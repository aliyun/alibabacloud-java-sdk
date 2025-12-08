// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class GetFaceEntityRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>66</p>
     */
    @NameInMap("EntityId")
    public String entityId;

    public static GetFaceEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFaceEntityRequest self = new GetFaceEntityRequest();
        return TeaModel.build(map, self);
    }

    public GetFaceEntityRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public GetFaceEntityRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

}
