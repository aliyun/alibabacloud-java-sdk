// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateRepositoryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>f0b1e61db5961df5975a93f9129d2513</p>
     */
    @NameInMap("accessToken")
    public String accessToken;

    /**
     * <strong>example:</strong>
     * <p><a href="https://tcs-devops.aliyuncs.com/thumbnail/112afcb7a6a35c3f67f1bea827c4/w/100/h/100">https://tcs-devops.aliyuncs.com/thumbnail/112afcb7a6a35c3f67f1bea827c4/w/100/h/100</a></p>
     */
    @NameInMap("avatarUrl")
    public String avatarUrl;

    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>Java</p>
     */
    @NameInMap("gitignoreType")
    public String gitignoreType;

    /**
     * <strong>example:</strong>
     * <p>codeup-test</p>
     */
    @NameInMap("importAccount")
    public String importAccount;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("importDemoProject")
    public Boolean importDemoProject;

    /**
     * <strong>example:</strong>
     * <p>GIT</p>
     */
    @NameInMap("importRepoType")
    public String importRepoType;

    /**
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("importToken")
    public String importToken;

    /**
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("importTokenEncrypted")
    public String importTokenEncrypted;

    /**
     * <strong>example:</strong>
     * <p><a href="https://github.com/a/b.git">https://github.com/a/b.git</a></p>
     */
    @NameInMap("importUrl")
    public String importUrl;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("initStandardService")
    public Boolean initStandardService;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("isCryptoEnabled")
    public Boolean isCryptoEnabled;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("localImportUrl")
    public String localImportUrl;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("namespaceId")
    public Long namespaceId;

    @NameInMap("path")
    public String path;

    /**
     * <strong>example:</strong>
     * <p>USER_GUIDE</p>
     */
    @NameInMap("readmeType")
    public String readmeType;

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
    @NameInMap("createParentPath")
    public Boolean createParentPath;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60de7a6852743a5162b5f957</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("sync")
    public Boolean sync;

    public static CreateRepositoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRepositoryRequest self = new CreateRepositoryRequest();
        return TeaModel.build(map, self);
    }

    public CreateRepositoryRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public CreateRepositoryRequest setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public CreateRepositoryRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRepositoryRequest setGitignoreType(String gitignoreType) {
        this.gitignoreType = gitignoreType;
        return this;
    }
    public String getGitignoreType() {
        return this.gitignoreType;
    }

    public CreateRepositoryRequest setImportAccount(String importAccount) {
        this.importAccount = importAccount;
        return this;
    }
    public String getImportAccount() {
        return this.importAccount;
    }

    public CreateRepositoryRequest setImportDemoProject(Boolean importDemoProject) {
        this.importDemoProject = importDemoProject;
        return this;
    }
    public Boolean getImportDemoProject() {
        return this.importDemoProject;
    }

    public CreateRepositoryRequest setImportRepoType(String importRepoType) {
        this.importRepoType = importRepoType;
        return this;
    }
    public String getImportRepoType() {
        return this.importRepoType;
    }

    public CreateRepositoryRequest setImportToken(String importToken) {
        this.importToken = importToken;
        return this;
    }
    public String getImportToken() {
        return this.importToken;
    }

    public CreateRepositoryRequest setImportTokenEncrypted(String importTokenEncrypted) {
        this.importTokenEncrypted = importTokenEncrypted;
        return this;
    }
    public String getImportTokenEncrypted() {
        return this.importTokenEncrypted;
    }

    public CreateRepositoryRequest setImportUrl(String importUrl) {
        this.importUrl = importUrl;
        return this;
    }
    public String getImportUrl() {
        return this.importUrl;
    }

    public CreateRepositoryRequest setInitStandardService(Boolean initStandardService) {
        this.initStandardService = initStandardService;
        return this;
    }
    public Boolean getInitStandardService() {
        return this.initStandardService;
    }

    public CreateRepositoryRequest setIsCryptoEnabled(Boolean isCryptoEnabled) {
        this.isCryptoEnabled = isCryptoEnabled;
        return this;
    }
    public Boolean getIsCryptoEnabled() {
        return this.isCryptoEnabled;
    }

    public CreateRepositoryRequest setLocalImportUrl(String localImportUrl) {
        this.localImportUrl = localImportUrl;
        return this;
    }
    public String getLocalImportUrl() {
        return this.localImportUrl;
    }

    public CreateRepositoryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateRepositoryRequest setNamespaceId(Long namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public Long getNamespaceId() {
        return this.namespaceId;
    }

    public CreateRepositoryRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public CreateRepositoryRequest setReadmeType(String readmeType) {
        this.readmeType = readmeType;
        return this;
    }
    public String getReadmeType() {
        return this.readmeType;
    }

    public CreateRepositoryRequest setVisibilityLevel(Integer visibilityLevel) {
        this.visibilityLevel = visibilityLevel;
        return this;
    }
    public Integer getVisibilityLevel() {
        return this.visibilityLevel;
    }

    public CreateRepositoryRequest setCreateParentPath(Boolean createParentPath) {
        this.createParentPath = createParentPath;
        return this;
    }
    public Boolean getCreateParentPath() {
        return this.createParentPath;
    }

    public CreateRepositoryRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public CreateRepositoryRequest setSync(Boolean sync) {
        this.sync = sync;
        return this;
    }
    public Boolean getSync() {
        return this.sync;
    }

}
