// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class BatchDeleteLiveDomainConfigsRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("DomainNames")
    @Validation(required = true)
    public String domainNames;

    @NameInMap("FunctionNames")
    @Validation(required = true)
    public String functionNames;

    public static BatchDeleteLiveDomainConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteLiveDomainConfigsRequest self = new BatchDeleteLiveDomainConfigsRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteLiveDomainConfigsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public BatchDeleteLiveDomainConfigsRequest setDomainNames(String domainNames) {
        this.domainNames = domainNames;
        return this;
    }
    public String getDomainNames() {
        return this.domainNames;
    }

    public BatchDeleteLiveDomainConfigsRequest setFunctionNames(String functionNames) {
        this.functionNames = functionNames;
        return this;
    }
    public String getFunctionNames() {
        return this.functionNames;
    }

}
