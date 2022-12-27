// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainMultiUsageDataRequest extends TeaModel {
    // The accelerated domain names. You can specify multiple accelerated domain names and separate domain names with commas (,).
    // 
    // > *   You can specify at most 30 accelerated domain names.
    // *   If you do not set this parameter, the data of all accelerated domain names that belong to your Alibaba Cloud account is queried.
    @NameInMap("DomainName")
    public String domainName;

    // The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
    // 
    // >  The end time must be later than the start time.
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainMultiUsageDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainMultiUsageDataRequest self = new DescribeDomainMultiUsageDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainMultiUsageDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainMultiUsageDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainMultiUsageDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDomainMultiUsageDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
