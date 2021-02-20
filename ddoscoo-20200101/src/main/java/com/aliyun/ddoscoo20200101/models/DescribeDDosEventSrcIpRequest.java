// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosEventSrcIpRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("EventType")
    public String eventType;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("Range")
    public Long range;

    public static DescribeDDosEventSrcIpRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDosEventSrcIpRequest self = new DescribeDDosEventSrcIpRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDDosEventSrcIpRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeDDosEventSrcIpRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public DescribeDDosEventSrcIpRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
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

}
