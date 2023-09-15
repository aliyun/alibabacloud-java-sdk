// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainSpecialBizInfoByDomainRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static QueryDomainSpecialBizInfoByDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainSpecialBizInfoByDomainRequest self = new QueryDomainSpecialBizInfoByDomainRequest();
        return TeaModel.build(map, self);
    }

    public QueryDomainSpecialBizInfoByDomainRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QueryDomainSpecialBizInfoByDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public QueryDomainSpecialBizInfoByDomainRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
