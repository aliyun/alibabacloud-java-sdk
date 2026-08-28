// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateAgentSpecVersionRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public CreateAgentSpecVersionRequestBody body;

    public static CreateAgentSpecVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentSpecVersionRequest self = new CreateAgentSpecVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgentSpecVersionRequest setBody(CreateAgentSpecVersionRequestBody body) {
        this.body = body;
        return this;
    }
    public CreateAgentSpecVersionRequestBody getBody() {
        return this.body;
    }

    public static class CreateAgentSpecVersionRequestBody extends TeaModel {
        /**
         * <p>The existing version on which to base the draft.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("basedOnVersion")
        public String basedOnVersion;

        /**
         * <p>The version number for the draft. If not specified, the version number is automatically incremented.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0.0</p>
         */
        @NameInMap("targetVersion")
        public String targetVersion;

        public static CreateAgentSpecVersionRequestBody build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentSpecVersionRequestBody self = new CreateAgentSpecVersionRequestBody();
            return TeaModel.build(map, self);
        }

        public CreateAgentSpecVersionRequestBody setBasedOnVersion(String basedOnVersion) {
            this.basedOnVersion = basedOnVersion;
            return this;
        }
        public String getBasedOnVersion() {
            return this.basedOnVersion;
        }

        public CreateAgentSpecVersionRequestBody setTargetVersion(String targetVersion) {
            this.targetVersion = targetVersion;
            return this;
        }
        public String getTargetVersion() {
            return this.targetVersion;
        }

    }

}
