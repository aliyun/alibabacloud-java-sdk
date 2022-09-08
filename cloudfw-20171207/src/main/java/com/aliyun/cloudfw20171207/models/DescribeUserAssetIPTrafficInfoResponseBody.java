// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeUserAssetIPTrafficInfoResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("InBps")
    public Long inBps;

    @NameInMap("InPps")
    public Long inPps;

    @NameInMap("NewConn")
    public Long newConn;

    @NameInMap("OutBps")
    public Long outBps;

    @NameInMap("OutPps")
    public Long outPps;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SessionCount")
    public Long sessionCount;

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
