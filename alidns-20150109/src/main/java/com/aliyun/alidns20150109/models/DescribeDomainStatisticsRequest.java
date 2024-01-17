// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainStatisticsRequest extends TeaModel {
    /**
     * <p>The domain name.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The type of the domain name. Valid values:</p>
     * <br>
     * <p>*   PUBLIC (default): hosted public domain name</p>
     * <p>*   CACHE: cached public domain name</p>
     */
    @NameInMap("DomainType")
    public String domainType;

    /**
     * <p>The end date of the query. Specify the end date in the **YYYY-MM-DD** format.</p>
     * <br>
     * <p>The default value is the day when you query the data.</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The language.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The start date of the query. Specify the start date in the **YYYY-MM-DD** format.</p>
     * <br>
     * <p>You can only query the DNS records within the last 90 days.``</p>
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
