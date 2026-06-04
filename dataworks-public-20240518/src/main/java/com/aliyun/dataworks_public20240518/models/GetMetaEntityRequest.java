// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetMetaEntityRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>custom_entity-customer_api:api_001</p>
     */
    @NameInMap("Id")
    public String id;

    public static GetMetaEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaEntityRequest self = new GetMetaEntityRequest();
        return TeaModel.build(map, self);
    }

    public GetMetaEntityRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
