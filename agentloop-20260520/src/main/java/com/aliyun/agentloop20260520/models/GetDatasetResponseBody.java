// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class GetDatasetResponseBody extends TeaModel {
    /**
     * <p>The agent space name.</p>
     * 
     * <strong>example:</strong>
     * <p>sop-agent</p>
     */
    @NameInMap("agentSpace")
    public String agentSpace;

    /**
     * <p>The creation time.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
     * 
     * <strong>example:</strong>
     * <p>2026-06-15T10:30:00Z</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <p>The dataset name.</p>
     * 
     * <strong>example:</strong>
     * <p>product_faq_dataset</p>
     */
    @NameInMap("datasetName")
    public String datasetName;

    /**
     * <p>The dataset description.</p>
     * 
     * <strong>example:</strong>
     * <p>Product FAQ dataset for semantic search</p>
     */
    @NameInMap("description")
    public String description;

    @NameInMap("isFavorite")
    public Boolean isFavorite;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D17DE39E-6C62-50E3-9EB7-FDE41BB0D43D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The table schema of the dataset.</p>
     */
    @NameInMap("schema")
    public java.util.Map<String, IndexKey> schema;

    /**
     * <p>The update time.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
     * 
     * <strong>example:</strong>
     * <p>2026-06-15T11:20:00Z</p>
     */
    @NameInMap("updateTime")
    public String updateTime;

    public static GetDatasetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDatasetResponseBody self = new GetDatasetResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDatasetResponseBody setAgentSpace(String agentSpace) {
        this.agentSpace = agentSpace;
        return this;
    }
    public String getAgentSpace() {
        return this.agentSpace;
    }

    public GetDatasetResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetDatasetResponseBody setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public GetDatasetResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetDatasetResponseBody setIsFavorite(Boolean isFavorite) {
        this.isFavorite = isFavorite;
        return this;
    }
    public Boolean getIsFavorite() {
        return this.isFavorite;
    }

    public GetDatasetResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetDatasetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDatasetResponseBody setSchema(java.util.Map<String, IndexKey> schema) {
        this.schema = schema;
        return this;
    }
    public java.util.Map<String, IndexKey> getSchema() {
        return this.schema;
    }

    public GetDatasetResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
