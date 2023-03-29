// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainsBySourceRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The origin servers. Separate origin servers with commas (,). Fuzzy match is not supported.</p>
     */
    @NameInMap("Sources")
    public String sources;

    public static DescribeDomainsBySourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainsBySourceRequest self = new DescribeDomainsBySourceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainsBySourceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDomainsBySourceRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeDomainsBySourceRequest setSources(String sources) {
        this.sources = sources;
        return this;
    }
    public String getSources() {
        return this.sources;
    }

}
