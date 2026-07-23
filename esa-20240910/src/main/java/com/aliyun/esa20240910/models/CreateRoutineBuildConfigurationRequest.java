// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateRoutineBuildConfigurationRequest extends TeaModel {
    /**
     * <p>The static resource directory.</p>
     * 
     * <strong>example:</strong>
     * <p>/root/user</p>
     */
    @NameInMap("AssetsDirectory")
    public String assetsDirectory;

    /**
     * <p>The branches that trigger a build. Set this parameter to * for all branches. To specify multiple branches, separate branch names with commas.</p>
     * 
     * <strong>example:</strong>
     * <p>feature/test,hotfix/test</p>
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
     */
    @NameInMap("EnvironmentVariables")
    public java.util.Map<String, String> environmentVariables;

    /**
     * <p>The Git account ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3472021274759488</p>
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
     * <p>The Node.js version. Valid values: <code>22.x</code>, <code>20.x</code>, <code>18.x</code>, <code>16.x</code>, <code>14.x</code>, <code>12.x</code>.</p>
     * <p>This parameter is required.</p>
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
     * <p>webdeck</p>
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
     * <p>rwa-test</p>
     */
    @NameInMap("RoutineName")
    public String routineName;

    /**
     * <p>The build template name.</p>
     * 
     * <strong>example:</strong>
     * <p>react-router</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    public static CreateRoutineBuildConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRoutineBuildConfigurationRequest self = new CreateRoutineBuildConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public CreateRoutineBuildConfigurationRequest setAssetsDirectory(String assetsDirectory) {
        this.assetsDirectory = assetsDirectory;
        return this;
    }
    public String getAssetsDirectory() {
        return this.assetsDirectory;
    }

    public CreateRoutineBuildConfigurationRequest setBuildBranches(String buildBranches) {
        this.buildBranches = buildBranches;
        return this;
    }
    public String getBuildBranches() {
        return this.buildBranches;
    }

    public CreateRoutineBuildConfigurationRequest setBuildCommand(String buildCommand) {
        this.buildCommand = buildCommand;
        return this;
    }
    public String getBuildCommand() {
        return this.buildCommand;
    }

    public CreateRoutineBuildConfigurationRequest setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }
    public java.util.Map<String, String> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    public CreateRoutineBuildConfigurationRequest setGitAccountId(Long gitAccountId) {
        this.gitAccountId = gitAccountId;
        return this;
    }
    public Long getGitAccountId() {
        return this.gitAccountId;
    }

    public CreateRoutineBuildConfigurationRequest setGitPlatform(String gitPlatform) {
        this.gitPlatform = gitPlatform;
        return this;
    }
    public String getGitPlatform() {
        return this.gitPlatform;
    }

    public CreateRoutineBuildConfigurationRequest setInstallCommand(String installCommand) {
        this.installCommand = installCommand;
        return this;
    }
    public String getInstallCommand() {
        return this.installCommand;
    }

    public CreateRoutineBuildConfigurationRequest setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
        return this;
    }
    public Boolean getIsPrivate() {
        return this.isPrivate;
    }

    public CreateRoutineBuildConfigurationRequest setNodeVersion(String nodeVersion) {
        this.nodeVersion = nodeVersion;
        return this;
    }
    public String getNodeVersion() {
        return this.nodeVersion;
    }

    public CreateRoutineBuildConfigurationRequest setProductionBranch(String productionBranch) {
        this.productionBranch = productionBranch;
        return this;
    }
    public String getProductionBranch() {
        return this.productionBranch;
    }

    public CreateRoutineBuildConfigurationRequest setRepository(String repository) {
        this.repository = repository;
        return this;
    }
    public String getRepository() {
        return this.repository;
    }

    public CreateRoutineBuildConfigurationRequest setRootDirectory(String rootDirectory) {
        this.rootDirectory = rootDirectory;
        return this;
    }
    public String getRootDirectory() {
        return this.rootDirectory;
    }

    public CreateRoutineBuildConfigurationRequest setRoutineEntry(String routineEntry) {
        this.routineEntry = routineEntry;
        return this;
    }
    public String getRoutineEntry() {
        return this.routineEntry;
    }

    public CreateRoutineBuildConfigurationRequest setRoutineName(String routineName) {
        this.routineName = routineName;
        return this;
    }
    public String getRoutineName() {
        return this.routineName;
    }

    public CreateRoutineBuildConfigurationRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
