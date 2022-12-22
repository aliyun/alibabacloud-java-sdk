// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeUserAssetIPTrafficInfoResponseBody extends TeaModel {
    // The end of the time range that is queried. The value is a UNIX timestamp. Unit: seconds.
    @NameInMap("EndTime")
    public Long endTime;

    // The network throughput, which indicates the inbound traffic rate. Unit: bit/s.
    @NameInMap("InBps")
    public Long inBps;

    // The network throughput, which indicates the inbound packet rate. Unit: packets per second (pps).
    @NameInMap("InPps")
    public Long inPps;

    // The number of new connections.
    @NameInMap("NewConn")
    public Long newConn;

    // The network throughput, which indicates the outbound traffic rate. Unit: bit/s.
    @NameInMap("OutBps")
    public Long outBps;

    // The network throughput, which indicates the outbound packet rate. Unit: pps.
    @NameInMap("OutPps")
    public Long outPps;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The number of requests.
    @NameInMap("SessionCount")
    public Long sessionCount;

    // The beginning of the time range that is queried. The value is a UNIX timestamp. Unit: seconds.
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeUserAssetIPTrafficInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserAssetIPTrafficInfoResponseBody self = new DescribeUserAssetIPTrafficInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserAssetIPTrafficInfoResponseBody setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeUserAssetIPTrafficInfoResponseBody setInBps(Long inBps) {
        this.inBps = inBps;
        return this;
    }
    public Long getInBps() {
        return this.inBps;
    }

    public DescribeUserAssetIPTrafficInfoResponseBody setInPps(Long inPps) {
        this.inPps = inPps;
        return this;
    }
    public Long getInPps() {
        return this.inPps;
    }

    public DescribeUserAssetIPTrafficInfoResponseBody setNewConn(Long newConn) {
        this.newConn = newConn;
        return this;
    }
    public Long getNewConn() {
        return this.newConn;
    }

    public DescribeUserAssetIPTrafficInfoResponseBody setOutBps(Long outBps) {
        this.outBps = outBps;
        return this;
    }
    public Long getOutBps() {
        return this.outBps;
    }

    public DescribeUserAssetIPTrafficInfoResponseBody setOutPps(Long outPps) {
        this.outPps = outPps;
        return this;
    }
    public Long getOutPps() {
        return this.outPps;
    }

    public DescribeUserAssetIPTrafficInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserAssetIPTrafficInfoResponseBody setSessionCount(Long sessionCount) {
        this.sessionCount = sessionCount;
        return this;
    }
    public Long getSessionCount() {
        return this.sessionCount;
    }

    public DescribeUserAssetIPTrafficInfoResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
