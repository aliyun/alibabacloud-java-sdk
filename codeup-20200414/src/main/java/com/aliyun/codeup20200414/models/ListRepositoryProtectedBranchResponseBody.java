// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListRepositoryProtectedBranchResponseBody extends TeaModel {
    // 错误信息
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 请求结果
    @NameInMap("Success")
    public Boolean success;

    // 错误码
    @NameInMap("ErrorCode")
    public String errorCode;

    // 响应结果
    @NameInMap("Result")
    public java.util.List<ListRepositoryProtectedBranchResponseBodyResult> result;

    public static ListRepositoryProtectedBranchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryProtectedBranchResponseBody self = new ListRepositoryProtectedBranchResponseBody();
        return TeaModel.build(map, self);
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

    public ListRepositoryProtectedBranchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListRepositoryProtectedBranchResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListRepositoryProtectedBranchResponseBody setResult(java.util.List<ListRepositoryProtectedBranchResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListRepositoryProtectedBranchResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListRepositoryProtectedBranchResponseBodyResultMergeRequestSettingDefaultAssignees extends TeaModel {
        // 姓名
        @NameInMap("Name")
        public String name;

        // 云效用户ID
        @NameInMap("ExternUid")
        public String externUid;

        // 头像地址
        @NameInMap("AvatarUrl")
        public String avatarUrl;

        // 用户ID
        @NameInMap("Id")
        public Long id;

        // 邮箱
        @NameInMap("Email")
        public String email;

        public static ListRepositoryProtectedBranchResponseBodyResultMergeRequestSettingDefaultAssignees build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryProtectedBranchResponseBodyResultMergeRequestSettingDefaultAssignees self = new ListRepositoryProtectedBranchResponseBodyResultMergeRequestSettingDefaultAssignees();
            return TeaModel.build(map, self);
        }

        public ListRepositoryProtectedBranchResponseBodyResultMergeRequestSettingDefaultAssignees setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRepositoryProtectedBranchResponseBodyResultMergeRequestSettingDefaultAssignees setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public ListRepositoryProtectedBranchResponseBodyResultMergeRequestSettingDefaultAssignees setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ListRepositoryProtectedBranchResponseBodyResultMergeRequestSettingDefaultAssignees setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListRepositoryProtectedBranchResponseBodyResultMergeRequestSettingDefaultAssignees setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

    }

    public static class ListRepositoryProtectedBranchResponseBodyResultMergeRequestSetting extends TeaModel {
        // 评审模式。  general：普通 codeowner：CodeOwner模式
        @NameInMap("MergeRequestMode")
        public String mergeRequestMode;

        // 是否允许创建者通过代码评审。
        @NameInMap("AllowSelfApproval")
        public Boolean allowSelfApproval;

        // 是否要求评论全部已解决。
        @NameInMap("IsRequireDiscussionProcessed")
        public Boolean isRequireDiscussionProcessed;

        // 是否要求合并前通过代码评审。
        @NameInMap("Required")
        public Boolean required;

        // 评审通过的最少人数。  注：仅普通模式生效。
        @NameInMap("MinimumApproval")
        public Integer minimumApproval;

        // 默认评审者。  注：云效用户 ID 列表。
        @NameInMap("DefaultAssignees")
        public java.util.List<ListRepositoryProtectedBranchResponseBodyResultMergeRequestSettingDefaultAssignees> defaultAssignees;

        // 允许通过代码评审的角色。  40：管理员  30：开发者
        @NameInMap("AllowMergeRequestRoles")
        public java.util.List<Integer> allowMergeRequestRoles;

        // 评审文件白名单
        @NameInMap("WhiteList")
        public String whiteList;

        public static ListRepositoryProtectedBranchResponseBodyResultMergeRequestSetting build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryProtectedBranchResponseBodyResultMergeRequestSetting self = new ListRepositoryProtectedBranchResponseBodyResultMergeRequestSetting();
            return TeaModel.build(map, self);
        }

        public ListRepositoryProtectedBranchResponseBodyResultMergeRequestSetting setMergeRequestMode(String mergeRequestMode) {
            this.mergeRequestMode = mergeRequestMode;
            return this;
        }
        public String getMergeRequestMode() {
            return this.mergeRequestMode;
        }

        public ListRepositoryProtectedBranchResponseBodyResultMergeRequestSetting setAllowSelfApproval(Boolean allowSelfApproval) {
            this.allowSelfApproval = allowSelfApproval;
            return this;
        }
        public Boolean getAllowSelfApproval() {
            return this.allowSelfApproval;
        }

        public ListRepositoryProtectedBranchResponseBodyResultMergeRequestSetting setIsRequireDiscussionProcessed(Boolean isRequireDiscussionProcessed) {
            this.isRequireDiscussionProcessed = isRequireDiscussionProcessed;
            return this;
        }
        public Boolean getIsRequireDiscussionProcessed() {
            return this.isRequireDiscussionProcessed;
        }

        public ListRepositoryProtectedBranchResponseBodyResultMergeRequestSetting setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public ListRepositoryProtectedBranchResponseBodyResultMergeRequestSetting setMinimumApproval(Integer minimumApproval) {
            this.minimumApproval = minimumApproval;
            return this;
        }
        public Integer getMinimumApproval() {
            return this.minimumApproval;
        }

        public ListRepositoryProtectedBranchResponseBodyResultMergeRequestSetting setDefaultAssignees(java.util.List<ListRepositoryProtectedBranchResponseBodyResultMergeRequestSettingDefaultAssignees> defaultAssignees) {
            this.defaultAssignees = defaultAssignees;
            return this;
        }
        public java.util.List<ListRepositoryProtectedBranchResponseBodyResultMergeRequestSettingDefaultAssignees> getDefaultAssignees() {
            return this.defaultAssignees;
        }

        public ListRepositoryProtectedBranchResponseBodyResultMergeRequestSetting setAllowMergeRequestRoles(java.util.List<Integer> allowMergeRequestRoles) {
            this.allowMergeRequestRoles = allowMergeRequestRoles;
            return this;
        }
        public java.util.List<Integer> getAllowMergeRequestRoles() {
            return this.allowMergeRequestRoles;
        }

        public ListRepositoryProtectedBranchResponseBodyResultMergeRequestSetting setWhiteList(String whiteList) {
            this.whiteList = whiteList;
            return this;
        }
        public String getWhiteList() {
            return this.whiteList;
        }

    }

    public static class ListRepositoryProtectedBranchResponseBodyResultTestSettingCodingGuidelinesDetection extends TeaModel {
        // 检查信息
        @NameInMap("Message")
        public String message;

        // 合并前是否需要通过Java 代码规约扫描。
        @NameInMap("Enabled")
        public Boolean enabled;

        public static ListRepositoryProtectedBranchResponseBodyResultTestSettingCodingGuidelinesDetection build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryProtectedBranchResponseBodyResultTestSettingCodingGuidelinesDetection self = new ListRepositoryProtectedBranchResponseBodyResultTestSettingCodingGuidelinesDetection();
            return TeaModel.build(map, self);
        }

        public ListRepositoryProtectedBranchResponseBodyResultTestSettingCodingGuidelinesDetection setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListRepositoryProtectedBranchResponseBodyResultTestSettingCodingGuidelinesDetection setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class ListRepositoryProtectedBranchResponseBodyResultTestSettingSensitiveInfoDetection extends TeaModel {
        // 检查信息
        @NameInMap("Message")
        public String message;

        // 合并前是否需要通过敏感信息检查
        @NameInMap("Enabled")
        public Boolean enabled;

        public static ListRepositoryProtectedBranchResponseBodyResultTestSettingSensitiveInfoDetection build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryProtectedBranchResponseBodyResultTestSettingSensitiveInfoDetection self = new ListRepositoryProtectedBranchResponseBodyResultTestSettingSensitiveInfoDetection();
            return TeaModel.build(map, self);
        }

        public ListRepositoryProtectedBranchResponseBodyResultTestSettingSensitiveInfoDetection setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListRepositoryProtectedBranchResponseBodyResultTestSettingSensitiveInfoDetection setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class ListRepositoryProtectedBranchResponseBodyResultTestSettingCheckConfigCheckItems extends TeaModel {
        // 流水线名称
        @NameInMap("Name")
        public String name;

        // 是否开启检测
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
        // 流水线检测列表
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

    public static class ListRepositoryProtectedBranchResponseBodyResultTestSetting extends TeaModel {
        // 要求合并前通过自动化执行检查。
        @NameInMap("Required")
        public Boolean required;

        // Java 代码规约扫描
        @NameInMap("CodingGuidelinesDetection")
        public ListRepositoryProtectedBranchResponseBodyResultTestSettingCodingGuidelinesDetection codingGuidelinesDetection;

        // 敏感信息检查
        @NameInMap("SensitiveInfoDetection")
        public ListRepositoryProtectedBranchResponseBodyResultTestSettingSensitiveInfoDetection sensitiveInfoDetection;

        // 卡点检测
        @NameInMap("CheckConfig")
        public ListRepositoryProtectedBranchResponseBodyResultTestSettingCheckConfig checkConfig;

        public static ListRepositoryProtectedBranchResponseBodyResultTestSetting build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryProtectedBranchResponseBodyResultTestSetting self = new ListRepositoryProtectedBranchResponseBodyResultTestSetting();
            return TeaModel.build(map, self);
        }

        public ListRepositoryProtectedBranchResponseBodyResultTestSetting setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public ListRepositoryProtectedBranchResponseBodyResultTestSetting setCodingGuidelinesDetection(ListRepositoryProtectedBranchResponseBodyResultTestSettingCodingGuidelinesDetection codingGuidelinesDetection) {
            this.codingGuidelinesDetection = codingGuidelinesDetection;
            return this;
        }
        public ListRepositoryProtectedBranchResponseBodyResultTestSettingCodingGuidelinesDetection getCodingGuidelinesDetection() {
            return this.codingGuidelinesDetection;
        }

        public ListRepositoryProtectedBranchResponseBodyResultTestSetting setSensitiveInfoDetection(ListRepositoryProtectedBranchResponseBodyResultTestSettingSensitiveInfoDetection sensitiveInfoDetection) {
            this.sensitiveInfoDetection = sensitiveInfoDetection;
            return this;
        }
        public ListRepositoryProtectedBranchResponseBodyResultTestSettingSensitiveInfoDetection getSensitiveInfoDetection() {
            return this.sensitiveInfoDetection;
        }

        public ListRepositoryProtectedBranchResponseBodyResultTestSetting setCheckConfig(ListRepositoryProtectedBranchResponseBodyResultTestSettingCheckConfig checkConfig) {
            this.checkConfig = checkConfig;
            return this;
        }
        public ListRepositoryProtectedBranchResponseBodyResultTestSettingCheckConfig getCheckConfig() {
            return this.checkConfig;
        }

    }

    public static class ListRepositoryProtectedBranchResponseBodyResult extends TeaModel {
        // 保护分支名称
        @NameInMap("Branch")
        public String branch;

        // 保护分支 ID
        @NameInMap("Id")
        public Long id;

        // 允许推送代码的角色。  40：管理员  30：开发者
        @NameInMap("AllowPushRoles")
        public java.util.List<Integer> allowPushRoles;

        // 允许合并的角色。  40：管理员  30：开发者
        @NameInMap("AllowMergeRoles")
        public java.util.List<Integer> allowMergeRoles;

        // 代码评审设置
        @NameInMap("MergeRequestSetting")
        public ListRepositoryProtectedBranchResponseBodyResultMergeRequestSetting mergeRequestSetting;

        // 自动化检查设置
        @NameInMap("TestSetting")
        public ListRepositoryProtectedBranchResponseBodyResultTestSetting testSetting;

        public static ListRepositoryProtectedBranchResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryProtectedBranchResponseBodyResult self = new ListRepositoryProtectedBranchResponseBodyResult();
            return TeaModel.build(map, self);
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

        public ListRepositoryProtectedBranchResponseBodyResult setAllowPushRoles(java.util.List<Integer> allowPushRoles) {
            this.allowPushRoles = allowPushRoles;
            return this;
        }
        public java.util.List<Integer> getAllowPushRoles() {
            return this.allowPushRoles;
        }

        public ListRepositoryProtectedBranchResponseBodyResult setAllowMergeRoles(java.util.List<Integer> allowMergeRoles) {
            this.allowMergeRoles = allowMergeRoles;
            return this;
        }
        public java.util.List<Integer> getAllowMergeRoles() {
            return this.allowMergeRoles;
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
