// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateProtectdBranchResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public CreateProtectdBranchResponseBodyResult result;

    @NameInMap("success")
    public Boolean success;

    public static CreateProtectdBranchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProtectdBranchResponseBody self = new CreateProtectdBranchResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProtectdBranchResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateProtectdBranchResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateProtectdBranchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateProtectdBranchResponseBody setResult(CreateProtectdBranchResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateProtectdBranchResponseBodyResult getResult() {
        return this.result;
    }

    public CreateProtectdBranchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateProtectdBranchResponseBodyResultMergeRequestSetting extends TeaModel {
        @NameInMap("allowMergeRequestRoles")
        public java.util.List<Integer> allowMergeRequestRoles;

        @NameInMap("defaultAssignees")
        public java.util.List<String> defaultAssignees;

        @NameInMap("isAllowSelfApproval")
        public Boolean isAllowSelfApproval;

        @NameInMap("isRequireDiscussionProcessed")
        public Boolean isRequireDiscussionProcessed;

        @NameInMap("isRequired")
        public Boolean isRequired;

        @NameInMap("isResetApprovalWhenNewPush")
        public Boolean isResetApprovalWhenNewPush;

        @NameInMap("minimumApproval")
        public Integer minimumApproval;

        @NameInMap("mrMode")
        public String mrMode;

        @NameInMap("whiteList")
        public String whiteList;

        public static CreateProtectdBranchResponseBodyResultMergeRequestSetting build(java.util.Map<String, ?> map) throws Exception {
            CreateProtectdBranchResponseBodyResultMergeRequestSetting self = new CreateProtectdBranchResponseBodyResultMergeRequestSetting();
            return TeaModel.build(map, self);
        }

        public CreateProtectdBranchResponseBodyResultMergeRequestSetting setAllowMergeRequestRoles(java.util.List<Integer> allowMergeRequestRoles) {
            this.allowMergeRequestRoles = allowMergeRequestRoles;
            return this;
        }
        public java.util.List<Integer> getAllowMergeRequestRoles() {
            return this.allowMergeRequestRoles;
        }

        public CreateProtectdBranchResponseBodyResultMergeRequestSetting setDefaultAssignees(java.util.List<String> defaultAssignees) {
            this.defaultAssignees = defaultAssignees;
            return this;
        }
        public java.util.List<String> getDefaultAssignees() {
            return this.defaultAssignees;
        }

        public CreateProtectdBranchResponseBodyResultMergeRequestSetting setIsAllowSelfApproval(Boolean isAllowSelfApproval) {
            this.isAllowSelfApproval = isAllowSelfApproval;
            return this;
        }
        public Boolean getIsAllowSelfApproval() {
            return this.isAllowSelfApproval;
        }

        public CreateProtectdBranchResponseBodyResultMergeRequestSetting setIsRequireDiscussionProcessed(Boolean isRequireDiscussionProcessed) {
            this.isRequireDiscussionProcessed = isRequireDiscussionProcessed;
            return this;
        }
        public Boolean getIsRequireDiscussionProcessed() {
            return this.isRequireDiscussionProcessed;
        }

        public CreateProtectdBranchResponseBodyResultMergeRequestSetting setIsRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            return this;
        }
        public Boolean getIsRequired() {
            return this.isRequired;
        }

        public CreateProtectdBranchResponseBodyResultMergeRequestSetting setIsResetApprovalWhenNewPush(Boolean isResetApprovalWhenNewPush) {
            this.isResetApprovalWhenNewPush = isResetApprovalWhenNewPush;
            return this;
        }
        public Boolean getIsResetApprovalWhenNewPush() {
            return this.isResetApprovalWhenNewPush;
        }

        public CreateProtectdBranchResponseBodyResultMergeRequestSetting setMinimumApproval(Integer minimumApproval) {
            this.minimumApproval = minimumApproval;
            return this;
        }
        public Integer getMinimumApproval() {
            return this.minimumApproval;
        }

        public CreateProtectdBranchResponseBodyResultMergeRequestSetting setMrMode(String mrMode) {
            this.mrMode = mrMode;
            return this;
        }
        public String getMrMode() {
            return this.mrMode;
        }

        public CreateProtectdBranchResponseBodyResultMergeRequestSetting setWhiteList(String whiteList) {
            this.whiteList = whiteList;
            return this;
        }
        public String getWhiteList() {
            return this.whiteList;
        }

    }

    public static class CreateProtectdBranchResponseBodyResultTestSettingDTOCheckConfigCheckItems extends TeaModel {
        @NameInMap("isRequired")
        public Boolean isRequired;

        @NameInMap("name")
        public String name;

        public static CreateProtectdBranchResponseBodyResultTestSettingDTOCheckConfigCheckItems build(java.util.Map<String, ?> map) throws Exception {
            CreateProtectdBranchResponseBodyResultTestSettingDTOCheckConfigCheckItems self = new CreateProtectdBranchResponseBodyResultTestSettingDTOCheckConfigCheckItems();
            return TeaModel.build(map, self);
        }

        public CreateProtectdBranchResponseBodyResultTestSettingDTOCheckConfigCheckItems setIsRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            return this;
        }
        public Boolean getIsRequired() {
            return this.isRequired;
        }

        public CreateProtectdBranchResponseBodyResultTestSettingDTOCheckConfigCheckItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateProtectdBranchResponseBodyResultTestSettingDTOCheckConfig extends TeaModel {
        @NameInMap("checkItems")
        public java.util.List<CreateProtectdBranchResponseBodyResultTestSettingDTOCheckConfigCheckItems> checkItems;

        public static CreateProtectdBranchResponseBodyResultTestSettingDTOCheckConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateProtectdBranchResponseBodyResultTestSettingDTOCheckConfig self = new CreateProtectdBranchResponseBodyResultTestSettingDTOCheckConfig();
            return TeaModel.build(map, self);
        }

        public CreateProtectdBranchResponseBodyResultTestSettingDTOCheckConfig setCheckItems(java.util.List<CreateProtectdBranchResponseBodyResultTestSettingDTOCheckConfigCheckItems> checkItems) {
            this.checkItems = checkItems;
            return this;
        }
        public java.util.List<CreateProtectdBranchResponseBodyResultTestSettingDTOCheckConfigCheckItems> getCheckItems() {
            return this.checkItems;
        }

    }

    public static class CreateProtectdBranchResponseBodyResultTestSettingDTOCheckTaskQualityConfig extends TeaModel {
        @NameInMap("bizNo")
        public String bizNo;

        @NameInMap("enabled")
        public Boolean enabled;

        @NameInMap("message")
        public String message;

        @NameInMap("taskName")
        public String taskName;

        public static CreateProtectdBranchResponseBodyResultTestSettingDTOCheckTaskQualityConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateProtectdBranchResponseBodyResultTestSettingDTOCheckTaskQualityConfig self = new CreateProtectdBranchResponseBodyResultTestSettingDTOCheckTaskQualityConfig();
            return TeaModel.build(map, self);
        }

        public CreateProtectdBranchResponseBodyResultTestSettingDTOCheckTaskQualityConfig setBizNo(String bizNo) {
            this.bizNo = bizNo;
            return this;
        }
        public String getBizNo() {
            return this.bizNo;
        }

        public CreateProtectdBranchResponseBodyResultTestSettingDTOCheckTaskQualityConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateProtectdBranchResponseBodyResultTestSettingDTOCheckTaskQualityConfig setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateProtectdBranchResponseBodyResultTestSettingDTOCheckTaskQualityConfig setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

    public static class CreateProtectdBranchResponseBodyResultTestSettingDTOCodeGuidelinesDetection extends TeaModel {
        @NameInMap("enabled")
        public Boolean enabled;

        @NameInMap("message")
        public String message;

        public static CreateProtectdBranchResponseBodyResultTestSettingDTOCodeGuidelinesDetection build(java.util.Map<String, ?> map) throws Exception {
            CreateProtectdBranchResponseBodyResultTestSettingDTOCodeGuidelinesDetection self = new CreateProtectdBranchResponseBodyResultTestSettingDTOCodeGuidelinesDetection();
            return TeaModel.build(map, self);
        }

        public CreateProtectdBranchResponseBodyResultTestSettingDTOCodeGuidelinesDetection setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateProtectdBranchResponseBodyResultTestSettingDTOCodeGuidelinesDetection setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class CreateProtectdBranchResponseBodyResultTestSettingDTOSensitiveInfoDetection extends TeaModel {
        @NameInMap("enabled")
        public Boolean enabled;

        @NameInMap("message")
        public String message;

        public static CreateProtectdBranchResponseBodyResultTestSettingDTOSensitiveInfoDetection build(java.util.Map<String, ?> map) throws Exception {
            CreateProtectdBranchResponseBodyResultTestSettingDTOSensitiveInfoDetection self = new CreateProtectdBranchResponseBodyResultTestSettingDTOSensitiveInfoDetection();
            return TeaModel.build(map, self);
        }

        public CreateProtectdBranchResponseBodyResultTestSettingDTOSensitiveInfoDetection setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateProtectdBranchResponseBodyResultTestSettingDTOSensitiveInfoDetection setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class CreateProtectdBranchResponseBodyResultTestSettingDTO extends TeaModel {
        @NameInMap("checkConfig")
        public CreateProtectdBranchResponseBodyResultTestSettingDTOCheckConfig checkConfig;

        @NameInMap("checkTaskQualityConfig")
        public CreateProtectdBranchResponseBodyResultTestSettingDTOCheckTaskQualityConfig checkTaskQualityConfig;

        @NameInMap("codeGuidelinesDetection")
        public CreateProtectdBranchResponseBodyResultTestSettingDTOCodeGuidelinesDetection codeGuidelinesDetection;

        @NameInMap("isRequired")
        public Boolean isRequired;

        @NameInMap("sensitiveInfoDetection")
        public CreateProtectdBranchResponseBodyResultTestSettingDTOSensitiveInfoDetection sensitiveInfoDetection;

        public static CreateProtectdBranchResponseBodyResultTestSettingDTO build(java.util.Map<String, ?> map) throws Exception {
            CreateProtectdBranchResponseBodyResultTestSettingDTO self = new CreateProtectdBranchResponseBodyResultTestSettingDTO();
            return TeaModel.build(map, self);
        }

        public CreateProtectdBranchResponseBodyResultTestSettingDTO setCheckConfig(CreateProtectdBranchResponseBodyResultTestSettingDTOCheckConfig checkConfig) {
            this.checkConfig = checkConfig;
            return this;
        }
        public CreateProtectdBranchResponseBodyResultTestSettingDTOCheckConfig getCheckConfig() {
            return this.checkConfig;
        }

        public CreateProtectdBranchResponseBodyResultTestSettingDTO setCheckTaskQualityConfig(CreateProtectdBranchResponseBodyResultTestSettingDTOCheckTaskQualityConfig checkTaskQualityConfig) {
            this.checkTaskQualityConfig = checkTaskQualityConfig;
            return this;
        }
        public CreateProtectdBranchResponseBodyResultTestSettingDTOCheckTaskQualityConfig getCheckTaskQualityConfig() {
            return this.checkTaskQualityConfig;
        }

        public CreateProtectdBranchResponseBodyResultTestSettingDTO setCodeGuidelinesDetection(CreateProtectdBranchResponseBodyResultTestSettingDTOCodeGuidelinesDetection codeGuidelinesDetection) {
            this.codeGuidelinesDetection = codeGuidelinesDetection;
            return this;
        }
        public CreateProtectdBranchResponseBodyResultTestSettingDTOCodeGuidelinesDetection getCodeGuidelinesDetection() {
            return this.codeGuidelinesDetection;
        }

        public CreateProtectdBranchResponseBodyResultTestSettingDTO setIsRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            return this;
        }
        public Boolean getIsRequired() {
            return this.isRequired;
        }

        public CreateProtectdBranchResponseBodyResultTestSettingDTO setSensitiveInfoDetection(CreateProtectdBranchResponseBodyResultTestSettingDTOSensitiveInfoDetection sensitiveInfoDetection) {
            this.sensitiveInfoDetection = sensitiveInfoDetection;
            return this;
        }
        public CreateProtectdBranchResponseBodyResultTestSettingDTOSensitiveInfoDetection getSensitiveInfoDetection() {
            return this.sensitiveInfoDetection;
        }

    }

    public static class CreateProtectdBranchResponseBodyResult extends TeaModel {
        @NameInMap("allowMergeRoles")
        public java.util.List<Integer> allowMergeRoles;

        @NameInMap("allowMergeUserIds")
        public java.util.List<Long> allowMergeUserIds;

        @NameInMap("allowPushRoles")
        public java.util.List<Integer> allowPushRoles;

        @NameInMap("allowPushUserIds")
        public java.util.List<Long> allowPushUserIds;

        @NameInMap("branch")
        public String branch;

        @NameInMap("id")
        public Long id;

        @NameInMap("mergeRequestSetting")
        public CreateProtectdBranchResponseBodyResultMergeRequestSetting mergeRequestSetting;

        @NameInMap("testSettingDTO")
        public CreateProtectdBranchResponseBodyResultTestSettingDTO testSettingDTO;

        public static CreateProtectdBranchResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateProtectdBranchResponseBodyResult self = new CreateProtectdBranchResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateProtectdBranchResponseBodyResult setAllowMergeRoles(java.util.List<Integer> allowMergeRoles) {
            this.allowMergeRoles = allowMergeRoles;
            return this;
        }
        public java.util.List<Integer> getAllowMergeRoles() {
            return this.allowMergeRoles;
        }

        public CreateProtectdBranchResponseBodyResult setAllowMergeUserIds(java.util.List<Long> allowMergeUserIds) {
            this.allowMergeUserIds = allowMergeUserIds;
            return this;
        }
        public java.util.List<Long> getAllowMergeUserIds() {
            return this.allowMergeUserIds;
        }

        public CreateProtectdBranchResponseBodyResult setAllowPushRoles(java.util.List<Integer> allowPushRoles) {
            this.allowPushRoles = allowPushRoles;
            return this;
        }
        public java.util.List<Integer> getAllowPushRoles() {
            return this.allowPushRoles;
        }

        public CreateProtectdBranchResponseBodyResult setAllowPushUserIds(java.util.List<Long> allowPushUserIds) {
            this.allowPushUserIds = allowPushUserIds;
            return this;
        }
        public java.util.List<Long> getAllowPushUserIds() {
            return this.allowPushUserIds;
        }

        public CreateProtectdBranchResponseBodyResult setBranch(String branch) {
            this.branch = branch;
            return this;
        }
        public String getBranch() {
            return this.branch;
        }

        public CreateProtectdBranchResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateProtectdBranchResponseBodyResult setMergeRequestSetting(CreateProtectdBranchResponseBodyResultMergeRequestSetting mergeRequestSetting) {
            this.mergeRequestSetting = mergeRequestSetting;
            return this;
        }
        public CreateProtectdBranchResponseBodyResultMergeRequestSetting getMergeRequestSetting() {
            return this.mergeRequestSetting;
        }

        public CreateProtectdBranchResponseBodyResult setTestSettingDTO(CreateProtectdBranchResponseBodyResultTestSettingDTO testSettingDTO) {
            this.testSettingDTO = testSettingDTO;
            return this;
        }
        public CreateProtectdBranchResponseBodyResultTestSettingDTO getTestSettingDTO() {
            return this.testSettingDTO;
        }

    }

}
