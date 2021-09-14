// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imgsearch20200320.models;

import com.aliyun.tea.*;

public class DeleteImageRequest extends TeaModel {
    @NameInMap("DbName")
    public String dbName;

    @NameInMap("EntityId")
    public String entityId;

    public static DeleteImageRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageRequest self = new DeleteImageRequest();
        return TeaModel.build(map, self);
    }

    public DeleteImageRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DeleteImageRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

}
