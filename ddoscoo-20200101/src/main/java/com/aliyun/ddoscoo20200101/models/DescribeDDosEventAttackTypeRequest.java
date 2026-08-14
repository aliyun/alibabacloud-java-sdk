// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosEventAttackTypeRequest extends TeaModel {
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

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeDDosEventAttackTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDosEventAttackTypeRequest self = new DescribeDDosEventAttackTypeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDDosEventAttackTypeRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public DescribeDDosEventAttackTypeRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DescribeDDosEventAttackTypeRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
