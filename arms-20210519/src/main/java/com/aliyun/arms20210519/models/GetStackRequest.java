// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class GetStackRequest extends TeaModel {
    @NameInMap("TraceID")
    public String traceID;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RpcID")
    public String rpcID;

    @NameInMap("Pid")
    public String pid;

    public static GetStackRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStackRequest self = new GetStackRequest();
        return TeaModel.build(map, self);
    }

    public GetStackRequest setTraceID(String traceID) {
        this.traceID = traceID;
        return this;
    }
    public String getTraceID() {
        return this.traceID;
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

    public GetStackRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

}
