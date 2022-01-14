// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetUserAppEnhanceProcessInMsaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public GetUserAppEnhanceProcessInMsaResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static GetUserAppEnhanceProcessInMsaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserAppEnhanceProcessInMsaResponseBody self = new GetUserAppEnhanceProcessInMsaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserAppEnhanceProcessInMsaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserAppEnhanceProcessInMsaResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetUserAppEnhanceProcessInMsaResponseBody setResultContent(GetUserAppEnhanceProcessInMsaResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public GetUserAppEnhanceProcessInMsaResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public GetUserAppEnhanceProcessInMsaResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class GetUserAppEnhanceProcessInMsaResponseBodyResultContentDataEnhanceMapping extends TeaModel {
        @NameInMap("Info")
        public String info;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("Type")
        public String type;

        public static GetUserAppEnhanceProcessInMsaResponseBodyResultContentDataEnhanceMapping build(java.util.Map<String, ?> map) throws Exception {
            GetUserAppEnhanceProcessInMsaResponseBodyResultContentDataEnhanceMapping self = new GetUserAppEnhanceProcessInMsaResponseBodyResultContentDataEnhanceMapping();
            return TeaModel.build(map, self);
        }

        public GetUserAppEnhanceProcessInMsaResponseBodyResultContentDataEnhanceMapping setInfo(String info) {
            this.info = info;
            return this;
        }
        public String getInfo() {
            return this.info;
        }

        public GetUserAppEnhanceProcessInMsaResponseBodyResultContentDataEnhanceMapping setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public GetUserAppEnhanceProcessInMsaResponseBodyResultContentDataEnhanceMapping setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetUserAppEnhanceProcessInMsaResponseBodyResultContentData extends TeaModel {
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
        public java.util.List<String> classForest;

        @NameInMap("EnhanceMapping")
        public java.util.List<GetUserAppEnhanceProcessInMsaResponseBodyResultContentDataEnhanceMapping> enhanceMapping;

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

        public static GetUserAppEnhanceProcessInMsaResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            GetUserAppEnhanceProcessInMsaResponseBodyResultContentData self = new GetUserAppEnhanceProcessInMsaResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public GetUserAppEnhanceProcessInMsaResponseBodyResultContentData setAfterMd5(String afterMd5) {
            this.afterMd5 = afterMd5;
            return this;
        }
        public String getAfterMd5() {
            return this.afterMd5;
        }

        public GetUserAppEnhanceProcessInMsaResponseBodyResultContentData setAfterSize(Long afterSize) {
            this.afterSize = afterSize;
            return this;
        }
        public Long getAfterSize() {
            return this.afterSize;
        }

        public GetUserAppEnhanceProcessInMsaResponseBodyResultContentData setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public GetUserAppEnhanceProcessInMsaResponseBodyResultContentData setAppPackage(String appPackage) {
            this.appPackage = appPackage;
            return this;
        }
        public String getAppPackage() {
            return this.appPackage;
        }

        public GetUserAppEnhanceProcessInMsaResponseBodyResultContentData setBeforeMd5(String beforeMd5) {
            this.beforeMd5 = beforeMd5;
            return this;
        }
        public String getBeforeMd5() {
            return this.beforeMd5;
        }

        public GetUserAppEnhanceProcessInMsaResponseBodyResultContentData setBeforeSize(Long beforeSize) {
            this.beforeSize = beforeSize;
            return this;
        }
        public Long getBeforeSize() {
            return this.beforeSize;
        }

        public GetUserAppEnhanceProcessInMsaResponseBodyResultContentData setClassForest(java.util.List<String> classForest) {
            this.classForest = classForest;
            return this;
        }
        public java.util.List<String> getClassForest() {
            return this.classForest;
        }

        public GetUserAppEnhanceProcessInMsaResponseBodyResultContentData setEnhanceMapping(java.util.List<GetUserAppEnhanceProcessInMsaResponseBodyResultContentDataEnhanceMapping> enhanceMapping) {
            this.enhanceMapping = enhanceMapping;
            return this;
        }
        public java.util.List<GetUserAppEnhanceProcessInMsaResponseBodyResultContentDataEnhanceMapping> getEnhanceMapping() {
            return this.enhanceMapping;
        }

        public GetUserAppEnhanceProcessInMsaResponseBodyResultContentData setEnhanceRules(java.util.List<String> enhanceRules) {
            this.enhanceRules = enhanceRules;
            return this;
        }
        public java.util.List<String> getEnhanceRules() {
            return this.enhanceRules;
        }

        public GetUserAppEnhanceProcessInMsaResponseBodyResultContentData setEnhancedClasses(java.util.List<String> enhancedClasses) {
            this.enhancedClasses = enhancedClasses;
            return this;
        }
        public java.util.List<String> getEnhancedClasses() {
            return this.enhancedClasses;
        }

        public GetUserAppEnhanceProcessInMsaResponseBodyResultContentData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetUserAppEnhanceProcessInMsaResponseBodyResultContentData setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetUserAppEnhanceProcessInMsaResponseBodyResultContentData setProgress(Long progress) {
            this.progress = progress;
            return this;
        }
        public Long getProgress() {
            return this.progress;
        }

        public GetUserAppEnhanceProcessInMsaResponseBodyResultContentData setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public GetUserAppEnhanceProcessInMsaResponseBodyResultContentData setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public GetUserAppEnhanceProcessInMsaResponseBodyResultContentData setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

        public GetUserAppEnhanceProcessInMsaResponseBodyResultContentData setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

    }

    public static class GetUserAppEnhanceProcessInMsaResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Data")
        public GetUserAppEnhanceProcessInMsaResponseBodyResultContentData data;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static GetUserAppEnhanceProcessInMsaResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            GetUserAppEnhanceProcessInMsaResponseBodyResultContent self = new GetUserAppEnhanceProcessInMsaResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public GetUserAppEnhanceProcessInMsaResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetUserAppEnhanceProcessInMsaResponseBodyResultContent setData(GetUserAppEnhanceProcessInMsaResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public GetUserAppEnhanceProcessInMsaResponseBodyResultContentData getData() {
            return this.data;
        }

        public GetUserAppEnhanceProcessInMsaResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetUserAppEnhanceProcessInMsaResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
