// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdateAuditRequestShrinkRequest extends TeaModel {
    /**
     * <p>Viber audit items.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AuditRecord")
    public String auditRecordShrink;

    /**
     * <p>The audit result.</p>
     * 
     * <strong>example:</strong>
     * <p>unAudit</p>
     */
    @NameInMap("AuditResult")
    public String auditResult;

    /**
     * <p>The Space ID of the ISV sub-customer or the instance ID. View it on the <a href="https://chatapp.console.aliyun.com/ChannelsManagement">Channel Management</a> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cams-8pi**urn5s</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <strong>example:</strong>
     * <p>1500111740532860</p>
     */
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The request number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>114624518**5956096</p>
     */
    @NameInMap("RequestNo")
    public String requestNo;

    /**
     * <strong>example:</strong>
     * <p><a href="mailto:user1@example.com">user1@example.com</a>&quot;</p>
     */
    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <strong>example:</strong>
     * <p>1577495724967111</p>
     */
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static UpdateAuditRequestShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuditRequestShrinkRequest self = new UpdateAuditRequestShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAuditRequestShrinkRequest setAuditRecordShrink(String auditRecordShrink) {
        this.auditRecordShrink = auditRecordShrink;
        return this;
    }
    public String getAuditRecordShrink() {
        return this.auditRecordShrink;
    }

    public UpdateAuditRequestShrinkRequest setAuditResult(String auditResult) {
        this.auditResult = auditResult;
        return this;
    }
    public String getAuditResult() {
        return this.auditResult;
    }

    public UpdateAuditRequestShrinkRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public UpdateAuditRequestShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateAuditRequestShrinkRequest setRequestNo(String requestNo) {
        this.requestNo = requestNo;
        return this;
    }
    public String getRequestNo() {
        return this.requestNo;
    }

    public UpdateAuditRequestShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateAuditRequestShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
