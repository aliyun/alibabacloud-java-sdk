// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelExceedApplyQueryRequest extends TeaModel {
    @NameInMap("apply_id")
    public Long applyId;

    @NameInMap("user_id")
    public String userId;

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

    public HotelExceedApplyQueryRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
