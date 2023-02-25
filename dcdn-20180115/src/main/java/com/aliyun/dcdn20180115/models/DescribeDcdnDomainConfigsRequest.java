// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainConfigsRequest extends TeaModel {
    /**
     * <p>The ID of the configuration.</p>
     */
    @NameInMap("ConfigId")
    public String configId;

    /**
     * <p>The accelerated domain name. You can specify only one domain name in each call.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The names of the features to query. Separate features with commas (,).</p>
     */
    @NameInMap("FunctionNames")
    public String functionNames;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeDcdnDomainConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainConfigsRequest self = new DescribeDcdnDomainConfigsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainConfigsRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public DescribeDcdnDomainConfigsRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainConfigsRequest setFunctionNames(String functionNames) {
        this.functionNames = functionNames;
        return this;
    }
    public String getFunctionNames() {
        return this.functionNames;
    }

    public DescribeDcdnDomainConfigsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDcdnDomainConfigsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
