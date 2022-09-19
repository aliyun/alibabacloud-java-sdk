// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskOutputRequest extends TeaModel {
    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("NodeOutput")
    public String nodeOutput;

    @NameInMap("Tid")
    public Long tid;

    public static UpdateTaskOutputRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskOutputRequest self = new UpdateTaskOutputRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskOutputRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public UpdateTaskOutputRequest setNodeOutput(String nodeOutput) {
        this.nodeOutput = nodeOutput;
        return this;
    }
    public String getNodeOutput() {
        return this.nodeOutput;
    }

    public UpdateTaskOutputRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
