// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosEventSrcIpRequest extends TeaModel {
    /**
     * <p>The type of the attack event that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>defense</strong>: attack events that trigger traffic scrubbing</li>
     * <li><strong>blackhole</strong>: attack events that trigger blackhole filtering</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>defense</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The IP address of the attacked Anti-DDoS Pro or Anti-DDoS Premium instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>203.<em><strong>.</strong></em>.199</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The number of source IP addresses that you want to return. The source IP addresses are returned in descending order of attack traffic. By default, the top <strong>five</strong> source IP addresses are returned.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Range")
    public Long range;

    /**
     * <p>The UNIX timestamp when the query starts. Unit: seconds.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/188604.html">DescribeDDosAllEventList</a> operation to query the beginning time of all attack events.</p>
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
