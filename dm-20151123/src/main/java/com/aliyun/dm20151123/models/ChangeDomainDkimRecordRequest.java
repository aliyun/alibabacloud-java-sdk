// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ChangeDomainDkimRecordRequest extends TeaModel {
    @NameInMap("DkimRsaLength")
    public Integer dkimRsaLength;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ChangeDomainDkimRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeDomainDkimRecordRequest self = new ChangeDomainDkimRecordRequest();
        return TeaModel.build(map, self);
    }

    public ChangeDomainDkimRecordRequest setDkimRsaLength(Integer dkimRsaLength) {
        this.dkimRsaLength = dkimRsaLength;
        return this;
    }
    public Integer getDkimRsaLength() {
        return this.dkimRsaLength;
    }

    public ChangeDomainDkimRecordRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ChangeDomainDkimRecordRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ChangeDomainDkimRecordRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ChangeDomainDkimRecordRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
