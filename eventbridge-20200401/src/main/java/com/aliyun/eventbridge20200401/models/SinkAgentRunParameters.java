// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SinkAgentRunParameters extends TeaModel {
    /**
     * <p>The name of the AgentRun agent runtime. You can obtain it from the Alibaba Cloud AgentRun console.</p>
     * 
     * <strong>example:</strong>
     * <p>agent-demo-example</p>
     */
    @NameInMap("AgentRuntimeName")
    public String agentRuntimeName;

    /**
     * <p>The triplet configuration for the Body parameter template. It defines the data transformation method and supports two modes: ORIGINAL (pass-through) and TEMPLATE (template replacement).</p>
     */
    @NameInMap("Body")
    public SinkAgentRunParametersBody body;

    /**
     * <p>The endpoint name of the AgentRun agent runtime, which is used to construct the invocation URL.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("EndpointName")
    public String endpointName;

    /**
     * <p>The name of the AgentRun agent role.</p>
     * 
     * <strong>example:</strong>
     * <p>example-agent-role</p>
     */
    @NameInMap("RoleName")
    public String roleName;

    /**
     * <p>The HTTP request timeout period in milliseconds. Default value: 30000.</p>
     * 
     * <strong>example:</strong>
     * <p>30000</p>
     */
    @NameInMap("Timeout")
    public String timeout;

    public static SinkAgentRunParameters build(java.util.Map<String, ?> map) throws Exception {
        SinkAgentRunParameters self = new SinkAgentRunParameters();
        return TeaModel.build(map, self);
    }

    public SinkAgentRunParameters setAgentRuntimeName(String agentRuntimeName) {
        this.agentRuntimeName = agentRuntimeName;
        return this;
    }
    public String getAgentRuntimeName() {
        return this.agentRuntimeName;
    }

    public SinkAgentRunParameters setBody(SinkAgentRunParametersBody body) {
        this.body = body;
        return this;
    }
    public SinkAgentRunParametersBody getBody() {
        return this.body;
    }

    public SinkAgentRunParameters setEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }
    public String getEndpointName() {
        return this.endpointName;
    }

    public SinkAgentRunParameters setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public SinkAgentRunParameters setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

    public static class SinkAgentRunParametersBody extends TeaModel {
        /**
         * <p>The transformation format. Default value: CONSTANT. Valid values: ORIGINAL, TEMPLATE. Example: <code>ORIGINAL</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>ORIGINAL</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template pattern. This parameter is required only when Form is set to TEMPLATE. It supports ${variable} placeholder replacement. Example: <code>The value of ${key} is ${value}!</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The parameter value. In ORIGINAL mode, the value is $. In TEMPLATE mode, the value is a key-value mapping in JSON format, where the value is a JSONPath expression or a constant. Example: <code>$</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>$</p>
         */
        @NameInMap("Value")
        public String value;

        public static SinkAgentRunParametersBody build(java.util.Map<String, ?> map) throws Exception {
            SinkAgentRunParametersBody self = new SinkAgentRunParametersBody();
            return TeaModel.build(map, self);
        }

        public SinkAgentRunParametersBody setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public SinkAgentRunParametersBody setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public SinkAgentRunParametersBody setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
