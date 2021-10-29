// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class StopOrRollbackOptimizeTaskRequest extends TeaModel {
    @NameInMap("AccessKey")
    public String accessKey;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Signature")
    public String signature;

    @NameInMap("StopOrRollback")
    public String stopOrRollback;

    @NameInMap("TaskType")
    public String taskType;

    @NameInMap("TaskUuid")
    public String taskUuid;

    @NameInMap("Uid")
    public String uid;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("__context")
    public String context;

    public static StopOrRollbackOptimizeTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StopOrRollbackOptimizeTaskRequest self = new StopOrRollbackOptimizeTaskRequest();
        return TeaModel.build(map, self);
    }

    public StopOrRollbackOptimizeTaskRequest setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public StopOrRollbackOptimizeTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StopOrRollbackOptimizeTaskRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public StopOrRollbackOptimizeTaskRequest setStopOrRollback(String stopOrRollback) {
        this.stopOrRollback = stopOrRollback;
        return this;
    }
    public String getStopOrRollback() {
        return this.stopOrRollback;
    }

    public StopOrRollbackOptimizeTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public StopOrRollbackOptimizeTaskRequest setTaskUuid(String taskUuid) {
        this.taskUuid = taskUuid;
        return this;
    }
    public String getTaskUuid() {
        return this.taskUuid;
    }

    public StopOrRollbackOptimizeTaskRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public StopOrRollbackOptimizeTaskRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public StopOrRollbackOptimizeTaskRequest setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

}
