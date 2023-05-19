// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainTopReferVisitRequest extends TeaModel {
    /**
     * <p>The operation that you want to perform. Set the value to **DescribeDomainTopReferVisit**.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The accelerated domain names. Separate multiple accelerated domain names with commas (,).</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The most frequently requested web pages.</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The number of visits to the web page.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainTopReferVisitRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainTopReferVisitRequest self = new DescribeDomainTopReferVisitRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainTopReferVisitRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainTopReferVisitRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainTopReferVisitRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public DescribeDomainTopReferVisitRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
