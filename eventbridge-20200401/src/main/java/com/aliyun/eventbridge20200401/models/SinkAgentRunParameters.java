// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SinkAgentRunParameters extends TeaModel {
    @NameInMap("AgentRuntimeName")
    public String agentRuntimeName;

    @NameInMap("Body")
    public SinkAgentRunParametersBody body;

    @NameInMap("EndpointName")
    public String endpointName;

    @NameInMap("RoleName")
    public String roleName;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
