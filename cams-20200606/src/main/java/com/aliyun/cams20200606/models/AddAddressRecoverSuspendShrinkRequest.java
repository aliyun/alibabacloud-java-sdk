// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class AddAddressRecoverSuspendShrinkRequest extends TeaModel {
    @NameInMap("AuditRecord")
    public String auditRecordShrink;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("RequestType")
    public String requestType;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static AddAddressRecoverSuspendShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAddressRecoverSuspendShrinkRequest self = new AddAddressRecoverSuspendShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddAddressRecoverSuspendShrinkRequest setAuditRecordShrink(String auditRecordShrink) {
        this.auditRecordShrink = auditRecordShrink;
        return this;
    }
    public String getAuditRecordShrink() {
        return this.auditRecordShrink;
    }

    public AddAddressRecoverSuspendShrinkRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public AddAddressRecoverSuspendShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddAddressRecoverSuspendShrinkRequest setRequestType(String requestType) {
        this.requestType = requestType;
        return this;
    }
    public String getRequestType() {
        return this.requestType;
    }

    public AddAddressRecoverSuspendShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddAddressRecoverSuspendShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
