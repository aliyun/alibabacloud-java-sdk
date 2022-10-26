// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CancelRealTbAccountSupportRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    public static CancelRealTbAccountSupportRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelRealTbAccountSupportRequest self = new CancelRealTbAccountSupportRequest();
        return TeaModel.build(map, self);
    }

    public CancelRealTbAccountSupportRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
