// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosEventSrcIpRequest extends TeaModel {
    /**
     * <p>The type of the attack event that you want to query. Valid values:</p>
     * <br>
     * <p>*   **defense**: attack events that trigger traffic scrubbing</p>
     * <p>*   **blackhole**: attack events that trigger blackhole filtering</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The IP address of the attacked Anti-DDoS Pro or Anti-DDoS Premium instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The number of source IP addresses that you want to return. The source IP addresses are returned in descending order of attack traffic. By default, the top **five** source IP addresses are returned.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Range")
    public Long range;

    /**
     * <p>The UNIX timestamp when the query starts. Unit: seconds.</p>
     * <br>
     * <p>> You can call the [DescribeDDosAllEventList](https://help.aliyun.com/document_detail/188604.html) operation to query the beginning time of all attack events.</p>
     * <br>
     * <p>This parameter is required.</p>
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
