// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RunCommandRequest extends TeaModel {
    /**
     * <p>The channel type used to execute the command.</p>
     * 
     * <strong>example:</strong>
     * <p>EdsAgent</p>
     */
    @NameInMap("AgentType")
    public String agentType;

    /**
     * <p>The command content.</p>
     * 
     * <strong>example:</strong>
     * <p>ls</p>
     */
    @NameInMap("CommandContent")
    public String commandContent;

    /**
     * <p>The encoding method of the command content (<code>CommandContent</code>). This parameter is case-insensitive.</p>
     * <blockquote>
     * <p>If the specified value is not within the valid values, it is processed as <code>PlainText</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PlainText</p>
     */
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    /**
     * <p>The list of instance IDs. A single request supports up to 50 instances.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The timeout period. Unit: seconds. If the command is not completed within this period, the command execution status is set to timeout. If this parameter is not specified, the default value is 60 seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Timeout")
    public Long timeout;

    public static RunCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        RunCommandRequest self = new RunCommandRequest();
        return TeaModel.build(map, self);
    }

    public RunCommandRequest setAgentType(String agentType) {
        this.agentType = agentType;
        return this;
    }
    public String getAgentType() {
        return this.agentType;
    }

    public RunCommandRequest setCommandContent(String commandContent) {
        this.commandContent = commandContent;
        return this;
    }
    public String getCommandContent() {
        return this.commandContent;
    }

    public RunCommandRequest setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    public RunCommandRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public RunCommandRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

}
