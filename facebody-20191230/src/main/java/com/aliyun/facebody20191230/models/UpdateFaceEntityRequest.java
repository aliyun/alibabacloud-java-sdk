// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class UpdateFaceEntityRequest extends TeaModel {
    @NameInMap("DbName")
    @Validation(required = true)
    public String dbName;

    @NameInMap("EntityId")
    @Validation(required = true)
    public String entityId;

    @NameInMap("Labels")
    public String labels;

    public static UpdateFaceEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFaceEntityRequest self = new UpdateFaceEntityRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFaceEntityRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public UpdateFaceEntityRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public UpdateFaceEntityRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

}
