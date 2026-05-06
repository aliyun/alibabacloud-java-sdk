// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetTableKnowledgeDetailsRequest extends TeaModel {
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

    public static GetTableKnowledgeDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTableKnowledgeDetailsRequest self = new GetTableKnowledgeDetailsRequest();
        return TeaModel.build(map, self);
    }

    public GetTableKnowledgeDetailsRequest setDbId(Integer dbId) {
        this.dbId = dbId;
        return this;
    }
    public Integer getDbId() {
        return this.dbId;
    }

    public GetTableKnowledgeDetailsRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
