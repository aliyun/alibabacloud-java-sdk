// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20241107.models;

import com.aliyun.tea.*;

public class GetLabelTaskResultRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>313123123</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static GetLabelTaskResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLabelTaskResultRequest self = new GetLabelTaskResultRequest();
        return TeaModel.build(map, self);
    }

    public GetLabelTaskResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
