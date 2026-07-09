// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class GetContextStoreResponseBody extends TeaModel {
    /**
     * <p>The name of the AgentSpace to which the context store belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent-space</p>
     */
    @NameInMap("agentSpace")
    public String agentSpace;

    /**
     * <p>The configuration of the context store.</p>
     */
    @NameInMap("config")
    public GetContextStoreResponseBodyConfig config;

    /**
     * <p>The context store name.</p>
     * 
     * <strong>example:</strong>
     * <p>my-context-store</p>
     */
    @NameInMap("contextStoreName")
    public String contextStoreName;

    /**
     * <p>The type of the context store, such as experience or memory.</p>
     * 
     * <strong>example:</strong>
     * <p>experience</p>
     */
    @NameInMap("contextType")
    public String contextType;

    /**
     * <p>The time when the context store was created, in ISO 8601 UTC format.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01T00:00:00Z</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <p>The description of the context store.</p>
     * 
     * <strong>example:</strong>
     * <p>我的上下文库</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The region ID of the context store.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The status of the context store. Valid values:</p>
     * <ul>
     * <li>ACTIVE</li>
     * <li>INITIALIZING</li>
     * <li>FAILED</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ACTIVE</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The time when the context store was last updated, in ISO 8601 UTC format.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-02T00:00:00Z</p>
     */
    @NameInMap("updateTime")
    public String updateTime;

    public static GetContextStoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetContextStoreResponseBody self = new GetContextStoreResponseBody();
        return TeaModel.build(map, self);
    }

    public GetContextStoreResponseBody setAgentSpace(String agentSpace) {
        this.agentSpace = agentSpace;
        return this;
    }
    public String getAgentSpace() {
        return this.agentSpace;
    }

    public GetContextStoreResponseBody setConfig(GetContextStoreResponseBodyConfig config) {
        this.config = config;
        return this;
    }
    public GetContextStoreResponseBodyConfig getConfig() {
        return this.config;
    }

    public GetContextStoreResponseBody setContextStoreName(String contextStoreName) {
        this.contextStoreName = contextStoreName;
        return this;
    }
    public String getContextStoreName() {
        return this.contextStoreName;
    }

    public GetContextStoreResponseBody setContextType(String contextType) {
        this.contextType = contextType;
        return this;
    }
    public String getContextType() {
        return this.contextType;
    }

    public GetContextStoreResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetContextStoreResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetContextStoreResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetContextStoreResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetContextStoreResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetContextStoreResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static class GetContextStoreResponseBodyConfigSource extends TeaModel {
        /**
         * <p>The AgentSpace where the trace data source resides. This is the same as the AgentSpace specified during creation.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-space</p>
         */
        @NameInMap("agentSpace")
        public String agentSpace;

        /**
         * <p>The start time for data backfill, in ISO 8601 UTC format.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        @NameInMap("startTime")
        public String startTime;

        public static GetContextStoreResponseBodyConfigSource build(java.util.Map<String, ?> map) throws Exception {
            GetContextStoreResponseBodyConfigSource self = new GetContextStoreResponseBodyConfigSource();
            return TeaModel.build(map, self);
        }

        public GetContextStoreResponseBodyConfigSource setAgentSpace(String agentSpace) {
            this.agentSpace = agentSpace;
            return this;
        }
        public String getAgentSpace() {
            return this.agentSpace;
        }

        public GetContextStoreResponseBodyConfigSource setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class GetContextStoreResponseBodyConfig extends TeaModel {
        /**
         * <p>The metadata field mapping. The key is the business field and the value is the storage field.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;userId&quot;:&quot;user_id&quot;,&quot;sessionId&quot;:&quot;session_id&quot;}</p>
         */
        @NameInMap("metadataField")
        public java.util.Map<String, String> metadataField;

        /**
         * <p>The experience mining interval. Valid values: 1h, 6h, 12h, and 1d. Default value: 1d.</p>
         * 
         * <strong>example:</strong>
         * <p>1d</p>
         */
        @NameInMap("miningInterval")
        public String miningInterval;

        /**
         * <p>The list of service names. This works together with source.agentSpace to locate the trace data source. This value cannot be changed in the current version.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;order-service&quot;,&quot;payment-service&quot;]</p>
         */
        @NameInMap("serviceNames")
        public java.util.List<String> serviceNames;

        /**
         * <p>The datasource config passed in by the user. This serves only as the root identifier of the data source.</p>
         */
        @NameInMap("source")
        public GetContextStoreResponseBodyConfigSource source;

        public static GetContextStoreResponseBodyConfig build(java.util.Map<String, ?> map) throws Exception {
            GetContextStoreResponseBodyConfig self = new GetContextStoreResponseBodyConfig();
            return TeaModel.build(map, self);
        }

        public GetContextStoreResponseBodyConfig setMetadataField(java.util.Map<String, String> metadataField) {
            this.metadataField = metadataField;
            return this;
        }
        public java.util.Map<String, String> getMetadataField() {
            return this.metadataField;
        }

        public GetContextStoreResponseBodyConfig setMiningInterval(String miningInterval) {
            this.miningInterval = miningInterval;
            return this;
        }
        public String getMiningInterval() {
            return this.miningInterval;
        }

        public GetContextStoreResponseBodyConfig setServiceNames(java.util.List<String> serviceNames) {
            this.serviceNames = serviceNames;
            return this;
        }
        public java.util.List<String> getServiceNames() {
            return this.serviceNames;
        }

        public GetContextStoreResponseBodyConfig setSource(GetContextStoreResponseBodyConfigSource source) {
            this.source = source;
            return this;
        }
        public GetContextStoreResponseBodyConfigSource getSource() {
            return this.source;
        }

    }

}
