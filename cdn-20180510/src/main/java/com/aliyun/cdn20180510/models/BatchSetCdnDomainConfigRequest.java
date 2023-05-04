// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class BatchSetCdnDomainConfigRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("DomainNames")
    public String domainNames;

    /**
     * <p>The list of domain configurations.</p>
     */
    @NameInMap("Functions")
    public String functions;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static BatchSetCdnDomainConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchSetCdnDomainConfigRequest self = new BatchSetCdnDomainConfigRequest();
        return TeaModel.build(map, self);
    }

    public BatchSetCdnDomainConfigRequest setDomainNames(String domainNames) {
        this.domainNames = domainNames;
        return this;
    }
    public String getDomainNames() {
        return this.domainNames;
    }

    public BatchSetCdnDomainConfigRequest setFunctions(String functions) {
        this.functions = functions;
        return this;
    }
    public String getFunctions() {
        return this.functions;
    }

    public BatchSetCdnDomainConfigRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public BatchSetCdnDomainConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BatchSetCdnDomainConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
