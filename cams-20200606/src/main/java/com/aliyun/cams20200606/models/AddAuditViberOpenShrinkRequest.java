// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class AddAuditViberOpenShrinkRequest extends TeaModel {
    @NameInMap("AuditRecord")
    public String auditRecordShrink;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("AuditResult")
    public String auditResult;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static AddAuditViberOpenShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAuditViberOpenShrinkRequest self = new AddAuditViberOpenShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddAuditViberOpenShrinkRequest setAuditRecordShrink(String auditRecordShrink) {
        this.auditRecordShrink = auditRecordShrink;
        return this;
    }
    public String getAuditRecordShrink() {
        return this.auditRecordShrink;
    }

    public AddAuditViberOpenShrinkRequest setAuditResult(String auditResult) {
        this.auditResult = auditResult;
        return this;
    }
    public String getAuditResult() {
        return this.auditResult;
    }

    public AddAuditViberOpenShrinkRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public AddAuditViberOpenShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddAuditViberOpenShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddAuditViberOpenShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
