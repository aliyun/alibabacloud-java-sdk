// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetQualityCheckTaskResultRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>17071319</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static GetQualityCheckTaskResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQualityCheckTaskResultRequest self = new GetQualityCheckTaskResultRequest();
        return TeaModel.build(map, self);
    }

    public GetQualityCheckTaskResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
