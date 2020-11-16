// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class BatchSetLiveDomainConfigsRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("DomainNames")
    @Validation(required = true)
    public String domainNames;

    @NameInMap("Functions")
    @Validation(required = true)
    public String functions;

    public static BatchSetLiveDomainConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchSetLiveDomainConfigsRequest self = new BatchSetLiveDomainConfigsRequest();
        return TeaModel.build(map, self);
    }

    public BatchSetLiveDomainConfigsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public BatchSetLiveDomainConfigsRequest setDomainNames(String domainNames) {
        this.domainNames = domainNames;
        return this;
    }
    public String getDomainNames() {
        return this.domainNames;
    }

    public BatchSetLiveDomainConfigsRequest setFunctions(String functions) {
        this.functions = functions;
        return this;
    }
    public String getFunctions() {
        return this.functions;
    }

}
