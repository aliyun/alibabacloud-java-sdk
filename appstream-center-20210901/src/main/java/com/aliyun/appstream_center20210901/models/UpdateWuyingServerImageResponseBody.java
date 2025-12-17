// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class UpdateWuyingServerImageResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the update task.</p>
     * 
     * <strong>example:</strong>
     * <p>ota-be7jzm29wrrz5****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static UpdateWuyingServerImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWuyingServerImageResponseBody self = new UpdateWuyingServerImageResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWuyingServerImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateWuyingServerImageResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
