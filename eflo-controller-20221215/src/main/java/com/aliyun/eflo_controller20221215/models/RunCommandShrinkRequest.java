// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class RunCommandShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ZWNobyAxMjM=</p>
     */
    @NameInMap("CommandContent")
    public String commandContent;

    /**
     * <strong>example:</strong>
     * <p>Base64</p>
     */
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    /**
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableParameter")
    public Boolean enableParameter;

    @NameInMap("Frequency")
    public String frequency;

    /**
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("NodeIdList")
    public String nodeIdListShrink;

    /**
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:&quot;Jack&quot;, &quot;accessKey&quot;:&quot;LTAIdyvdIqaRY****&quot;}</p>
     */
    @NameInMap("Parameters")
    public String parametersShrink;

    /**
     * <strong>example:</strong>
     * <p>Once</p>
     */
    @NameInMap("RepeatMode")
    public String repeatMode;

    /**
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    /**
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <strong>example:</strong>
     * <p>/home/user</p>
     */
    @NameInMap("WorkingDir")
    public String workingDir;

    public static RunCommandShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunCommandShrinkRequest self = new RunCommandShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunCommandShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RunCommandShrinkRequest setCommandContent(String commandContent) {
        this.commandContent = commandContent;
        return this;
    }
    public String getCommandContent() {
        return this.commandContent;
    }

    public RunCommandShrinkRequest setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    public RunCommandShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public RunCommandShrinkRequest setEnableParameter(Boolean enableParameter) {
        this.enableParameter = enableParameter;
        return this;
    }
    public Boolean getEnableParameter() {
        return this.enableParameter;
    }

    public RunCommandShrinkRequest setFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }
    public String getFrequency() {
        return this.frequency;
    }

    public RunCommandShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RunCommandShrinkRequest setNodeIdListShrink(String nodeIdListShrink) {
        this.nodeIdListShrink = nodeIdListShrink;
        return this;
    }
    public String getNodeIdListShrink() {
        return this.nodeIdListShrink;
    }

    public RunCommandShrinkRequest setParametersShrink(String parametersShrink) {
        this.parametersShrink = parametersShrink;
        return this;
    }
    public String getParametersShrink() {
        return this.parametersShrink;
    }

    public RunCommandShrinkRequest setRepeatMode(String repeatMode) {
        this.repeatMode = repeatMode;
        return this;
    }
    public String getRepeatMode() {
        return this.repeatMode;
    }

    public RunCommandShrinkRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public RunCommandShrinkRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public RunCommandShrinkRequest setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
        return this;
    }
    public String getWorkingDir() {
        return this.workingDir;
    }

}
