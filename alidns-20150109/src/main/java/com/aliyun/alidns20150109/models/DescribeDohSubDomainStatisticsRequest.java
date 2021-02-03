// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDohSubDomainStatisticsRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("SubDomain")
    @Validation(required = true)
    public String subDomain;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("EndDate")
    public String endDate;

    public static DescribeDohSubDomainStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDohSubDomainStatisticsRequest self = new DescribeDohSubDomainStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDohSubDomainStatisticsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDohSubDomainStatisticsRequest setSubDomain(String subDomain) {
        this.subDomain = subDomain;
        return this;
    }
    public String getSubDomain() {
        return this.subDomain;
    }

    public DescribeDohSubDomainStatisticsRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public DescribeDohSubDomainStatisticsRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

}
