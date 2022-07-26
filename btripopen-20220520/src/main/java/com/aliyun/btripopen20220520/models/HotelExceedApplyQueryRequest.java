// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelExceedApplyQueryRequest extends TeaModel {
    @NameInMap("apply_id")
    public Long applyId;

    @NameInMap("corp_id")
    public String corpId;

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

    public HotelExceedApplyQueryRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public HotelExceedApplyQueryRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
