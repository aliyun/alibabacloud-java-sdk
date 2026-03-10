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

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("shortTermTtl")
    public Integer shortTermTtl;

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

    public GetMemoryStoreResponseBody setShortTermTtl(Integer shortTermTtl) {
        this.shortTermTtl = shortTermTtl;
        return this;
    }
    public Integer getShortTermTtl() {
        return this.shortTermTtl;
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

}
