// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosEventIspRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("EventType")
    public String eventType;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Ip")
    public String ip;

    public static DescribeDDosEventIspRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDosEventIspRequest self = new DescribeDDosEventIspRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDDosEventIspRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeDDosEventIspRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public DescribeDDosEventIspRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeDDosEventIspRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

}
