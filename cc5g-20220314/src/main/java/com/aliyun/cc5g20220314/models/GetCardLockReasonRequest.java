// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class GetCardLockReasonRequest extends TeaModel {
    @NameInMap("Iccid")
    public String iccid;

    public static GetCardLockReasonRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCardLockReasonRequest self = new GetCardLockReasonRequest();
        return TeaModel.build(map, self);
    }

    public GetCardLockReasonRequest setIccid(String iccid) {
        this.iccid = iccid;
        return this;
    }
    public String getIccid() {
        return this.iccid;
    }

}
