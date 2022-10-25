// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class CreateRepositoryProtectedBranchResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateRepositoryProtectedBranchResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static CreateRepositoryProtectedBranchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRepositoryProtectedBranchResponseBody self = new CreateRepositoryProtectedBranchResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRepositoryProtectedBranchResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateRepositoryProtectedBranchResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateRepositoryProtectedBranchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRepositoryProtectedBranchResponseBody setResult(CreateRepositoryProtectedBranchResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateRepositoryProtectedBranchResponseBodyResult getResult() {
        return this.result;
    }

    public CreateRepositoryProtectedBranchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateRepositoryProtectedBranchResponseBodyResultMergeRequestSetting extends TeaModel {
        @NameInMap("AllowMergeRequestRoles")
        public java.util.List<Integer> allowMergeRequestRoles;

        @NameInMap("AllowSelfApproval")
        public Boolean allowSelfApproval;

        @NameInMap("DefaultAssignees")
        public java.util.List<String> defaultAssignees;

        @NameInMap("IsRequireDiscussionProcessed")
        public Boolean isRequireDiscussionProcessed;

        @NameInMap("IsResetApprovalWhenNewPush")
        public Boolean isResetApprovalWhenNewPush;

        @NameInMap("MergeRequestMode")
        public String mergeRequestMode;

        @NameInMap("MinimualApproval")
        public Integer minimualApproval;

        @NameInMap("Required")
        public Boolean required;

        public static CreateRepositoryProtectedBranchResponseBodyResultMergeRequestSetting build(java.util.Map<String, ?> map) throws Exception {
            CreateRepositoryProtectedBranchResponseBodyResultMergeRequestSetting self = new CreateRepositoryProtectedBranchResponseBodyResultMergeRequestSetting();
            return TeaModel.build(map, self);
        }

        public CreateRepositoryProtectedBranchResponseBodyResultMergeRequestSetting setAllowMergeRequestRoles(java.util.List<Integer> allowMergeRequestRoles) {
            this.allowMergeRequestRoles = allowMergeRequestRoles;
            return this;
        }
        public java.util.List<Integer> getAllowMergeRequestRoles() {
            return this.allowMergeRequestRoles;
        }

        public CreateRepositoryProtectedBranchResponseBodyResultMergeRequestSetting setAllowSelfApproval(Boolean allowSelfApproval) {
            this.allowSelfApproval = allowSelfApproval;
            return this;
        }
        public Boolean getAllowSelfApproval() {
            return this.allowSelfApproval;
        }

        public CreateRepositoryProtectedBranchResponseBodyResultMergeRequestSetting setDefaultAssignees(java.util.List<String> defaultAssignees) {
            this.defaultAssignees = defaultAssignees;
            return this;
        }
        public java.util.List<String> getDefaultAssignees() {
            return this.defaultAssignees;
        }

        public CreateRepositoryProtectedBranchResponseBodyResultMergeRequestSetting setIsRequireDiscussionProcessed(Boolean isRequireDiscussionProcessed) {
            this.isRequireDiscussionProcessed = isRequireDiscussionProcessed;
            return this;
        }
        public Boolean getIsRequireDiscussionProcessed() {
            return this.isRequireDiscussionProcessed;
        }

        public CreateRepositoryProtectedBranchResponseBodyResultMergeRequestSetting setIsResetApprovalWhenNewPush(Boolean isResetApprovalWhenNewPush) {
            this.isResetApprovalWhenNewPush = isResetApprovalWhenNewPush;
            return this;
        }
        public Boolean getIsResetApprovalWhenNewPush() {
            return this.isResetApprovalWhenNewPush;
        }

        public CreateRepositoryProtectedBranchResponseBodyResultMergeRequestSetting setMergeRequestMode(String mergeRequestMode) {
            this.mergeRequestMode = mergeRequestMode;
            return this;
        }
        public String getMergeRequestMode() {
            return this.mergeRequestMode;
        }

        public CreateRepositoryProtectedBranchResponseBodyResultMergeRequestSetting setMinimualApproval(Integer minimualApproval) {
            this.minimualApproval = minimualApproval;
            return this;
        }
        public Integer getMinimualApproval() {
            return this.minimualApproval;
        }

        public CreateRepositoryProtectedBranchResponseBodyResultMergeRequestSetting setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

    }

    public static class CreateRepositoryProtectedBranchResponseBodyResultTestSettingCheckConfigCheckItems extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Required")
        public Boolean required;

        public static CreateRepositoryProtectedBranchResponseBodyResultTestSettingCheckConfigCheckItems build(java.util.Map<String, ?> map) throws Exception {
            CreateRepositoryProtectedBranchResponseBodyResultTestSettingCheckConfigCheckItems self = new CreateRepositoryProtectedBranchResponseBodyResultTestSettingCheckConfigCheckItems();
            return TeaModel.build(map, self);
        }

        public CreateRepositoryProtectedBranchResponseBodyResultTestSettingCheckConfigCheckItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateRepositoryProtectedBranchResponseBodyResultTestSettingCheckConfigCheckItems setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

    }

    public static class CreateRepositoryProtectedBranchResponseBodyResultTestSettingCheckConfig extends TeaModel {
        @NameInMap("CheckItems")
        public java.util.List<CreateRepositoryProtectedBranchResponseBodyResultTestSettingCheckConfigCheckItems> checkItems;

        public static CreateRepositoryProtectedBranchResponseBodyResultTestSettingCheckConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRepositoryProtectedBranchResponseBodyResultTestSettingCheckConfig self = new CreateRepositoryProtectedBranchResponseBodyResultTestSettingCheckConfig();
            return TeaModel.build(map, self);
        }

        public CreateRepositoryProtectedBranchResponseBodyResultTestSettingCheckConfig setCheckItems(java.util.List<CreateRepositoryProtectedBranchResponseBodyResultTestSettingCheckConfigCheckItems> checkItems) {
            this.checkItems = checkItems;
            return this;
        }
        public java.util.List<CreateRepositoryProtectedBranchResponseBodyResultTestSettingCheckConfigCheckItems> getCheckItems() {
            return this.checkItems;
        }

    }

    public static class CreateRepositoryProtectedBranchResponseBodyResultTestSettingCodingGuidelinesDetection extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("Message")
        public String message;

        public static CreateRepositoryProtectedBranchResponseBodyResultTestSettingCodingGuidelinesDetection build(java.util.Map<String, ?> map) throws Exception {
            CreateRepositoryProtectedBranchResponseBodyResultTestSettingCodingGuidelinesDetection self = new CreateRepositoryProtectedBranchResponseBodyResultTestSettingCodingGuidelinesDetection();
            return TeaModel.build(map, self);
        }

        public CreateRepositoryProtectedBranchResponseBodyResultTestSettingCodingGuidelinesDetection setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateRepositoryProtectedBranchResponseBodyResultTestSettingCodingGuidelinesDetection setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class CreateRepositoryProtectedBranchResponseBodyResultTestSettingSensitiveInfoDetection extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("Message")
        public String message;

        public static CreateRepositoryProtectedBranchResponseBodyResultTestSettingSensitiveInfoDetection build(java.util.Map<String, ?> map) throws Exception {
            CreateRepositoryProtectedBranchResponseBodyResultTestSettingSensitiveInfoDetection self = new CreateRepositoryProtectedBranchResponseBodyResultTestSettingSensitiveInfoDetection();
            return TeaModel.build(map, self);
        }

        public CreateRepositoryProtectedBranchResponseBodyResultTestSettingSensitiveInfoDetection setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateRepositoryProtectedBranchResponseBodyResultTestSettingSensitiveInfoDetection setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class CreateRepositoryProtectedBranchResponseBodyResultTestSetting extends TeaModel {
        @NameInMap("CheckConfig")
        public CreateRepositoryProtectedBranchResponseBodyResultTestSettingCheckConfig checkConfig;

        @NameInMap("CodingGuidelinesDetection")
        public CreateRepositoryProtectedBranchResponseBodyResultTestSettingCodingGuidelinesDetection codingGuidelinesDetection;

        @NameInMap("Required")
        public Boolean required;

        @NameInMap("SensitiveInfoDetection")
        public CreateRepositoryProtectedBranchResponseBodyResultTestSettingSensitiveInfoDetection sensitiveInfoDetection;

        public static CreateRepositoryProtectedBranchResponseBodyResultTestSetting build(java.util.Map<String, ?> map) throws Exception {
            CreateRepositoryProtectedBranchResponseBodyResultTestSetting self = new CreateRepositoryProtectedBranchResponseBodyResultTestSetting();
            return TeaModel.build(map, self);
        }

        public CreateRepositoryProtectedBranchResponseBodyResultTestSetting setCheckConfig(CreateRepositoryProtectedBranchResponseBodyResultTestSettingCheckConfig checkConfig) {
            this.checkConfig = checkConfig;
            return this;
        }
        public CreateRepositoryProtectedBranchResponseBodyResultTestSettingCheckConfig getCheckConfig() {
            return this.checkConfig;
        }

        public CreateRepositoryProtectedBranchResponseBodyResultTestSetting setCodingGuidelinesDetection(CreateRepositoryProtectedBranchResponseBodyResultTestSettingCodingGuidelinesDetection codingGuidelinesDetection) {
            this.codingGuidelinesDetection = codingGuidelinesDetection;
            return this;
        }
        public CreateRepositoryProtectedBranchResponseBodyResultTestSettingCodingGuidelinesDetection getCodingGuidelinesDetection() {
            return this.codingGuidelinesDetection;
        }

        public CreateRepositoryProtectedBranchResponseBodyResultTestSetting setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public CreateRepositoryProtectedBranchResponseBodyResultTestSetting setSensitiveInfoDetection(CreateRepositoryProtectedBranchResponseBodyResultTestSettingSensitiveInfoDetection sensitiveInfoDetection) {
            this.sensitiveInfoDetection = sensitiveInfoDetection;
            return this;
        }
        public CreateRepositoryProtectedBranchResponseBodyResultTestSettingSensitiveInfoDetection getSensitiveInfoDetection() {
            return this.sensitiveInfoDetection;
        }

    }

    public static class CreateRepositoryProtectedBranchResponseBodyResult extends TeaModel {
        @NameInMap("AllowMergeRoles")
        public java.util.List<Integer> allowMergeRoles;

        @NameInMap("AllowPushRoles")
        public java.util.List<Integer> allowPushRoles;

        @NameInMap("Branch")
        public String branch;

        @NameInMap("Id")
        public Long id;

        @NameInMap("MergeRequestSetting")
        public CreateRepositoryProtectedBranchResponseBodyResultMergeRequestSetting mergeRequestSetting;

        @NameInMap("TestSetting")
        public CreateRepositoryProtectedBranchResponseBodyResultTestSetting testSetting;

        public static CreateRepositoryProtectedBranchResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateRepositoryProtectedBranchResponseBodyResult self = new CreateRepositoryProtectedBranchResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateRepositoryProtectedBranchResponseBodyResult setAllowMergeRoles(java.util.List<Integer> allowMergeRoles) {
            this.allowMergeRoles = allowMergeRoles;
            return this;
        }
        public java.util.List<Integer> getAllowMergeRoles() {
            return this.allowMergeRoles;
        }

        public CreateRepositoryProtectedBranchResponseBodyResult setAllowPushRoles(java.util.List<Integer> allowPushRoles) {
            this.allowPushRoles = allowPushRoles;
            return this;
        }
        public java.util.List<Integer> getAllowPushRoles() {
            return this.allowPushRoles;
        }

        public CreateRepositoryProtectedBranchResponseBodyResult setBranch(String branch) {
            this.branch = branch;
            return this;
        }
        public String getBranch() {
            return this.branch;
        }

        public CreateRepositoryProtectedBranchResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateRepositoryProtectedBranchResponseBodyResult setMergeRequestSetting(CreateRepositoryProtectedBranchResponseBodyResultMergeRequestSetting mergeRequestSetting) {
            this.mergeRequestSetting = mergeRequestSetting;
            return this;
        }
        public CreateRepositoryProtectedBranchResponseBodyResultMergeRequestSetting getMergeRequestSetting() {
            return this.mergeRequestSetting;
        }

        public CreateRepositoryProtectedBranchResponseBodyResult setTestSetting(CreateRepositoryProtectedBranchResponseBodyResultTestSetting testSetting) {
            this.testSetting = testSetting;
            return this;
        }
        public CreateRepositoryProtectedBranchResponseBodyResultTestSetting getTestSetting() {
            return this.testSetting;
        }

    }

}
