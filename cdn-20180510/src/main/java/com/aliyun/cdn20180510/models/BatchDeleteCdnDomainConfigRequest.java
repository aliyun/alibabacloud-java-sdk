// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class BatchDeleteCdnDomainConfigRequest extends TeaModel {
    /**
     * <p>The accelerated domain names whose configurations you want to delete. Separate accelerated domain names with commas (,).</p>
     */
    @NameInMap("DomainNames")
    public String domainNames;

    /**
     * <p>The names of the features that you want to manage. Separate feature names with commas (,).</p>
     */
    @NameInMap("FunctionNames")
    public String functionNames;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static BatchDeleteCdnDomainConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteCdnDomainConfigRequest self = new BatchDeleteCdnDomainConfigRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteCdnDomainConfigRequest setDomainNames(String domainNames) {
        this.domainNames = domainNames;
        return this;
    }
    public String getDomainNames() {
        return this.domainNames;
    }

    public BatchDeleteCdnDomainConfigRequest setFunctionNames(String functionNames) {
        this.functionNames = functionNames;
        return this;
    }
    public String getFunctionNames() {
        return this.functionNames;
    }

    public BatchDeleteCdnDomainConfigRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public BatchDeleteCdnDomainConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BatchDeleteCdnDomainConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
