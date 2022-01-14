// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class UploadUserAppToMsaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public UploadUserAppToMsaResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static UploadUserAppToMsaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadUserAppToMsaResponseBody self = new UploadUserAppToMsaResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadUserAppToMsaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadUserAppToMsaResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UploadUserAppToMsaResponseBody setResultContent(UploadUserAppToMsaResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public UploadUserAppToMsaResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public UploadUserAppToMsaResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class UploadUserAppToMsaResponseBodyResultContentDataApkInfoEnhanceMapping extends TeaModel {
        @NameInMap("Info")
        public String info;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("Type")
        public String type;

        public static UploadUserAppToMsaResponseBodyResultContentDataApkInfoEnhanceMapping build(java.util.Map<String, ?> map) throws Exception {
            UploadUserAppToMsaResponseBodyResultContentDataApkInfoEnhanceMapping self = new UploadUserAppToMsaResponseBodyResultContentDataApkInfoEnhanceMapping();
            return TeaModel.build(map, self);
        }

        public UploadUserAppToMsaResponseBodyResultContentDataApkInfoEnhanceMapping setInfo(String info) {
            this.info = info;
            return this;
        }
        public String getInfo() {
            return this.info;
        }

        public UploadUserAppToMsaResponseBodyResultContentDataApkInfoEnhanceMapping setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public UploadUserAppToMsaResponseBodyResultContentDataApkInfoEnhanceMapping setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UploadUserAppToMsaResponseBodyResultContentDataApkInfo extends TeaModel {
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
        public UploadUserAppToMsaResponseBodyResultContentDataApkInfoEnhanceMapping enhanceMapping;

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

        public static UploadUserAppToMsaResponseBodyResultContentDataApkInfo build(java.util.Map<String, ?> map) throws Exception {
            UploadUserAppToMsaResponseBodyResultContentDataApkInfo self = new UploadUserAppToMsaResponseBodyResultContentDataApkInfo();
            return TeaModel.build(map, self);
        }

        public UploadUserAppToMsaResponseBodyResultContentDataApkInfo setAfterMd5(String afterMd5) {
            this.afterMd5 = afterMd5;
            return this;
        }
        public String getAfterMd5() {
            return this.afterMd5;
        }

        public UploadUserAppToMsaResponseBodyResultContentDataApkInfo setAfterSize(Long afterSize) {
            this.afterSize = afterSize;
            return this;
        }
        public Long getAfterSize() {
            return this.afterSize;
        }

        public UploadUserAppToMsaResponseBodyResultContentDataApkInfo setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public UploadUserAppToMsaResponseBodyResultContentDataApkInfo setAppPackage(String appPackage) {
            this.appPackage = appPackage;
            return this;
        }
        public String getAppPackage() {
            return this.appPackage;
        }

        public UploadUserAppToMsaResponseBodyResultContentDataApkInfo setBeforeMd5(String beforeMd5) {
            this.beforeMd5 = beforeMd5;
            return this;
        }
        public String getBeforeMd5() {
            return this.beforeMd5;
        }

        public UploadUserAppToMsaResponseBodyResultContentDataApkInfo setBeforeSize(Long beforeSize) {
            this.beforeSize = beforeSize;
            return this;
        }
        public Long getBeforeSize() {
            return this.beforeSize;
        }

        public UploadUserAppToMsaResponseBodyResultContentDataApkInfo setClassForest(String classForest) {
            this.classForest = classForest;
            return this;
        }
        public String getClassForest() {
            return this.classForest;
        }

        public UploadUserAppToMsaResponseBodyResultContentDataApkInfo setEnhanceMapping(UploadUserAppToMsaResponseBodyResultContentDataApkInfoEnhanceMapping enhanceMapping) {
            this.enhanceMapping = enhanceMapping;
            return this;
        }
        public UploadUserAppToMsaResponseBodyResultContentDataApkInfoEnhanceMapping getEnhanceMapping() {
            return this.enhanceMapping;
        }

        public UploadUserAppToMsaResponseBodyResultContentDataApkInfo setEnhanceRules(java.util.List<String> enhanceRules) {
            this.enhanceRules = enhanceRules;
            return this;
        }
        public java.util.List<String> getEnhanceRules() {
            return this.enhanceRules;
        }

        public UploadUserAppToMsaResponseBodyResultContentDataApkInfo setEnhancedClasses(java.util.List<String> enhancedClasses) {
            this.enhancedClasses = enhancedClasses;
            return this;
        }
        public java.util.List<String> getEnhancedClasses() {
            return this.enhancedClasses;
        }

        public UploadUserAppToMsaResponseBodyResultContentDataApkInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UploadUserAppToMsaResponseBodyResultContentDataApkInfo setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public UploadUserAppToMsaResponseBodyResultContentDataApkInfo setProgress(Long progress) {
            this.progress = progress;
            return this;
        }
        public Long getProgress() {
            return this.progress;
        }

        public UploadUserAppToMsaResponseBodyResultContentDataApkInfo setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public UploadUserAppToMsaResponseBodyResultContentDataApkInfo setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public UploadUserAppToMsaResponseBodyResultContentDataApkInfo setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

        public UploadUserAppToMsaResponseBodyResultContentDataApkInfo setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

    }

    public static class UploadUserAppToMsaResponseBodyResultContentData extends TeaModel {
        @NameInMap("ApkInfo")
        public UploadUserAppToMsaResponseBodyResultContentDataApkInfo apkInfo;

        @NameInMap("EnhanceTaskId")
        public Long enhanceTaskId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Progress")
        public Long progress;

        @NameInMap("Status")
        public Long status;

        public static UploadUserAppToMsaResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            UploadUserAppToMsaResponseBodyResultContentData self = new UploadUserAppToMsaResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public UploadUserAppToMsaResponseBodyResultContentData setApkInfo(UploadUserAppToMsaResponseBodyResultContentDataApkInfo apkInfo) {
            this.apkInfo = apkInfo;
            return this;
        }
        public UploadUserAppToMsaResponseBodyResultContentDataApkInfo getApkInfo() {
            return this.apkInfo;
        }

        public UploadUserAppToMsaResponseBodyResultContentData setEnhanceTaskId(Long enhanceTaskId) {
            this.enhanceTaskId = enhanceTaskId;
            return this;
        }
        public Long getEnhanceTaskId() {
            return this.enhanceTaskId;
        }

        public UploadUserAppToMsaResponseBodyResultContentData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UploadUserAppToMsaResponseBodyResultContentData setProgress(Long progress) {
            this.progress = progress;
            return this;
        }
        public Long getProgress() {
            return this.progress;
        }

        public UploadUserAppToMsaResponseBodyResultContentData setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

    }

    public static class UploadUserAppToMsaResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Data")
        public UploadUserAppToMsaResponseBodyResultContentData data;

        @NameInMap("Extra")
        public String extra;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static UploadUserAppToMsaResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            UploadUserAppToMsaResponseBodyResultContent self = new UploadUserAppToMsaResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public UploadUserAppToMsaResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UploadUserAppToMsaResponseBodyResultContent setData(UploadUserAppToMsaResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public UploadUserAppToMsaResponseBodyResultContentData getData() {
            return this.data;
        }

        public UploadUserAppToMsaResponseBodyResultContent setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public UploadUserAppToMsaResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UploadUserAppToMsaResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
