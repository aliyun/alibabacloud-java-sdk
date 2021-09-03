// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class GetOrganizationRepositorySettingResponseBody extends TeaModel {
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
    public GetOrganizationRepositorySettingResponseBodyResult result;

    public static GetOrganizationRepositorySettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOrganizationRepositorySettingResponseBody self = new GetOrganizationRepositorySettingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOrganizationRepositorySettingResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetOrganizationRepositorySettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOrganizationRepositorySettingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOrganizationRepositorySettingResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetOrganizationRepositorySettingResponseBody setResult(GetOrganizationRepositorySettingResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetOrganizationRepositorySettingResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetOrganizationRepositorySettingResponseBodyResultOrgCloneDownloadMethodList extends TeaModel {
        // 权限码。ssh-clone：SSH克隆；http-clone：HTTP克隆；download：下载ZIP/TAR
        @NameInMap("PermissionCode")
        public String permissionCode;

        // 是否允许
        @NameInMap("Allowed")
        public Boolean allowed;

        public static GetOrganizationRepositorySettingResponseBodyResultOrgCloneDownloadMethodList build(java.util.Map<String, ?> map) throws Exception {
            GetOrganizationRepositorySettingResponseBodyResultOrgCloneDownloadMethodList self = new GetOrganizationRepositorySettingResponseBodyResultOrgCloneDownloadMethodList();
            return TeaModel.build(map, self);
        }

        public GetOrganizationRepositorySettingResponseBodyResultOrgCloneDownloadMethodList setPermissionCode(String permissionCode) {
            this.permissionCode = permissionCode;
            return this;
        }
        public String getPermissionCode() {
            return this.permissionCode;
        }

        public GetOrganizationRepositorySettingResponseBodyResultOrgCloneDownloadMethodList setAllowed(Boolean allowed) {
            this.allowed = allowed;
            return this;
        }
        public Boolean getAllowed() {
            return this.allowed;
        }

    }

    public static class GetOrganizationRepositorySettingResponseBodyResultOrgCloneDownloadRoleList extends TeaModel {
        // 角色Code。5：企业外部成员；9999：企业成员（含管理员）
        @NameInMap("RoleCode")
        public Long roleCode;

        // 是否允许
        @NameInMap("Allowed")
        public Boolean allowed;

        public static GetOrganizationRepositorySettingResponseBodyResultOrgCloneDownloadRoleList build(java.util.Map<String, ?> map) throws Exception {
            GetOrganizationRepositorySettingResponseBodyResultOrgCloneDownloadRoleList self = new GetOrganizationRepositorySettingResponseBodyResultOrgCloneDownloadRoleList();
            return TeaModel.build(map, self);
        }

        public GetOrganizationRepositorySettingResponseBodyResultOrgCloneDownloadRoleList setRoleCode(Long roleCode) {
            this.roleCode = roleCode;
            return this;
        }
        public Long getRoleCode() {
            return this.roleCode;
        }

        public GetOrganizationRepositorySettingResponseBodyResultOrgCloneDownloadRoleList setAllowed(Boolean allowed) {
            this.allowed = allowed;
            return this;
        }
        public Boolean getAllowed() {
            return this.allowed;
        }

    }

    public static class GetOrganizationRepositorySettingResponseBodyResult extends TeaModel {
        // 创建库是否必选代码组
        @NameInMap("GroupRequired")
        public Boolean groupRequired;

        // 创建代码库允许使用的可见性选项。0：允许私有；10：允许企业可见
        @NameInMap("RepoVisibilityLevel")
        public java.util.List<Long> repoVisibilityLevel;

        // 允许创建代码库的角色。5：企业外部成员；15：企业成员；60：企业管理员
        @NameInMap("RepoCreatorIdentity")
        public java.util.List<Long> repoCreatorIdentity;

        // 库公开性调整设置。0：允许库管理员调整公开性为私有；10：允许库管理员调整公开性为企业可见
        @NameInMap("RepoAdminAccessVisibilityLevel")
        public java.util.List<Long> repoAdminAccessVisibilityLevel;

        // 库管理员允许操作。1：允许库管理员删除代码库；2：未使用保留操作
        @NameInMap("RepoAdminOperation")
        public java.util.List<Long> repoAdminOperation;

        // 开启克隆下载限制
        @NameInMap("OpenCloneDownloadControl")
        public Boolean openCloneDownloadControl;

        // 克隆下载限制方法列表
        @NameInMap("OrgCloneDownloadMethodList")
        public java.util.List<GetOrganizationRepositorySettingResponseBodyResultOrgCloneDownloadMethodList> orgCloneDownloadMethodList;

        // 克隆下载限制角色列表
        @NameInMap("OrgCloneDownloadRoleList")
        public java.util.List<GetOrganizationRepositorySettingResponseBodyResultOrgCloneDownloadRoleList> orgCloneDownloadRoleList;

        // 禁止强制推送（Force Push）
        @NameInMap("ForcePushForbidden")
        public Boolean forcePushForbidden;

        public static GetOrganizationRepositorySettingResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetOrganizationRepositorySettingResponseBodyResult self = new GetOrganizationRepositorySettingResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetOrganizationRepositorySettingResponseBodyResult setGroupRequired(Boolean groupRequired) {
            this.groupRequired = groupRequired;
            return this;
        }
        public Boolean getGroupRequired() {
            return this.groupRequired;
        }

        public GetOrganizationRepositorySettingResponseBodyResult setRepoVisibilityLevel(java.util.List<Long> repoVisibilityLevel) {
            this.repoVisibilityLevel = repoVisibilityLevel;
            return this;
        }
        public java.util.List<Long> getRepoVisibilityLevel() {
            return this.repoVisibilityLevel;
        }

        public GetOrganizationRepositorySettingResponseBodyResult setRepoCreatorIdentity(java.util.List<Long> repoCreatorIdentity) {
            this.repoCreatorIdentity = repoCreatorIdentity;
            return this;
        }
        public java.util.List<Long> getRepoCreatorIdentity() {
            return this.repoCreatorIdentity;
        }

        public GetOrganizationRepositorySettingResponseBodyResult setRepoAdminAccessVisibilityLevel(java.util.List<Long> repoAdminAccessVisibilityLevel) {
            this.repoAdminAccessVisibilityLevel = repoAdminAccessVisibilityLevel;
            return this;
        }
        public java.util.List<Long> getRepoAdminAccessVisibilityLevel() {
            return this.repoAdminAccessVisibilityLevel;
        }

        public GetOrganizationRepositorySettingResponseBodyResult setRepoAdminOperation(java.util.List<Long> repoAdminOperation) {
            this.repoAdminOperation = repoAdminOperation;
            return this;
        }
        public java.util.List<Long> getRepoAdminOperation() {
            return this.repoAdminOperation;
        }

        public GetOrganizationRepositorySettingResponseBodyResult setOpenCloneDownloadControl(Boolean openCloneDownloadControl) {
            this.openCloneDownloadControl = openCloneDownloadControl;
            return this;
        }
        public Boolean getOpenCloneDownloadControl() {
            return this.openCloneDownloadControl;
        }

        public GetOrganizationRepositorySettingResponseBodyResult setOrgCloneDownloadMethodList(java.util.List<GetOrganizationRepositorySettingResponseBodyResultOrgCloneDownloadMethodList> orgCloneDownloadMethodList) {
            this.orgCloneDownloadMethodList = orgCloneDownloadMethodList;
            return this;
        }
        public java.util.List<GetOrganizationRepositorySettingResponseBodyResultOrgCloneDownloadMethodList> getOrgCloneDownloadMethodList() {
            return this.orgCloneDownloadMethodList;
        }

        public GetOrganizationRepositorySettingResponseBodyResult setOrgCloneDownloadRoleList(java.util.List<GetOrganizationRepositorySettingResponseBodyResultOrgCloneDownloadRoleList> orgCloneDownloadRoleList) {
            this.orgCloneDownloadRoleList = orgCloneDownloadRoleList;
            return this;
        }
        public java.util.List<GetOrganizationRepositorySettingResponseBodyResultOrgCloneDownloadRoleList> getOrgCloneDownloadRoleList() {
            return this.orgCloneDownloadRoleList;
        }

        public GetOrganizationRepositorySettingResponseBodyResult setForcePushForbidden(Boolean forcePushForbidden) {
            this.forcePushForbidden = forcePushForbidden;
            return this;
        }
        public Boolean getForcePushForbidden() {
            return this.forcePushForbidden;
        }

    }

}
