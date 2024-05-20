// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DescDomainRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainId")
    public Integer domainId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RequireRealTimeDnsRecords")
    public Boolean requireRealTimeDnsRecords;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        DescDomainRequest self = new DescDomainRequest();
        return TeaModel.build(map, self);
    }

    public DescDomainRequest setDomainId(Integer domainId) {
        this.domainId = domainId;
        return this;
    }
    public Integer getDomainId() {
        return this.domainId;
    }

    public DescDomainRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescDomainRequest setRequireRealTimeDnsRecords(Boolean requireRealTimeDnsRecords) {
        this.requireRealTimeDnsRecords = requireRealTimeDnsRecords;
        return this;
    }
    public Boolean getRequireRealTimeDnsRecords() {
        return this.requireRealTimeDnsRecords;
    }

    public DescDomainRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescDomainRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
