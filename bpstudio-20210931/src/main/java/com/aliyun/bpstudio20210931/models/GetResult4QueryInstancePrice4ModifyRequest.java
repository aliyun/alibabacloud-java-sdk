// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class GetResult4QueryInstancePrice4ModifyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>02S7UU41WKJL7ERR</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>58d5d8c5b5489150417a7cd6caa614bb</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetResult4QueryInstancePrice4ModifyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResult4QueryInstancePrice4ModifyRequest self = new GetResult4QueryInstancePrice4ModifyRequest();
        return TeaModel.build(map, self);
    }

    public GetResult4QueryInstancePrice4ModifyRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public GetResult4QueryInstancePrice4ModifyRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
