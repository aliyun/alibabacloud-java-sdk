// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDestinationPortEventRequest extends TeaModel {
    /**
     * <p>The type of the attack event that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>defense</strong>: attack events that trigger traffic scrubbing.</li>
     * <li><strong>blackhole</strong>: attack events that trigger blackhole filtering.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>defense</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The IP address of the attacker.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>203.107.XX.XX</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The number of destination ports to return. The ports are sorted in descending order of the number of received request packets. By default, the first <strong>10</strong> ports are returned.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Range")
    public Long range;

    /**
     * <p>The region in which your service is deployed. Valid values:</p>
     * <ul>
     * <li><strong>cn</strong>: a region in the Chinese mainland.</li>
     * <li><strong>cn-hongkong</strong>: a region outside the Chinese mainland.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     * <blockquote>
     * <p> This UNIX timestamp must indicate a point in time that is accurate to the minute.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1720059000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeDestinationPortEventRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDestinationPortEventRequest self = new DescribeDestinationPortEventRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDestinationPortEventRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public DescribeDestinationPortEventRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DescribeDestinationPortEventRequest setRange(Long range) {
        this.range = range;
        return this;
    }
    public Long getRange() {
        return this.range;
    }

    public DescribeDestinationPortEventRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeDestinationPortEventRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
