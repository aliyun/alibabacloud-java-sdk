// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateCompressPointCloudTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0B7-1LR4Wcue1aBhk2xT85MfL*****</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <strong>example:</strong>
     * <p>CA995EFD-083D-4F40-BE8A-BDF75FFF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>PointCloudCompress-badda57d-a3ab-4e6d-938f-49b77ce****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CreateCompressPointCloudTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCompressPointCloudTaskResponseBody self = new CreateCompressPointCloudTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCompressPointCloudTaskResponseBody setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public CreateCompressPointCloudTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCompressPointCloudTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
