// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainHitRateDataRequest extends TeaModel {
    // You can specify multiple domain names and separate them with commas (,). You can specify at most 500 domain names in each call.
    // 
    // By default, this operation queries the byte hit ratios of all accelerated domain names that belong to your Alibaba Cloud account.
    @NameInMap("DomainName")
    public String domainName;

    // The end of the time range to query.
    // 
    // Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
    // 
    // >  The end time must be later than the start time.
    @NameInMap("EndTime")
    public String endTime;

    // The time interval between the data entries. Unit: seconds.
    // 
    // The time granularity varies with the time range to query. Supported values: 300 (5 minutes), 3600 (1 hour), and 86400 (1 day). For more information, see **Usage notes**.
    @NameInMap("Interval")
    public String interval;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The start of the time range to query.
    // 
    // Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainHitRateDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainHitRateDataRequest self = new DescribeDomainHitRateDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainHitRateDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainHitRateDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainHitRateDataRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeDomainHitRateDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDomainHitRateDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
