// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateRepositoryRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    // 代码库头像地址
    @NameInMap("avatarUrl")
    public String avatarUrl;

    // 代码库描述
    @NameInMap("description")
    public String description;

    // gitignore模板类型
    @NameInMap("gitignoreType")
    public String gitignoreType;

    // 导入时使用的账号
    @NameInMap("importAccount")
    public String importAccount;

    // 使用使用demo库内容进行初始化
    @NameInMap("importDemoProject")
    public Boolean importDemoProject;

    // 导入代码库类型 (GIT: Git库, SVN: SVN库)
    @NameInMap("importRepoType")
    public String importRepoType;

    // 导入时账号的token
    @NameInMap("importToken")
    public String importToken;

    // import_token字段的传输格式，使用明文或rsa加密
    @NameInMap("importTokenEncrypted")
    public String importTokenEncrypted;

    // 导入地址（http协议地址）
    @NameInMap("importUrl")
    public String importUrl;

    // 初始化标准智能化服务
    @NameInMap("initStandardService")
    public Boolean initStandardService;

    // 是否启用加密
    @NameInMap("isCryptoEnabled")
    public Boolean isCryptoEnabled;

    // 本地导入代码库的远程地址
    @NameInMap("localImportUrl")
    public String localImportUrl;

    // 代码库名称
    @NameInMap("name")
    public String name;

    // 代码库父路径id
    @NameInMap("namespaceId")
    public Long namespaceId;

    // 代码库路径
    @NameInMap("path")
    public String path;

    // 自动创建readme类型 (EMPTY: 仅创建README.md, USER_GUIDE: 包含新手引导)
    @NameInMap("readmeType")
    public String readmeType;

    @NameInMap("visibilityLevel")
    public Integer visibilityLevel;

    @NameInMap("createParentPath")
    public Boolean createParentPath;

    @NameInMap("organizationId")
    public String organizationId;

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
