// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRoutineBuildResponseBody extends TeaModel {
    /**
     * <p>The static resource directory.</p>
     * 
     * <strong>example:</strong>
     * <p>/root/user</p>
     */
    @NameInMap("AssetsDirectory")
    public String assetsDirectory;

    /**
     * <p>The build branch.</p>
     * 
     * <strong>example:</strong>
     * <p>dev</p>
     */
    @NameInMap("Branch")
    public String branch;

    /**
     * <p>The build command.</p>
     * 
     * <strong>example:</strong>
     * <p>npm run build</p>
     */
    @NameInMap("BuildCommand")
    public String buildCommand;

    /**
     * <p>The commit ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9bf55641a1a608b9e7297d3fe51e39baa4b68ba0</p>
     */
    @NameInMap("CommitId")
    public String commitId;

    /**
     * <p>The commit message.</p>
     * 
     * <strong>example:</strong>
     * <p>Add configuration file.</p>
     */
    @NameInMap("CommitMessage")
    public String commitMessage;

    /**
     * <p>The creation time. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-02-28T09:03:42Z</p>
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
     * <p>4580717755793600</p>
     */
    @NameInMap("GitAccountId")
    public Long gitAccountId;

    /**
     * <p>The ID of the ER build task.</p>
     * 
     * <strong>example:</strong>
     * <p>164557372123356</p>
     */
    @NameInMap("Id")
    public Long id;

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
     * <p>The Node.js version. Valid values: <code>22.x</code>, <code>20.x</code>, <code>18.x</code>, <code>16.x</code>, <code>14.x</code>, <code>12.x</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>22.x</p>
     */
    @NameInMap("NodeVersion")
    public String nodeVersion;

    /**
     * <p>The pipeline ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4371588</p>
     */
    @NameInMap("PipelineId")
    public Long pipelineId;

    /**
     * <p>The pipeline run ID.</p>
     * 
     * <strong>example:</strong>
     * <p>70</p>
     */
    @NameInMap("PipelineRunId")
    public Long pipelineRunId;

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
     * <p>8C3CC8AF-7C4C-5841-BDAE-B295FD9AE913</p>
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
     * <p>The status of the build task. Valid values:</p>
     * <ul>
     * <li>int: init</li>
     * <li>pending: preparing</li>
     * <li>building: building</li>
     * <li>succeed: build succeeded</li>
     * <li>failed: build failed</li>
     * <li>canceled: canceled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>succeed</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The template name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The modification time. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-07-20T09:59:28+08:00</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    public static GetRoutineBuildResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRoutineBuildResponseBody self = new GetRoutineBuildResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRoutineBuildResponseBody setAssetsDirectory(String assetsDirectory) {
        this.assetsDirectory = assetsDirectory;
        return this;
    }
    public String getAssetsDirectory() {
        return this.assetsDirectory;
    }

    public GetRoutineBuildResponseBody setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public String getBranch() {
        return this.branch;
    }

    public GetRoutineBuildResponseBody setBuildCommand(String buildCommand) {
        this.buildCommand = buildCommand;
        return this;
    }
    public String getBuildCommand() {
        return this.buildCommand;
    }

    public GetRoutineBuildResponseBody setCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }
    public String getCommitId() {
        return this.commitId;
    }

    public GetRoutineBuildResponseBody setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
        return this;
    }
    public String getCommitMessage() {
        return this.commitMessage;
    }

    public GetRoutineBuildResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetRoutineBuildResponseBody setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }
    public java.util.Map<String, String> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    public GetRoutineBuildResponseBody setGitAccountId(Long gitAccountId) {
        this.gitAccountId = gitAccountId;
        return this;
    }
    public Long getGitAccountId() {
        return this.gitAccountId;
    }

    public GetRoutineBuildResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetRoutineBuildResponseBody setInstallCommand(String installCommand) {
        this.installCommand = installCommand;
        return this;
    }
    public String getInstallCommand() {
        return this.installCommand;
    }

    public GetRoutineBuildResponseBody setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
        return this;
    }
    public Boolean getIsPrivate() {
        return this.isPrivate;
    }

    public GetRoutineBuildResponseBody setNodeVersion(String nodeVersion) {
        this.nodeVersion = nodeVersion;
        return this;
    }
    public String getNodeVersion() {
        return this.nodeVersion;
    }

    public GetRoutineBuildResponseBody setPipelineId(Long pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public Long getPipelineId() {
        return this.pipelineId;
    }

    public GetRoutineBuildResponseBody setPipelineRunId(Long pipelineRunId) {
        this.pipelineRunId = pipelineRunId;
        return this;
    }
    public Long getPipelineRunId() {
        return this.pipelineRunId;
    }

    public GetRoutineBuildResponseBody setProductionBranch(String productionBranch) {
        this.productionBranch = productionBranch;
        return this;
    }
    public String getProductionBranch() {
        return this.productionBranch;
    }

    public GetRoutineBuildResponseBody setRepository(String repository) {
        this.repository = repository;
        return this;
    }
    public String getRepository() {
        return this.repository;
    }

    public GetRoutineBuildResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRoutineBuildResponseBody setRootDirectory(String rootDirectory) {
        this.rootDirectory = rootDirectory;
        return this;
    }
    public String getRootDirectory() {
        return this.rootDirectory;
    }

    public GetRoutineBuildResponseBody setRoutineEntry(String routineEntry) {
        this.routineEntry = routineEntry;
        return this;
    }
    public String getRoutineEntry() {
        return this.routineEntry;
    }

    public GetRoutineBuildResponseBody setRoutineName(String routineName) {
        this.routineName = routineName;
        return this;
    }
    public String getRoutineName() {
        return this.routineName;
    }

    public GetRoutineBuildResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetRoutineBuildResponseBody setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public GetRoutineBuildResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
