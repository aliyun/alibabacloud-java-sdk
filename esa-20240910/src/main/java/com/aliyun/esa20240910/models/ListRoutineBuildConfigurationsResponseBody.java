// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListRoutineBuildConfigurationsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6abd807e-ed2a-44de-ac54-ac38a62472e6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of ER build configurations.</p>
     */
    @NameInMap("RoutineBuildConfigurations")
    public java.util.List<ListRoutineBuildConfigurationsResponseBodyRoutineBuildConfigurations> routineBuildConfigurations;

    public static ListRoutineBuildConfigurationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRoutineBuildConfigurationsResponseBody self = new ListRoutineBuildConfigurationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRoutineBuildConfigurationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRoutineBuildConfigurationsResponseBody setRoutineBuildConfigurations(java.util.List<ListRoutineBuildConfigurationsResponseBodyRoutineBuildConfigurations> routineBuildConfigurations) {
        this.routineBuildConfigurations = routineBuildConfigurations;
        return this;
    }
    public java.util.List<ListRoutineBuildConfigurationsResponseBodyRoutineBuildConfigurations> getRoutineBuildConfigurations() {
        return this.routineBuildConfigurations;
    }

    public static class ListRoutineBuildConfigurationsResponseBodyRoutineBuildConfigurationsLatestRoutineBuildTask extends TeaModel {
        /**
         * <p>The creation time, in ISO 8601 format (UTC), formatted as yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-10T02:18:55Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ER routine name.</p>
         * 
         * <strong>example:</strong>
         * <p>rwa-test</p>
         */
        @NameInMap("RoutineName")
        public String routineName;

        /**
         * <p>The status of the build task. Valid values:</p>
         * <ul>
         * <li>int: Init.</li>
         * <li>pending: Pending.</li>
         * <li>building: Building.</li>
         * <li>succeed: Succeeded.</li>
         * <li>failed: Failed.</li>
         * <li>canceled: Canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>building</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListRoutineBuildConfigurationsResponseBodyRoutineBuildConfigurationsLatestRoutineBuildTask build(java.util.Map<String, ?> map) throws Exception {
            ListRoutineBuildConfigurationsResponseBodyRoutineBuildConfigurationsLatestRoutineBuildTask self = new ListRoutineBuildConfigurationsResponseBodyRoutineBuildConfigurationsLatestRoutineBuildTask();
            return TeaModel.build(map, self);
        }

        public ListRoutineBuildConfigurationsResponseBodyRoutineBuildConfigurationsLatestRoutineBuildTask setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListRoutineBuildConfigurationsResponseBodyRoutineBuildConfigurationsLatestRoutineBuildTask setRoutineName(String routineName) {
            this.routineName = routineName;
            return this;
        }
        public String getRoutineName() {
            return this.routineName;
        }

        public ListRoutineBuildConfigurationsResponseBodyRoutineBuildConfigurationsLatestRoutineBuildTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListRoutineBuildConfigurationsResponseBodyRoutineBuildConfigurationsRoutineBuildConfiguration extends TeaModel {
        /**
         * <p>The Git account name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("GitAccountName")
        public String gitAccountName;

        /**
         * <p>The Git platform. Valid values: github, gitee, and upload.</p>
         * 
         * <strong>example:</strong>
         * <p>github</p>
         */
        @NameInMap("GitPlatform")
        public String gitPlatform;

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
         * <p>The ER routine name.</p>
         * 
         * <strong>example:</strong>
         * <p>rwa-test</p>
         */
        @NameInMap("RoutineName")
        public String routineName;

        public static ListRoutineBuildConfigurationsResponseBodyRoutineBuildConfigurationsRoutineBuildConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ListRoutineBuildConfigurationsResponseBodyRoutineBuildConfigurationsRoutineBuildConfiguration self = new ListRoutineBuildConfigurationsResponseBodyRoutineBuildConfigurationsRoutineBuildConfiguration();
            return TeaModel.build(map, self);
        }

        public ListRoutineBuildConfigurationsResponseBodyRoutineBuildConfigurationsRoutineBuildConfiguration setGitAccountName(String gitAccountName) {
            this.gitAccountName = gitAccountName;
            return this;
        }
        public String getGitAccountName() {
            return this.gitAccountName;
        }

        public ListRoutineBuildConfigurationsResponseBodyRoutineBuildConfigurationsRoutineBuildConfiguration setGitPlatform(String gitPlatform) {
            this.gitPlatform = gitPlatform;
            return this;
        }
        public String getGitPlatform() {
            return this.gitPlatform;
        }

        public ListRoutineBuildConfigurationsResponseBodyRoutineBuildConfigurationsRoutineBuildConfiguration setProductionBranch(String productionBranch) {
            this.productionBranch = productionBranch;
            return this;
        }
        public String getProductionBranch() {
            return this.productionBranch;
        }

        public ListRoutineBuildConfigurationsResponseBodyRoutineBuildConfigurationsRoutineBuildConfiguration setRepository(String repository) {
            this.repository = repository;
            return this;
        }
        public String getRepository() {
            return this.repository;
        }

        public ListRoutineBuildConfigurationsResponseBodyRoutineBuildConfigurationsRoutineBuildConfiguration setRoutineName(String routineName) {
            this.routineName = routineName;
            return this;
        }
        public String getRoutineName() {
            return this.routineName;
        }

    }

    public static class ListRoutineBuildConfigurationsResponseBodyRoutineBuildConfigurations extends TeaModel {
        /**
         * <p>The latest ER build task information.</p>
         */
        @NameInMap("LatestRoutineBuildTask")
        public ListRoutineBuildConfigurationsResponseBodyRoutineBuildConfigurationsLatestRoutineBuildTask latestRoutineBuildTask;

        /**
         * <p>The ER build configuration information.</p>
         */
        @NameInMap("RoutineBuildConfiguration")
        public ListRoutineBuildConfigurationsResponseBodyRoutineBuildConfigurationsRoutineBuildConfiguration routineBuildConfiguration;

        public static ListRoutineBuildConfigurationsResponseBodyRoutineBuildConfigurations build(java.util.Map<String, ?> map) throws Exception {
            ListRoutineBuildConfigurationsResponseBodyRoutineBuildConfigurations self = new ListRoutineBuildConfigurationsResponseBodyRoutineBuildConfigurations();
            return TeaModel.build(map, self);
        }

        public ListRoutineBuildConfigurationsResponseBodyRoutineBuildConfigurations setLatestRoutineBuildTask(ListRoutineBuildConfigurationsResponseBodyRoutineBuildConfigurationsLatestRoutineBuildTask latestRoutineBuildTask) {
            this.latestRoutineBuildTask = latestRoutineBuildTask;
            return this;
        }
        public ListRoutineBuildConfigurationsResponseBodyRoutineBuildConfigurationsLatestRoutineBuildTask getLatestRoutineBuildTask() {
            return this.latestRoutineBuildTask;
        }

        public ListRoutineBuildConfigurationsResponseBodyRoutineBuildConfigurations setRoutineBuildConfiguration(ListRoutineBuildConfigurationsResponseBodyRoutineBuildConfigurationsRoutineBuildConfiguration routineBuildConfiguration) {
            this.routineBuildConfiguration = routineBuildConfiguration;
            return this;
        }
        public ListRoutineBuildConfigurationsResponseBodyRoutineBuildConfigurationsRoutineBuildConfiguration getRoutineBuildConfiguration() {
            return this.routineBuildConfiguration;
        }

    }

}
