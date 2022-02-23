// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAsyncErrorRequestListByCodeRequest extends TeaModel {
    @NameInMap("End")
    public Long end;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("Start")
    public Long start;

    public static GetAsyncErrorRequestListByCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncErrorRequestListByCodeRequest self = new GetAsyncErrorRequestListByCodeRequest();
        return TeaModel.build(map, self);
    }

    public GetAsyncErrorRequestListByCodeRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public GetAsyncErrorRequestListByCodeRequest setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetAsyncErrorRequestListByCodeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAsyncErrorRequestListByCodeRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetAsyncErrorRequestListByCodeRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
