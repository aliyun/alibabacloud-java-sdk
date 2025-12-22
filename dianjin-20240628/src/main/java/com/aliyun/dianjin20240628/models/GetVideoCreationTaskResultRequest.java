// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetVideoCreationTaskResultRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("taskId")
    public String taskId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("userId")
    public String userId;

    public static GetVideoCreationTaskResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoCreationTaskResultRequest self = new GetVideoCreationTaskResultRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoCreationTaskResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetVideoCreationTaskResultRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
