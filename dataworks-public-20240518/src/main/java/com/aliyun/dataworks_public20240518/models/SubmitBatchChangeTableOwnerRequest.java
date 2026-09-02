// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class SubmitBatchChangeTableOwnerRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableCrossTenant")
    public Boolean enableCrossTenant;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2xxxxx8146415628</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TableMetaEntityIds")
    public java.util.List<String> tableMetaEntityIds;

    public static SubmitBatchChangeTableOwnerRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitBatchChangeTableOwnerRequest self = new SubmitBatchChangeTableOwnerRequest();
        return TeaModel.build(map, self);
    }

    public SubmitBatchChangeTableOwnerRequest setEnableCrossTenant(Boolean enableCrossTenant) {
        this.enableCrossTenant = enableCrossTenant;
        return this;
    }
    public Boolean getEnableCrossTenant() {
        return this.enableCrossTenant;
    }

    public SubmitBatchChangeTableOwnerRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public SubmitBatchChangeTableOwnerRequest setTableMetaEntityIds(java.util.List<String> tableMetaEntityIds) {
        this.tableMetaEntityIds = tableMetaEntityIds;
        return this;
    }
    public java.util.List<String> getTableMetaEntityIds() {
        return this.tableMetaEntityIds;
    }

}
