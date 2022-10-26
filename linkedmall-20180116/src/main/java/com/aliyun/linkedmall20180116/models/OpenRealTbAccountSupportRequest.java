// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class OpenRealTbAccountSupportRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    public static OpenRealTbAccountSupportRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenRealTbAccountSupportRequest self = new OpenRealTbAccountSupportRequest();
        return TeaModel.build(map, self);
    }

    public OpenRealTbAccountSupportRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
