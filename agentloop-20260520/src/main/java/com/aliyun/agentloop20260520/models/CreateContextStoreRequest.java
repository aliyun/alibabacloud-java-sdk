// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class CreateContextStoreRequest extends TeaModel {
    @NameInMap("config")
    public CreateContextStoreRequestConfig config;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-context-store</p>
     */
    @NameInMap("contextStoreName")
    public String contextStoreName;

    /**
     * <p>This parameter is required.</p>
     * 
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

    public static CreateContextStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContextStoreRequest self = new CreateContextStoreRequest();
        return TeaModel.build(map, self);
    }

    public CreateContextStoreRequest setConfig(CreateContextStoreRequestConfig config) {
        this.config = config;
        return this;
    }
    public CreateContextStoreRequestConfig getConfig() {
        return this.config;
    }

    public CreateContextStoreRequest setContextStoreName(String contextStoreName) {
        this.contextStoreName = contextStoreName;
        return this;
    }
    public String getContextStoreName() {
        return this.contextStoreName;
    }

    public CreateContextStoreRequest setContextType(String contextType) {
        this.contextType = contextType;
        return this;
    }
    public String getContextType() {
        return this.contextType;
    }

    public CreateContextStoreRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateContextStoreRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class CreateContextStoreRequestConfigSource extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>my-agent-space</p>
         */
        @NameInMap("agentSpace")
        public String agentSpace;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        @NameInMap("startTime")
        public String startTime;

        public static CreateContextStoreRequestConfigSource build(java.util.Map<String, ?> map) throws Exception {
            CreateContextStoreRequestConfigSource self = new CreateContextStoreRequestConfigSource();
            return TeaModel.build(map, self);
        }

        public CreateContextStoreRequestConfigSource setAgentSpace(String agentSpace) {
            this.agentSpace = agentSpace;
            return this;
        }
        public String getAgentSpace() {
            return this.agentSpace;
        }

        public CreateContextStoreRequestConfigSource setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class CreateContextStoreRequestConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;userId&quot;:&quot;user_id&quot;,&quot;sessionId&quot;:&quot;session_id&quot;}</p>
         */
        @NameInMap("metadataField")
        public java.util.Map<String, String> metadataField;

        /**
         * <strong>example:</strong>
         * <p>1d</p>
         */
        @NameInMap("miningInterval")
        public String miningInterval;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;order-service&quot;,&quot;payment-service&quot;]</p>
         */
        @NameInMap("serviceNames")
        public java.util.List<String> serviceNames;

        @NameInMap("source")
        public CreateContextStoreRequestConfigSource source;

        public static CreateContextStoreRequestConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateContextStoreRequestConfig self = new CreateContextStoreRequestConfig();
            return TeaModel.build(map, self);
        }

        public CreateContextStoreRequestConfig setMetadataField(java.util.Map<String, String> metadataField) {
            this.metadataField = metadataField;
            return this;
        }
        public java.util.Map<String, String> getMetadataField() {
            return this.metadataField;
        }

        public CreateContextStoreRequestConfig setMiningInterval(String miningInterval) {
            this.miningInterval = miningInterval;
            return this;
        }
        public String getMiningInterval() {
            return this.miningInterval;
        }

        public CreateContextStoreRequestConfig setServiceNames(java.util.List<String> serviceNames) {
            this.serviceNames = serviceNames;
            return this;
        }
        public java.util.List<String> getServiceNames() {
            return this.serviceNames;
        }

        public CreateContextStoreRequestConfig setSource(CreateContextStoreRequestConfigSource source) {
            this.source = source;
            return this;
        }
        public CreateContextStoreRequestConfigSource getSource() {
            return this.source;
        }

    }

}
