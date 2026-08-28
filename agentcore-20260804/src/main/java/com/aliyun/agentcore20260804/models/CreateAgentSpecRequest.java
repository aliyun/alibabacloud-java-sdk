// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateAgentSpecRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public CreateAgentSpecRequestBody body;

    public static CreateAgentSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentSpecRequest self = new CreateAgentSpecRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgentSpecRequest setBody(CreateAgentSpecRequestBody body) {
        this.body = body;
        return this;
    }
    public CreateAgentSpecRequestBody getBody() {
        return this.body;
    }

    public static class CreateAgentSpecRequestBody extends TeaModel {
        /**
         * <p>The unique name of the AgentSpec.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-worker</p>
         */
        @NameInMap("agentSpecName")
        public String agentSpecName;

        /**
         * <p>The draft version number. If not specified, the default value is 0.0.1.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.1</p>
         */
        @NameInMap("targetVersion")
        public String targetVersion;

        public static CreateAgentSpecRequestBody build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentSpecRequestBody self = new CreateAgentSpecRequestBody();
            return TeaModel.build(map, self);
        }

        public CreateAgentSpecRequestBody setAgentSpecName(String agentSpecName) {
            this.agentSpecName = agentSpecName;
            return this;
        }
        public String getAgentSpecName() {
            return this.agentSpecName;
        }

        public CreateAgentSpecRequestBody setTargetVersion(String targetVersion) {
            this.targetVersion = targetVersion;
            return this;
        }
        public String getTargetVersion() {
            return this.targetVersion;
        }

    }

}
