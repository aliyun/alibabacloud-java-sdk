// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListRoutineBuildsResponseBody extends TeaModel {
    /**
     * <p>The list of ER build tasks.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListRoutineBuildsResponseBodyData> data;

    /**
     * <p>The page number, same as the PageIndex request parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageIndex")
    public Long pageIndex;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ET5BF670-09D5-4D0B-BEBY-D96A2A528000</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalPage")
    public Long totalPage;

    public static ListRoutineBuildsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRoutineBuildsResponseBody self = new ListRoutineBuildsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRoutineBuildsResponseBody setData(java.util.List<ListRoutineBuildsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListRoutineBuildsResponseBodyData> getData() {
        return this.data;
    }

    public ListRoutineBuildsResponseBody setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public ListRoutineBuildsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListRoutineBuildsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRoutineBuildsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListRoutineBuildsResponseBody setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public static class ListRoutineBuildsResponseBodyData extends TeaModel {
        /**
         * <p>The static assets directory.</p>
         * 
         * <strong>example:</strong>
         * <p>/root/usr</p>
         */
        @NameInMap("AssetsDirectory")
        public String assetsDirectory;

        /**
         * <p>The branch used for the build.</p>
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
         * <p>The ID of the commit.</p>
         * 
         * <strong>example:</strong>
         * <p>c08057f590f8d5be56fcae1e082128254a708f94</p>
         */
        @NameInMap("CommitId")
        public String commitId;

        /**
         * <p>The commit message.</p>
         * 
         * <strong>example:</strong>
         * <p>Add static files.</p>
         */
        @NameInMap("CommitMessage")
        public String commitMessage;

        /**
         * <p>The creation time, in ISO 8601 format using UTC time. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-26T02:19:34Z</p>
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
         * <p>162124764031208</p>
         */
        @NameInMap("GitAccountId")
        public Long gitAccountId;

        /**
         * <p>The Git account name.</p>
         * 
         * <strong>example:</strong>
         * <p>rwa</p>
         */
        @NameInMap("GitAccountName")
        public String gitAccountName;

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
         * <p>The Node.js version. Valid values: <code>22.x</code>, <code>20.x</code>, <code>18.x</code>, <code>16.x</code>, <code>14.x</code>, and <code>12.x</code>.</p>
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
         * <p>3850166</p>
         */
        @NameInMap("PipelineId")
        public Long pipelineId;

        /**
         * <p>The pipeline execution ID.</p>
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
         * <p>rwa-test</p>
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
         * <p>The ER build task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4133325046294912</p>
         */
        @NameInMap("RoutineBuildId")
        public Long routineBuildId;

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
         * <li>int: initialization</li>
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
         * <p>The modification time, in ISO 8601 format using UTC time. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-20T00:44:23Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1427812834792318</p>
         */
        @NameInMap("UserId")
        public Long userId;

        public static ListRoutineBuildsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListRoutineBuildsResponseBodyData self = new ListRoutineBuildsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListRoutineBuildsResponseBodyData setAssetsDirectory(String assetsDirectory) {
            this.assetsDirectory = assetsDirectory;
            return this;
        }
        public String getAssetsDirectory() {
            return this.assetsDirectory;
        }

        public ListRoutineBuildsResponseBodyData setBranch(String branch) {
            this.branch = branch;
            return this;
        }
        public String getBranch() {
            return this.branch;
        }

        public ListRoutineBuildsResponseBodyData setBuildCommand(String buildCommand) {
            this.buildCommand = buildCommand;
            return this;
        }
        public String getBuildCommand() {
            return this.buildCommand;
        }

        public ListRoutineBuildsResponseBodyData setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public ListRoutineBuildsResponseBodyData setCommitMessage(String commitMessage) {
            this.commitMessage = commitMessage;
            return this;
        }
        public String getCommitMessage() {
            return this.commitMessage;
        }

        public ListRoutineBuildsResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListRoutineBuildsResponseBodyData setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }
        public java.util.Map<String, String> getEnvironmentVariables() {
            return this.environmentVariables;
        }

        public ListRoutineBuildsResponseBodyData setGitAccountId(Long gitAccountId) {
            this.gitAccountId = gitAccountId;
            return this;
        }
        public Long getGitAccountId() {
            return this.gitAccountId;
        }

        public ListRoutineBuildsResponseBodyData setGitAccountName(String gitAccountName) {
            this.gitAccountName = gitAccountName;
            return this;
        }
        public String getGitAccountName() {
            return this.gitAccountName;
        }

        public ListRoutineBuildsResponseBodyData setInstallCommand(String installCommand) {
            this.installCommand = installCommand;
            return this;
        }
        public String getInstallCommand() {
            return this.installCommand;
        }

        public ListRoutineBuildsResponseBodyData setIsPrivate(Boolean isPrivate) {
            this.isPrivate = isPrivate;
            return this;
        }
        public Boolean getIsPrivate() {
            return this.isPrivate;
        }

        public ListRoutineBuildsResponseBodyData setNodeVersion(String nodeVersion) {
            this.nodeVersion = nodeVersion;
            return this;
        }
        public String getNodeVersion() {
            return this.nodeVersion;
        }

        public ListRoutineBuildsResponseBodyData setPipelineId(Long pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public Long getPipelineId() {
            return this.pipelineId;
        }

        public ListRoutineBuildsResponseBodyData setPipelineRunId(Long pipelineRunId) {
            this.pipelineRunId = pipelineRunId;
            return this;
        }
        public Long getPipelineRunId() {
            return this.pipelineRunId;
        }

        public ListRoutineBuildsResponseBodyData setProductionBranch(String productionBranch) {
            this.productionBranch = productionBranch;
            return this;
        }
        public String getProductionBranch() {
            return this.productionBranch;
        }

        public ListRoutineBuildsResponseBodyData setRepository(String repository) {
            this.repository = repository;
            return this;
        }
        public String getRepository() {
            return this.repository;
        }

        public ListRoutineBuildsResponseBodyData setRootDirectory(String rootDirectory) {
            this.rootDirectory = rootDirectory;
            return this;
        }
        public String getRootDirectory() {
            return this.rootDirectory;
        }

        public ListRoutineBuildsResponseBodyData setRoutineBuildId(Long routineBuildId) {
            this.routineBuildId = routineBuildId;
            return this;
        }
        public Long getRoutineBuildId() {
            return this.routineBuildId;
        }

        public ListRoutineBuildsResponseBodyData setRoutineEntry(String routineEntry) {
            this.routineEntry = routineEntry;
            return this;
        }
        public String getRoutineEntry() {
            return this.routineEntry;
        }

        public ListRoutineBuildsResponseBodyData setRoutineName(String routineName) {
            this.routineName = routineName;
            return this;
        }
        public String getRoutineName() {
            return this.routineName;
        }

        public ListRoutineBuildsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListRoutineBuildsResponseBodyData setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListRoutineBuildsResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListRoutineBuildsResponseBodyData setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
