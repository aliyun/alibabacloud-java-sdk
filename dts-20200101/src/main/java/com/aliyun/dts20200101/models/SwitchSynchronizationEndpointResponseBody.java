// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class SwitchSynchronizationEndpointResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call failed.</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the call failed.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The task ID. You must specify the task ID when you call the [DescribeEndpointSwitchStatus](https://help.aliyun.com/document_detail/135598.html) operation to query the execution status of the task.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static SwitchSynchronizationEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SwitchSynchronizationEndpointResponseBody self = new SwitchSynchronizationEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public SwitchSynchronizationEndpointResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public SwitchSynchronizationEndpointResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public SwitchSynchronizationEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SwitchSynchronizationEndpointResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public SwitchSynchronizationEndpointResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
