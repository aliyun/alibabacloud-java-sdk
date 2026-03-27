// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetMemoryStoreResponseBody extends TeaModel {
    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
     * 
     * <strong>example:</strong>
     * <p>1764556182850</p>
     */
    @NameInMap("createTime")
    public String createTime;

    @NameInMap("customExtractionStrategies")
    public java.util.List<CustomExtractionStrategy> customExtractionStrategies;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("description")
    public String description;

    @NameInMap("extractionStrategies")
    public java.util.List<String> extractionStrategies;

    /**
     * <strong>example:</strong>
     * <p>test-memory-store</p>
     */
    @NameInMap("memoryStoreName")
    public String memoryStoreName;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>0B9377D9-C56B-5C2E-A8A4-A01D6CC3F4B8</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("shortTermStorage")
    public GetMemoryStoreResponseBodyShortTermStorage shortTermStorage;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("shortTermTtl")
    public Integer shortTermTtl;

    /**
     * <strong>example:</strong>
     * <p>Trace</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    @NameInMap("traceSourceConfig")
    public GetMemoryStoreResponseBodyTraceSourceConfig traceSourceConfig;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
     * 
     * <strong>example:</strong>
     * <p>1764556182850</p>
     */
    @NameInMap("updateTime")
    public String updateTime;

    /**
     * <strong>example:</strong>
     * <p>default-cms-xxxxxx-cn-beijing</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static GetMemoryStoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMemoryStoreResponseBody self = new GetMemoryStoreResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMemoryStoreResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetMemoryStoreResponseBody setCustomExtractionStrategies(java.util.List<CustomExtractionStrategy> customExtractionStrategies) {
        this.customExtractionStrategies = customExtractionStrategies;
        return this;
    }
    public java.util.List<CustomExtractionStrategy> getCustomExtractionStrategies() {
        return this.customExtractionStrategies;
    }

    public GetMemoryStoreResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetMemoryStoreResponseBody setExtractionStrategies(java.util.List<String> extractionStrategies) {
        this.extractionStrategies = extractionStrategies;
        return this;
    }
    public java.util.List<String> getExtractionStrategies() {
        return this.extractionStrategies;
    }

    public GetMemoryStoreResponseBody setMemoryStoreName(String memoryStoreName) {
        this.memoryStoreName = memoryStoreName;
        return this;
    }
    public String getMemoryStoreName() {
        return this.memoryStoreName;
    }

    public GetMemoryStoreResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetMemoryStoreResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMemoryStoreResponseBody setShortTermStorage(GetMemoryStoreResponseBodyShortTermStorage shortTermStorage) {
        this.shortTermStorage = shortTermStorage;
        return this;
    }
    public GetMemoryStoreResponseBodyShortTermStorage getShortTermStorage() {
        return this.shortTermStorage;
    }

    public GetMemoryStoreResponseBody setShortTermTtl(Integer shortTermTtl) {
        this.shortTermTtl = shortTermTtl;
        return this;
    }
    public Integer getShortTermTtl() {
        return this.shortTermTtl;
    }

    public GetMemoryStoreResponseBody setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public GetMemoryStoreResponseBody setTraceSourceConfig(GetMemoryStoreResponseBodyTraceSourceConfig traceSourceConfig) {
        this.traceSourceConfig = traceSourceConfig;
        return this;
    }
    public GetMemoryStoreResponseBodyTraceSourceConfig getTraceSourceConfig() {
        return this.traceSourceConfig;
    }

    public GetMemoryStoreResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public GetMemoryStoreResponseBody setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class GetMemoryStoreResponseBodyShortTermStorage extends TeaModel {
        @NameInMap("logstore")
        public String logstore;

        @NameInMap("project")
        public String project;

        public static GetMemoryStoreResponseBodyShortTermStorage build(java.util.Map<String, ?> map) throws Exception {
            GetMemoryStoreResponseBodyShortTermStorage self = new GetMemoryStoreResponseBodyShortTermStorage();
            return TeaModel.build(map, self);
        }

        public GetMemoryStoreResponseBodyShortTermStorage setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public GetMemoryStoreResponseBodyShortTermStorage setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

    }

    public static class GetMemoryStoreResponseBodyTraceSourceConfig extends TeaModel {
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

        public static GetMemoryStoreResponseBodyTraceSourceConfig build(java.util.Map<String, ?> map) throws Exception {
            GetMemoryStoreResponseBodyTraceSourceConfig self = new GetMemoryStoreResponseBodyTraceSourceConfig();
            return TeaModel.build(map, self);
        }

        public GetMemoryStoreResponseBodyTraceSourceConfig setIncludeOutput(Boolean includeOutput) {
            this.includeOutput = includeOutput;
            return this;
        }
        public Boolean getIncludeOutput() {
            return this.includeOutput;
        }

        public GetMemoryStoreResponseBodyTraceSourceConfig setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

        public GetMemoryStoreResponseBodyTraceSourceConfig setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

}
