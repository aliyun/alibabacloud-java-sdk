// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdateAuditRequestShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AuditRecord")
    public String auditRecordShrink;

    /**
     * <strong>example:</strong>
     * <p>unAudit</p>
     */
    @NameInMap("AuditResult")
    public String auditResult;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cams-8pi**urn5s</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>114624518**5956096</p>
     */
    @NameInMap("RequestNo")
    public String requestNo;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

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
