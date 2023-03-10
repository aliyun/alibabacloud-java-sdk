// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosEventAttackTypeRequest extends TeaModel {
    /**
     * <p>The type of the attack event that you want to query. Valid values:</p>
     * <br>
     * <p>*   **defense**: attack events that trigger traffic scrubbing</p>
     * <p>*   **blackhole**: attack events that trigger blackhole filtering</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The IP address of the attacked Anti-DDoS Pro or Anti-DDoS Premium instance.</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The UNIX timestamp when the query starts. Unit: seconds.</p>
     * <br>
     * <p>> You can call the [DescribeDDosAllEventList](~~188604~~) operation to query the beginning time of all attack events.</p>
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
