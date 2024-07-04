// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListScriptsResponseBody extends TeaModel {
    /**
     * <p>本次请求所返回的最大记录条数。</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>返回读取到的数据位置，空代表数据已经读取完毕。</p>
     * 
     * <strong>example:</strong>
     * <p>dd6b1b2a-5837-5237-abe4-ff0c89568982</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>请求ID。</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The scripts.</p>
     */
    @NameInMap("Scripts")
    public java.util.List<Scripts> scripts;

    /**
     * <p>本次请求条件下的数据总量。</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
         * <p>The name of the API operation.</p>
         * 
         * <strong>example:</strong>
         * <p>ListScripts</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The time when the system finishes the running of the script. This parameter is returned only if the ScriptType parameter is set to NORMAL.</p>
         * 
         * <strong>example:</strong>
         * <p>1639715635819</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The policy that is used to handle execution failures of the script. Valid values:</p>
         * <ul>
         * <li>FAILED_CONTINUE</li>
         * <li>FAILED_BLOCK</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FAILED_CONTINUE</p>
         */
        @NameInMap("ExecutionFailStrategy")
        public String executionFailStrategy;

        /**
         * <p>The time based on which the system runs the script. Valid values:</p>
         * <ul>
         * <li>BEFORE_INSTALL</li>
         * <li>AFTER_STARTED</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BEFORE_INSTALL</p>
         */
        @NameInMap("ExecutionMoment")
        public String executionMoment;

        /**
         * <p>The status of the script. This parameter is returned only if the <code>ScriptType</code> parameter is set to <code>NORMAL</code>. Valid values:</p>
         * <ul>
         * <li>SCRIPT_COMPLETED</li>
         * <li>SCRIPT_SUBMISSION_FAILED</li>
         * <li>SCRIPT_RUNNING</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SCRIPT_COMPLETED</p>
         */
        @NameInMap("ExecutionState")
        public String executionState;

        /**
         * <p>The time when the script was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1639714634819</p>
         */
        @NameInMap("LastUpdateTime")
        public Long lastUpdateTime;

        /**
         * <p>The node selector.</p>
         */
        @NameInMap("NodeSelector")
        public NodeSelector nodeSelector;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The runtime parameters of the script.</p>
         * 
         * <strong>example:</strong>
         * <p>--mode=client -h -p</p>
         */
        @NameInMap("ScriptArgs")
        public String scriptArgs;

        /**
         * <p>The script ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cs-bf25219d103043a0820613e32781****</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        /**
         * <p>The name of the script.</p>
         * 
         * <strong>example:</strong>
         * <p>check_env</p>
         */
        @NameInMap("ScriptName")
        public String scriptName;

        /**
         * <p>The path in which the script is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket1/check_evn.sh</p>
         */
        @NameInMap("ScriptPath")
        public String scriptPath;

        /**
         * <p>The time when the system starts to run the script. This parameter is returned only if the ScriptType parameter is set to NORMAL.</p>
         * 
         * <strong>example:</strong>
         * <p>1639714634000</p>
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
