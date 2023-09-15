// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainSpecialBizDetailRequest extends TeaModel {
    @NameInMap("BizId")
    public Long bizId;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static QueryDomainSpecialBizDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainSpecialBizDetailRequest self = new QueryDomainSpecialBizDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryDomainSpecialBizDetailRequest setBizId(Long bizId) {
        this.bizId = bizId;
        return this;
    }
    public Long getBizId() {
        return this.bizId;
    }

    public QueryDomainSpecialBizDetailRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
