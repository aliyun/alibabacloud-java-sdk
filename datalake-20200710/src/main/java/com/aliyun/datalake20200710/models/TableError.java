// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class TableError extends TeaModel {
    @NameInMap("ErrorDetail")
    public ErrorDetail errorDetail;

    // TableName
    @NameInMap("TableName")
    public String tableName;

    public static TableError build(java.util.Map<String, ?> map) throws Exception {
        TableError self = new TableError();
        return TeaModel.build(map, self);
    }

    public TableError setErrorDetail(ErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }
    public ErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    public TableError setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
