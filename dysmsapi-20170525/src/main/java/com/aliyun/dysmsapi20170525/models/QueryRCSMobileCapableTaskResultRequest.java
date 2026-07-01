// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRCSMobileCapableTaskResultRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static QueryRCSMobileCapableTaskResultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRCSMobileCapableTaskResultRequest self = new QueryRCSMobileCapableTaskResultRequest();
        return TeaModel.build(map, self);
    }

    public QueryRCSMobileCapableTaskResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
