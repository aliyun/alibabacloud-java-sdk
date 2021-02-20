// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosEventAreaRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("EventType")
    public String eventType;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Ip")
    public String ip;

    public static DescribeDDosEventAreaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDosEventAreaRequest self = new DescribeDDosEventAreaRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDDosEventAreaRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeDDosEventAreaRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public DescribeDDosEventAreaRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeDDosEventAreaRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

}
