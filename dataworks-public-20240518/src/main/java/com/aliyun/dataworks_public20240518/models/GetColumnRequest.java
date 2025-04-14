// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetColumnRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-column:11075xxxx::test_project:test_schema:test_table:test_column</p>
     */
    @NameInMap("Id")
    public String id;

    public static GetColumnRequest build(java.util.Map<String, ?> map) throws Exception {
        GetColumnRequest self = new GetColumnRequest();
        return TeaModel.build(map, self);
    }

    public GetColumnRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
