// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateProtectedBranchesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SYSTEM_UNKNOWN_ERROR</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>A35869D5-BB29-5F84-A4DD-B09985EA2AFA</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public UpdateProtectedBranchesResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        public java.util.List<String> defaultAssignees;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isAllowSelfApproval")
        public Boolean isAllowSelfApproval;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isRequireDiscussionProcessed")
        public Boolean isRequireDiscussionProcessed;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isRequired")
        public Boolean isRequired;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isResetApprovalWhenNewPush")
        public Boolean isResetApprovalWhenNewPush;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("minimumApproval")
        public Integer minimumApproval;

        /**
         * <strong>example:</strong>
         * <p>general</p>
         */
        @NameInMap("mrMode")
        public String mrMode;

        /**
         * <strong>example:</strong>
         * <p>**.java</p>
         */
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

        public UpdateProtectedBranchesResponseBodyResultMergeRequestSetting setDefaultAssignees(java.util.List<String> defaultAssignees) {
            this.defaultAssignees = defaultAssignees;
            return this;
        }
        public java.util.List<String> getDefaultAssignees() {
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
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("bizNo")
        public String bizNo;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <strong>example:</strong>
         * <p>test_task_quality</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>biz-task-quality</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <strong>example:</strong>
         * <p>test_code_guide_lines</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <strong>example:</strong>
         * <p>test_code_sensitive_info</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>master</p>
         */
        @NameInMap("branch")
        public String branch;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
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
