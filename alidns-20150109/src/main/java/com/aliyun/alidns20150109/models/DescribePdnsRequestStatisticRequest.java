// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribePdnsRequestStatisticRequest extends TeaModel {
    /**
     * <p>The primary domain name whose statistics you want to query.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query. Specify the time in the <strong>YYYY-MM-DD</strong> format.</p>
     * <p>The default value is the day when you query the data.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-7-1 00:00:00</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The beginning of the time range to query. Specify the time in the <strong>YYYY-MM-DD</strong> format.</p>
     * <p>You can query only records of the last 90 days.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-06-14 00:00:00</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The subdomain name whose statistics you want to query.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("SubDomain")
    public String subDomain;

    /**
     * <p>The type of the request statistics that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>ACCOUNT</strong>: queries the request statistics by account.</li>
     * <li><strong>DOMAIN</strong>: queries the request statistics by domain name.</li>
     * <li><strong>SUB_DOMAIN</strong>: queries the request statistics by subdomain name.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ACCOUNT</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribePdnsRequestStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePdnsRequestStatisticRequest self = new DescribePdnsRequestStatisticRequest();
        return TeaModel.build(map, self);
    }

    public DescribePdnsRequestStatisticRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribePdnsRequestStatisticRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribePdnsRequestStatisticRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribePdnsRequestStatisticRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public DescribePdnsRequestStatisticRequest setSubDomain(String subDomain) {
        this.subDomain = subDomain;
        return this;
    }
    public String getSubDomain() {
        return this.subDomain;
    }

    public DescribePdnsRequestStatisticRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
