// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class CreateDBImportTaskResponseBody extends TeaModel {
    @NameInMap("Host")
    public String host;

    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("FileKey")
    public String fileKey;

    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("Signature")
    public String signature;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Policy")
    public String policy;

    @NameInMap("TaskId")
    public String taskId;

    public static CreateDBImportTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDBImportTaskResponseBody self = new CreateDBImportTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDBImportTaskResponseBody setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public CreateDBImportTaskResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public CreateDBImportTaskResponseBody setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public CreateDBImportTaskResponseBody setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public CreateDBImportTaskResponseBody setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public CreateDBImportTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDBImportTaskResponseBody setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public CreateDBImportTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
