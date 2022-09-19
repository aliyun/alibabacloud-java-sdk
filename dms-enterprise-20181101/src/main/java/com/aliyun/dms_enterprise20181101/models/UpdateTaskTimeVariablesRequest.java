// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskTimeVariablesRequest extends TeaModel {
    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("Tid")
    public Long tid;

    @NameInMap("TimeVariables")
    public String timeVariables;

    public static UpdateTaskTimeVariablesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskTimeVariablesRequest self = new UpdateTaskTimeVariablesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskTimeVariablesRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public UpdateTaskTimeVariablesRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public UpdateTaskTimeVariablesRequest setTimeVariables(String timeVariables) {
        this.timeVariables = timeVariables;
        return this;
    }
    public String getTimeVariables() {
        return this.timeVariables;
    }

}
