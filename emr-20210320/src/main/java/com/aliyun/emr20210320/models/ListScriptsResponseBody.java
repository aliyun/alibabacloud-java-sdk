// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListScriptsResponseBody extends TeaModel {
    /**
     * <p>本次请求所返回的最大记录条数。</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>返回读取到的数据位置，空代表数据已经读取完毕。</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>请求ID。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Scripts")
    public java.util.List<Scripts> scripts;

    /**
     * <p>本次请求条件下的数据总量。</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListScriptsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScriptsResponseBody self = new ListScriptsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScriptsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListScriptsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListScriptsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScriptsResponseBody setScripts(java.util.List<Scripts> scripts) {
        this.scripts = scripts;
        return this;
    }
    public java.util.List<Scripts> getScripts() {
        return this.scripts;
    }

    public ListScriptsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class Scripts extends TeaModel {
        /**
         * <p>API名称。</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>结束执行时间。</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>执行失败策略。</p>
         */
        @NameInMap("ExecutionFailStrategy")
        public String executionFailStrategy;

        /**
         * <p>执行时机。</p>
         */
        @NameInMap("ExecutionMoment")
        public String executionMoment;

        @NameInMap("ExecutionState")
        public String executionState;

        /**
         * <p>最近一次编辑时间。</p>
         */
        @NameInMap("LastUpdateTime")
        public Long lastUpdateTime;

        /**
         * <p>节点选择器。</p>
         */
        @NameInMap("NodeSelector")
        public NodeSelector nodeSelector;

        /**
         * <p>区域ID。</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>集群脚本执行参数。</p>
         */
        @NameInMap("ScriptArgs")
        public String scriptArgs;

        /**
         * <p>脚本ID。</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        /**
         * <p>集群脚本名称。</p>
         */
        @NameInMap("ScriptName")
        public String scriptName;

        /**
         * <p>集群脚本路径。</p>
         */
        @NameInMap("ScriptPath")
        public String scriptPath;

        /**
         * <p>开始执行时间。</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static Scripts build(java.util.Map<String, ?> map) throws Exception {
            Scripts self = new Scripts();
            return TeaModel.build(map, self);
        }

        public Scripts setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public Scripts setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public Scripts setExecutionFailStrategy(String executionFailStrategy) {
            this.executionFailStrategy = executionFailStrategy;
            return this;
        }
        public String getExecutionFailStrategy() {
            return this.executionFailStrategy;
        }

        public Scripts setExecutionMoment(String executionMoment) {
            this.executionMoment = executionMoment;
            return this;
        }
        public String getExecutionMoment() {
            return this.executionMoment;
        }

        public Scripts setExecutionState(String executionState) {
            this.executionState = executionState;
            return this;
        }
        public String getExecutionState() {
            return this.executionState;
        }

        public Scripts setLastUpdateTime(Long lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
            return this;
        }
        public Long getLastUpdateTime() {
            return this.lastUpdateTime;
        }

        public Scripts setNodeSelector(NodeSelector nodeSelector) {
            this.nodeSelector = nodeSelector;
            return this;
        }
        public NodeSelector getNodeSelector() {
            return this.nodeSelector;
        }

        public Scripts setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public Scripts setScriptArgs(String scriptArgs) {
            this.scriptArgs = scriptArgs;
            return this;
        }
        public String getScriptArgs() {
            return this.scriptArgs;
        }

        public Scripts setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public Scripts setScriptName(String scriptName) {
            this.scriptName = scriptName;
            return this;
        }
        public String getScriptName() {
            return this.scriptName;
        }

        public Scripts setScriptPath(String scriptPath) {
            this.scriptPath = scriptPath;
            return this;
        }
        public String getScriptPath() {
            return this.scriptPath;
        }

        public Scripts setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
