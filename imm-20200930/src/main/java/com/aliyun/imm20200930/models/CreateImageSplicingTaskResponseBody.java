// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateImageSplicingTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10C-1R6p7Km0H5Ieg38LKXTIvw*****</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <strong>example:</strong>
     * <p>94D6F994-E298-037E-8E8B-0090F27*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>ImageSplicing-537cc157-7645-444a-a631-c8db4d02*****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CreateImageSplicingTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateImageSplicingTaskResponseBody self = new CreateImageSplicingTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateImageSplicingTaskResponseBody setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public CreateImageSplicingTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateImageSplicingTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
