// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateProtectedBranchesResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public UpdateProtectedBranchesResponseBodyResult result;

    @NameInMap("success")
    public Boolean success;

    public static UpdateProtectedBranchesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProtectedBranchesResponseBody self = new UpdateProtectedBranchesResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProtectedBranchesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateProtectedBranchesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateProtectedBranchesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateProtectedBranchesResponseBody setResult(UpdateProtectedBranchesResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateProtectedBranchesResponseBodyResult getResult() {
        return this.result;
    }

    public UpdateProtectedBranchesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateProtectedBranchesResponseBodyResultMergeRequestSetting extends TeaModel {
        @NameInMap("allowMergeRequestRoles")
        public java.util.List<Integer> allowMergeRequestRoles;

        @NameInMap("defaultAssignees")
        public java.util.List<Integer> defaultAssignees;

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

        public static UpdateProtectedBranchesResponseBodyResultMergeRequestSetting build(java.util.Map<String, ?> map) throws Exception {
            UpdateProtectedBranchesResponseBodyResultMergeRequestSetting self = new UpdateProtectedBranchesResponseBodyResultMergeRequestSetting();
            return TeaModel.build(map, self);
        }

        public UpdateProtectedBranchesResponseBodyResultMergeRequestSetting setAllowMergeRequestRoles(java.util.List<Integer> allowMergeRequestRoles) {
            this.allowMergeRequestRoles = allowMergeRequestRoles;
            return this;
        }
        public java.util.List<Integer> getAllowMergeRequestRoles() {
            return this.allowMergeRequestRoles;
        }

        public UpdateProtectedBranchesResponseBodyResultMergeRequestSetting setDefaultAssignees(java.util.List<Integer> defaultAssignees) {
            this.defaultAssignees = defaultAssignees;
            return this;
        }
        public java.util.List<Integer> getDefaultAssignees() {
            return this.defaultAssignees;
        }

        public UpdateProtectedBranchesResponseBodyResultMergeRequestSetting setIsAllowSelfApproval(Boolean isAllowSelfApproval) {
            this.isAllowSelfApproval = isAllowSelfApproval;
            return this;
        }
        public Boolean getIsAllowSelfApproval() {
            return this.isAllowSelfApproval;
        }

        public UpdateProtectedBranchesResponseBodyResultMergeRequestSetting setIsRequireDiscussionProcessed(Boolean isRequireDiscussionProcessed) {
            this.isRequireDiscussionProcessed = isRequireDiscussionProcessed;
            return this;
        }
        public Boolean getIsRequireDiscussionProcessed() {
            return this.isRequireDiscussionProcessed;
        }

        public UpdateProtectedBranchesResponseBodyResultMergeRequestSetting setIsRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            return this;
        }
        public Boolean getIsRequired() {
            return this.isRequired;
        }

        public UpdateProtectedBranchesResponseBodyResultMergeRequestSetting setIsResetApprovalWhenNewPush(Boolean isResetApprovalWhenNewPush) {
            this.isResetApprovalWhenNewPush = isResetApprovalWhenNewPush;
            return this;
        }
        public Boolean getIsResetApprovalWhenNewPush() {
            return this.isResetApprovalWhenNewPush;
        }

        public UpdateProtectedBranchesResponseBodyResultMergeRequestSetting setMinimumApproval(Integer minimumApproval) {
            this.minimumApproval = minimumApproval;
            return this;
        }
        public Integer getMinimumApproval() {
            return this.minimumApproval;
        }

        public UpdateProtectedBranchesResponseBodyResultMergeRequestSetting setMrMode(String mrMode) {
            this.mrMode = mrMode;
            return this;
        }
        public String getMrMode() {
            return this.mrMode;
        }

        public UpdateProtectedBranchesResponseBodyResultMergeRequestSetting setWhiteList(String whiteList) {
            this.whiteList = whiteList;
            return this;
        }
        public String getWhiteList() {
            return this.whiteList;
        }

    }

    public static class UpdateProtectedBranchesResponseBodyResultTestSettingDTOCheckConfigCheckItems extends TeaModel {
        @NameInMap("isRequired")
        public Boolean isRequired;

        @NameInMap("name")
        public String name;

        public static UpdateProtectedBranchesResponseBodyResultTestSettingDTOCheckConfigCheckItems build(java.util.Map<String, ?> map) throws Exception {
            UpdateProtectedBranchesResponseBodyResultTestSettingDTOCheckConfigCheckItems self = new UpdateProtectedBranchesResponseBodyResultTestSettingDTOCheckConfigCheckItems();
            return TeaModel.build(map, self);
        }

        public UpdateProtectedBranchesResponseBodyResultTestSettingDTOCheckConfigCheckItems setIsRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            return this;
        }
        public Boolean getIsRequired() {
            return this.isRequired;
        }

        public UpdateProtectedBranchesResponseBodyResultTestSettingDTOCheckConfigCheckItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateProtectedBranchesResponseBodyResultTestSettingDTOCheckConfig extends TeaModel {
        @NameInMap("checkItems")
        public java.util.List<UpdateProtectedBranchesResponseBodyResultTestSettingDTOCheckConfigCheckItems> checkItems;

        public static UpdateProtectedBranchesResponseBodyResultTestSettingDTOCheckConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateProtectedBranchesResponseBodyResultTestSettingDTOCheckConfig self = new UpdateProtectedBranchesResponseBodyResultTestSettingDTOCheckConfig();
            return TeaModel.build(map, self);
        }

        public UpdateProtectedBranchesResponseBodyResultTestSettingDTOCheckConfig setCheckItems(java.util.List<UpdateProtectedBranchesResponseBodyResultTestSettingDTOCheckConfigCheckItems> checkItems) {
            this.checkItems = checkItems;
            return this;
        }
        public java.util.List<UpdateProtectedBranchesResponseBodyResultTestSettingDTOCheckConfigCheckItems> getCheckItems() {
            return this.checkItems;
        }

    }

    public static class UpdateProtectedBranchesResponseBodyResultTestSettingDTOCheckTaskQualityConfig extends TeaModel {
        @NameInMap("bizNo")
        public String bizNo;

        @NameInMap("enabled")
        public Boolean enabled;

        @NameInMap("message")
        public String message;

        @NameInMap("taskName")
        public String taskName;

        public static UpdateProtectedBranchesResponseBodyResultTestSettingDTOCheckTaskQualityConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateProtectedBranchesResponseBodyResultTestSettingDTOCheckTaskQualityConfig self = new UpdateProtectedBranchesResponseBodyResultTestSettingDTOCheckTaskQualityConfig();
            return TeaModel.build(map, self);
        }

        public UpdateProtectedBranchesResponseBodyResultTestSettingDTOCheckTaskQualityConfig setBizNo(String bizNo) {
            this.bizNo = bizNo;
            return this;
        }
        public String getBizNo() {
            return this.bizNo;
        }

        public UpdateProtectedBranchesResponseBodyResultTestSettingDTOCheckTaskQualityConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateProtectedBranchesResponseBodyResultTestSettingDTOCheckTaskQualityConfig setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UpdateProtectedBranchesResponseBodyResultTestSettingDTOCheckTaskQualityConfig setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

    public static class UpdateProtectedBranchesResponseBodyResultTestSettingDTOCodeGuidelinesDetection extends TeaModel {
        @NameInMap("enabled")
        public Boolean enabled;

        @NameInMap("message")
        public String message;

        public static UpdateProtectedBranchesResponseBodyResultTestSettingDTOCodeGuidelinesDetection build(java.util.Map<String, ?> map) throws Exception {
            UpdateProtectedBranchesResponseBodyResultTestSettingDTOCodeGuidelinesDetection self = new UpdateProtectedBranchesResponseBodyResultTestSettingDTOCodeGuidelinesDetection();
            return TeaModel.build(map, self);
        }

        public UpdateProtectedBranchesResponseBodyResultTestSettingDTOCodeGuidelinesDetection setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateProtectedBranchesResponseBodyResultTestSettingDTOCodeGuidelinesDetection setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class UpdateProtectedBranchesResponseBodyResultTestSettingDTOSensitiveInfoDetection extends TeaModel {
        @NameInMap("enabled")
        public Boolean enabled;

        @NameInMap("message")
        public String message;

        public static UpdateProtectedBranchesResponseBodyResultTestSettingDTOSensitiveInfoDetection build(java.util.Map<String, ?> map) throws Exception {
            UpdateProtectedBranchesResponseBodyResultTestSettingDTOSensitiveInfoDetection self = new UpdateProtectedBranchesResponseBodyResultTestSettingDTOSensitiveInfoDetection();
            return TeaModel.build(map, self);
        }

        public UpdateProtectedBranchesResponseBodyResultTestSettingDTOSensitiveInfoDetection setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateProtectedBranchesResponseBodyResultTestSettingDTOSensitiveInfoDetection setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class UpdateProtectedBranchesResponseBodyResultTestSettingDTO extends TeaModel {
        @NameInMap("checkConfig")
        public UpdateProtectedBranchesResponseBodyResultTestSettingDTOCheckConfig checkConfig;

        @NameInMap("checkTaskQualityConfig")
        public UpdateProtectedBranchesResponseBodyResultTestSettingDTOCheckTaskQualityConfig checkTaskQualityConfig;

        @NameInMap("codeGuidelinesDetection")
        public UpdateProtectedBranchesResponseBodyResultTestSettingDTOCodeGuidelinesDetection codeGuidelinesDetection;

        @NameInMap("isRequired")
        public Boolean isRequired;

        @NameInMap("sensitiveInfoDetection")
        public UpdateProtectedBranchesResponseBodyResultTestSettingDTOSensitiveInfoDetection sensitiveInfoDetection;

        public static UpdateProtectedBranchesResponseBodyResultTestSettingDTO build(java.util.Map<String, ?> map) throws Exception {
            UpdateProtectedBranchesResponseBodyResultTestSettingDTO self = new UpdateProtectedBranchesResponseBodyResultTestSettingDTO();
            return TeaModel.build(map, self);
        }

        public UpdateProtectedBranchesResponseBodyResultTestSettingDTO setCheckConfig(UpdateProtectedBranchesResponseBodyResultTestSettingDTOCheckConfig checkConfig) {
            this.checkConfig = checkConfig;
            return this;
        }
        public UpdateProtectedBranchesResponseBodyResultTestSettingDTOCheckConfig getCheckConfig() {
            return this.checkConfig;
        }

        public UpdateProtectedBranchesResponseBodyResultTestSettingDTO setCheckTaskQualityConfig(UpdateProtectedBranchesResponseBodyResultTestSettingDTOCheckTaskQualityConfig checkTaskQualityConfig) {
            this.checkTaskQualityConfig = checkTaskQualityConfig;
            return this;
        }
        public UpdateProtectedBranchesResponseBodyResultTestSettingDTOCheckTaskQualityConfig getCheckTaskQualityConfig() {
            return this.checkTaskQualityConfig;
        }

        public UpdateProtectedBranchesResponseBodyResultTestSettingDTO setCodeGuidelinesDetection(UpdateProtectedBranchesResponseBodyResultTestSettingDTOCodeGuidelinesDetection codeGuidelinesDetection) {
            this.codeGuidelinesDetection = codeGuidelinesDetection;
            return this;
        }
        public UpdateProtectedBranchesResponseBodyResultTestSettingDTOCodeGuidelinesDetection getCodeGuidelinesDetection() {
            return this.codeGuidelinesDetection;
        }

        public UpdateProtectedBranchesResponseBodyResultTestSettingDTO setIsRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            return this;
        }
        public Boolean getIsRequired() {
            return this.isRequired;
        }

        public UpdateProtectedBranchesResponseBodyResultTestSettingDTO setSensitiveInfoDetection(UpdateProtectedBranchesResponseBodyResultTestSettingDTOSensitiveInfoDetection sensitiveInfoDetection) {
            this.sensitiveInfoDetection = sensitiveInfoDetection;
            return this;
        }
        public UpdateProtectedBranchesResponseBodyResultTestSettingDTOSensitiveInfoDetection getSensitiveInfoDetection() {
            return this.sensitiveInfoDetection;
        }

    }

    public static class UpdateProtectedBranchesResponseBodyResult extends TeaModel {
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
        public UpdateProtectedBranchesResponseBodyResultMergeRequestSetting mergeRequestSetting;

        @NameInMap("testSettingDTO")
        public UpdateProtectedBranchesResponseBodyResultTestSettingDTO testSettingDTO;

        public static UpdateProtectedBranchesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateProtectedBranchesResponseBodyResult self = new UpdateProtectedBranchesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateProtectedBranchesResponseBodyResult setAllowMergeRoles(java.util.List<Integer> allowMergeRoles) {
            this.allowMergeRoles = allowMergeRoles;
            return this;
        }
        public java.util.List<Integer> getAllowMergeRoles() {
            return this.allowMergeRoles;
        }

        public UpdateProtectedBranchesResponseBodyResult setAllowMergeUserIds(java.util.List<Long> allowMergeUserIds) {
            this.allowMergeUserIds = allowMergeUserIds;
            return this;
        }
        public java.util.List<Long> getAllowMergeUserIds() {
            return this.allowMergeUserIds;
        }

        public UpdateProtectedBranchesResponseBodyResult setAllowPushRoles(java.util.List<Integer> allowPushRoles) {
            this.allowPushRoles = allowPushRoles;
            return this;
        }
        public java.util.List<Integer> getAllowPushRoles() {
            return this.allowPushRoles;
        }

        public UpdateProtectedBranchesResponseBodyResult setAllowPushUserIds(java.util.List<Long> allowPushUserIds) {
            this.allowPushUserIds = allowPushUserIds;
            return this;
        }
        public java.util.List<Long> getAllowPushUserIds() {
            return this.allowPushUserIds;
        }

        public UpdateProtectedBranchesResponseBodyResult setBranch(String branch) {
            this.branch = branch;
            return this;
        }
        public String getBranch() {
            return this.branch;
        }

        public UpdateProtectedBranchesResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateProtectedBranchesResponseBodyResult setMergeRequestSetting(UpdateProtectedBranchesResponseBodyResultMergeRequestSetting mergeRequestSetting) {
            this.mergeRequestSetting = mergeRequestSetting;
            return this;
        }
        public UpdateProtectedBranchesResponseBodyResultMergeRequestSetting getMergeRequestSetting() {
            return this.mergeRequestSetting;
        }

        public UpdateProtectedBranchesResponseBodyResult setTestSettingDTO(UpdateProtectedBranchesResponseBodyResultTestSettingDTO testSettingDTO) {
            this.testSettingDTO = testSettingDTO;
            return this;
        }
        public UpdateProtectedBranchesResponseBodyResultTestSettingDTO getTestSettingDTO() {
            return this.testSettingDTO;
        }

    }

}
