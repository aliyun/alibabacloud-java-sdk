// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosEventAttackTypeRequest extends TeaModel {
    /**
     * <p>The type of the attack event to query. Valid values:</p>
     * <ul>
     * <li><strong>defense</strong>: volumetric attack scrubbing events.</li>
     * <li><strong>blackhole</strong>: volumetric attack blackhole filtering events.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>defense</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The attacked IP Address of Anti-DDoS Proxy instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>203.<em><strong>.</strong></em>.199</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The start timestamp of the event to query. Unit: seconds.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/188604.html">DescribeDDosAllEventList</a> to query the start time of all events.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1598948471</p>
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
