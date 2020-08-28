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

}
