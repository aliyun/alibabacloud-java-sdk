// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetTableLineageByTaskIdShrinkRequest extends TeaModel {
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
    @NameInMap("TableLineageByTaskIdQuery")
    public String tableLineageByTaskIdQueryShrink;

    public static GetTableLineageByTaskIdShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTableLineageByTaskIdShrinkRequest self = new GetTableLineageByTaskIdShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetTableLineageByTaskIdShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetTableLineageByTaskIdShrinkRequest setTableLineageByTaskIdQueryShrink(String tableLineageByTaskIdQueryShrink) {
        this.tableLineageByTaskIdQueryShrink = tableLineageByTaskIdQueryShrink;
        return this;
    }
    public String getTableLineageByTaskIdQueryShrink() {
        return this.tableLineageByTaskIdQueryShrink;
    }

}
