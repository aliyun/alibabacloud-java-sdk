// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetUserAppUploadProcessInMsaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public GetUserAppUploadProcessInMsaResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static GetUserAppUploadProcessInMsaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserAppUploadProcessInMsaResponseBody self = new GetUserAppUploadProcessInMsaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserAppUploadProcessInMsaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserAppUploadProcessInMsaResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetUserAppUploadProcessInMsaResponseBody setResultContent(GetUserAppUploadProcessInMsaResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public GetUserAppUploadProcessInMsaResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public GetUserAppUploadProcessInMsaResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class GetUserAppUploadProcessInMsaResponseBodyResultContentDataApkInfoEnhanceMapping extends TeaModel {
        @NameInMap("Info")
        public String info;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("Type")
        public String type;

        public static GetUserAppUploadProcessInMsaResponseBodyResultContentDataApkInfoEnhanceMapping build(java.util.Map<String, ?> map) throws Exception {
            GetUserAppUploadProcessInMsaResponseBodyResultContentDataApkInfoEnhanceMapping self = new GetUserAppUploadProcessInMsaResponseBodyResultContentDataApkInfoEnhanceMapping();
            return TeaModel.build(map, self);
        }

        public GetUserAppUploadProcessInMsaResponseBodyResultContentDataApkInfoEnhanceMapping setInfo(String info) {
            this.info = info;
            return this;
        }
        public String getInfo() {
            return this.info;
        }

        public GetUserAppUploadProcessInMsaResponseBodyResultContentDataApkInfoEnhanceMapping setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public GetUserAppUploadProcessInMsaResponseBodyResultContentDataApkInfoEnhanceMapping setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetUserAppUploadProcessInMsaResponseBodyResultContentDataApkInfo extends TeaModel {
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
        public java.util.List<GetUserAppUploadProcessInMsaResponseBodyResultContentDataApkInfoEnhanceMapping> enhanceMapping;

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

        public static GetUserAppUploadProcessInMsaResponseBodyResultContentDataApkInfo build(java.util.Map<String, ?> map) throws Exception {
            GetUserAppUploadProcessInMsaResponseBodyResultContentDataApkInfo self = new GetUserAppUploadProcessInMsaResponseBodyResultContentDataApkInfo();
            return TeaModel.build(map, self);
        }

        public GetUserAppUploadProcessInMsaResponseBodyResultContentDataApkInfo setAfterMd5(String afterMd5) {
            this.afterMd5 = afterMd5;
            return this;
        }
        public String getAfterMd5() {
            return this.afterMd5;
        }

        public GetUserAppUploadProcessInMsaResponseBodyResultContentDataApkInfo setAfterSize(Long afterSize) {
            this.afterSize = afterSize;
            return this;
        }
        public Long getAfterSize() {
            return this.afterSize;
        }

        public GetUserAppUploadProcessInMsaResponseBodyResultContentDataApkInfo setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public GetUserAppUploadProcessInMsaResponseBodyResultContentDataApkInfo setAppPackage(String appPackage) {
            this.appPackage = appPackage;
            return this;
        }
        public String getAppPackage() {
            return this.appPackage;
        }

        public GetUserAppUploadProcessInMsaResponseBodyResultContentDataApkInfo setBeforeMd5(String beforeMd5) {
            this.beforeMd5 = beforeMd5;
            return this;
        }
        public String getBeforeMd5() {
            return this.beforeMd5;
        }

        public GetUserAppUploadProcessInMsaResponseBodyResultContentDataApkInfo setBeforeSize(Long beforeSize) {
            this.beforeSize = beforeSize;
            return this;
        }
        public Long getBeforeSize() {
            return this.beforeSize;
        }

        public GetUserAppUploadProcessInMsaResponseBodyResultContentDataApkInfo setClassForest(String classForest) {
            this.classForest = classForest;
            return this;
        }
        public String getClassForest() {
            return this.classForest;
        }

        public GetUserAppUploadProcessInMsaResponseBodyResultContentDataApkInfo setEnhanceMapping(java.util.List<GetUserAppUploadProcessInMsaResponseBodyResultContentDataApkInfoEnhanceMapping> enhanceMapping) {
            this.enhanceMapping = enhanceMapping;
            return this;
        }
        public java.util.List<GetUserAppUploadProcessInMsaResponseBodyResultContentDataApkInfoEnhanceMapping> getEnhanceMapping() {
            return this.enhanceMapping;
        }

        public GetUserAppUploadProcessInMsaResponseBodyResultContentDataApkInfo setEnhanceRules(java.util.List<String> enhanceRules) {
            this.enhanceRules = enhanceRules;
            return this;
        }
        public java.util.List<String> getEnhanceRules() {
            return this.enhanceRules;
        }

        public GetUserAppUploadProcessInMsaResponseBodyResultContentDataApkInfo setEnhancedClasses(java.util.List<String> enhancedClasses) {
            this.enhancedClasses = enhancedClasses;
            return this;
        }
        public java.util.List<String> getEnhancedClasses() {
            return this.enhancedClasses;
        }

        public GetUserAppUploadProcessInMsaResponseBodyResultContentDataApkInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetUserAppUploadProcessInMsaResponseBodyResultContentDataApkInfo setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetUserAppUploadProcessInMsaResponseBodyResultContentDataApkInfo setProgress(Long progress) {
            this.progress = progress;
            return this;
        }
        public Long getProgress() {
            return this.progress;
        }

        public GetUserAppUploadProcessInMsaResponseBodyResultContentDataApkInfo setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public GetUserAppUploadProcessInMsaResponseBodyResultContentDataApkInfo setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public GetUserAppUploadProcessInMsaResponseBodyResultContentDataApkInfo setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

        public GetUserAppUploadProcessInMsaResponseBodyResultContentDataApkInfo setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

    }

    public static class GetUserAppUploadProcessInMsaResponseBodyResultContentData extends TeaModel {
        @NameInMap("ApkInfo")
        public GetUserAppUploadProcessInMsaResponseBodyResultContentDataApkInfo apkInfo;

        @NameInMap("EnhanceTaskId")
        public Long enhanceTaskId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Progress")
        public Long progress;

        @NameInMap("Status")
        public Long status;

        public static GetUserAppUploadProcessInMsaResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            GetUserAppUploadProcessInMsaResponseBodyResultContentData self = new GetUserAppUploadProcessInMsaResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public GetUserAppUploadProcessInMsaResponseBodyResultContentData setApkInfo(GetUserAppUploadProcessInMsaResponseBodyResultContentDataApkInfo apkInfo) {
            this.apkInfo = apkInfo;
            return this;
        }
        public GetUserAppUploadProcessInMsaResponseBodyResultContentDataApkInfo getApkInfo() {
            return this.apkInfo;
        }

        public GetUserAppUploadProcessInMsaResponseBodyResultContentData setEnhanceTaskId(Long enhanceTaskId) {
            this.enhanceTaskId = enhanceTaskId;
            return this;
        }
        public Long getEnhanceTaskId() {
            return this.enhanceTaskId;
        }

        public GetUserAppUploadProcessInMsaResponseBodyResultContentData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetUserAppUploadProcessInMsaResponseBodyResultContentData setProgress(Long progress) {
            this.progress = progress;
            return this;
        }
        public Long getProgress() {
            return this.progress;
        }

        public GetUserAppUploadProcessInMsaResponseBodyResultContentData setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

    }

    public static class GetUserAppUploadProcessInMsaResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Data")
        public GetUserAppUploadProcessInMsaResponseBodyResultContentData data;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static GetUserAppUploadProcessInMsaResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            GetUserAppUploadProcessInMsaResponseBodyResultContent self = new GetUserAppUploadProcessInMsaResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public GetUserAppUploadProcessInMsaResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetUserAppUploadProcessInMsaResponseBodyResultContent setData(GetUserAppUploadProcessInMsaResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public GetUserAppUploadProcessInMsaResponseBodyResultContentData getData() {
            return this.data;
        }

        public GetUserAppUploadProcessInMsaResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetUserAppUploadProcessInMsaResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
