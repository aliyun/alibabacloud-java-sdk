// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRealTimeByteHitRateDataRequest extends TeaModel {
    // You can specify multiple domain names and separate them with commas (,). You can specify at most 100 domain names in each call.
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

    public static DescribeDomainRealTimeByteHitRateDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRealTimeByteHitRateDataRequest self = new DescribeDomainRealTimeByteHitRateDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRealTimeByteHitRateDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainRealTimeByteHitRateDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainRealTimeByteHitRateDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDomainRealTimeByteHitRateDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
