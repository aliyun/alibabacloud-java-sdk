// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class StorageCollectTaskOperationResult extends TeaModel {
    @NameInMap("DlfCreated")
    public Boolean dlfCreated;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TaskType")
    public String taskType;

    public static StorageCollectTaskOperationResult build(java.util.Map<String, ?> map) throws Exception {
        StorageCollectTaskOperationResult self = new StorageCollectTaskOperationResult();
        return TeaModel.build(map, self);
    }

    public StorageCollectTaskOperationResult setDlfCreated(Boolean dlfCreated) {
        this.dlfCreated = dlfCreated;
        return this;
    }
    public Boolean getDlfCreated() {
        return this.dlfCreated;
    }

    public StorageCollectTaskOperationResult setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public StorageCollectTaskOperationResult setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public StorageCollectTaskOperationResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public StorageCollectTaskOperationResult setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public StorageCollectTaskOperationResult setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
