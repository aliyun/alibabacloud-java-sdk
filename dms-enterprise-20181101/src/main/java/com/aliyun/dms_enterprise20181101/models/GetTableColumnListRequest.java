// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetTableColumnListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1***</p>
     */
    @NameInMap("DbId")
    public Integer dbId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>order_info</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static GetTableColumnListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTableColumnListRequest self = new GetTableColumnListRequest();
        return TeaModel.build(map, self);
    }

    public GetTableColumnListRequest setDbId(Integer dbId) {
        this.dbId = dbId;
        return this;
    }
    public Integer getDbId() {
        return this.dbId;
    }

    public GetTableColumnListRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
