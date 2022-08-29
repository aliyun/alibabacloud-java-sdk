// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetTableIdByNameRequest extends TeaModel {
    @NameInMap("TableName")
    public String tableName;

    public static GetTableIdByNameRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTableIdByNameRequest self = new GetTableIdByNameRequest();
        return TeaModel.build(map, self);
    }

    public GetTableIdByNameRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
