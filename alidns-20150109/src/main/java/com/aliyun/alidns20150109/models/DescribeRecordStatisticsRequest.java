// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeRecordStatisticsRequest extends TeaModel {
    /**
     * <p>The domain name.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The type of the domain name. The parameter value is not case-sensitive. Valid values:</p>
     * <br>
     * <p>*   PUBLIC (default): hosted public domain name</p>
     * <p>*   CACHE: cache-accelerated domain name</p>
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
     * <p>The hostname. If you want to resolve the subdomain name www.dns-exmaple.top, set this parameter to www.</p>
     */
    @NameInMap("Rr")
    public String rr;

    /**
     * <p>The start date of the query. Specify the start date in the **YYYY-MM-DD** format.</p>
     * <br>
     * <p>You can only query the DNS records within the last 90 days.``</p>
     * <br>
     * <p>If the time range is less than or equal to seven days, data is returned on an hourly basis.````</p>
     * <br>
     * <p>If the time range is greater than seven days, data is returned on a daily basis.````</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    public static DescribeRecordStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordStatisticsRequest self = new DescribeRecordStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRecordStatisticsRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeRecordStatisticsRequest setDomainType(String domainType) {
        this.domainType = domainType;
        return this;
    }
    public String getDomainType() {
        return this.domainType;
    }

    public DescribeRecordStatisticsRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribeRecordStatisticsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeRecordStatisticsRequest setRr(String rr) {
        this.rr = rr;
        return this;
    }
    public String getRr() {
        return this.rr;
    }

    public DescribeRecordStatisticsRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
