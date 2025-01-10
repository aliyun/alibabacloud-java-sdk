// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListVccFlowInfosRequest extends TeaModel {
    /**
     * <p>Direction</p>
     * <p>Valid value:</p>
     * <ul>
     * <li>IN: inbound.</li>
     * <li>OUT: the outbound.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OUT</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The start time. The default value is 5 minutes ago.</p>
     * 
     * <strong>example:</strong>
     * <p>1667727514000</p>
     */
    @NameInMap("From")
    public Long from;

    /**
     * <p>Metric</p>
     * <p>Valid value:</p>
     * <ul>
     * <li>totalPacketsRate: Total Packet Rate.</li>
     * <li>dropBytesRate: the of the stream drop rate.</li>
     * <li>dropPacketsRate: Dropped Packet Rate.</li>
     * <li>totalBytesRate: the total streaming rate.</li>
     * <li>passBytesRate: by stream rate.</li>
     * <li>passPacketsRate: by packet rate.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>passBytesRate</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The end time. The default time is the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>1689749749000</p>
     */
    @NameInMap("To")
    public Long to;

    /**
     * <p>Lingjun Connection ID</p>
     * 
     * <strong>example:</strong>
     * <p>vcc-cn-zvp2******</p>
     */
    @NameInMap("VccId")
    public String vccId;

    public static ListVccFlowInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVccFlowInfosRequest self = new ListVccFlowInfosRequest();
        return TeaModel.build(map, self);
    }

    public ListVccFlowInfosRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public ListVccFlowInfosRequest setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public ListVccFlowInfosRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public ListVccFlowInfosRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListVccFlowInfosRequest setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

    public ListVccFlowInfosRequest setVccId(String vccId) {
        this.vccId = vccId;
        return this;
    }
    public String getVccId() {
        return this.vccId;
    }

}
