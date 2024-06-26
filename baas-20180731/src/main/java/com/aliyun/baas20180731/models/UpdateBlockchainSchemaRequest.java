// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class UpdateBlockchainSchemaRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    @NameInMap("CategoryConfigs")
    public String categoryConfigs;

    @NameInMap("Description")
    public String description;

    @NameInMap("SchemaId")
    public Long schemaId;

    @NameInMap("SchemaName")
    public String schemaName;

    public static UpdateBlockchainSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBlockchainSchemaRequest self = new UpdateBlockchainSchemaRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBlockchainSchemaRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public UpdateBlockchainSchemaRequest setCategoryConfigs(String categoryConfigs) {
        this.categoryConfigs = categoryConfigs;
        return this;
    }
    public String getCategoryConfigs() {
        return this.categoryConfigs;
    }

    public UpdateBlockchainSchemaRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateBlockchainSchemaRequest setSchemaId(Long schemaId) {
        this.schemaId = schemaId;
        return this;
    }
    public Long getSchemaId() {
        return this.schemaId;
    }

    public UpdateBlockchainSchemaRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

}
