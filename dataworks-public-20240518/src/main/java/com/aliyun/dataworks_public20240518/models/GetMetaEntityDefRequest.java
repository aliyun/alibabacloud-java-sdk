// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetMetaEntityDefRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>custom_entity-customer_api</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    public static GetMetaEntityDefRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaEntityDefRequest self = new GetMetaEntityDefRequest();
        return TeaModel.build(map, self);
    }

    public GetMetaEntityDefRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

}
