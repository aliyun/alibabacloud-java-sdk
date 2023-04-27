// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskFlowTimeVariablesRequest extends TeaModel {
    @NameInMap("DagId")
    public Long dagId;

    @NameInMap("Tid")
    public Long tid;

    @NameInMap("TimeVariables")
    public String timeVariables;

    public static UpdateTaskFlowTimeVariablesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskFlowTimeVariablesRequest self = new UpdateTaskFlowTimeVariablesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskFlowTimeVariablesRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public UpdateTaskFlowTimeVariablesRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public UpdateTaskFlowTimeVariablesRequest setTimeVariables(String timeVariables) {
        this.timeVariables = timeVariables;
        return this;
    }
    public String getTimeVariables() {
        return this.timeVariables;
    }

}
