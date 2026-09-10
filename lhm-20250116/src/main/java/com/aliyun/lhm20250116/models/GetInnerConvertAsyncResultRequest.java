// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetInnerConvertAsyncResultRequest extends TeaModel {
    /**
     * <p>The task ID that uniquely identifies a task.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static GetInnerConvertAsyncResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInnerConvertAsyncResultRequest self = new GetInnerConvertAsyncResultRequest();
        return TeaModel.build(map, self);
    }

    public GetInnerConvertAsyncResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
