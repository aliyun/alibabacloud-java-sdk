// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class AddTableShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>connector-d51861492df64257</p>
     */
    @NameInMap("ConnectorId")
    public String connectorId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TableColumns")
    public String tableColumnsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ads_wjjr_basc_enterprise_di</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static AddTableShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTableShrinkRequest self = new AddTableShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddTableShrinkRequest setConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }
    public String getConnectorId() {
        return this.connectorId;
    }

    public AddTableShrinkRequest setTableColumnsShrink(String tableColumnsShrink) {
        this.tableColumnsShrink = tableColumnsShrink;
        return this;
    }
    public String getTableColumnsShrink() {
        return this.tableColumnsShrink;
    }

    public AddTableShrinkRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
