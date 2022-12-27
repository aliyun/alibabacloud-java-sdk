// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainSrcTopUrlVisitRequest extends TeaModel {
    // The accelerated domain name. Separate multiple accelerated domain names with commas (,).
    @NameInMap("DomainName")
    public String domainName;

    // The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
    // 
    // >  The end time must be later than the start time. The difference between the end time and the start time cannot exceed seven days.
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The method that is used to sort the returned URLs.**** Valid values:
    // 
    // *   **traf**: by network traffic.
    // *   **pv**: by the number of page views. This is the default value.
    @NameInMap("SortBy")
    public String sortBy;

    // The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
    // 
    // >  If you do not set the StartTime parameter, the data within the previous day is queried.
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

    public DescribeDomainSrcTopUrlVisitRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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
