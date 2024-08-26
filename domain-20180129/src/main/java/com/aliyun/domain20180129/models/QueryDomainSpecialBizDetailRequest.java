// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainSpecialBizDetailRequest extends TeaModel {
    /**
     * <p>The business ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("BizId")
    public Long bizId;

    /**
     * <p>The IP address of the client.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
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
