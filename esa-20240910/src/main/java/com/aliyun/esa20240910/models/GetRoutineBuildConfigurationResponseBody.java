// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRoutineBuildConfigurationResponseBody extends TeaModel {
    /**
     * <p>The static assets directory.</p>
     * 
     * <strong>example:</strong>
     * <p>/root/usr</p>
     */
    @NameInMap("AssetsDirectory")
    public String assetsDirectory;

    /**
     * <p>The branches that trigger builds. A value of * indicates all branches. Multiple specific branches are separated by commas.</p>
     * 
     * <strong>example:</strong>
     * <p>int,abc</p>
     */
    @NameInMap("BuildBranches")
    public String buildBranches;

    /**
     * <p>The build command.</p>
     * 
     * <strong>example:</strong>
     * <p>npm run build</p>
     */
    @NameInMap("BuildCommand")
    public String buildCommand;

    /**
     * <p>The creation time, in ISO 8601 format using UTC time. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-03-11T01:23:21Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The environment variables.</p>
     */
    @NameInMap("EnvironmentVariables")
    public java.util.Map<String, String> environmentVariables;

    /**
     * <p>The Git account ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4695144764942144</p>
     */
    @NameInMap("GitAccountId")
    public Long gitAccountId;

    /**
     * <p>The Git account type. Valid values:</p>
     * <ul>
     * <li>User: individual account.</li>
     * <li>Organization: organization account.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>User</p>
     */
    @NameInMap("GitAccountType")
    public String gitAccountType;

    /**
     * <p>The Git platform.</p>
     * 
     * <strong>example:</strong>
     * <p>github</p>
     */
    @NameInMap("GitPlatform")
    public String gitPlatform;

    /**
     * <p>The install command.</p>
     * 
     * <strong>example:</strong>
     * <p>npm install</p>
     */
    @NameInMap("InstallCommand")
    public String installCommand;

    /**
     * <p>Indicates whether the repository is private. Valid values:</p>
     * <ul>
     * <li>true: The repository is private.</li>
     * <li>false: The repository is not private.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsPrivate")
    public Boolean isPrivate;

    /**
     * <p>The Node.js version.</p>
     * 
     * <strong>example:</strong>
     * <p>22.x</p>
     */
    @NameInMap("NodeVersion")
    public String nodeVersion;

    /**
     * <p>The production branch name.</p>
     * 
     * <strong>example:</strong>
     * <p>main</p>
     */
    @NameInMap("ProductionBranch")
    public String productionBranch;

    /**
     * <p>The repository name.</p>
     * 
     * <strong>example:</strong>
     * <p>example-test</p>
     */
    @NameInMap("Repository")
    public String repository;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D1D7BBB5-9B5B-5A29-8848-398F3CA18A8A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The root directory.</p>
     * 
     * <strong>example:</strong>
     * <p>/root/admin</p>
     */
    @NameInMap("RootDirectory")
    public String rootDirectory;

    /**
     * <p>The ER build configuration ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3472165674357056</p>
     */
    @NameInMap("RoutineBuildConfigurationId")
    public Long routineBuildConfigurationId;

    /**
     * <p>The ER entry file path.</p>
     * 
     * <strong>example:</strong>
     * <p>/home</p>
     */
    @NameInMap("RoutineEntry")
    public String routineEntry;

    /**
     * <p>The ER name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-routine</p>
     */
    @NameInMap("RoutineName")
    public String routineName;

    /**
     * <p>The modification time, in ISO 8601 format using UTC time. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-04-19T11:15:20Z</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    public static GetRoutineBuildConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRoutineBuildConfigurationResponseBody self = new GetRoutineBuildConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRoutineBuildConfigurationResponseBody setAssetsDirectory(String assetsDirectory) {
        this.assetsDirectory = assetsDirectory;
        return this;
    }
    public String getAssetsDirectory() {
        return this.assetsDirectory;
    }

    public GetRoutineBuildConfigurationResponseBody setBuildBranches(String buildBranches) {
        this.buildBranches = buildBranches;
        return this;
    }
    public String getBuildBranches() {
        return this.buildBranches;
    }

    public GetRoutineBuildConfigurationResponseBody setBuildCommand(String buildCommand) {
        this.buildCommand = buildCommand;
        return this;
    }
    public String getBuildCommand() {
        return this.buildCommand;
    }

    public GetRoutineBuildConfigurationResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetRoutineBuildConfigurationResponseBody setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }
    public java.util.Map<String, String> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    public GetRoutineBuildConfigurationResponseBody setGitAccountId(Long gitAccountId) {
        this.gitAccountId = gitAccountId;
        return this;
    }
    public Long getGitAccountId() {
        return this.gitAccountId;
    }

    public GetRoutineBuildConfigurationResponseBody setGitAccountType(String gitAccountType) {
        this.gitAccountType = gitAccountType;
        return this;
    }
    public String getGitAccountType() {
        return this.gitAccountType;
    }

    public GetRoutineBuildConfigurationResponseBody setGitPlatform(String gitPlatform) {
        this.gitPlatform = gitPlatform;
        return this;
    }
    public String getGitPlatform() {
        return this.gitPlatform;
    }

    public GetRoutineBuildConfigurationResponseBody setInstallCommand(String installCommand) {
        this.installCommand = installCommand;
        return this;
    }
    public String getInstallCommand() {
        return this.installCommand;
    }

    public GetRoutineBuildConfigurationResponseBody setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
        return this;
    }
    public Boolean getIsPrivate() {
        return this.isPrivate;
    }

    public GetRoutineBuildConfigurationResponseBody setNodeVersion(String nodeVersion) {
        this.nodeVersion = nodeVersion;
        return this;
    }
    public String getNodeVersion() {
        return this.nodeVersion;
    }

    public GetRoutineBuildConfigurationResponseBody setProductionBranch(String productionBranch) {
        this.productionBranch = productionBranch;
        return this;
    }
    public String getProductionBranch() {
        return this.productionBranch;
    }

    public GetRoutineBuildConfigurationResponseBody setRepository(String repository) {
        this.repository = repository;
        return this;
    }
    public String getRepository() {
        return this.repository;
    }

    public GetRoutineBuildConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRoutineBuildConfigurationResponseBody setRootDirectory(String rootDirectory) {
        this.rootDirectory = rootDirectory;
        return this;
    }
    public String getRootDirectory() {
        return this.rootDirectory;
    }

    public GetRoutineBuildConfigurationResponseBody setRoutineBuildConfigurationId(Long routineBuildConfigurationId) {
        this.routineBuildConfigurationId = routineBuildConfigurationId;
        return this;
    }
    public Long getRoutineBuildConfigurationId() {
        return this.routineBuildConfigurationId;
    }

    public GetRoutineBuildConfigurationResponseBody setRoutineEntry(String routineEntry) {
        this.routineEntry = routineEntry;
        return this;
    }
    public String getRoutineEntry() {
        return this.routineEntry;
    }

    public GetRoutineBuildConfigurationResponseBody setRoutineName(String routineName) {
        this.routineName = routineName;
        return this;
    }
    public String getRoutineName() {
        return this.routineName;
    }

    public GetRoutineBuildConfigurationResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
