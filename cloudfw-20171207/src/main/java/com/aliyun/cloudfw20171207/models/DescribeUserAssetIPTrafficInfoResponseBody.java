// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeUserAssetIPTrafficInfoResponseBody extends TeaModel {
    // 结束时间
    @NameInMap("EndTime")
    public Long endTime;

    // 入方向流量信息
    @NameInMap("InTrafficInfo")
    public DescribeUserAssetIPTrafficInfoResponseBodyInTrafficInfo inTrafficInfo;

    // 出方向流量信息
    @NameInMap("OutTrafficInfo")
    public DescribeUserAssetIPTrafficInfoResponseBodyOutTrafficInfo outTrafficInfo;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 开始时间
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

    public DescribeUserAssetIPTrafficInfoResponseBody setInTrafficInfo(DescribeUserAssetIPTrafficInfoResponseBodyInTrafficInfo inTrafficInfo) {
        this.inTrafficInfo = inTrafficInfo;
        return this;
    }
    public DescribeUserAssetIPTrafficInfoResponseBodyInTrafficInfo getInTrafficInfo() {
        return this.inTrafficInfo;
    }

    public DescribeUserAssetIPTrafficInfoResponseBody setOutTrafficInfo(DescribeUserAssetIPTrafficInfoResponseBodyOutTrafficInfo outTrafficInfo) {
        this.outTrafficInfo = outTrafficInfo;
        return this;
    }
    public DescribeUserAssetIPTrafficInfoResponseBodyOutTrafficInfo getOutTrafficInfo() {
        return this.outTrafficInfo;
    }

    public DescribeUserAssetIPTrafficInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserAssetIPTrafficInfoResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public static class DescribeUserAssetIPTrafficInfoResponseBodyInTrafficInfo extends TeaModel {
        // 入方向Bps
        @NameInMap("InBps")
        public Long inBps;

        // 入方向pps
        @NameInMap("InPps")
        public Long inPps;

        // 新建会话数
        @NameInMap("NewConn")
        public Long newConn;

        // 返回Bps
        @NameInMap("OutBps")
        public Long outBps;

        // 返回pps
        @NameInMap("OutPps")
        public Long outPps;

        // 会话数
        @NameInMap("SessionCount")
        public Long sessionCount;

        public static DescribeUserAssetIPTrafficInfoResponseBodyInTrafficInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserAssetIPTrafficInfoResponseBodyInTrafficInfo self = new DescribeUserAssetIPTrafficInfoResponseBodyInTrafficInfo();
            return TeaModel.build(map, self);
        }

        public DescribeUserAssetIPTrafficInfoResponseBodyInTrafficInfo setInBps(Long inBps) {
            this.inBps = inBps;
            return this;
        }
        public Long getInBps() {
            return this.inBps;
        }

        public DescribeUserAssetIPTrafficInfoResponseBodyInTrafficInfo setInPps(Long inPps) {
            this.inPps = inPps;
            return this;
        }
        public Long getInPps() {
            return this.inPps;
        }

        public DescribeUserAssetIPTrafficInfoResponseBodyInTrafficInfo setNewConn(Long newConn) {
            this.newConn = newConn;
            return this;
        }
        public Long getNewConn() {
            return this.newConn;
        }

        public DescribeUserAssetIPTrafficInfoResponseBodyInTrafficInfo setOutBps(Long outBps) {
            this.outBps = outBps;
            return this;
        }
        public Long getOutBps() {
            return this.outBps;
        }

        public DescribeUserAssetIPTrafficInfoResponseBodyInTrafficInfo setOutPps(Long outPps) {
            this.outPps = outPps;
            return this;
        }
        public Long getOutPps() {
            return this.outPps;
        }

        public DescribeUserAssetIPTrafficInfoResponseBodyInTrafficInfo setSessionCount(Long sessionCount) {
            this.sessionCount = sessionCount;
            return this;
        }
        public Long getSessionCount() {
            return this.sessionCount;
        }

    }

    public static class DescribeUserAssetIPTrafficInfoResponseBodyOutTrafficInfo extends TeaModel {
        // 出方向接收流量Bps
        @NameInMap("InBps")
        public Long inBps;

        // 出方向接收流量Bps
        @NameInMap("InPps")
        public Long inPps;

        // 新建会话数
        @NameInMap("NewConn")
        public Long newConn;

        // 出方向流量Bps
        @NameInMap("OutBps")
        public Long outBps;

        // 出方向pps
        @NameInMap("OutPps")
        public Long outPps;

        // 会话数
        @NameInMap("SessionCount")
        public Long sessionCount;

        public static DescribeUserAssetIPTrafficInfoResponseBodyOutTrafficInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserAssetIPTrafficInfoResponseBodyOutTrafficInfo self = new DescribeUserAssetIPTrafficInfoResponseBodyOutTrafficInfo();
            return TeaModel.build(map, self);
        }

        public DescribeUserAssetIPTrafficInfoResponseBodyOutTrafficInfo setInBps(Long inBps) {
            this.inBps = inBps;
            return this;
        }
        public Long getInBps() {
            return this.inBps;
        }

        public DescribeUserAssetIPTrafficInfoResponseBodyOutTrafficInfo setInPps(Long inPps) {
            this.inPps = inPps;
            return this;
        }
        public Long getInPps() {
            return this.inPps;
        }

        public DescribeUserAssetIPTrafficInfoResponseBodyOutTrafficInfo setNewConn(Long newConn) {
            this.newConn = newConn;
            return this;
        }
        public Long getNewConn() {
            return this.newConn;
        }

        public DescribeUserAssetIPTrafficInfoResponseBodyOutTrafficInfo setOutBps(Long outBps) {
            this.outBps = outBps;
            return this;
        }
        public Long getOutBps() {
            return this.outBps;
        }

        public DescribeUserAssetIPTrafficInfoResponseBodyOutTrafficInfo setOutPps(Long outPps) {
            this.outPps = outPps;
            return this;
        }
        public Long getOutPps() {
            return this.outPps;
        }

        public DescribeUserAssetIPTrafficInfoResponseBodyOutTrafficInfo setSessionCount(Long sessionCount) {
            this.sessionCount = sessionCount;
            return this;
        }
        public Long getSessionCount() {
            return this.sessionCount;
        }

    }

}
