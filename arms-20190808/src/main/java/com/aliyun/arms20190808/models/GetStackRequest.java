// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetStackRequest extends TeaModel {
    // The end time of the call method.
    @NameInMap("EndTime")
    public Long endTime;

    // The process identifier (PID) of the application. For more information about how to obtain the PID, see [Obtain the PID of an application](https://help.aliyun.com/document_detail/186100.html?spm=a2c4g.11186623.6.792.1b50654cqcDPyk#title-imy-7gj-qhr).
    @NameInMap("Pid")
    public String pid;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the remote procedure call (RPC) mode. You can obtain the ID by calling the **GetTrace** operation.
    @NameInMap("RpcID")
    public String rpcID;

    // The start time of the call method.
    @NameInMap("StartTime")
    public Long startTime;

    // The ID of the trace. You can log on to the Application Real-Time Monitoring Service (ARMS) console and obtain the trace ID on the **Trace Query** page.
    @NameInMap("TraceID")
    public String traceID;

    public static GetStackRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStackRequest self = new GetStackRequest();
        return TeaModel.build(map, self);
    }

    public GetStackRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetStackRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public GetStackRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetStackRequest setRpcID(String rpcID) {
        this.rpcID = rpcID;
        return this;
    }
    public String getRpcID() {
        return this.rpcID;
    }

    public GetStackRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetStackRequest setTraceID(String traceID) {
        this.traceID = traceID;
        return this;
    }
    public String getTraceID() {
        return this.traceID;
    }

}
