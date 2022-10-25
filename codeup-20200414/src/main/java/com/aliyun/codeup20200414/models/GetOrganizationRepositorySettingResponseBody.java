// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class GetOrganizationRepositorySettingResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetOrganizationRepositorySettingResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static GetOrganizationRepositorySettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOrganizationRepositorySettingResponseBody self = new GetOrganizationRepositorySettingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOrganizationRepositorySettingResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
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

    public GetOrganizationRepositorySettingResponseBody setResult(GetOrganizationRepositorySettingResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetOrganizationRepositorySettingResponseBodyResult getResult() {
        return this.result;
    }

    public GetOrganizationRepositorySettingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOrganizationRepositorySettingResponseBodyResultOrgCloneDownloadMethodList extends TeaModel {
        @NameInMap("Allowed")
        public Boolean allowed;

        @NameInMap("PermissionCode")
        public String permissionCode;

        public static GetOrganizationRepositorySettingResponseBodyResultOrgCloneDownloadMethodList build(java.util.Map<String, ?> map) throws Exception {
            GetOrganizationRepositorySettingResponseBodyResultOrgCloneDownloadMethodList self = new GetOrganizationRepositorySettingResponseBodyResultOrgCloneDownloadMethodList();
            return TeaModel.build(map, self);
        }

        public GetOrganizationRepositorySettingResponseBodyResultOrgCloneDownloadMethodList setAllowed(Boolean allowed) {
            this.allowed = allowed;
            return this;
        }
        public Boolean getAllowed() {
            return this.allowed;
        }

        public GetOrganizationRepositorySettingResponseBodyResultOrgCloneDownloadMethodList setPermissionCode(String permissionCode) {
            this.permissionCode = permissionCode;
            return this;
        }
        public String getPermissionCode() {
            return this.permissionCode;
        }

    }

    public static class GetOrganizationRepositorySettingResponseBodyResultOrgCloneDownloadRoleList extends TeaModel {
        @NameInMap("Allowed")
        public Boolean allowed;

        @NameInMap("RoleCode")
        public Long roleCode;

        public static GetOrganizationRepositorySettingResponseBodyResultOrgCloneDownloadRoleList build(java.util.Map<String, ?> map) throws Exception {
            GetOrganizationRepositorySettingResponseBodyResultOrgCloneDownloadRoleList self = new GetOrganizationRepositorySettingResponseBodyResultOrgCloneDownloadRoleList();
            return TeaModel.build(map, self);
        }

        public GetOrganizationRepositorySettingResponseBodyResultOrgCloneDownloadRoleList setAllowed(Boolean allowed) {
            this.allowed = allowed;
            return this;
        }
        public Boolean getAllowed() {
            return this.allowed;
        }

        public GetOrganizationRepositorySettingResponseBodyResultOrgCloneDownloadRoleList setRoleCode(Long roleCode) {
            this.roleCode = roleCode;
            return this;
        }
        public Long getRoleCode() {
            return this.roleCode;
        }

    }

    public static class GetOrganizationRepositorySettingResponseBodyResult extends TeaModel {
        @NameInMap("ForcePushForbidden")
        public Boolean forcePushForbidden;

        @NameInMap("GroupRequired")
        public Boolean groupRequired;

        @NameInMap("OpenCloneDownloadControl")
        public Boolean openCloneDownloadControl;

        @NameInMap("OrgCloneDownloadMethodList")
        public java.util.List<GetOrganizationRepositorySettingResponseBodyResultOrgCloneDownloadMethodList> orgCloneDownloadMethodList;

        @NameInMap("OrgCloneDownloadRoleList")
        public java.util.List<GetOrganizationRepositorySettingResponseBodyResultOrgCloneDownloadRoleList> orgCloneDownloadRoleList;

        @NameInMap("RepoAdminAccessVisibilityLevel")
        public java.util.List<Long> repoAdminAccessVisibilityLevel;

        @NameInMap("RepoAdminOperation")
        public java.util.List<Long> repoAdminOperation;

        @NameInMap("RepoCreatorIdentity")
        public java.util.List<Long> repoCreatorIdentity;

        @NameInMap("RepoVisibilityLevel")
        public java.util.List<Long> repoVisibilityLevel;

        public static GetOrganizationRepositorySettingResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetOrganizationRepositorySettingResponseBodyResult self = new GetOrganizationRepositorySettingResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetOrganizationRepositorySettingResponseBodyResult setForcePushForbidden(Boolean forcePushForbidden) {
            this.forcePushForbidden = forcePushForbidden;
            return this;
        }
        public Boolean getForcePushForbidden() {
            return this.forcePushForbidden;
        }

        public GetOrganizationRepositorySettingResponseBodyResult setGroupRequired(Boolean groupRequired) {
            this.groupRequired = groupRequired;
            return this;
        }
        public Boolean getGroupRequired() {
            return this.groupRequired;
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

        public GetOrganizationRepositorySettingResponseBodyResult setRepoCreatorIdentity(java.util.List<Long> repoCreatorIdentity) {
            this.repoCreatorIdentity = repoCreatorIdentity;
            return this;
        }
        public java.util.List<Long> getRepoCreatorIdentity() {
            return this.repoCreatorIdentity;
        }

        public GetOrganizationRepositorySettingResponseBodyResult setRepoVisibilityLevel(java.util.List<Long> repoVisibilityLevel) {
            this.repoVisibilityLevel = repoVisibilityLevel;
            return this;
        }
        public java.util.List<Long> getRepoVisibilityLevel() {
            return this.repoVisibilityLevel;
        }

    }

}
