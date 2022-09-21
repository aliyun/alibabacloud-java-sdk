// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class Script extends TeaModel {
    @NameInMap("ExecutionFailStrategy")
    public String executionFailStrategy;

    @NameInMap("ExecutionMoment")
    public String executionMoment;

    @NameInMap("NodeSelector")
    public NodeSelector nodeSelector;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("ScriptArgs")
    public String scriptArgs;

    @NameInMap("ScriptName")
    public String scriptName;

    @NameInMap("ScriptPath")
    public String scriptPath;

    public static Script build(java.util.Map<String, ?> map) throws Exception {
        Script self = new Script();
        return TeaModel.build(map, self);
    }

    public Script setExecutionFailStrategy(String executionFailStrategy) {
        this.executionFailStrategy = executionFailStrategy;
        return this;
    }
    public String getExecutionFailStrategy() {
        return this.executionFailStrategy;
    }

    public Script setExecutionMoment(String executionMoment) {
        this.executionMoment = executionMoment;
        return this;
    }
    public String getExecutionMoment() {
        return this.executionMoment;
    }

    public Script setNodeSelector(NodeSelector nodeSelector) {
        this.nodeSelector = nodeSelector;
        return this;
    }
    public NodeSelector getNodeSelector() {
        return this.nodeSelector;
    }

    public Script setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public Script setScriptArgs(String scriptArgs) {
        this.scriptArgs = scriptArgs;
        return this;
    }
    public String getScriptArgs() {
        return this.scriptArgs;
    }

    public Script setScriptName(String scriptName) {
        this.scriptName = scriptName;
        return this;
    }
    public String getScriptName() {
        return this.scriptName;
    }

    public Script setScriptPath(String scriptPath) {
        this.scriptPath = scriptPath;
        return this;
    }
    public String getScriptPath() {
        return this.scriptPath;
    }

}
