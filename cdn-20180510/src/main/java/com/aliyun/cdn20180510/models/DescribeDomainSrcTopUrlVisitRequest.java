// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainSrcTopUrlVisitRequest extends TeaModel {
    /**
     * <p>The number of visits to the URL.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The accelerated domain name. Separate multiple accelerated domain names with commas (,).</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>A list of frequently requested URLs.</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The operation that you want to perform. Set the value to **DescribeDomainSrcTopUrlVisit**.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainSrcTopUrlVisitRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSrcTopUrlVisitRequest self = new DescribeDomainSrcTopUrlVisitRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSrcTopUrlVisitRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainSrcTopUrlVisitRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainSrcTopUrlVisitRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public DescribeDomainSrcTopUrlVisitRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
