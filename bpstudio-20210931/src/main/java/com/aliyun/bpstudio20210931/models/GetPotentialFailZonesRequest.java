// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class GetPotentialFailZonesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsPlanId")
    public Boolean isPlanId;

    /**
     * <strong>example:</strong>
     * <p>FS3ATPTOSC4SE1GG</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    public static GetPotentialFailZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPotentialFailZonesRequest self = new GetPotentialFailZonesRequest();
        return TeaModel.build(map, self);
    }

    public GetPotentialFailZonesRequest setIsPlanId(Boolean isPlanId) {
        this.isPlanId = isPlanId;
        return this;
    }
    public Boolean getIsPlanId() {
        return this.isPlanId;
    }

    public GetPotentialFailZonesRequest setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

}
