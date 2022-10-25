// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListRepositoryProtectedBranchResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListRepositoryProtectedBranchResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static ListRepositoryProtectedBranchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryProtectedBranchResponseBody self = new ListRepositoryProtectedBranchResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRepositoryProtectedBranchResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListRepositoryProtectedBranchResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListRepositoryProtectedBranchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRepositoryProtectedBranchResponseBody setResult(java.util.List<ListRepositoryProtectedBranchResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListRepositoryProtectedBranchResponseBodyResult> getResult() {
        return this.result;
    }

    public ListRepositoryProtectedBranchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListRepositoryProtectedBranchResponseBodyResultMergeRequestSettingDefaultAssignees extends TeaModel {
        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("Email")
        public String email;

        @NameInMap("ExternUid")
        public String externUid;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        public static ListRepositoryProtectedBranchResponseBodyResultMergeRequestSettingDefaultAssignees build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryProtectedBranchResponseBodyResultMergeRequestSettingDefaultAssignees self = new ListRepositoryProtectedBranchResponseBodyResultMergeRequestSettingDefaultAssignees();
            return TeaModel.build(map, self);
        }

        public ListRepositoryProtectedBranchResponseBodyResultMergeRequestSettingDefaultAssignees setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ListRepositoryProtectedBranchResponseBodyResultMergeRequestSettingDefaultAssignees setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListRepositoryProtectedBranchResponseBodyResultMergeRequestSettingDefaultAssignees setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public ListRepositoryProtectedBranchResponseBodyResultMergeRequestSettingDefaultAssignees setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListRepositoryProtectedBranchResponseBodyResultMergeRequestSettingDefaultAssignees setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListRepositoryProtectedBranchResponseBodyResultMergeRequestSetting extends TeaModel {
        @NameInMap("AllowMergeRequestRoles")
        public java.util.List<Integer> allowMergeRequestRoles;

        @NameInMap("AllowSelfApproval")
        public Boolean allowSelfApproval;

        @NameInMap("DefaultAssignees")
        public java.util.List<ListRepositoryProtectedBranchResponseBodyResultMergeRequestSettingDefaultAssignees> defaultAssignees;

        @NameInMap("IsRequireDiscussionProcessed")
        public Boolean isRequireDiscussionProcessed;

        @NameInMap("MergeRequestMode")
        public String mergeRequestMode;

        @NameInMap("MinimumApproval")
        public Integer minimumApproval;

        @NameInMap("Required")
        public Boolean required;

        @NameInMap("WhiteList")
        public String whiteList;

        public static ListRepositoryProtectedBranchResponseBodyResultMergeRequestSetting build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryProtectedBranchResponseBodyResultMergeRequestSetting self = new ListRepositoryProtectedBranchResponseBodyResultMergeRequestSetting();
            return TeaModel.build(map, self);
        }

        public ListRepositoryProtectedBranchResponseBodyResultMergeRequestSetting setAllowMergeRequestRoles(java.util.List<Integer> allowMergeRequestRoles) {
            this.allowMergeRequestRoles = allowMergeRequestRoles;
            return this;
        }
        public java.util.List<Integer> getAllowMergeRequestRoles() {
            return this.allowMergeRequestRoles;
        }

        public ListRepositoryProtectedBranchResponseBodyResultMergeRequestSetting setAllowSelfApproval(Boolean allowSelfApproval) {
            this.allowSelfApproval = allowSelfApproval;
            return this;
        }
        public Boolean getAllowSelfApproval() {
            return this.allowSelfApproval;
        }

        public ListRepositoryProtectedBranchResponseBodyResultMergeRequestSetting setDefaultAssignees(java.util.List<ListRepositoryProtectedBranchResponseBodyResultMergeRequestSettingDefaultAssignees> defaultAssignees) {
            this.defaultAssignees = defaultAssignees;
            return this;
        }
        public java.util.List<ListRepositoryProtectedBranchResponseBodyResultMergeRequestSettingDefaultAssignees> getDefaultAssignees() {
            return this.defaultAssignees;
        }

        public ListRepositoryProtectedBranchResponseBodyResultMergeRequestSetting setIsRequireDiscussionProcessed(Boolean isRequireDiscussionProcessed) {
            this.isRequireDiscussionProcessed = isRequireDiscussionProcessed;
            return this;
        }
        public Boolean getIsRequireDiscussionProcessed() {
            return this.isRequireDiscussionProcessed;
        }

        public ListRepositoryProtectedBranchResponseBodyResultMergeRequestSetting setMergeRequestMode(String mergeRequestMode) {
            this.mergeRequestMode = mergeRequestMode;
            return this;
        }
        public String getMergeRequestMode() {
            return this.mergeRequestMode;
        }

        public ListRepositoryProtectedBranchResponseBodyResultMergeRequestSetting setMinimumApproval(Integer minimumApproval) {
            this.minimumApproval = minimumApproval;
            return this;
        }
        public Integer getMinimumApproval() {
            return this.minimumApproval;
        }

        public ListRepositoryProtectedBranchResponseBodyResultMergeRequestSetting setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public ListRepositoryProtectedBranchResponseBodyResultMergeRequestSetting setWhiteList(String whiteList) {
            this.whiteList = whiteList;
            return this;
        }
        public String getWhiteList() {
            return this.whiteList;
        }

    }

    public static class ListRepositoryProtectedBranchResponseBodyResultTestSettingCheckConfigCheckItems extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Required")
        public Boolean required;

        public static ListRepositoryProtectedBranchResponseBodyResultTestSettingCheckConfigCheckItems build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryProtectedBranchResponseBodyResultTestSettingCheckConfigCheckItems self = new ListRepositoryProtectedBranchResponseBodyResultTestSettingCheckConfigCheckItems();
            return TeaModel.build(map, self);
        }

        public ListRepositoryProtectedBranchResponseBodyResultTestSettingCheckConfigCheckItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRepositoryProtectedBranchResponseBodyResultTestSettingCheckConfigCheckItems setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

    }

    public static class ListRepositoryProtectedBranchResponseBodyResultTestSettingCheckConfig extends TeaModel {
        @NameInMap("CheckItems")
        public java.util.List<ListRepositoryProtectedBranchResponseBodyResultTestSettingCheckConfigCheckItems> checkItems;

        public static ListRepositoryProtectedBranchResponseBodyResultTestSettingCheckConfig build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryProtectedBranchResponseBodyResultTestSettingCheckConfig self = new ListRepositoryProtectedBranchResponseBodyResultTestSettingCheckConfig();
            return TeaModel.build(map, self);
        }

        public ListRepositoryProtectedBranchResponseBodyResultTestSettingCheckConfig setCheckItems(java.util.List<ListRepositoryProtectedBranchResponseBodyResultTestSettingCheckConfigCheckItems> checkItems) {
            this.checkItems = checkItems;
            return this;
        }
        public java.util.List<ListRepositoryProtectedBranchResponseBodyResultTestSettingCheckConfigCheckItems> getCheckItems() {
            return this.checkItems;
        }

    }

    public static class ListRepositoryProtectedBranchResponseBodyResultTestSettingCodingGuidelinesDetection extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("Message")
        public String message;

        public static ListRepositoryProtectedBranchResponseBodyResultTestSettingCodingGuidelinesDetection build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryProtectedBranchResponseBodyResultTestSettingCodingGuidelinesDetection self = new ListRepositoryProtectedBranchResponseBodyResultTestSettingCodingGuidelinesDetection();
            return TeaModel.build(map, self);
        }

        public ListRepositoryProtectedBranchResponseBodyResultTestSettingCodingGuidelinesDetection setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListRepositoryProtectedBranchResponseBodyResultTestSettingCodingGuidelinesDetection setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class ListRepositoryProtectedBranchResponseBodyResultTestSettingSensitiveInfoDetection extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("Message")
        public String message;

        public static ListRepositoryProtectedBranchResponseBodyResultTestSettingSensitiveInfoDetection build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryProtectedBranchResponseBodyResultTestSettingSensitiveInfoDetection self = new ListRepositoryProtectedBranchResponseBodyResultTestSettingSensitiveInfoDetection();
            return TeaModel.build(map, self);
        }

        public ListRepositoryProtectedBranchResponseBodyResultTestSettingSensitiveInfoDetection setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListRepositoryProtectedBranchResponseBodyResultTestSettingSensitiveInfoDetection setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class ListRepositoryProtectedBranchResponseBodyResultTestSetting extends TeaModel {
        @NameInMap("CheckConfig")
        public ListRepositoryProtectedBranchResponseBodyResultTestSettingCheckConfig checkConfig;

        @NameInMap("CodingGuidelinesDetection")
        public ListRepositoryProtectedBranchResponseBodyResultTestSettingCodingGuidelinesDetection codingGuidelinesDetection;

        @NameInMap("Required")
        public Boolean required;

        @NameInMap("SensitiveInfoDetection")
        public ListRepositoryProtectedBranchResponseBodyResultTestSettingSensitiveInfoDetection sensitiveInfoDetection;

        public static ListRepositoryProtectedBranchResponseBodyResultTestSetting build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryProtectedBranchResponseBodyResultTestSetting self = new ListRepositoryProtectedBranchResponseBodyResultTestSetting();
            return TeaModel.build(map, self);
        }

        public ListRepositoryProtectedBranchResponseBodyResultTestSetting setCheckConfig(ListRepositoryProtectedBranchResponseBodyResultTestSettingCheckConfig checkConfig) {
            this.checkConfig = checkConfig;
            return this;
        }
        public ListRepositoryProtectedBranchResponseBodyResultTestSettingCheckConfig getCheckConfig() {
            return this.checkConfig;
        }

        public ListRepositoryProtectedBranchResponseBodyResultTestSetting setCodingGuidelinesDetection(ListRepositoryProtectedBranchResponseBodyResultTestSettingCodingGuidelinesDetection codingGuidelinesDetection) {
            this.codingGuidelinesDetection = codingGuidelinesDetection;
            return this;
        }
        public ListRepositoryProtectedBranchResponseBodyResultTestSettingCodingGuidelinesDetection getCodingGuidelinesDetection() {
            return this.codingGuidelinesDetection;
        }

        public ListRepositoryProtectedBranchResponseBodyResultTestSetting setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public ListRepositoryProtectedBranchResponseBodyResultTestSetting setSensitiveInfoDetection(ListRepositoryProtectedBranchResponseBodyResultTestSettingSensitiveInfoDetection sensitiveInfoDetection) {
            this.sensitiveInfoDetection = sensitiveInfoDetection;
            return this;
        }
        public ListRepositoryProtectedBranchResponseBodyResultTestSettingSensitiveInfoDetection getSensitiveInfoDetection() {
            return this.sensitiveInfoDetection;
        }

    }

    public static class ListRepositoryProtectedBranchResponseBodyResult extends TeaModel {
        @NameInMap("AllowMergeRoles")
        public java.util.List<Integer> allowMergeRoles;

        @NameInMap("AllowPushRoles")
        public java.util.List<Integer> allowPushRoles;

        @NameInMap("Branch")
        public String branch;

        @NameInMap("Id")
        public Long id;

        @NameInMap("MergeRequestSetting")
        public ListRepositoryProtectedBranchResponseBodyResultMergeRequestSetting mergeRequestSetting;

        @NameInMap("TestSetting")
        public ListRepositoryProtectedBranchResponseBodyResultTestSetting testSetting;

        public static ListRepositoryProtectedBranchResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryProtectedBranchResponseBodyResult self = new ListRepositoryProtectedBranchResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListRepositoryProtectedBranchResponseBodyResult setAllowMergeRoles(java.util.List<Integer> allowMergeRoles) {
            this.allowMergeRoles = allowMergeRoles;
            return this;
        }
        public java.util.List<Integer> getAllowMergeRoles() {
            return this.allowMergeRoles;
        }

        public ListRepositoryProtectedBranchResponseBodyResult setAllowPushRoles(java.util.List<Integer> allowPushRoles) {
            this.allowPushRoles = allowPushRoles;
            return this;
        }
        public java.util.List<Integer> getAllowPushRoles() {
            return this.allowPushRoles;
        }

        public ListRepositoryProtectedBranchResponseBodyResult setBranch(String branch) {
            this.branch = branch;
            return this;
        }
        public String getBranch() {
            return this.branch;
        }

        public ListRepositoryProtectedBranchResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListRepositoryProtectedBranchResponseBodyResult setMergeRequestSetting(ListRepositoryProtectedBranchResponseBodyResultMergeRequestSetting mergeRequestSetting) {
            this.mergeRequestSetting = mergeRequestSetting;
            return this;
        }
        public ListRepositoryProtectedBranchResponseBodyResultMergeRequestSetting getMergeRequestSetting() {
            return this.mergeRequestSetting;
        }

        public ListRepositoryProtectedBranchResponseBodyResult setTestSetting(ListRepositoryProtectedBranchResponseBodyResultTestSetting testSetting) {
            this.testSetting = testSetting;
            return this;
        }
        public ListRepositoryProtectedBranchResponseBodyResultTestSetting getTestSetting() {
            return this.testSetting;
        }

    }

}
