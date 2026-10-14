// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosEventAreaRequest extends TeaModel {
    /**
     * <p>The event type of the attack event to query. Valid values:</p>
     * <ul>
     * <li><strong>defense</strong>: traffic scrubbing events for volumetric attacks.</li>
     * <li><strong>blackhole</strong>: blackhole filtering events for volumetric attacks.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>defense</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The attacked IP Address of Anti-DDoS Proxy instance of Anti-DDoS Pro and Anti-DDoS Premium.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>203.XX.XX.199</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The number of data entries to return. Unit: entries.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Range")
    public Long range;

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
