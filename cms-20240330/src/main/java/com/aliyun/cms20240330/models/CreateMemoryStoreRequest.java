// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateMemoryStoreRequest extends TeaModel {
    @NameInMap("customExtractionStrategies")
    public java.util.List<CustomExtractionStrategy> customExtractionStrategies;

    /**
     * <strong>example:</strong>
     * <p>Test memory store for demonstration.</p>
     */
    @NameInMap("description")
    public String description;

    @NameInMap("extractionStrategies")
    public java.util.List<String> extractionStrategies;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-memory-store</p>
     */
    @NameInMap("memoryStoreName")
    public String memoryStoreName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("shortTermTtl")
    public Integer shortTermTtl;

    /**
     * <strong>example:</strong>
     * <p>None/Trace</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    @NameInMap("traceSourceConfig")
    public CreateMemoryStoreRequestTraceSourceConfig traceSourceConfig;

    public static CreateMemoryStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMemoryStoreRequest self = new CreateMemoryStoreRequest();
        return TeaModel.build(map, self);
    }

    public CreateMemoryStoreRequest setCustomExtractionStrategies(java.util.List<CustomExtractionStrategy> customExtractionStrategies) {
        this.customExtractionStrategies = customExtractionStrategies;
        return this;
    }
    public java.util.List<CustomExtractionStrategy> getCustomExtractionStrategies() {
        return this.customExtractionStrategies;
    }

    public CreateMemoryStoreRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateMemoryStoreRequest setExtractionStrategies(java.util.List<String> extractionStrategies) {
        this.extractionStrategies = extractionStrategies;
        return this;
    }
    public java.util.List<String> getExtractionStrategies() {
        return this.extractionStrategies;
    }

    public CreateMemoryStoreRequest setMemoryStoreName(String memoryStoreName) {
        this.memoryStoreName = memoryStoreName;
        return this;
    }
    public String getMemoryStoreName() {
        return this.memoryStoreName;
    }

    public CreateMemoryStoreRequest setShortTermTtl(Integer shortTermTtl) {
        this.shortTermTtl = shortTermTtl;
        return this;
    }
    public Integer getShortTermTtl() {
        return this.shortTermTtl;
    }

    public CreateMemoryStoreRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateMemoryStoreRequest setTraceSourceConfig(CreateMemoryStoreRequestTraceSourceConfig traceSourceConfig) {
        this.traceSourceConfig = traceSourceConfig;
        return this;
    }
    public CreateMemoryStoreRequestTraceSourceConfig getTraceSourceConfig() {
        return this.traceSourceConfig;
    }

    public static class CreateMemoryStoreRequestTraceSourceConfig extends TeaModel {
        @NameInMap("includeOutput")
        public Boolean includeOutput;

        /**
         * <strong>example:</strong>
         * <p>(serviceName : &quot;langchain-rag&quot; or serviceName : &quot;agentscope-code-correction&quot;) and hostname = frontend-proxy-999c48c8d-hvk6c</p>
         */
        @NameInMap("query")
        public String query;

        /**
         * <strong>example:</strong>
         * <p>test-workspace</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static CreateMemoryStoreRequestTraceSourceConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateMemoryStoreRequestTraceSourceConfig self = new CreateMemoryStoreRequestTraceSourceConfig();
            return TeaModel.build(map, self);
        }

        public CreateMemoryStoreRequestTraceSourceConfig setIncludeOutput(Boolean includeOutput) {
            this.includeOutput = includeOutput;
            return this;
        }
        public Boolean getIncludeOutput() {
            return this.includeOutput;
        }

        public CreateMemoryStoreRequestTraceSourceConfig setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

        public CreateMemoryStoreRequestTraceSourceConfig setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

}
