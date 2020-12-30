// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class UpdateDomainTrackNameRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("DomainId")
    public Integer domainId;

    @NameInMap("CnameTrackRecord")
    public String cnameTrackRecord;

    public static UpdateDomainTrackNameRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainTrackNameRequest self = new UpdateDomainTrackNameRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDomainTrackNameRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateDomainTrackNameRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateDomainTrackNameRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateDomainTrackNameRequest setDomainId(Integer domainId) {
        this.domainId = domainId;
        return this;
    }
    public Integer getDomainId() {
        return this.domainId;
    }

    public UpdateDomainTrackNameRequest setCnameTrackRecord(String cnameTrackRecord) {
        this.cnameTrackRecord = cnameTrackRecord;
        return this;
    }
    public String getCnameTrackRecord() {
        return this.cnameTrackRecord;
    }

}
