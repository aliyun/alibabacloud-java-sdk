// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class DomainSpecialBizCancelRequest extends TeaModel {
    @NameInMap("BizId")
    public Long bizId;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static DomainSpecialBizCancelRequest build(java.util.Map<String, ?> map) throws Exception {
        DomainSpecialBizCancelRequest self = new DomainSpecialBizCancelRequest();
        return TeaModel.build(map, self);
    }

    public DomainSpecialBizCancelRequest setBizId(Long bizId) {
        this.bizId = bizId;
        return this;
    }
    public Long getBizId() {
        return this.bizId;
    }

    public DomainSpecialBizCancelRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
