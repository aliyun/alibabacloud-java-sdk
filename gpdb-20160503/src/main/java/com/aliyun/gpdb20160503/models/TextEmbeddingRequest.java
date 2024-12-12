// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class TextEmbeddingRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("Input")
    public java.util.List<String> input;

    /**
     * <strong>example:</strong>
     * <p>text-embedding-v2</p>
     */
    @NameInMap("Model")
    public String model;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
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
