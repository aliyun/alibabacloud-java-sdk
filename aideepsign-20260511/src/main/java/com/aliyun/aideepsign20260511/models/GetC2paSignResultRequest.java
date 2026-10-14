// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class GetC2paSignResultRequest extends TeaModel {
    /**
     * <p>The opaque task ID returned by CreateC2paSignTask, up to 64 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7093c29e-f472-4e1e-91c6-a43df7c7382e</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetC2paSignResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetC2paSignResultRequest self = new GetC2paSignResultRequest();
        return TeaModel.build(map, self);
    }

    public GetC2paSignResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
