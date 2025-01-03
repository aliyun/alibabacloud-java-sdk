// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateRepositoryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>c3c09f1230187a879678da43c973d069</p>
     */
    @NameInMap("accessToken")
    public String accessToken;

    /**
     * <strong>example:</strong>
     * <p>Java</p>
     */
    @NameInMap("adminSettingLanguage")
    public String adminSettingLanguage;

    /**
     * <strong>example:</strong>
     * <p><a href="https://xxxx">https://xxxx</a></p>
     */
    @NameInMap("avatar")
    public String avatar;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("buildsEnabled")
    public Boolean buildsEnabled;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("checkEmail")
    public Boolean checkEmail;

    /**
     * <strong>example:</strong>
     * <p>master</p>
     */
    @NameInMap("defaultBranch")
    public String defaultBranch;

    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>2080398</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("issuesEnabled")
    public Boolean issuesEnabled;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("mergeRequestsEnabled")
    public Boolean mergeRequestsEnabled;

    /**
     * <strong>example:</strong>
     * <p>codeup</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("openCloneDownloadControl")
    public Boolean openCloneDownloadControl;

    @NameInMap("path")
    public String path;

    @NameInMap("projectCloneDownloadMethodList")
    public java.util.List<UpdateRepositoryRequestProjectCloneDownloadMethodList> projectCloneDownloadMethodList;

    @NameInMap("projectCloneDownloadRoleList")
    public java.util.List<UpdateRepositoryRequestProjectCloneDownloadRoleList> projectCloneDownloadRoleList;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("snippetsEnabled")
    public Boolean snippetsEnabled;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("visibilityLevel")
    public Integer visibilityLevel;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("wikiEnabled")
    public Boolean wikiEnabled;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60de7a6852743a5162b5f957</p>
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
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("allowed")
        public Boolean allowed;

        /**
         * <strong>example:</strong>
         * <p>project:download</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("allowed")
        public Boolean allowed;

        /**
         * <strong>example:</strong>
         * <p>15</p>
         */
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
