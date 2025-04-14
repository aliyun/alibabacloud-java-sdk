// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetSchemaRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-schema:123456XXX::test_project:default
     * holo-schema:h-abc123xxx::test_db:test_schema</p>
     */
    @NameInMap("Id")
    public String id;

    public static GetSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSchemaRequest self = new GetSchemaRequest();
        return TeaModel.build(map, self);
    }

    public GetSchemaRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
