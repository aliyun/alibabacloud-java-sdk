// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RegistAnonymousTbAccountRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    public static RegistAnonymousTbAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        RegistAnonymousTbAccountRequest self = new RegistAnonymousTbAccountRequest();
        return TeaModel.build(map, self);
    }

    public RegistAnonymousTbAccountRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public RegistAnonymousTbAccountRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

}
