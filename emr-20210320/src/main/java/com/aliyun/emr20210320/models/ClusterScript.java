// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ClusterScript extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>取值:FAILED_CONTINUE, FAILED_BLOCKED</p>
     */
    @NameInMap("ExecutionFailStrategy")
    public String executionFailStrategy;

    /**
     * <strong>example:</strong>
     * <p>取值:BEFORE_INSTALL, AFTER_STARTED</p>
     */
    @NameInMap("ExecutionMoment")
    public String executionMoment;

    @NameInMap("NodeSelect")
    public NodeSelector nodeSelect;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("ScriptArgs")
    public String scriptArgs;

    @NameInMap("ScriptName")
    public String scriptName;

    @NameInMap("ScriptPath")
    public String scriptPath;

    public static ClusterScript build(java.util.Map<String, ?> map) throws Exception {
        ClusterScript self = new ClusterScript();
        return TeaModel.build(map, self);
    }

    public ClusterScript setExecutionFailStrategy(String executionFailStrategy) {
        this.executionFailStrategy = executionFailStrategy;
        return this;
    }
    public String getExecutionFailStrategy() {
        return this.executionFailStrategy;
    }

    public ClusterScript setExecutionMoment(String executionMoment) {
        this.executionMoment = executionMoment;
        return this;
    }
    public String getExecutionMoment() {
        return this.executionMoment;
    }

    public ClusterScript setNodeSelect(NodeSelector nodeSelect) {
        this.nodeSelect = nodeSelect;
        return this;
    }
    public NodeSelector getNodeSelect() {
        return this.nodeSelect;
    }

    public ClusterScript setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public ClusterScript setScriptArgs(String scriptArgs) {
        this.scriptArgs = scriptArgs;
        return this;
    }
    public String getScriptArgs() {
        return this.scriptArgs;
    }

    public ClusterScript setScriptName(String scriptName) {
        this.scriptName = scriptName;
        return this;
    }
    public String getScriptName() {
        return this.scriptName;
    }

    public ClusterScript setScriptPath(String scriptPath) {
        this.scriptPath = scriptPath;
        return this;
    }
    public String getScriptPath() {
        return this.scriptPath;
    }

}
