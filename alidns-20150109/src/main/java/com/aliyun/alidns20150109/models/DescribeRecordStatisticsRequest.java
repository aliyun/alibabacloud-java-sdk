// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeRecordStatisticsRequest extends TeaModel {
    /**
     * <p>The primary domain name.
     * &lt;props=&quot;china&quot;&gt;For more information, see <a href="https://help.aliyun.com/document_detail/29751.html">DescribeDomains</a>.
     * &lt;props=&quot;intl&quot;&gt;For more information, see <a href="https://www.alibabacloud.com/help/en/dns/api-alidns-2015-01-09-describedomains">DescribeDomains</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exmaple.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The type of the domain name. This parameter is not case-sensitive. Valid values:</p>
     * <ul>
     * <li><p>PUBLIC (default): authoritative domain name</p>
     * </li>
     * <li><p>CACHE: authoritative proxy domain name</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("DomainType")
    public String domainType;

    /**
     * <p>The end date of the query. The format is <strong>YYYY-MM-DD</strong>.</p>
     * <p>The default value is the current date.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-07-04</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The language of the return value. Valid values:</p>
     * <ul>
     * <li><p>zh (default): Chinese</p>
     * </li>
     * <li><p>en: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The host record. For example, to resolve www\.example.com, set this parameter to www.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>www</p>
     */
    @NameInMap("Rr")
    public String rr;

    /**
     * <p>The start date of the query. The format is <strong>YYYY-MM-DD</strong>.</p>
     * <p>The start date must be within the last 90 days.</p>
     * <p>If the time range of the query is 7 days or less, data is returned by the hour.</p>
     * <p>If the time range of the query is more than 7 days, data is returned by the day.</p>
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
