// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelExceedApplyQueryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("apply_id")
    public Long applyId;

    public static HotelExceedApplyQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        HotelExceedApplyQueryRequest self = new HotelExceedApplyQueryRequest();
        return TeaModel.build(map, self);
    }

    public HotelExceedApplyQueryRequest setApplyId(Long applyId) {
        this.applyId = applyId;
        return this;
    }
    public Long getApplyId() {
        return this.applyId;
    }

}
