// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class GetStackRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Pid")
    public String pid;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RpcID")
    public String rpcID;

    @NameInMap("StartTime")
    public Long startTime;

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
