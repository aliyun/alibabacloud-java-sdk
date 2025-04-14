// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDatabaseRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql-database:rm-abc123xxx::test_db</p>
     */
    @NameInMap("Id")
    public String id;

    public static GetDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseRequest self = new GetDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public GetDatabaseRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
