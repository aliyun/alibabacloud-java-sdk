// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeUserAssetIPTrafficInfoResponseBody extends TeaModel {
    /**
     * <p>The end time of the query, as a UNIX timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1656923760</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The inbound network throughput, in bits per second (bps).</p>
     * 
     * <strong>example:</strong>
     * <p>4520</p>
     */
    @NameInMap("InBps")
    public Long inBps;

    /**
     * <p>The inbound packet rate, in packets per second (pps).</p>
     * 
     * <strong>example:</strong>
     * <p>233</p>
     */
    @NameInMap("InPps")
    public Long inPps;

    /**
     * <p>The number of new connections.</p>
     * 
     * <strong>example:</strong>
     * <p>43</p>
     */
    @NameInMap("NewConn")
    public Long newConn;

    /**
     * <p>The outbound network throughput, in bits per second (bps).</p>
     * 
     * <strong>example:</strong>
     * <p>4180</p>
     */
    @NameInMap("OutBps")
    public Long outBps;

    /**
     * <p>The outbound packet rate, in packets per second (pps).</p>
     * 
     * <strong>example:</strong>
     * <p>224</p>
     */
    @NameInMap("OutPps")
    public Long outPps;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F0F82705-CFC7-5F83-86C8-A063892F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of sessions.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("SessionCount")
    public Long sessionCount;

    /**
     * <p>The start time of the query, as a UNIX timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1656837360</p>
     */
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
