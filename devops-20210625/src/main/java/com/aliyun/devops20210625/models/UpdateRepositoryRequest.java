// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateRepositoryRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    @NameInMap("adminSettingLanguage")
    public String adminSettingLanguage;

    @NameInMap("avatar")
    public String avatar;

    @NameInMap("buildsEnabled")
    public Boolean buildsEnabled;

    @NameInMap("checkEmail")
    public Boolean checkEmail;

    @NameInMap("defaultBranch")
    public String defaultBranch;

    @NameInMap("description")
    public String description;

    @NameInMap("id")
    public Long id;

    @NameInMap("issuesEnabled")
    public Boolean issuesEnabled;

    @NameInMap("mergeRequestsEnabled")
    public Boolean mergeRequestsEnabled;

    @NameInMap("name")
    public String name;

    @NameInMap("openCloneDownloadControl")
    public Boolean openCloneDownloadControl;

    @NameInMap("path")
    public String path;

    @NameInMap("projectCloneDownloadMethodList")
    public java.util.List<UpdateRepositoryRequestProjectCloneDownloadMethodList> projectCloneDownloadMethodList;

    @NameInMap("projectCloneDownloadRoleList")
    public java.util.List<UpdateRepositoryRequestProjectCloneDownloadRoleList> projectCloneDownloadRoleList;

    @NameInMap("snippetsEnabled")
    public Boolean snippetsEnabled;

    @NameInMap("visibilityLevel")
    public Integer visibilityLevel;

    @NameInMap("wikiEnabled")
    public Boolean wikiEnabled;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    public static UpdateRepositoryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRepositoryRequest self = new UpdateRepositoryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRepositoryRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public UpdateRepositoryRequest setAdminSettingLanguage(String adminSettingLanguage) {
        this.adminSettingLanguage = adminSettingLanguage;
        return this;
    }
    public String getAdminSettingLanguage() {
        return this.adminSettingLanguage;
    }

    public UpdateRepositoryRequest setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
    public String getAvatar() {
        return this.avatar;
    }

    public UpdateRepositoryRequest setBuildsEnabled(Boolean buildsEnabled) {
        this.buildsEnabled = buildsEnabled;
        return this;
    }
    public Boolean getBuildsEnabled() {
        return this.buildsEnabled;
    }

    public UpdateRepositoryRequest setCheckEmail(Boolean checkEmail) {
        this.checkEmail = checkEmail;
        return this;
    }
    public Boolean getCheckEmail() {
        return this.checkEmail;
    }

    public UpdateRepositoryRequest setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
        return this;
    }
    public String getDefaultBranch() {
        return this.defaultBranch;
    }

    public UpdateRepositoryRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateRepositoryRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateRepositoryRequest setIssuesEnabled(Boolean issuesEnabled) {
        this.issuesEnabled = issuesEnabled;
        return this;
    }
    public Boolean getIssuesEnabled() {
        return this.issuesEnabled;
    }

    public UpdateRepositoryRequest setMergeRequestsEnabled(Boolean mergeRequestsEnabled) {
        this.mergeRequestsEnabled = mergeRequestsEnabled;
        return this;
    }
    public Boolean getMergeRequestsEnabled() {
        return this.mergeRequestsEnabled;
    }

    public UpdateRepositoryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateRepositoryRequest setOpenCloneDownloadControl(Boolean openCloneDownloadControl) {
        this.openCloneDownloadControl = openCloneDownloadControl;
        return this;
    }
    public Boolean getOpenCloneDownloadControl() {
        return this.openCloneDownloadControl;
    }

    public UpdateRepositoryRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public UpdateRepositoryRequest setProjectCloneDownloadMethodList(java.util.List<UpdateRepositoryRequestProjectCloneDownloadMethodList> projectCloneDownloadMethodList) {
        this.projectCloneDownloadMethodList = projectCloneDownloadMethodList;
        return this;
    }
    public java.util.List<UpdateRepositoryRequestProjectCloneDownloadMethodList> getProjectCloneDownloadMethodList() {
        return this.projectCloneDownloadMethodList;
    }

    public UpdateRepositoryRequest setProjectCloneDownloadRoleList(java.util.List<UpdateRepositoryRequestProjectCloneDownloadRoleList> projectCloneDownloadRoleList) {
        this.projectCloneDownloadRoleList = projectCloneDownloadRoleList;
        return this;
    }
    public java.util.List<UpdateRepositoryRequestProjectCloneDownloadRoleList> getProjectCloneDownloadRoleList() {
        return this.projectCloneDownloadRoleList;
    }

    public UpdateRepositoryRequest setSnippetsEnabled(Boolean snippetsEnabled) {
        this.snippetsEnabled = snippetsEnabled;
        return this;
    }
    public Boolean getSnippetsEnabled() {
        return this.snippetsEnabled;
    }

    public UpdateRepositoryRequest setVisibilityLevel(Integer visibilityLevel) {
        this.visibilityLevel = visibilityLevel;
        return this;
    }
    public Integer getVisibilityLevel() {
        return this.visibilityLevel;
    }

    public UpdateRepositoryRequest setWikiEnabled(Boolean wikiEnabled) {
        this.wikiEnabled = wikiEnabled;
        return this;
    }
    public Boolean getWikiEnabled() {
        return this.wikiEnabled;
    }

    public UpdateRepositoryRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static class UpdateRepositoryRequestProjectCloneDownloadMethodList extends TeaModel {
        @NameInMap("allowed")
        public Boolean allowed;

        @NameInMap("permissionCode")
        public String permissionCode;

        public static UpdateRepositoryRequestProjectCloneDownloadMethodList build(java.util.Map<String, ?> map) throws Exception {
            UpdateRepositoryRequestProjectCloneDownloadMethodList self = new UpdateRepositoryRequestProjectCloneDownloadMethodList();
            return TeaModel.build(map, self);
        }

        public UpdateRepositoryRequestProjectCloneDownloadMethodList setAllowed(Boolean allowed) {
            this.allowed = allowed;
            return this;
        }
        public Boolean getAllowed() {
            return this.allowed;
        }

        public UpdateRepositoryRequestProjectCloneDownloadMethodList setPermissionCode(String permissionCode) {
            this.permissionCode = permissionCode;
            return this;
        }
        public String getPermissionCode() {
            return this.permissionCode;
        }

    }

    public static class UpdateRepositoryRequestProjectCloneDownloadRoleList extends TeaModel {
        @NameInMap("allowed")
        public Boolean allowed;

        @NameInMap("roleCode")
        public Integer roleCode;

        public static UpdateRepositoryRequestProjectCloneDownloadRoleList build(java.util.Map<String, ?> map) throws Exception {
            UpdateRepositoryRequestProjectCloneDownloadRoleList self = new UpdateRepositoryRequestProjectCloneDownloadRoleList();
            return TeaModel.build(map, self);
        }

        public UpdateRepositoryRequestProjectCloneDownloadRoleList setAllowed(Boolean allowed) {
            this.allowed = allowed;
            return this;
        }
        public Boolean getAllowed() {
            return this.allowed;
        }

        public UpdateRepositoryRequestProjectCloneDownloadRoleList setRoleCode(Integer roleCode) {
            this.roleCode = roleCode;
            return this;
        }
        public Integer getRoleCode() {
            return this.roleCode;
        }

    }

}
