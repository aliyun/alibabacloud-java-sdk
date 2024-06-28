// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DeleteCostUnitRequest extends TeaModel {
    /**
     * <p>The user ID of the cost center owner.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2135342</p>
     */
    @NameInMap("OwnerUid")
    public Long ownerUid;

    /**
     * <p>The ID of the cost center. A value of -1 indicates the root cost center.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>376348</p>
     */
    @NameInMap("UnitId")
    public Long unitId;

    public static DeleteCostUnitRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCostUnitRequest self = new DeleteCostUnitRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCostUnitRequest setOwnerUid(Long ownerUid) {
        this.ownerUid = ownerUid;
        return this;
    }
    public Long getOwnerUid() {
        return this.ownerUid;
    }

    public DeleteCostUnitRequest setUnitId(Long unitId) {
        this.unitId = unitId;
        return this;
    }
    public Long getUnitId() {
        return this.unitId;
    }

}
