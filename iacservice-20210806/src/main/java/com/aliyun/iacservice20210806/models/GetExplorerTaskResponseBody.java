// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetExplorerTaskResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("task")
    public GetExplorerTaskResponseBodyTask task;

    public static GetExplorerTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExplorerTaskResponseBody self = new GetExplorerTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExplorerTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetExplorerTaskResponseBody setTask(GetExplorerTaskResponseBodyTask task) {
        this.task = task;
        return this;
    }
    public GetExplorerTaskResponseBodyTask getTask() {
        return this.task;
    }

    public static class GetExplorerTaskResponseBodyTaskUploadSignature extends TeaModel {
        @NameInMap("accessKeyId")
        public String accessKeyId;

        @NameInMap("bucketName")
        public String bucketName;

        @NameInMap("key")
        public String key;

        @NameInMap("policy")
        public String policy;

        @NameInMap("signature")
        public String signature;

        @NameInMap("url")
        public String url;

        public static GetExplorerTaskResponseBodyTaskUploadSignature build(java.util.Map<String, ?> map) throws Exception {
            GetExplorerTaskResponseBodyTaskUploadSignature self = new GetExplorerTaskResponseBodyTaskUploadSignature();
            return TeaModel.build(map, self);
        }

        public GetExplorerTaskResponseBodyTaskUploadSignature setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetExplorerTaskResponseBodyTaskUploadSignature setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public GetExplorerTaskResponseBodyTaskUploadSignature setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetExplorerTaskResponseBodyTaskUploadSignature setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetExplorerTaskResponseBodyTaskUploadSignature setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GetExplorerTaskResponseBodyTaskUploadSignature setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetExplorerTaskResponseBodyTask extends TeaModel {
        @NameInMap("autoApply")
        public Boolean autoApply;

        @NameInMap("autoDestroy")
        public Boolean autoDestroy;

        @NameInMap("createTime")
        public String createTime;

        @NameInMap("currentJobId")
        public String currentJobId;

        @NameInMap("description")
        public String description;

        @NameInMap("explorerTaskId")
        public String explorerTaskId;

        @NameInMap("initModuleState")
        public Boolean initModuleState;

        @NameInMap("moduleId")
        public String moduleId;

        @NameInMap("moduleVersion")
        public String moduleVersion;

        @NameInMap("name")
        public String name;

        @NameInMap("skipPropertyValidation")
        public Boolean skipPropertyValidation;

        @NameInMap("status")
        public String status;

        @NameInMap("taskOutputPath")
        public String taskOutputPath;

        @NameInMap("terraformVersion")
        public String terraformVersion;

        @NameInMap("triggerValue")
        public String triggerValue;

        @NameInMap("uploadSignature")
        public GetExplorerTaskResponseBodyTaskUploadSignature uploadSignature;

        public static GetExplorerTaskResponseBodyTask build(java.util.Map<String, ?> map) throws Exception {
            GetExplorerTaskResponseBodyTask self = new GetExplorerTaskResponseBodyTask();
            return TeaModel.build(map, self);
        }

        public GetExplorerTaskResponseBodyTask setAutoApply(Boolean autoApply) {
            this.autoApply = autoApply;
            return this;
        }
        public Boolean getAutoApply() {
            return this.autoApply;
        }

        public GetExplorerTaskResponseBodyTask setAutoDestroy(Boolean autoDestroy) {
            this.autoDestroy = autoDestroy;
            return this;
        }
        public Boolean getAutoDestroy() {
            return this.autoDestroy;
        }

        public GetExplorerTaskResponseBodyTask setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetExplorerTaskResponseBodyTask setCurrentJobId(String currentJobId) {
            this.currentJobId = currentJobId;
            return this;
        }
        public String getCurrentJobId() {
            return this.currentJobId;
        }

        public GetExplorerTaskResponseBodyTask setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetExplorerTaskResponseBodyTask setExplorerTaskId(String explorerTaskId) {
            this.explorerTaskId = explorerTaskId;
            return this;
        }
        public String getExplorerTaskId() {
            return this.explorerTaskId;
        }

        public GetExplorerTaskResponseBodyTask setInitModuleState(Boolean initModuleState) {
            this.initModuleState = initModuleState;
            return this;
        }
        public Boolean getInitModuleState() {
            return this.initModuleState;
        }

        public GetExplorerTaskResponseBodyTask setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public GetExplorerTaskResponseBodyTask setModuleVersion(String moduleVersion) {
            this.moduleVersion = moduleVersion;
            return this;
        }
        public String getModuleVersion() {
            return this.moduleVersion;
        }

        public GetExplorerTaskResponseBodyTask setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetExplorerTaskResponseBodyTask setSkipPropertyValidation(Boolean skipPropertyValidation) {
            this.skipPropertyValidation = skipPropertyValidation;
            return this;
        }
        public Boolean getSkipPropertyValidation() {
            return this.skipPropertyValidation;
        }

        public GetExplorerTaskResponseBodyTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetExplorerTaskResponseBodyTask setTaskOutputPath(String taskOutputPath) {
            this.taskOutputPath = taskOutputPath;
            return this;
        }
        public String getTaskOutputPath() {
            return this.taskOutputPath;
        }

        public GetExplorerTaskResponseBodyTask setTerraformVersion(String terraformVersion) {
            this.terraformVersion = terraformVersion;
            return this;
        }
        public String getTerraformVersion() {
            return this.terraformVersion;
        }

        public GetExplorerTaskResponseBodyTask setTriggerValue(String triggerValue) {
            this.triggerValue = triggerValue;
            return this;
        }
        public String getTriggerValue() {
            return this.triggerValue;
        }

        public GetExplorerTaskResponseBodyTask setUploadSignature(GetExplorerTaskResponseBodyTaskUploadSignature uploadSignature) {
            this.uploadSignature = uploadSignature;
            return this;
        }
        public GetExplorerTaskResponseBodyTaskUploadSignature getUploadSignature() {
            return this.uploadSignature;
        }

    }

}
