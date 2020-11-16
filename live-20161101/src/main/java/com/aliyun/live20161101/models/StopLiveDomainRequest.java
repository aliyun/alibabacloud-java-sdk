// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StopLiveDomainRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    public static StopLiveDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        StopLiveDomainRequest self = new StopLiveDomainRequest();
        return TeaModel.build(map, self);
    }

    public StopLiveDomainRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public StopLiveDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
