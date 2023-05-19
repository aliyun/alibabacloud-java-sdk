// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainSrcTopUrlVisitRequest extends TeaModel {
    /**
     * <p>The accelerated domain name. Separate multiple accelerated domain names with commas (,).</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The proportion of visits to the URL.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>>  If you do not set the StartTime parameter, the data within the previous day is queried.</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>A list of frequently requested URLs.</p>
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
