// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeRecordStatisticsRequest extends TeaModel {
    /**
     * <p>The primary domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dns-example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The type of the domain name. The parameter value is not case-sensitive. Valid values:</p>
     * <ul>
     * <li>PUBLIC (default): hosted public domain name</li>
     * <li>CACHE: cache-accelerated domain name</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
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
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The hostname. If you want to resolve <a href="http://www.dns-exmaple.top">www.dns-exmaple.top</a>, set Rr to www.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>www</p>
     */
    @NameInMap("Rr")
    public String rr;

    /**
     * <p>The start date of the query. Specify the start date in the <strong>YYYY-MM-DD</strong> format.</p>
     * <p>You can only query the DNS records within the last 90 days.``</p>
     * <p>If the time range is less than or equal to seven days, data is returned on an hourly basis.````</p>
     * <p>If the time range is greater than seven days, data is returned on a daily basis.````</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-07-04</p>
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
