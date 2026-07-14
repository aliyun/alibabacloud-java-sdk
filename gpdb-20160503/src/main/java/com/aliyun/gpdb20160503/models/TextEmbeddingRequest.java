// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class TextEmbeddingRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The vector dimensions. Default value: the dimensions supported by the embedding model.</p>
     * <blockquote>
     * <ul>
     * <li>text-embedding-v3 supports 1024, 768, and 512 dimensions. Default value: 1024.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("Dimension")
    public Integer dimension;

    /**
     * <p>The list of text content to vectorize. The list can contain up to 100 entries.</p>
     * 
     * <strong>example:</strong>
     * <p>What is ADBPG?</p>
     */
    @NameInMap("Input")
    public java.util.List<String> input;

    /**
     * <p>The embedding model. Valid values:</p>
     * <ul>
     * <li>text-embedding-v1: 1536 dimensions</li>
     * <li>text-embedding-v2: 1536 dimensions</li>
     * <li>text-embedding-v3 (default): 1024, 768, or 512 dimensions</li>
     * <li>text2vec (not recommended): 1024 dimensions</li>
     * <li>m3e-base (not recommended): 768 dimensions</li>
     * <li>m3e-small (not recommended): 512 dimensions</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>text-embedding-v3</p>
     */
    @NameInMap("Model")
    public String model;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static TextEmbeddingRequest build(java.util.Map<String, ?> map) throws Exception {
        TextEmbeddingRequest self = new TextEmbeddingRequest();
        return TeaModel.build(map, self);
    }

    public TextEmbeddingRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public TextEmbeddingRequest setDimension(Integer dimension) {
        this.dimension = dimension;
        return this;
    }
    public Integer getDimension() {
        return this.dimension;
    }

    public TextEmbeddingRequest setInput(java.util.List<String> input) {
        this.input = input;
        return this;
    }
    public java.util.List<String> getInput() {
        return this.input;
    }

    public TextEmbeddingRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public TextEmbeddingRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public TextEmbeddingRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
