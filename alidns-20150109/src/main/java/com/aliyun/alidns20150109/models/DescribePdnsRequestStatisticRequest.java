// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribePdnsRequestStatisticRequest extends TeaModel {
    /**
     * <p>The primary domain name for which you want to query statistics.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end date of the query in the <strong>YYYY-MM-DD</strong> format.</p>
     * <p>The default value is the current day.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-07-01</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The language of the request and response. The default value is <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The start date of the query in the <strong>YYYY-MM-DD</strong> format.</p>
     * <p>You can query data from the last 90 days.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-06-14</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The subdomain for which you want to query statistics.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("SubDomain")
    public String subDomain;

    /**
     * <p>The dimension for statistics. Valid values:</p>
     * <ul>
     * <li><p><strong>ACCOUNT</strong>: queries statistics by account.</p>
     * </li>
     * <li><p><strong>DOMAIN</strong>: queries statistics by domain name. The DomainName parameter is required.</p>
     * </li>
     * <li><p><strong>SUB_DOMAIN</strong>: queries statistics by subdomain. The DomainName and SubDomain parameters are required.</p>
     * </li>
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
