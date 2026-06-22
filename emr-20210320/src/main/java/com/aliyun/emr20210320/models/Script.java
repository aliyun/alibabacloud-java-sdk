// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class Script extends TeaModel {
    /**
     * <p>The execution failure strategy. Valid values:</p>
     * <ul>
     * <li><p><code>FAILED_CONTINUE</code>: If the script fails, cluster creation or scaling continues.</p>
     * </li>
     * <li><p><code>FAILED_BLOCK</code>: If the script fails, cluster creation or scaling is blocked.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FAILED_CONTINUE</p>
     */
    @NameInMap("ExecutionFailStrategy")
    public String executionFailStrategy;

    /**
     * <p>The execution timing for the script. Valid values:</p>
     * <ul>
     * <li><p><code>BEFORE_INSTALL</code>: The script runs before applications are installed.</p>
     * </li>
     * <li><p><code>AFTER_STARTED</code>: The script runs after applications start.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BEFORE_INSTALL</p>
     */
    @NameInMap("ExecutionMoment")
    public String executionMoment;

    /**
     * <p>Specifies the nodes on which the script runs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeSelector")
    public NodeSelector nodeSelector;

    /**
     * <blockquote>
     * <p>This parameter is deprecated. Scripts run in the order they are defined.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    @Deprecated
    public Integer priority;

    /**
     * <p>The optional script execution arguments.</p>
     * 
     * <strong>example:</strong>
     * <p>-host 10.0.10.5 -m 30</p>
     */
    @NameInMap("ScriptArgs")
    public String scriptArgs;

    /**
     * <p>The required script name. The name must be 1 to 64 characters long and start with a letter or a Chinese character. It cannot start with <code>http://</code> or <code>https://</code>. It can contain Chinese characters, letters, numbers, underscores (<code>_</code>), or hyphens (<code>-</code>).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>脚本名-1</p>
     */
    @NameInMap("ScriptName")
    public String scriptName;

    /**
     * <p>The required path to the script in Object Storage Service (OSS). The path must start with <code>oss://</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://bucket1/update_hosts.sh</p>
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

    @Deprecated
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
