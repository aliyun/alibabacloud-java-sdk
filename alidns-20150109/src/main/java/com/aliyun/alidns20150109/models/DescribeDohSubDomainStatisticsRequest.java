// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDohSubDomainStatisticsRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Specify the time in the YYYY-MM-DD format.</p>
     * <p>The default value is the day when you perform the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-07-04</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The language type.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The beginning of the time range to query. Specify the time in the YYYY-MM-DD format.</p>
     * <p>You can query only the DNS records of the latest 90 days. <code>The value of StartDate must be greater than or equal to the difference between the current date and 90</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-07-04</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The subdomain whose statistics you want to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("SubDomain")
    public String subDomain;

    public static DescribeDohSubDomainStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDohSubDomainStatisticsRequest self = new DescribeDohSubDomainStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDohSubDomainStatisticsRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribeDohSubDomainStatisticsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDohSubDomainStatisticsRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public DescribeDohSubDomainStatisticsRequest setSubDomain(String subDomain) {
        this.subDomain = subDomain;
        return this;
    }
    public String getSubDomain() {
        return this.subDomain;
    }

}
