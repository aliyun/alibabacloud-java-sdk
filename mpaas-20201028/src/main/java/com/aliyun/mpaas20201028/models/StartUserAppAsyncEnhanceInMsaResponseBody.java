// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class StartUserAppAsyncEnhanceInMsaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public StartUserAppAsyncEnhanceInMsaResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static StartUserAppAsyncEnhanceInMsaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartUserAppAsyncEnhanceInMsaResponseBody self = new StartUserAppAsyncEnhanceInMsaResponseBody();
        return TeaModel.build(map, self);
    }

    public StartUserAppAsyncEnhanceInMsaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartUserAppAsyncEnhanceInMsaResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartUserAppAsyncEnhanceInMsaResponseBody setResultContent(StartUserAppAsyncEnhanceInMsaResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public StartUserAppAsyncEnhanceInMsaResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public StartUserAppAsyncEnhanceInMsaResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class StartUserAppAsyncEnhanceInMsaResponseBodyResultContentDataEnhanceMapping extends TeaModel {
        @NameInMap("Info")
        public String info;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("Type")
        public String type;

        public static StartUserAppAsyncEnhanceInMsaResponseBodyResultContentDataEnhanceMapping build(java.util.Map<String, ?> map) throws Exception {
            StartUserAppAsyncEnhanceInMsaResponseBodyResultContentDataEnhanceMapping self = new StartUserAppAsyncEnhanceInMsaResponseBodyResultContentDataEnhanceMapping();
            return TeaModel.build(map, self);
        }

        public StartUserAppAsyncEnhanceInMsaResponseBodyResultContentDataEnhanceMapping setInfo(String info) {
            this.info = info;
            return this;
        }
        public String getInfo() {
            return this.info;
        }

        public StartUserAppAsyncEnhanceInMsaResponseBodyResultContentDataEnhanceMapping setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public StartUserAppAsyncEnhanceInMsaResponseBodyResultContentDataEnhanceMapping setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class StartUserAppAsyncEnhanceInMsaResponseBodyResultContentData extends TeaModel {
        @NameInMap("AfterMd5")
        public String afterMd5;

        @NameInMap("AfterSize")
        public Long afterSize;

        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("AppPackage")
        public String appPackage;

        @NameInMap("BeforeMd5")
        public String beforeMd5;

        @NameInMap("BeforeSize")
        public Long beforeSize;

        @NameInMap("ClassForest")
        public String classForest;

        @NameInMap("EnhanceMapping")
        public java.util.List<StartUserAppAsyncEnhanceInMsaResponseBodyResultContentDataEnhanceMapping> enhanceMapping;

        @NameInMap("EnhanceRules")
        public java.util.List<String> enhanceRules;

        @NameInMap("EnhancedClasses")
        public java.util.List<String> enhancedClasses;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Label")
        public String label;

        @NameInMap("Progress")
        public Long progress;

        @NameInMap("Status")
        public Long status;

        @NameInMap("TaskType")
        public String taskType;

        @NameInMap("VersionCode")
        public String versionCode;

        @NameInMap("VersionName")
        public String versionName;

        public static StartUserAppAsyncEnhanceInMsaResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            StartUserAppAsyncEnhanceInMsaResponseBodyResultContentData self = new StartUserAppAsyncEnhanceInMsaResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public StartUserAppAsyncEnhanceInMsaResponseBodyResultContentData setAfterMd5(String afterMd5) {
            this.afterMd5 = afterMd5;
            return this;
        }
        public String getAfterMd5() {
            return this.afterMd5;
        }

        public StartUserAppAsyncEnhanceInMsaResponseBodyResultContentData setAfterSize(Long afterSize) {
            this.afterSize = afterSize;
            return this;
        }
        public Long getAfterSize() {
            return this.afterSize;
        }

        public StartUserAppAsyncEnhanceInMsaResponseBodyResultContentData setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public StartUserAppAsyncEnhanceInMsaResponseBodyResultContentData setAppPackage(String appPackage) {
            this.appPackage = appPackage;
            return this;
        }
        public String getAppPackage() {
            return this.appPackage;
        }

        public StartUserAppAsyncEnhanceInMsaResponseBodyResultContentData setBeforeMd5(String beforeMd5) {
            this.beforeMd5 = beforeMd5;
            return this;
        }
        public String getBeforeMd5() {
            return this.beforeMd5;
        }

        public StartUserAppAsyncEnhanceInMsaResponseBodyResultContentData setBeforeSize(Long beforeSize) {
            this.beforeSize = beforeSize;
            return this;
        }
        public Long getBeforeSize() {
            return this.beforeSize;
        }

        public StartUserAppAsyncEnhanceInMsaResponseBodyResultContentData setClassForest(String classForest) {
            this.classForest = classForest;
            return this;
        }
        public String getClassForest() {
            return this.classForest;
        }

        public StartUserAppAsyncEnhanceInMsaResponseBodyResultContentData setEnhanceMapping(java.util.List<StartUserAppAsyncEnhanceInMsaResponseBodyResultContentDataEnhanceMapping> enhanceMapping) {
            this.enhanceMapping = enhanceMapping;
            return this;
        }
        public java.util.List<StartUserAppAsyncEnhanceInMsaResponseBodyResultContentDataEnhanceMapping> getEnhanceMapping() {
            return this.enhanceMapping;
        }

        public StartUserAppAsyncEnhanceInMsaResponseBodyResultContentData setEnhanceRules(java.util.List<String> enhanceRules) {
            this.enhanceRules = enhanceRules;
            return this;
        }
        public java.util.List<String> getEnhanceRules() {
            return this.enhanceRules;
        }

        public StartUserAppAsyncEnhanceInMsaResponseBodyResultContentData setEnhancedClasses(java.util.List<String> enhancedClasses) {
            this.enhancedClasses = enhancedClasses;
            return this;
        }
        public java.util.List<String> getEnhancedClasses() {
            return this.enhancedClasses;
        }

        public StartUserAppAsyncEnhanceInMsaResponseBodyResultContentData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public StartUserAppAsyncEnhanceInMsaResponseBodyResultContentData setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public StartUserAppAsyncEnhanceInMsaResponseBodyResultContentData setProgress(Long progress) {
            this.progress = progress;
            return this;
        }
        public Long getProgress() {
            return this.progress;
        }

        public StartUserAppAsyncEnhanceInMsaResponseBodyResultContentData setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public StartUserAppAsyncEnhanceInMsaResponseBodyResultContentData setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public StartUserAppAsyncEnhanceInMsaResponseBodyResultContentData setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

        public StartUserAppAsyncEnhanceInMsaResponseBodyResultContentData setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

    }

    public static class StartUserAppAsyncEnhanceInMsaResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Data")
        public StartUserAppAsyncEnhanceInMsaResponseBodyResultContentData data;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static StartUserAppAsyncEnhanceInMsaResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            StartUserAppAsyncEnhanceInMsaResponseBodyResultContent self = new StartUserAppAsyncEnhanceInMsaResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public StartUserAppAsyncEnhanceInMsaResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public StartUserAppAsyncEnhanceInMsaResponseBodyResultContent setData(StartUserAppAsyncEnhanceInMsaResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public StartUserAppAsyncEnhanceInMsaResponseBodyResultContentData getData() {
            return this.data;
        }

        public StartUserAppAsyncEnhanceInMsaResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public StartUserAppAsyncEnhanceInMsaResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
