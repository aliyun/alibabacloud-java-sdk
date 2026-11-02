// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetTaskAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The failure message.</p>
     * 
     * <strong>example:</strong>
     * <p>error</p>
     */
    @NameInMap("TaskMessage")
    public String taskMessage;

    /**
     * <p>The task result. Valid values:</p>
     * <ul>
     * <li>success: The submission succeeded.</li>
     * <li>processing: The submission is in progress.</li>
     * <li>failed: The submission failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("TaskStatus")
    public String taskStatus;

    public static GetTaskAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskAttributeResponseBody self = new GetTaskAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskAttributeResponseBody setTaskMessage(String taskMessage) {
        this.taskMessage = taskMessage;
        return this;
    }
    public String getTaskMessage() {
        return this.taskMessage;
    }

    public GetTaskAttributeResponseBody setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

}
