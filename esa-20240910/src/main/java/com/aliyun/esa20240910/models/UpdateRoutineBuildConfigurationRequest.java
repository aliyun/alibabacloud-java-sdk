// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateRoutineBuildConfigurationRequest extends TeaModel {
    /**
     * <p>The static resource directory.</p>
     * 
     * <strong>example:</strong>
     * <p>/root/user</p>
     */
    @NameInMap("AssetsDirectory")
    public String assetsDirectory;

    /**
     * <p>The branches that trigger a build. Set this to * for all branches. To specify multiple branches, separate branch names with commas.</p>
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
     * <p>The environment variables.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("EnvironmentVariables")
    public java.util.Map<String, String> environmentVariables;

    /**
     * <p>The Git account ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4580717755793600</p>
     */
    @NameInMap("GitAccountId")
    public Long gitAccountId;

    /**
     * <p>The Git platform. Valid values: github, gitee, and upload.</p>
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
     * <p>Specifies whether the repository is private. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The repository is private.</li>
     * <li><code>false</code>: The repository is not private.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsPrivate")
    public Boolean isPrivate;

    /**
     * <p>The Node.js version. Valid values: <code>22.x</code>, <code>20.x</code>, <code>18.x</code>, <code>16.x</code>, <code>14.x</code>, <code>12.x</code>.</p>
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
     * <p>The root directory.</p>
     * 
     * <strong>example:</strong>
     * <p>/root/admin</p>
     */
    @NameInMap("RootDirectory")
    public String rootDirectory;

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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-routine</p>
     */
    @NameInMap("RoutineName")
    public String routineName;

    public static UpdateRoutineBuildConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRoutineBuildConfigurationRequest self = new UpdateRoutineBuildConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRoutineBuildConfigurationRequest setAssetsDirectory(String assetsDirectory) {
        this.assetsDirectory = assetsDirectory;
        return this;
    }
    public String getAssetsDirectory() {
        return this.assetsDirectory;
    }

    public UpdateRoutineBuildConfigurationRequest setBuildBranches(String buildBranches) {
        this.buildBranches = buildBranches;
        return this;
    }
    public String getBuildBranches() {
        return this.buildBranches;
    }

    public UpdateRoutineBuildConfigurationRequest setBuildCommand(String buildCommand) {
        this.buildCommand = buildCommand;
        return this;
    }
    public String getBuildCommand() {
        return this.buildCommand;
    }

    public UpdateRoutineBuildConfigurationRequest setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }
    public java.util.Map<String, String> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    public UpdateRoutineBuildConfigurationRequest setGitAccountId(Long gitAccountId) {
        this.gitAccountId = gitAccountId;
        return this;
    }
    public Long getGitAccountId() {
        return this.gitAccountId;
    }

    public UpdateRoutineBuildConfigurationRequest setGitPlatform(String gitPlatform) {
        this.gitPlatform = gitPlatform;
        return this;
    }
    public String getGitPlatform() {
        return this.gitPlatform;
    }

    public UpdateRoutineBuildConfigurationRequest setInstallCommand(String installCommand) {
        this.installCommand = installCommand;
        return this;
    }
    public String getInstallCommand() {
        return this.installCommand;
    }

    public UpdateRoutineBuildConfigurationRequest setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
        return this;
    }
    public Boolean getIsPrivate() {
        return this.isPrivate;
    }

    public UpdateRoutineBuildConfigurationRequest setNodeVersion(String nodeVersion) {
        this.nodeVersion = nodeVersion;
        return this;
    }
    public String getNodeVersion() {
        return this.nodeVersion;
    }

    public UpdateRoutineBuildConfigurationRequest setProductionBranch(String productionBranch) {
        this.productionBranch = productionBranch;
        return this;
    }
    public String getProductionBranch() {
        return this.productionBranch;
    }

    public UpdateRoutineBuildConfigurationRequest setRepository(String repository) {
        this.repository = repository;
        return this;
    }
    public String getRepository() {
        return this.repository;
    }

    public UpdateRoutineBuildConfigurationRequest setRootDirectory(String rootDirectory) {
        this.rootDirectory = rootDirectory;
        return this;
    }
    public String getRootDirectory() {
        return this.rootDirectory;
    }

    public UpdateRoutineBuildConfigurationRequest setRoutineEntry(String routineEntry) {
        this.routineEntry = routineEntry;
        return this;
    }
    public String getRoutineEntry() {
        return this.routineEntry;
    }

    public UpdateRoutineBuildConfigurationRequest setRoutineName(String routineName) {
        this.routineName = routineName;
        return this;
    }
    public String getRoutineName() {
        return this.routineName;
    }

}
