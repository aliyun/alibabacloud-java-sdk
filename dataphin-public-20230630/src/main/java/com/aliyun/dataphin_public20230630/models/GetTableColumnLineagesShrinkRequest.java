// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetTableColumnLineagesShrinkRequest extends TeaModel {
    @NameInMap("FilterQuery")
    public String filterQueryShrink;

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
     * 
     * <strong>example:</strong>
     * <p>1121</p>
     */
    @NameInMap("TableGuid")
    public String tableGuid;

    public static GetTableColumnLineagesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTableColumnLineagesShrinkRequest self = new GetTableColumnLineagesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetTableColumnLineagesShrinkRequest setFilterQueryShrink(String filterQueryShrink) {
        this.filterQueryShrink = filterQueryShrink;
        return this;
    }
    public String getFilterQueryShrink() {
        return this.filterQueryShrink;
    }

    public GetTableColumnLineagesShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetTableColumnLineagesShrinkRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

}
