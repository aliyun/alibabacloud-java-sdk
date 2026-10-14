// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosEventSrcIpRequest extends TeaModel {
    /**
     * <p>The type of the attack event to query. Valid values:</p>
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
     * <p>The attacked IP Address of Anti-DDoS Proxy instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>203.<em><strong>.</strong></em>.199</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The number of attack source IP addresses to return. The IP addresses are sorted by attack traffic in descending order. Default value: <strong>5</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
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
