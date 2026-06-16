// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class UpdateContextStoreRequest extends TeaModel {
    @NameInMap("config")
    public UpdateContextStoreRequestConfig config;

    /**
     * <strong>example:</strong>
     * <p>experience</p>
     */
    @NameInMap("contextType")
    public String contextType;

    /**
     * <strong>example:</strong>
     * <p>我的上下文库</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>a1b2c3d4-1234-5678-90ab-cdef12345678</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateContextStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateContextStoreRequest self = new UpdateContextStoreRequest();
        return TeaModel.build(map, self);
    }

    public UpdateContextStoreRequest setConfig(UpdateContextStoreRequestConfig config) {
        this.config = config;
        return this;
    }
    public UpdateContextStoreRequestConfig getConfig() {
        return this.config;
    }

    public UpdateContextStoreRequest setContextType(String contextType) {
        this.contextType = contextType;
        return this;
    }
    public String getContextType() {
        return this.contextType;
    }

    public UpdateContextStoreRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateContextStoreRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class UpdateContextStoreRequestConfigSource extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>my-agent-space</p>
         */
        @NameInMap("agentSpace")
        public String agentSpace;

        /**
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        @NameInMap("startTime")
        public String startTime;

        public static UpdateContextStoreRequestConfigSource build(java.util.Map<String, ?> map) throws Exception {
            UpdateContextStoreRequestConfigSource self = new UpdateContextStoreRequestConfigSource();
            return TeaModel.build(map, self);
        }

        public UpdateContextStoreRequestConfigSource setAgentSpace(String agentSpace) {
            this.agentSpace = agentSpace;
            return this;
        }
        public String getAgentSpace() {
            return this.agentSpace;
        }

        public UpdateContextStoreRequestConfigSource setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class UpdateContextStoreRequestConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;userId&quot;:&quot;user_id&quot;,&quot;sessionId&quot;:&quot;session_id&quot;}</p>
         */
        @NameInMap("metadataField")
        public java.util.Map<String, String> metadataField;

        @NameInMap("source")
        public UpdateContextStoreRequestConfigSource source;

        public static UpdateContextStoreRequestConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateContextStoreRequestConfig self = new UpdateContextStoreRequestConfig();
            return TeaModel.build(map, self);
        }

        public UpdateContextStoreRequestConfig setMetadataField(java.util.Map<String, String> metadataField) {
            this.metadataField = metadataField;
            return this;
        }
        public java.util.Map<String, String> getMetadataField() {
            return this.metadataField;
        }

        public UpdateContextStoreRequestConfig setSource(UpdateContextStoreRequestConfigSource source) {
            this.source = source;
            return this;
        }
        public UpdateContextStoreRequestConfigSource getSource() {
            return this.source;
        }

    }

}
