// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateProtectedBranchesRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

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
    public UpdateProtectedBranchesRequestMergeRequestSetting mergeRequestSetting;

    @NameInMap("testSettingDTO")
    public UpdateProtectedBranchesRequestTestSettingDTO testSettingDTO;

    @NameInMap("organizationId")
    public String organizationId;

    public static UpdateProtectedBranchesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProtectedBranchesRequest self = new UpdateProtectedBranchesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProtectedBranchesRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public UpdateProtectedBranchesRequest setAllowMergeRoles(java.util.List<Integer> allowMergeRoles) {
        this.allowMergeRoles = allowMergeRoles;
        return this;
    }
    public java.util.List<Integer> getAllowMergeRoles() {
        return this.allowMergeRoles;
    }

    public UpdateProtectedBranchesRequest setAllowMergeUserIds(java.util.List<Long> allowMergeUserIds) {
        this.allowMergeUserIds = allowMergeUserIds;
        return this;
    }
    public java.util.List<Long> getAllowMergeUserIds() {
        return this.allowMergeUserIds;
    }

    public UpdateProtectedBranchesRequest setAllowPushRoles(java.util.List<Integer> allowPushRoles) {
        this.allowPushRoles = allowPushRoles;
        return this;
    }
    public java.util.List<Integer> getAllowPushRoles() {
        return this.allowPushRoles;
    }

    public UpdateProtectedBranchesRequest setAllowPushUserIds(java.util.List<Long> allowPushUserIds) {
        this.allowPushUserIds = allowPushUserIds;
        return this;
    }
    public java.util.List<Long> getAllowPushUserIds() {
        return this.allowPushUserIds;
    }

    public UpdateProtectedBranchesRequest setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public String getBranch() {
        return this.branch;
    }

    public UpdateProtectedBranchesRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateProtectedBranchesRequest setMergeRequestSetting(UpdateProtectedBranchesRequestMergeRequestSetting mergeRequestSetting) {
        this.mergeRequestSetting = mergeRequestSetting;
        return this;
    }
    public UpdateProtectedBranchesRequestMergeRequestSetting getMergeRequestSetting() {
        return this.mergeRequestSetting;
    }

    public UpdateProtectedBranchesRequest setTestSettingDTO(UpdateProtectedBranchesRequestTestSettingDTO testSettingDTO) {
        this.testSettingDTO = testSettingDTO;
        return this;
    }
    public UpdateProtectedBranchesRequestTestSettingDTO getTestSettingDTO() {
        return this.testSettingDTO;
    }

    public UpdateProtectedBranchesRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static class UpdateProtectedBranchesRequestMergeRequestSetting extends TeaModel {
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

        public static UpdateProtectedBranchesRequestMergeRequestSetting build(java.util.Map<String, ?> map) throws Exception {
            UpdateProtectedBranchesRequestMergeRequestSetting self = new UpdateProtectedBranchesRequestMergeRequestSetting();
            return TeaModel.build(map, self);
        }

        public UpdateProtectedBranchesRequestMergeRequestSetting setAllowMergeRequestRoles(java.util.List<Integer> allowMergeRequestRoles) {
            this.allowMergeRequestRoles = allowMergeRequestRoles;
            return this;
        }
        public java.util.List<Integer> getAllowMergeRequestRoles() {
            return this.allowMergeRequestRoles;
        }

        public UpdateProtectedBranchesRequestMergeRequestSetting setDefaultAssignees(java.util.List<Integer> defaultAssignees) {
            this.defaultAssignees = defaultAssignees;
            return this;
        }
        public java.util.List<Integer> getDefaultAssignees() {
            return this.defaultAssignees;
        }

        public UpdateProtectedBranchesRequestMergeRequestSetting setIsAllowSelfApproval(Boolean isAllowSelfApproval) {
            this.isAllowSelfApproval = isAllowSelfApproval;
            return this;
        }
        public Boolean getIsAllowSelfApproval() {
            return this.isAllowSelfApproval;
        }

        public UpdateProtectedBranchesRequestMergeRequestSetting setIsRequireDiscussionProcessed(Boolean isRequireDiscussionProcessed) {
            this.isRequireDiscussionProcessed = isRequireDiscussionProcessed;
            return this;
        }
        public Boolean getIsRequireDiscussionProcessed() {
            return this.isRequireDiscussionProcessed;
        }

        public UpdateProtectedBranchesRequestMergeRequestSetting setIsRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            return this;
        }
        public Boolean getIsRequired() {
            return this.isRequired;
        }

        public UpdateProtectedBranchesRequestMergeRequestSetting setIsResetApprovalWhenNewPush(Boolean isResetApprovalWhenNewPush) {
            this.isResetApprovalWhenNewPush = isResetApprovalWhenNewPush;
            return this;
        }
        public Boolean getIsResetApprovalWhenNewPush() {
            return this.isResetApprovalWhenNewPush;
        }

        public UpdateProtectedBranchesRequestMergeRequestSetting setMinimumApproval(Integer minimumApproval) {
            this.minimumApproval = minimumApproval;
            return this;
        }
        public Integer getMinimumApproval() {
            return this.minimumApproval;
        }

        public UpdateProtectedBranchesRequestMergeRequestSetting setMrMode(String mrMode) {
            this.mrMode = mrMode;
            return this;
        }
        public String getMrMode() {
            return this.mrMode;
        }

        public UpdateProtectedBranchesRequestMergeRequestSetting setWhiteList(String whiteList) {
            this.whiteList = whiteList;
            return this;
        }
        public String getWhiteList() {
            return this.whiteList;
        }

    }

    public static class UpdateProtectedBranchesRequestTestSettingDTOCheckConfigCheckItems extends TeaModel {
        @NameInMap("isRequired")
        public Boolean isRequired;

        @NameInMap("name")
        public String name;

        public static UpdateProtectedBranchesRequestTestSettingDTOCheckConfigCheckItems build(java.util.Map<String, ?> map) throws Exception {
            UpdateProtectedBranchesRequestTestSettingDTOCheckConfigCheckItems self = new UpdateProtectedBranchesRequestTestSettingDTOCheckConfigCheckItems();
            return TeaModel.build(map, self);
        }

        public UpdateProtectedBranchesRequestTestSettingDTOCheckConfigCheckItems setIsRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            return this;
        }
        public Boolean getIsRequired() {
            return this.isRequired;
        }

        public UpdateProtectedBranchesRequestTestSettingDTOCheckConfigCheckItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateProtectedBranchesRequestTestSettingDTOCheckConfig extends TeaModel {
        @NameInMap("checkItems")
        public java.util.List<UpdateProtectedBranchesRequestTestSettingDTOCheckConfigCheckItems> checkItems;

        public static UpdateProtectedBranchesRequestTestSettingDTOCheckConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateProtectedBranchesRequestTestSettingDTOCheckConfig self = new UpdateProtectedBranchesRequestTestSettingDTOCheckConfig();
            return TeaModel.build(map, self);
        }

        public UpdateProtectedBranchesRequestTestSettingDTOCheckConfig setCheckItems(java.util.List<UpdateProtectedBranchesRequestTestSettingDTOCheckConfigCheckItems> checkItems) {
            this.checkItems = checkItems;
            return this;
        }
        public java.util.List<UpdateProtectedBranchesRequestTestSettingDTOCheckConfigCheckItems> getCheckItems() {
            return this.checkItems;
        }

    }

    public static class UpdateProtectedBranchesRequestTestSettingDTOCheckTaskQualityConfig extends TeaModel {
        @NameInMap("bizNo")
        public String bizNo;

        @NameInMap("enabled")
        public Boolean enabled;

        @NameInMap("message")
        public String message;

        @NameInMap("taskName")
        public String taskName;

        public static UpdateProtectedBranchesRequestTestSettingDTOCheckTaskQualityConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateProtectedBranchesRequestTestSettingDTOCheckTaskQualityConfig self = new UpdateProtectedBranchesRequestTestSettingDTOCheckTaskQualityConfig();
            return TeaModel.build(map, self);
        }

        public UpdateProtectedBranchesRequestTestSettingDTOCheckTaskQualityConfig setBizNo(String bizNo) {
            this.bizNo = bizNo;
            return this;
        }
        public String getBizNo() {
            return this.bizNo;
        }

        public UpdateProtectedBranchesRequestTestSettingDTOCheckTaskQualityConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateProtectedBranchesRequestTestSettingDTOCheckTaskQualityConfig setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UpdateProtectedBranchesRequestTestSettingDTOCheckTaskQualityConfig setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

    public static class UpdateProtectedBranchesRequestTestSettingDTOCodeGuidelinesDetection extends TeaModel {
        @NameInMap("enabled")
        public Boolean enabled;

        @NameInMap("message")
        public String message;

        public static UpdateProtectedBranchesRequestTestSettingDTOCodeGuidelinesDetection build(java.util.Map<String, ?> map) throws Exception {
            UpdateProtectedBranchesRequestTestSettingDTOCodeGuidelinesDetection self = new UpdateProtectedBranchesRequestTestSettingDTOCodeGuidelinesDetection();
            return TeaModel.build(map, self);
        }

        public UpdateProtectedBranchesRequestTestSettingDTOCodeGuidelinesDetection setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateProtectedBranchesRequestTestSettingDTOCodeGuidelinesDetection setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class UpdateProtectedBranchesRequestTestSettingDTOSensitiveInfoDetection extends TeaModel {
        @NameInMap("enabled")
        public Boolean enabled;

        @NameInMap("message")
        public String message;

        public static UpdateProtectedBranchesRequestTestSettingDTOSensitiveInfoDetection build(java.util.Map<String, ?> map) throws Exception {
            UpdateProtectedBranchesRequestTestSettingDTOSensitiveInfoDetection self = new UpdateProtectedBranchesRequestTestSettingDTOSensitiveInfoDetection();
            return TeaModel.build(map, self);
        }

        public UpdateProtectedBranchesRequestTestSettingDTOSensitiveInfoDetection setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateProtectedBranchesRequestTestSettingDTOSensitiveInfoDetection setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class UpdateProtectedBranchesRequestTestSettingDTO extends TeaModel {
        @NameInMap("checkConfig")
        public UpdateProtectedBranchesRequestTestSettingDTOCheckConfig checkConfig;

        @NameInMap("checkTaskQualityConfig")
        public UpdateProtectedBranchesRequestTestSettingDTOCheckTaskQualityConfig checkTaskQualityConfig;

        @NameInMap("codeGuidelinesDetection")
        public UpdateProtectedBranchesRequestTestSettingDTOCodeGuidelinesDetection codeGuidelinesDetection;

        @NameInMap("isRequired")
        public Boolean isRequired;

        @NameInMap("sensitiveInfoDetection")
        public UpdateProtectedBranchesRequestTestSettingDTOSensitiveInfoDetection sensitiveInfoDetection;

        public static UpdateProtectedBranchesRequestTestSettingDTO build(java.util.Map<String, ?> map) throws Exception {
            UpdateProtectedBranchesRequestTestSettingDTO self = new UpdateProtectedBranchesRequestTestSettingDTO();
            return TeaModel.build(map, self);
        }

        public UpdateProtectedBranchesRequestTestSettingDTO setCheckConfig(UpdateProtectedBranchesRequestTestSettingDTOCheckConfig checkConfig) {
            this.checkConfig = checkConfig;
            return this;
        }
        public UpdateProtectedBranchesRequestTestSettingDTOCheckConfig getCheckConfig() {
            return this.checkConfig;
        }

        public UpdateProtectedBranchesRequestTestSettingDTO setCheckTaskQualityConfig(UpdateProtectedBranchesRequestTestSettingDTOCheckTaskQualityConfig checkTaskQualityConfig) {
            this.checkTaskQualityConfig = checkTaskQualityConfig;
            return this;
        }
        public UpdateProtectedBranchesRequestTestSettingDTOCheckTaskQualityConfig getCheckTaskQualityConfig() {
            return this.checkTaskQualityConfig;
        }

        public UpdateProtectedBranchesRequestTestSettingDTO setCodeGuidelinesDetection(UpdateProtectedBranchesRequestTestSettingDTOCodeGuidelinesDetection codeGuidelinesDetection) {
            this.codeGuidelinesDetection = codeGuidelinesDetection;
            return this;
        }
        public UpdateProtectedBranchesRequestTestSettingDTOCodeGuidelinesDetection getCodeGuidelinesDetection() {
            return this.codeGuidelinesDetection;
        }

        public UpdateProtectedBranchesRequestTestSettingDTO setIsRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            return this;
        }
        public Boolean getIsRequired() {
            return this.isRequired;
        }

        public UpdateProtectedBranchesRequestTestSettingDTO setSensitiveInfoDetection(UpdateProtectedBranchesRequestTestSettingDTOSensitiveInfoDetection sensitiveInfoDetection) {
            this.sensitiveInfoDetection = sensitiveInfoDetection;
            return this;
        }
        public UpdateProtectedBranchesRequestTestSettingDTOSensitiveInfoDetection getSensitiveInfoDetection() {
            return this.sensitiveInfoDetection;
        }

    }

}
