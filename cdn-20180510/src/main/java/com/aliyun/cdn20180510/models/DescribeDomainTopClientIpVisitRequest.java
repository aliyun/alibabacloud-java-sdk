// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainTopClientIpVisitRequest extends TeaModel {
    // The accelerated domain name. Separate multiple accelerated domain names with commas (,).
    // 
    // By default, this operation queries client IP addresses for all accelerated domain names.
    @NameInMap("DomainName")
    public String domainName;

    // The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
    // 
    // The end time must be later than the start time.
    @NameInMap("EndTime")
    public String endTime;

    // The maximum number of entries to return. Maximum value: 100.
    // 
    // Default value: 20. The default value 20 specifies that the top 20 data entries are returned.
    @NameInMap("Limit")
    public String limit;

    // The name of the region. Separate multiple region names with commas (,).
    // 
    // You can call the [DescribeCdnRegionAndIsp](~~91077~~) operation to query regions.
    @NameInMap("LocationNameEn")
    public String locationNameEn;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The method that is used to sort the client IP addresses. Valid values:
    // 
    // *   **traf**: by network traffic. This is the default value.
    // *   **acc**: by the number of requests.
    @NameInMap("SortBy")
    public String sortBy;

    // The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainTopClientIpVisitRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainTopClientIpVisitRequest self = new DescribeDomainTopClientIpVisitRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainTopClientIpVisitRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainTopClientIpVisitRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainTopClientIpVisitRequest setLimit(String limit) {
        this.limit = limit;
        return this;
    }
    public String getLimit() {
        return this.limit;
    }

    public DescribeDomainTopClientIpVisitRequest setLocationNameEn(String locationNameEn) {
        this.locationNameEn = locationNameEn;
        return this;
    }
    public String getLocationNameEn() {
        return this.locationNameEn;
    }

    public DescribeDomainTopClientIpVisitRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDomainTopClientIpVisitRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public DescribeDomainTopClientIpVisitRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
