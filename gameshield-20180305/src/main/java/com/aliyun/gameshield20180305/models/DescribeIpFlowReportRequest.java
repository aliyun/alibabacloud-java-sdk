// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeIpFlowReportRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("FPort")
    public Long FPort;

    @NameInMap("Interval")
    public Long interval;

    @NameInMap("ProtocolEx")
    public Long protocolEx;

    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeIpFlowReportRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpFlowReportRequest self = new DescribeIpFlowReportRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIpFlowReportRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeIpFlowReportRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DescribeIpFlowReportRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeIpFlowReportRequest setFPort(Long FPort) {
        this.FPort = FPort;
        return this;
    }
    public Long getFPort() {
        return this.FPort;
    }

    public DescribeIpFlowReportRequest setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public DescribeIpFlowReportRequest setProtocolEx(Long protocolEx) {
        this.protocolEx = protocolEx;
        return this;
    }
    public Long getProtocolEx() {
        return this.protocolEx;
    }

    public DescribeIpFlowReportRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
