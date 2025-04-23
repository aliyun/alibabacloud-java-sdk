// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainStatisticsRequest extends TeaModel {
    /**
     * <p>The domain name. You can call the <a href="https://www.alibabacloud.com/help/zh/dns/api-alidns-2015-01-09-describedomains?spm=a2c63.p38356.help-menu-search-29697.d_0">DescribeDomains</a> operation to obtain the domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The type of the domain name. Valid values:</p>
     * <ul>
     * <li>PUBLIC (default): hosted public domain name</li>
     * <li>CACHE: cached public domain name</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC CACHE</p>
     */
    @NameInMap("DomainType")
    public String domainType;

    /**
     * <p>The end date of the query. Specify the end date in the <strong>YYYY-MM-DD</strong> format.</p>
     * <p>The default value is the day when you query the data.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-07-04</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The language of the content within the request and response.</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese (default)</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The start date of the query. Specify the start date in the <strong>YYYY-MM-DD</strong> format.</p>
     * <p>You can only query the DNS records within the last 90 days.``</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-07-04</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    public static DescribeDomainStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainStatisticsRequest self = new DescribeDomainStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainStatisticsRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainStatisticsRequest setDomainType(String domainType) {
        this.domainType = domainType;
        return this;
    }
    public String getDomainType() {
        return this.domainType;
    }

    public DescribeDomainStatisticsRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribeDomainStatisticsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDomainStatisticsRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
