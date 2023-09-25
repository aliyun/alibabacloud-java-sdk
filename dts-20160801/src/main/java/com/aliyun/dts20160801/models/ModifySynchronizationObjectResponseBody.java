// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20160801.models;

import com.aliyun.tea.*;

public class ModifySynchronizationObjectResponseBody extends TeaModel {
    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    @NameInMap("TaskId")
    public String taskId;

    public static ModifySynchronizationObjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySynchronizationObjectResponseBody self = new ModifySynchronizationObjectResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySynchronizationObjectResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModifySynchronizationObjectResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModifySynchronizationObjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifySynchronizationObjectResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public ModifySynchronizationObjectResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
