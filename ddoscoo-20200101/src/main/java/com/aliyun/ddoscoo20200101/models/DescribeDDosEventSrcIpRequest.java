// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosEventSrcIpRequest extends TeaModel {
    @NameInMap("EventType")
    public String eventType;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("Range")
    public Long range;

    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeDDosEventSrcIpRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDosEventSrcIpRequest self = new DescribeDDosEventSrcIpRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDDosEventSrcIpRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public DescribeDDosEventSrcIpRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DescribeDDosEventSrcIpRequest setRange(Long range) {
        this.range = range;
        return this;
    }
    public Long getRange() {
        return this.range;
    }

    public DescribeDDosEventSrcIpRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
