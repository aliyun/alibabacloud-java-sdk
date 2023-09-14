// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class Script extends TeaModel {
    /**
     * <p>执行失败策略。</p>
     */
    @NameInMap("ExecutionFailStrategy")
    public String executionFailStrategy;

    /**
     * <p>脚本的执行时机。</p>
     */
    @NameInMap("ExecutionMoment")
    public String executionMoment;

    /**
     * <p>节点选择器。</p>
     */
    @NameInMap("NodeSelector")
    public NodeSelector nodeSelector;

    /**
     * <p>脚本执行优先级。取值范围：1~100。</p>
     */
    @NameInMap("Priority")
    @Deprecated
    public Integer priority;

    /**
     * <p>脚本执行参数。</p>
     */
    @NameInMap("ScriptArgs")
    public String scriptArgs;

    /**
     * <p>脚本名称。长度为1~64个字符，必须以大小字母或中文开头，不能以http://和https://开头。可以包含中文、英文、数字、下划线（_）、或者短划线（-）</p>
     */
    @NameInMap("ScriptName")
    public String scriptName;

    /**
     * <p>脚本所在OSS路径。</p>
     */
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
