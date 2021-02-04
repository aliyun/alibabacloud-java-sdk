// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DeleteCostUnitRequest extends TeaModel {
    @NameInMap("OwnerUid")
    @Validation(required = true)
    public Long ownerUid;

    @NameInMap("UnitId")
    @Validation(required = true)
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
