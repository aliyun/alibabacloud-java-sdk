// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetTableColumnLineageByTaskIdShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TableColumnLineageByTaskIdQuery")
    public String tableColumnLineageByTaskIdQueryShrink;

    public static GetTableColumnLineageByTaskIdShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTableColumnLineageByTaskIdShrinkRequest self = new GetTableColumnLineageByTaskIdShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetTableColumnLineageByTaskIdShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetTableColumnLineageByTaskIdShrinkRequest setTableColumnLineageByTaskIdQueryShrink(String tableColumnLineageByTaskIdQueryShrink) {
        this.tableColumnLineageByTaskIdQueryShrink = tableColumnLineageByTaskIdQueryShrink;
        return this;
    }
    public String getTableColumnLineageByTaskIdQueryShrink() {
        return this.tableColumnLineageByTaskIdQueryShrink;
    }

}
