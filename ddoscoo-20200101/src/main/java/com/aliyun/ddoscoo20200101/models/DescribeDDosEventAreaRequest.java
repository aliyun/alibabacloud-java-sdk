// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosEventAreaRequest extends TeaModel {
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

    public static DescribeDDosEventAreaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDosEventAreaRequest self = new DescribeDDosEventAreaRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDDosEventAreaRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public DescribeDDosEventAreaRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DescribeDDosEventAreaRequest setRange(Long range) {
        this.range = range;
        return this;
    }
    public Long getRange() {
        return this.range;
    }

    public DescribeDDosEventAreaRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
