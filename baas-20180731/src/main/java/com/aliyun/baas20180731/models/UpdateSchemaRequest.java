// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class UpdateSchemaRequest extends TeaModel {
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

    public static UpdateSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSchemaRequest self = new UpdateSchemaRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSchemaRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public UpdateSchemaRequest setCategoryConfigs(String categoryConfigs) {
        this.categoryConfigs = categoryConfigs;
        return this;
    }
    public String getCategoryConfigs() {
        return this.categoryConfigs;
    }

    public UpdateSchemaRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateSchemaRequest setSchemaId(Long schemaId) {
        this.schemaId = schemaId;
        return this;
    }
    public Long getSchemaId() {
        return this.schemaId;
    }

    public UpdateSchemaRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

}
