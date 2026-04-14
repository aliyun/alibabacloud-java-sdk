// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DescDomainRequest extends TeaModel {
    /**
     * <p>Domain ID. Can be obtained through QueryDomainByParam.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>13464</p>
     */
    @NameInMap("DomainId")
    public Integer domainId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Determines whether to perform real-time DNS resolution</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
