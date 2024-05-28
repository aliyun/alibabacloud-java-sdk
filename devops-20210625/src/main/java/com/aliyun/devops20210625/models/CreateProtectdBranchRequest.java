// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateProtectdBranchRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("allowMergeRoles")
    public java.util.List<Integer> allowMergeRoles;

    @NameInMap("allowMergeUserIds")
    public java.util.List<String> allowMergeUserIds;

    @NameInMap("allowPushRoles")
    public java.util.List<Integer> allowPushRoles;

    @NameInMap("allowPushUserIds")
    public java.util.List<String> allowPushUserIds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("branch")
    public String branch;

    @NameInMap("id")
    public Long id;

    @NameInMap("mergeRequestSetting")
    public CreateProtectdBranchRequestMergeRequestSetting mergeRequestSetting;

    @NameInMap("testSettingDTO")
    public CreateProtectdBranchRequestTestSettingDTO testSettingDTO;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    public static CreateProtectdBranchRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProtectdBranchRequest self = new CreateProtectdBranchRequest();
        return TeaModel.build(map, self);
    }

    public CreateProtectdBranchRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public CreateProtectdBranchRequest setAllowMergeRoles(java.util.List<Integer> allowMergeRoles) {
        this.allowMergeRoles = allowMergeRoles;
        return this;
    }
    public java.util.List<Integer> getAllowMergeRoles() {
        return this.allowMergeRoles;
    }

    public CreateProtectdBranchRequest setAllowMergeUserIds(java.util.List<String> allowMergeUserIds) {
        this.allowMergeUserIds = allowMergeUserIds;
        return this;
    }
    public java.util.List<String> getAllowMergeUserIds() {
        return this.allowMergeUserIds;
    }

    public CreateProtectdBranchRequest setAllowPushRoles(java.util.List<Integer> allowPushRoles) {
        this.allowPushRoles = allowPushRoles;
        return this;
    }
    public java.util.List<Integer> getAllowPushRoles() {
        return this.allowPushRoles;
    }

    public CreateProtectdBranchRequest setAllowPushUserIds(java.util.List<String> allowPushUserIds) {
        this.allowPushUserIds = allowPushUserIds;
        return this;
    }
    public java.util.List<String> getAllowPushUserIds() {
        return this.allowPushUserIds;
    }

    public CreateProtectdBranchRequest setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public String getBranch() {
        return this.branch;
    }

    public CreateProtectdBranchRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateProtectdBranchRequest setMergeRequestSetting(CreateProtectdBranchRequestMergeRequestSetting mergeRequestSetting) {
        this.mergeRequestSetting = mergeRequestSetting;
        return this;
    }
    public CreateProtectdBranchRequestMergeRequestSetting getMergeRequestSetting() {
        return this.mergeRequestSetting;
    }

    public CreateProtectdBranchRequest setTestSettingDTO(CreateProtectdBranchRequestTestSettingDTO testSettingDTO) {
        this.testSettingDTO = testSettingDTO;
        return this;
    }
    public CreateProtectdBranchRequestTestSettingDTO getTestSettingDTO() {
        return this.testSettingDTO;
    }

    public CreateProtectdBranchRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static class CreateProtectdBranchRequestMergeRequestSetting extends TeaModel {
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

        public static CreateProtectdBranchRequestMergeRequestSetting build(java.util.Map<String, ?> map) throws Exception {
            CreateProtectdBranchRequestMergeRequestSetting self = new CreateProtectdBranchRequestMergeRequestSetting();
            return TeaModel.build(map, self);
        }

        public CreateProtectdBranchRequestMergeRequestSetting setAllowMergeRequestRoles(java.util.List<Integer> allowMergeRequestRoles) {
            this.allowMergeRequestRoles = allowMergeRequestRoles;
            return this;
        }
        public java.util.List<Integer> getAllowMergeRequestRoles() {
            return this.allowMergeRequestRoles;
        }

        public CreateProtectdBranchRequestMergeRequestSetting setDefaultAssignees(java.util.List<String> defaultAssignees) {
            this.defaultAssignees = defaultAssignees;
            return this;
        }
        public java.util.List<String> getDefaultAssignees() {
            return this.defaultAssignees;
        }

        public CreateProtectdBranchRequestMergeRequestSetting setIsAllowSelfApproval(Boolean isAllowSelfApproval) {
            this.isAllowSelfApproval = isAllowSelfApproval;
            return this;
        }
        public Boolean getIsAllowSelfApproval() {
            return this.isAllowSelfApproval;
        }

        public CreateProtectdBranchRequestMergeRequestSetting setIsRequireDiscussionProcessed(Boolean isRequireDiscussionProcessed) {
            this.isRequireDiscussionProcessed = isRequireDiscussionProcessed;
            return this;
        }
        public Boolean getIsRequireDiscussionProcessed() {
            return this.isRequireDiscussionProcessed;
        }

        public CreateProtectdBranchRequestMergeRequestSetting setIsRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            return this;
        }
        public Boolean getIsRequired() {
            return this.isRequired;
        }

        public CreateProtectdBranchRequestMergeRequestSetting setIsResetApprovalWhenNewPush(Boolean isResetApprovalWhenNewPush) {
            this.isResetApprovalWhenNewPush = isResetApprovalWhenNewPush;
            return this;
        }
        public Boolean getIsResetApprovalWhenNewPush() {
            return this.isResetApprovalWhenNewPush;
        }

        public CreateProtectdBranchRequestMergeRequestSetting setMinimumApproval(Integer minimumApproval) {
            this.minimumApproval = minimumApproval;
            return this;
        }
        public Integer getMinimumApproval() {
            return this.minimumApproval;
        }

        public CreateProtectdBranchRequestMergeRequestSetting setMrMode(String mrMode) {
            this.mrMode = mrMode;
            return this;
        }
        public String getMrMode() {
            return this.mrMode;
        }

        public CreateProtectdBranchRequestMergeRequestSetting setWhiteList(String whiteList) {
            this.whiteList = whiteList;
            return this;
        }
        public String getWhiteList() {
            return this.whiteList;
        }

    }

    public static class CreateProtectdBranchRequestTestSettingDTOCheckConfigCheckItems extends TeaModel {
        @NameInMap("isRequired")
        public Boolean isRequired;

        @NameInMap("name")
        public String name;

        public static CreateProtectdBranchRequestTestSettingDTOCheckConfigCheckItems build(java.util.Map<String, ?> map) throws Exception {
            CreateProtectdBranchRequestTestSettingDTOCheckConfigCheckItems self = new CreateProtectdBranchRequestTestSettingDTOCheckConfigCheckItems();
            return TeaModel.build(map, self);
        }

        public CreateProtectdBranchRequestTestSettingDTOCheckConfigCheckItems setIsRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            return this;
        }
        public Boolean getIsRequired() {
            return this.isRequired;
        }

        public CreateProtectdBranchRequestTestSettingDTOCheckConfigCheckItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateProtectdBranchRequestTestSettingDTOCheckConfig extends TeaModel {
        @NameInMap("checkItems")
        public java.util.List<CreateProtectdBranchRequestTestSettingDTOCheckConfigCheckItems> checkItems;

        public static CreateProtectdBranchRequestTestSettingDTOCheckConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateProtectdBranchRequestTestSettingDTOCheckConfig self = new CreateProtectdBranchRequestTestSettingDTOCheckConfig();
            return TeaModel.build(map, self);
        }

        public CreateProtectdBranchRequestTestSettingDTOCheckConfig setCheckItems(java.util.List<CreateProtectdBranchRequestTestSettingDTOCheckConfigCheckItems> checkItems) {
            this.checkItems = checkItems;
            return this;
        }
        public java.util.List<CreateProtectdBranchRequestTestSettingDTOCheckConfigCheckItems> getCheckItems() {
            return this.checkItems;
        }

    }

    public static class CreateProtectdBranchRequestTestSettingDTOCheckTaskQualityConfig extends TeaModel {
        @NameInMap("bizNo")
        public String bizNo;

        @NameInMap("enabled")
        public Boolean enabled;

        @NameInMap("message")
        public String message;

        @NameInMap("taskName")
        public String taskName;

        public static CreateProtectdBranchRequestTestSettingDTOCheckTaskQualityConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateProtectdBranchRequestTestSettingDTOCheckTaskQualityConfig self = new CreateProtectdBranchRequestTestSettingDTOCheckTaskQualityConfig();
            return TeaModel.build(map, self);
        }

        public CreateProtectdBranchRequestTestSettingDTOCheckTaskQualityConfig setBizNo(String bizNo) {
            this.bizNo = bizNo;
            return this;
        }
        public String getBizNo() {
            return this.bizNo;
        }

        public CreateProtectdBranchRequestTestSettingDTOCheckTaskQualityConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateProtectdBranchRequestTestSettingDTOCheckTaskQualityConfig setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateProtectdBranchRequestTestSettingDTOCheckTaskQualityConfig setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

    public static class CreateProtectdBranchRequestTestSettingDTOCodeGuidelinesDetection extends TeaModel {
        @NameInMap("enabled")
        public Boolean enabled;

        @NameInMap("message")
        public String message;

        public static CreateProtectdBranchRequestTestSettingDTOCodeGuidelinesDetection build(java.util.Map<String, ?> map) throws Exception {
            CreateProtectdBranchRequestTestSettingDTOCodeGuidelinesDetection self = new CreateProtectdBranchRequestTestSettingDTOCodeGuidelinesDetection();
            return TeaModel.build(map, self);
        }

        public CreateProtectdBranchRequestTestSettingDTOCodeGuidelinesDetection setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateProtectdBranchRequestTestSettingDTOCodeGuidelinesDetection setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class CreateProtectdBranchRequestTestSettingDTOSensitiveInfoDetection extends TeaModel {
        @NameInMap("enabled")
        public Boolean enabled;

        @NameInMap("message")
        public String message;

        public static CreateProtectdBranchRequestTestSettingDTOSensitiveInfoDetection build(java.util.Map<String, ?> map) throws Exception {
            CreateProtectdBranchRequestTestSettingDTOSensitiveInfoDetection self = new CreateProtectdBranchRequestTestSettingDTOSensitiveInfoDetection();
            return TeaModel.build(map, self);
        }

        public CreateProtectdBranchRequestTestSettingDTOSensitiveInfoDetection setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateProtectdBranchRequestTestSettingDTOSensitiveInfoDetection setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class CreateProtectdBranchRequestTestSettingDTO extends TeaModel {
        @NameInMap("checkConfig")
        public CreateProtectdBranchRequestTestSettingDTOCheckConfig checkConfig;

        @NameInMap("checkTaskQualityConfig")
        public CreateProtectdBranchRequestTestSettingDTOCheckTaskQualityConfig checkTaskQualityConfig;

        @NameInMap("codeGuidelinesDetection")
        public CreateProtectdBranchRequestTestSettingDTOCodeGuidelinesDetection codeGuidelinesDetection;

        @NameInMap("isRequired")
        public Boolean isRequired;

        @NameInMap("sensitiveInfoDetection")
        public CreateProtectdBranchRequestTestSettingDTOSensitiveInfoDetection sensitiveInfoDetection;

        public static CreateProtectdBranchRequestTestSettingDTO build(java.util.Map<String, ?> map) throws Exception {
            CreateProtectdBranchRequestTestSettingDTO self = new CreateProtectdBranchRequestTestSettingDTO();
            return TeaModel.build(map, self);
        }

        public CreateProtectdBranchRequestTestSettingDTO setCheckConfig(CreateProtectdBranchRequestTestSettingDTOCheckConfig checkConfig) {
            this.checkConfig = checkConfig;
            return this;
        }
        public CreateProtectdBranchRequestTestSettingDTOCheckConfig getCheckConfig() {
            return this.checkConfig;
        }

        public CreateProtectdBranchRequestTestSettingDTO setCheckTaskQualityConfig(CreateProtectdBranchRequestTestSettingDTOCheckTaskQualityConfig checkTaskQualityConfig) {
            this.checkTaskQualityConfig = checkTaskQualityConfig;
            return this;
        }
        public CreateProtectdBranchRequestTestSettingDTOCheckTaskQualityConfig getCheckTaskQualityConfig() {
            return this.checkTaskQualityConfig;
        }

        public CreateProtectdBranchRequestTestSettingDTO setCodeGuidelinesDetection(CreateProtectdBranchRequestTestSettingDTOCodeGuidelinesDetection codeGuidelinesDetection) {
            this.codeGuidelinesDetection = codeGuidelinesDetection;
            return this;
        }
        public CreateProtectdBranchRequestTestSettingDTOCodeGuidelinesDetection getCodeGuidelinesDetection() {
            return this.codeGuidelinesDetection;
        }

        public CreateProtectdBranchRequestTestSettingDTO setIsRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            return this;
        }
        public Boolean getIsRequired() {
            return this.isRequired;
        }

        public CreateProtectdBranchRequestTestSettingDTO setSensitiveInfoDetection(CreateProtectdBranchRequestTestSettingDTOSensitiveInfoDetection sensitiveInfoDetection) {
            this.sensitiveInfoDetection = sensitiveInfoDetection;
            return this;
        }
        public CreateProtectdBranchRequestTestSettingDTOSensitiveInfoDetection getSensitiveInfoDetection() {
            return this.sensitiveInfoDetection;
        }

    }

}
