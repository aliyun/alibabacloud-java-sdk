// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetCreditInfoRequest extends TeaModel {
    /**
     * <p>Sub Account UID</p>
     */
    @NameInMap("Uid")
    public Long uid;

    public static GetCreditInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCreditInfoRequest self = new GetCreditInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetCreditInfoRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}
