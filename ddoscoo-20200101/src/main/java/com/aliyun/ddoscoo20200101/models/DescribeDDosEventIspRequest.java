// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosEventIspRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Ip")
    public String ip;

    @NameInMap("Range")
    public Long range;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeDDosEventIspRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDosEventIspRequest self = new DescribeDDosEventIspRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDDosEventIspRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public DescribeDDosEventIspRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DescribeDDosEventIspRequest setRange(Long range) {
        this.range = range;
        return this;
    }
    public Long getRange() {
        return this.range;
    }

    public DescribeDDosEventIspRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
