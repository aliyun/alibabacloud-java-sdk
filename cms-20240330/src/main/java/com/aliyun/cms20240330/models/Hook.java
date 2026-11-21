// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class Hook extends TeaModel {
    /**
     * <p>Specifies whether to enable debug mode.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("debug")
    public Boolean debug;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>检查工具调用中的命令是否安全。</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Specifies whether the Hook is enabled. It is executed only when this parameter is set to true. If not configured, the Hook is disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <p>The event. Each Hook processes only one event.</p>
     * 
     * <strong>example:</strong>
     * <p>ToolStart</p>
     */
    @NameInMap("event")
    public String event;

    /**
     * <p>The execution configuration. Configures the synchronous execution, total timeout, number of retries, and invalid return value handling policy for the Hook.</p>
     */
    @NameInMap("execution")
    public HookExecution execution;

    /**
     * <p>Specifies whether to hide Hook invocation events. When set to true, Hook invocation events are not sent to the frontend, regardless of whether debug mode is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("invisible")
    public Boolean invisible;

    /**
     * <p>The list of tool names. Only ToolStart and ToolEnd perform an exact match based on the actual tool name. Tool names such as Read, Write, Bash, and Edit are supported. Wildcards are not supported. An empty array does not restrict tools. This field is ignored for other events.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;Read&quot;,&quot;Write&quot;,&quot;Bash&quot;,&quot;Edit&quot;]</p>
     */
    @NameInMap("match")
    public java.util.List<String> match;

    /**
     * <p>The Hook name. Only digits, letters, underscores, and hyphens are allowed, and it cannot be empty. Hooks with the same name are executed independently in the order of the list.</p>
     * 
     * <strong>example:</strong>
     * <p>command-guard</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The configuration protocol version.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("schemaVersion")
    public String schemaVersion;

    /**
     * <p>The effective scope. A value of all indicates Chat and Mission. A value of chat or mission indicates that the Hook takes effect only in the corresponding scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("scope")
    public String scope;

    public static Hook build(java.util.Map<String, ?> map) throws Exception {
        Hook self = new Hook();
        return TeaModel.build(map, self);
    }

    public Hook setDebug(Boolean debug) {
        this.debug = debug;
        return this;
    }
    public Boolean getDebug() {
        return this.debug;
    }

    public Hook setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Hook setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public Hook setEvent(String event) {
        this.event = event;
        return this;
    }
    public String getEvent() {
        return this.event;
    }

    public Hook setExecution(HookExecution execution) {
        this.execution = execution;
        return this;
    }
    public HookExecution getExecution() {
        return this.execution;
    }

    public Hook setInvisible(Boolean invisible) {
        this.invisible = invisible;
        return this;
    }
    public Boolean getInvisible() {
        return this.invisible;
    }

    public Hook setMatch(java.util.List<String> match) {
        this.match = match;
        return this;
    }
    public java.util.List<String> getMatch() {
        return this.match;
    }

    public Hook setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Hook setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    public Hook setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public static class HookExecution extends TeaModel {
        /**
         * <p>The invalid return value handling policy. If the handler return value is still invalid after retries, it is processed as allow or reject.</p>
         * 
         * <strong>example:</strong>
         * <p>allow</p>
         */
        @NameInMap("failResult")
        public String failResult;

        /**
         * <p>The execution instruction. For the prompt type, it is a prompt. For the bash type, it is a Bash script. For the python3 type, it is a Python 3 script. For the hint type, it is contextual text directly appended. Non-empty UTF-8 text must be provided for all four types.</p>
         * 
         * <strong>example:</strong>
         * <p>检查当前工具调用是否安全。</p>
         */
        @NameInMap("instruction")
        public String instruction;

        /**
         * <p>The maximum number of retries. Specifies the number of additional attempts after a failure. Valid values: 0 to 3.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("maxRetry")
        public Long maxRetry;

        /**
         * <p>The timeout period in seconds. Valid values: 1 to 30. All attempts and waits for this Hook share this timeout period.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("timeoutSeconds")
        public Long timeoutSeconds;

        /**
         * <p>The handler type. Only prompt, bash, python3, and hint are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>prompt</p>
         */
        @NameInMap("type")
        public String type;

        public static HookExecution build(java.util.Map<String, ?> map) throws Exception {
            HookExecution self = new HookExecution();
            return TeaModel.build(map, self);
        }

        public HookExecution setFailResult(String failResult) {
            this.failResult = failResult;
            return this;
        }
        public String getFailResult() {
            return this.failResult;
        }

        public HookExecution setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public HookExecution setMaxRetry(Long maxRetry) {
            this.maxRetry = maxRetry;
            return this;
        }
        public Long getMaxRetry() {
            return this.maxRetry;
        }

        public HookExecution setTimeoutSeconds(Long timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Long getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        public HookExecution setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
