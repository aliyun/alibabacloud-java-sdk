// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class BatchDeleteLiveDomainConfigsRequest extends TeaModel {
    /**
     * <p>The ingest domain or streaming domain. Separate multiple domain names with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo.aliyundoc.com,example.aliyundoc.com,example.com</p>
     */
    @NameInMap("DomainNames")
    public String domainNames;

    /**
     * <p>The names of the features. Separate multiple features with commas (,). For more information, see <strong>Features specified by the Functions parameter</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>referer_white_list_set,ip_black_list_set</p>
     */
    @NameInMap("FunctionNames")
    public String functionNames;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static BatchDeleteLiveDomainConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteLiveDomainConfigsRequest self = new BatchDeleteLiveDomainConfigsRequest();
        return TeaModel.build(map, self);
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

    public BatchDeleteLiveDomainConfigsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public BatchDeleteLiveDomainConfigsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BatchDeleteLiveDomainConfigsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
