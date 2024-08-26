// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainSpecialBizInfoByDomainRequest extends TeaModel {
    /**
     * <p>The business type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>govRegister</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>The domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test003.cn</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The IP address of the client.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
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
