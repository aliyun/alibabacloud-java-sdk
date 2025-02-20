// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class DeleteJobRequest extends TeaModel {
    /**
     * <p>Specifies whether to force delete the subtask. If the task has subtasks and you set this parameter to true, the task and its subtasks are forcibly deleted. If this parameter is set to false, the task and its subtasks fail to be deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("forceDelete")
    public Boolean forceDelete;

    public static DeleteJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteJobRequest self = new DeleteJobRequest();
        return TeaModel.build(map, self);
    }

    public DeleteJobRequest setForceDelete(Boolean forceDelete) {
        this.forceDelete = forceDelete;
        return this;
    }
    public Boolean getForceDelete() {
        return this.forceDelete;
    }

}
