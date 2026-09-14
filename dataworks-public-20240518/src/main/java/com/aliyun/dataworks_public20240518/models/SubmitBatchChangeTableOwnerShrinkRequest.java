// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class SubmitBatchChangeTableOwnerShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to allow transferring ownership to an owner in a different tenant. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableCrossTenant")
    public Boolean enableCrossTenant;

    /**
     * <p>The target owner after the transfer. Use the Alibaba Cloud UID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2xxxxx8146415628</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The list of MaxCompute table metadata entity IDs to transfer. A maximum of 100 tables are allowed per request. Duplicate values are not allowed.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TableMetaEntityIds")
    public String tableMetaEntityIdsShrink;

    public static SubmitBatchChangeTableOwnerShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitBatchChangeTableOwnerShrinkRequest self = new SubmitBatchChangeTableOwnerShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitBatchChangeTableOwnerShrinkRequest setEnableCrossTenant(Boolean enableCrossTenant) {
        this.enableCrossTenant = enableCrossTenant;
        return this;
    }
    public Boolean getEnableCrossTenant() {
        return this.enableCrossTenant;
    }

    public SubmitBatchChangeTableOwnerShrinkRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public SubmitBatchChangeTableOwnerShrinkRequest setTableMetaEntityIdsShrink(String tableMetaEntityIdsShrink) {
        this.tableMetaEntityIdsShrink = tableMetaEntityIdsShrink;
        return this;
    }
    public String getTableMetaEntityIdsShrink() {
        return this.tableMetaEntityIdsShrink;
    }

}
