// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchSetDcdnIpaDomainConfigsRequest extends TeaModel {
    /**
     * <p>The domain names accelerated by IPA. Separate multiple domain names with commas (,).</p>
     */
    @NameInMap("DomainNames")
    public String domainNames;

    /**
     * <p>The list of features. `[{"functionArgs":[{"argName":"parameter name","argValue":"parameter value"}],"functionName":"feature name"}]`</p>
     */
    @NameInMap("Functions")
    public String functions;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static BatchSetDcdnIpaDomainConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchSetDcdnIpaDomainConfigsRequest self = new BatchSetDcdnIpaDomainConfigsRequest();
        return TeaModel.build(map, self);
    }

    public BatchSetDcdnIpaDomainConfigsRequest setDomainNames(String domainNames) {
        this.domainNames = domainNames;
        return this;
    }
    public String getDomainNames() {
        return this.domainNames;
    }

    public BatchSetDcdnIpaDomainConfigsRequest setFunctions(String functions) {
        this.functions = functions;
        return this;
    }
    public String getFunctions() {
        return this.functions;
    }

    public BatchSetDcdnIpaDomainConfigsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public BatchSetDcdnIpaDomainConfigsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BatchSetDcdnIpaDomainConfigsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
