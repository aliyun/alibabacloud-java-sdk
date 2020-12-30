// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainTopClientIpVisitRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("LocationNameEn")
    public String locationNameEn;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("Limit")
    public String limit;

    public static DescribeDomainTopClientIpVisitRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainTopClientIpVisitRequest self = new DescribeDomainTopClientIpVisitRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainTopClientIpVisitRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDomainTopClientIpVisitRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainTopClientIpVisitRequest setLocationNameEn(String locationNameEn) {
        this.locationNameEn = locationNameEn;
        return this;
    }
    public String getLocationNameEn() {
        return this.locationNameEn;
    }

    public DescribeDomainTopClientIpVisitRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDomainTopClientIpVisitRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainTopClientIpVisitRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public DescribeDomainTopClientIpVisitRequest setLimit(String limit) {
        this.limit = limit;
        return this;
    }
    public String getLimit() {
        return this.limit;
    }

}
