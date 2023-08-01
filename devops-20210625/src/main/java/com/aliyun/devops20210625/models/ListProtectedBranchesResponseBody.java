// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListProtectedBranchesResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListProtectedBranchesResponseBodyResult> result;

    @NameInMap("success")
    public Boolean success;

    public static ListProtectedBranchesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProtectedBranchesResponseBody self = new ListProtectedBranchesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProtectedBranchesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListProtectedBranchesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListProtectedBranchesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProtectedBranchesResponseBody setResult(java.util.List<ListProtectedBranchesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListProtectedBranchesResponseBodyResult> getResult() {
        return this.result;
    }

    public ListProtectedBranchesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListProtectedBranchesResponseBodyResultAllowMergeUsers extends TeaModel {
        @NameInMap("avatar")
        public String avatar;

        @NameInMap("email")
        public String email;

        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        @NameInMap("username")
        public String username;

        public static ListProtectedBranchesResponseBodyResultAllowMergeUsers build(java.util.Map<String, ?> map) throws Exception {
            ListProtectedBranchesResponseBodyResultAllowMergeUsers self = new ListProtectedBranchesResponseBodyResultAllowMergeUsers();
            return TeaModel.build(map, self);
        }

        public ListProtectedBranchesResponseBodyResultAllowMergeUsers setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }
        public String getAvatar() {
            return this.avatar;
        }

        public ListProtectedBranchesResponseBodyResultAllowMergeUsers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListProtectedBranchesResponseBodyResultAllowMergeUsers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListProtectedBranchesResponseBodyResultAllowMergeUsers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProtectedBranchesResponseBodyResultAllowMergeUsers setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class ListProtectedBranchesResponseBodyResultAllowPushUsers extends TeaModel {
        @NameInMap("avatar")
        public String avatar;

        @NameInMap("email")
        public String email;

        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        @NameInMap("username")
        public String username;

        public static ListProtectedBranchesResponseBodyResultAllowPushUsers build(java.util.Map<String, ?> map) throws Exception {
            ListProtectedBranchesResponseBodyResultAllowPushUsers self = new ListProtectedBranchesResponseBodyResultAllowPushUsers();
            return TeaModel.build(map, self);
        }

        public ListProtectedBranchesResponseBodyResultAllowPushUsers setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }
        public String getAvatar() {
            return this.avatar;
        }

        public ListProtectedBranchesResponseBodyResultAllowPushUsers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListProtectedBranchesResponseBodyResultAllowPushUsers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListProtectedBranchesResponseBodyResultAllowPushUsers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProtectedBranchesResponseBodyResultAllowPushUsers setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class ListProtectedBranchesResponseBodyResultMergeRequestSettingDefaultAssignees extends TeaModel {
        @NameInMap("avatar")
        public String avatar;

        @NameInMap("email")
        public String email;

        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        @NameInMap("username")
        public String username;

        public static ListProtectedBranchesResponseBodyResultMergeRequestSettingDefaultAssignees build(java.util.Map<String, ?> map) throws Exception {
            ListProtectedBranchesResponseBodyResultMergeRequestSettingDefaultAssignees self = new ListProtectedBranchesResponseBodyResultMergeRequestSettingDefaultAssignees();
            return TeaModel.build(map, self);
        }

        public ListProtectedBranchesResponseBodyResultMergeRequestSettingDefaultAssignees setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }
        public String getAvatar() {
            return this.avatar;
        }

        public ListProtectedBranchesResponseBodyResultMergeRequestSettingDefaultAssignees setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListProtectedBranchesResponseBodyResultMergeRequestSettingDefaultAssignees setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListProtectedBranchesResponseBodyResultMergeRequestSettingDefaultAssignees setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProtectedBranchesResponseBodyResultMergeRequestSettingDefaultAssignees setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class ListProtectedBranchesResponseBodyResultMergeRequestSetting extends TeaModel {
        @NameInMap("allowMergeRequestRoles")
        public java.util.List<Integer> allowMergeRequestRoles;

        @NameInMap("defaultAssignees")
        public java.util.List<ListProtectedBranchesResponseBodyResultMergeRequestSettingDefaultAssignees> defaultAssignees;

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

        public static ListProtectedBranchesResponseBodyResultMergeRequestSetting build(java.util.Map<String, ?> map) throws Exception {
            ListProtectedBranchesResponseBodyResultMergeRequestSetting self = new ListProtectedBranchesResponseBodyResultMergeRequestSetting();
            return TeaModel.build(map, self);
        }

        public ListProtectedBranchesResponseBodyResultMergeRequestSetting setAllowMergeRequestRoles(java.util.List<Integer> allowMergeRequestRoles) {
            this.allowMergeRequestRoles = allowMergeRequestRoles;
            return this;
        }
        public java.util.List<Integer> getAllowMergeRequestRoles() {
            return this.allowMergeRequestRoles;
        }

        public ListProtectedBranchesResponseBodyResultMergeRequestSetting setDefaultAssignees(java.util.List<ListProtectedBranchesResponseBodyResultMergeRequestSettingDefaultAssignees> defaultAssignees) {
            this.defaultAssignees = defaultAssignees;
            return this;
        }
        public java.util.List<ListProtectedBranchesResponseBodyResultMergeRequestSettingDefaultAssignees> getDefaultAssignees() {
            return this.defaultAssignees;
        }

        public ListProtectedBranchesResponseBodyResultMergeRequestSetting setIsAllowSelfApproval(Boolean isAllowSelfApproval) {
            this.isAllowSelfApproval = isAllowSelfApproval;
            return this;
        }
        public Boolean getIsAllowSelfApproval() {
            return this.isAllowSelfApproval;
        }

        public ListProtectedBranchesResponseBodyResultMergeRequestSetting setIsRequireDiscussionProcessed(Boolean isRequireDiscussionProcessed) {
            this.isRequireDiscussionProcessed = isRequireDiscussionProcessed;
            return this;
        }
        public Boolean getIsRequireDiscussionProcessed() {
            return this.isRequireDiscussionProcessed;
        }

        public ListProtectedBranchesResponseBodyResultMergeRequestSetting setIsRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            return this;
        }
        public Boolean getIsRequired() {
            return this.isRequired;
        }

        public ListProtectedBranchesResponseBodyResultMergeRequestSetting setIsResetApprovalWhenNewPush(Boolean isResetApprovalWhenNewPush) {
            this.isResetApprovalWhenNewPush = isResetApprovalWhenNewPush;
            return this;
        }
        public Boolean getIsResetApprovalWhenNewPush() {
            return this.isResetApprovalWhenNewPush;
        }

        public ListProtectedBranchesResponseBodyResultMergeRequestSetting setMinimumApproval(Integer minimumApproval) {
            this.minimumApproval = minimumApproval;
            return this;
        }
        public Integer getMinimumApproval() {
            return this.minimumApproval;
        }

        public ListProtectedBranchesResponseBodyResultMergeRequestSetting setMrMode(String mrMode) {
            this.mrMode = mrMode;
            return this;
        }
        public String getMrMode() {
            return this.mrMode;
        }

        public ListProtectedBranchesResponseBodyResultMergeRequestSetting setWhiteList(String whiteList) {
            this.whiteList = whiteList;
            return this;
        }
        public String getWhiteList() {
            return this.whiteList;
        }

    }

    public static class ListProtectedBranchesResponseBodyResultTestSettingDTOCheckConfigCheckItems extends TeaModel {
        @NameInMap("isRequired")
        public Boolean isRequired;

        @NameInMap("name")
        public String name;

        public static ListProtectedBranchesResponseBodyResultTestSettingDTOCheckConfigCheckItems build(java.util.Map<String, ?> map) throws Exception {
            ListProtectedBranchesResponseBodyResultTestSettingDTOCheckConfigCheckItems self = new ListProtectedBranchesResponseBodyResultTestSettingDTOCheckConfigCheckItems();
            return TeaModel.build(map, self);
        }

        public ListProtectedBranchesResponseBodyResultTestSettingDTOCheckConfigCheckItems setIsRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            return this;
        }
        public Boolean getIsRequired() {
            return this.isRequired;
        }

        public ListProtectedBranchesResponseBodyResultTestSettingDTOCheckConfigCheckItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListProtectedBranchesResponseBodyResultTestSettingDTOCheckConfig extends TeaModel {
        @NameInMap("checkItems")
        public java.util.List<ListProtectedBranchesResponseBodyResultTestSettingDTOCheckConfigCheckItems> checkItems;

        public static ListProtectedBranchesResponseBodyResultTestSettingDTOCheckConfig build(java.util.Map<String, ?> map) throws Exception {
            ListProtectedBranchesResponseBodyResultTestSettingDTOCheckConfig self = new ListProtectedBranchesResponseBodyResultTestSettingDTOCheckConfig();
            return TeaModel.build(map, self);
        }

        public ListProtectedBranchesResponseBodyResultTestSettingDTOCheckConfig setCheckItems(java.util.List<ListProtectedBranchesResponseBodyResultTestSettingDTOCheckConfigCheckItems> checkItems) {
            this.checkItems = checkItems;
            return this;
        }
        public java.util.List<ListProtectedBranchesResponseBodyResultTestSettingDTOCheckConfigCheckItems> getCheckItems() {
            return this.checkItems;
        }

    }

    public static class ListProtectedBranchesResponseBodyResultTestSettingDTOCheckTaskQualityConfig extends TeaModel {
        @NameInMap("bizNo")
        public String bizNo;

        @NameInMap("enabled")
        public Boolean enabled;

        @NameInMap("message")
        public String message;

        @NameInMap("taskName")
        public String taskName;

        public static ListProtectedBranchesResponseBodyResultTestSettingDTOCheckTaskQualityConfig build(java.util.Map<String, ?> map) throws Exception {
            ListProtectedBranchesResponseBodyResultTestSettingDTOCheckTaskQualityConfig self = new ListProtectedBranchesResponseBodyResultTestSettingDTOCheckTaskQualityConfig();
            return TeaModel.build(map, self);
        }

        public ListProtectedBranchesResponseBodyResultTestSettingDTOCheckTaskQualityConfig setBizNo(String bizNo) {
            this.bizNo = bizNo;
            return this;
        }
        public String getBizNo() {
            return this.bizNo;
        }

        public ListProtectedBranchesResponseBodyResultTestSettingDTOCheckTaskQualityConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListProtectedBranchesResponseBodyResultTestSettingDTOCheckTaskQualityConfig setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListProtectedBranchesResponseBodyResultTestSettingDTOCheckTaskQualityConfig setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

    public static class ListProtectedBranchesResponseBodyResultTestSettingDTOCodeGuidelinesDetection extends TeaModel {
        @NameInMap("enabled")
        public Boolean enabled;

        @NameInMap("message")
        public String message;

        public static ListProtectedBranchesResponseBodyResultTestSettingDTOCodeGuidelinesDetection build(java.util.Map<String, ?> map) throws Exception {
            ListProtectedBranchesResponseBodyResultTestSettingDTOCodeGuidelinesDetection self = new ListProtectedBranchesResponseBodyResultTestSettingDTOCodeGuidelinesDetection();
            return TeaModel.build(map, self);
        }

        public ListProtectedBranchesResponseBodyResultTestSettingDTOCodeGuidelinesDetection setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListProtectedBranchesResponseBodyResultTestSettingDTOCodeGuidelinesDetection setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class ListProtectedBranchesResponseBodyResultTestSettingDTOSensitiveInfoDetection extends TeaModel {
        @NameInMap("enabled")
        public Boolean enabled;

        @NameInMap("message")
        public String message;

        public static ListProtectedBranchesResponseBodyResultTestSettingDTOSensitiveInfoDetection build(java.util.Map<String, ?> map) throws Exception {
            ListProtectedBranchesResponseBodyResultTestSettingDTOSensitiveInfoDetection self = new ListProtectedBranchesResponseBodyResultTestSettingDTOSensitiveInfoDetection();
            return TeaModel.build(map, self);
        }

        public ListProtectedBranchesResponseBodyResultTestSettingDTOSensitiveInfoDetection setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListProtectedBranchesResponseBodyResultTestSettingDTOSensitiveInfoDetection setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class ListProtectedBranchesResponseBodyResultTestSettingDTO extends TeaModel {
        @NameInMap("checkConfig")
        public ListProtectedBranchesResponseBodyResultTestSettingDTOCheckConfig checkConfig;

        @NameInMap("checkTaskQualityConfig")
        public ListProtectedBranchesResponseBodyResultTestSettingDTOCheckTaskQualityConfig checkTaskQualityConfig;

        @NameInMap("codeGuidelinesDetection")
        public ListProtectedBranchesResponseBodyResultTestSettingDTOCodeGuidelinesDetection codeGuidelinesDetection;

        @NameInMap("isRequired")
        public Boolean isRequired;

        @NameInMap("sensitiveInfoDetection")
        public ListProtectedBranchesResponseBodyResultTestSettingDTOSensitiveInfoDetection sensitiveInfoDetection;

        public static ListProtectedBranchesResponseBodyResultTestSettingDTO build(java.util.Map<String, ?> map) throws Exception {
            ListProtectedBranchesResponseBodyResultTestSettingDTO self = new ListProtectedBranchesResponseBodyResultTestSettingDTO();
            return TeaModel.build(map, self);
        }

        public ListProtectedBranchesResponseBodyResultTestSettingDTO setCheckConfig(ListProtectedBranchesResponseBodyResultTestSettingDTOCheckConfig checkConfig) {
            this.checkConfig = checkConfig;
            return this;
        }
        public ListProtectedBranchesResponseBodyResultTestSettingDTOCheckConfig getCheckConfig() {
            return this.checkConfig;
        }

        public ListProtectedBranchesResponseBodyResultTestSettingDTO setCheckTaskQualityConfig(ListProtectedBranchesResponseBodyResultTestSettingDTOCheckTaskQualityConfig checkTaskQualityConfig) {
            this.checkTaskQualityConfig = checkTaskQualityConfig;
            return this;
        }
        public ListProtectedBranchesResponseBodyResultTestSettingDTOCheckTaskQualityConfig getCheckTaskQualityConfig() {
            return this.checkTaskQualityConfig;
        }

        public ListProtectedBranchesResponseBodyResultTestSettingDTO setCodeGuidelinesDetection(ListProtectedBranchesResponseBodyResultTestSettingDTOCodeGuidelinesDetection codeGuidelinesDetection) {
            this.codeGuidelinesDetection = codeGuidelinesDetection;
            return this;
        }
        public ListProtectedBranchesResponseBodyResultTestSettingDTOCodeGuidelinesDetection getCodeGuidelinesDetection() {
            return this.codeGuidelinesDetection;
        }

        public ListProtectedBranchesResponseBodyResultTestSettingDTO setIsRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            return this;
        }
        public Boolean getIsRequired() {
            return this.isRequired;
        }

        public ListProtectedBranchesResponseBodyResultTestSettingDTO setSensitiveInfoDetection(ListProtectedBranchesResponseBodyResultTestSettingDTOSensitiveInfoDetection sensitiveInfoDetection) {
            this.sensitiveInfoDetection = sensitiveInfoDetection;
            return this;
        }
        public ListProtectedBranchesResponseBodyResultTestSettingDTOSensitiveInfoDetection getSensitiveInfoDetection() {
            return this.sensitiveInfoDetection;
        }

    }

    public static class ListProtectedBranchesResponseBodyResult extends TeaModel {
        @NameInMap("allowMergeRoles")
        public java.util.List<Integer> allowMergeRoles;

        @NameInMap("allowMergeUserIds")
        public java.util.List<Long> allowMergeUserIds;

        @NameInMap("allowMergeUsers")
        public java.util.List<ListProtectedBranchesResponseBodyResultAllowMergeUsers> allowMergeUsers;

        @NameInMap("allowPushRoles")
        public java.util.List<Integer> allowPushRoles;

        @NameInMap("allowPushUserIds")
        public java.util.List<Long> allowPushUserIds;

        @NameInMap("allowPushUsers")
        public java.util.List<ListProtectedBranchesResponseBodyResultAllowPushUsers> allowPushUsers;

        @NameInMap("branch")
        public String branch;

        @NameInMap("createdAt")
        public String createdAt;

        @NameInMap("id")
        public Long id;

        @NameInMap("matches")
        public java.util.List<String> matches;

        @NameInMap("mergeRequestSetting")
        public ListProtectedBranchesResponseBodyResultMergeRequestSetting mergeRequestSetting;

        @NameInMap("testSettingDTO")
        public ListProtectedBranchesResponseBodyResultTestSettingDTO testSettingDTO;

        @NameInMap("updatedAt")
        public String updatedAt;

        public static ListProtectedBranchesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListProtectedBranchesResponseBodyResult self = new ListProtectedBranchesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListProtectedBranchesResponseBodyResult setAllowMergeRoles(java.util.List<Integer> allowMergeRoles) {
            this.allowMergeRoles = allowMergeRoles;
            return this;
        }
        public java.util.List<Integer> getAllowMergeRoles() {
            return this.allowMergeRoles;
        }

        public ListProtectedBranchesResponseBodyResult setAllowMergeUserIds(java.util.List<Long> allowMergeUserIds) {
            this.allowMergeUserIds = allowMergeUserIds;
            return this;
        }
        public java.util.List<Long> getAllowMergeUserIds() {
            return this.allowMergeUserIds;
        }

        public ListProtectedBranchesResponseBodyResult setAllowMergeUsers(java.util.List<ListProtectedBranchesResponseBodyResultAllowMergeUsers> allowMergeUsers) {
            this.allowMergeUsers = allowMergeUsers;
            return this;
        }
        public java.util.List<ListProtectedBranchesResponseBodyResultAllowMergeUsers> getAllowMergeUsers() {
            return this.allowMergeUsers;
        }

        public ListProtectedBranchesResponseBodyResult setAllowPushRoles(java.util.List<Integer> allowPushRoles) {
            this.allowPushRoles = allowPushRoles;
            return this;
        }
        public java.util.List<Integer> getAllowPushRoles() {
            return this.allowPushRoles;
        }

        public ListProtectedBranchesResponseBodyResult setAllowPushUserIds(java.util.List<Long> allowPushUserIds) {
            this.allowPushUserIds = allowPushUserIds;
            return this;
        }
        public java.util.List<Long> getAllowPushUserIds() {
            return this.allowPushUserIds;
        }

        public ListProtectedBranchesResponseBodyResult setAllowPushUsers(java.util.List<ListProtectedBranchesResponseBodyResultAllowPushUsers> allowPushUsers) {
            this.allowPushUsers = allowPushUsers;
            return this;
        }
        public java.util.List<ListProtectedBranchesResponseBodyResultAllowPushUsers> getAllowPushUsers() {
            return this.allowPushUsers;
        }

        public ListProtectedBranchesResponseBodyResult setBranch(String branch) {
            this.branch = branch;
            return this;
        }
        public String getBranch() {
            return this.branch;
        }

        public ListProtectedBranchesResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListProtectedBranchesResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListProtectedBranchesResponseBodyResult setMatches(java.util.List<String> matches) {
            this.matches = matches;
            return this;
        }
        public java.util.List<String> getMatches() {
            return this.matches;
        }

        public ListProtectedBranchesResponseBodyResult setMergeRequestSetting(ListProtectedBranchesResponseBodyResultMergeRequestSetting mergeRequestSetting) {
            this.mergeRequestSetting = mergeRequestSetting;
            return this;
        }
        public ListProtectedBranchesResponseBodyResultMergeRequestSetting getMergeRequestSetting() {
            return this.mergeRequestSetting;
        }

        public ListProtectedBranchesResponseBodyResult setTestSettingDTO(ListProtectedBranchesResponseBodyResultTestSettingDTO testSettingDTO) {
            this.testSettingDTO = testSettingDTO;
            return this;
        }
        public ListProtectedBranchesResponseBodyResultTestSettingDTO getTestSettingDTO() {
            return this.testSettingDTO;
        }

        public ListProtectedBranchesResponseBodyResult setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
