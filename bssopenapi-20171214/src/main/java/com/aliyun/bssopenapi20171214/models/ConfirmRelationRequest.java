// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ConfirmRelationRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud UID of the linked account.</p>
     * 
     * <strong>example:</strong>
     * <p>1512996702208737</p>
     */
    @NameInMap("ChildUserId")
    public Long childUserId;

    /**
     * <p>The confirmation action. Valid values:</p>
     * <ul>
     * <li>child_agree: The linked account agrees.</li>
     * <li>child_disagree: The linked account rejects.</li>
     * <li>主账号取消确认: The main account cancels the confirmation.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>child_agree</p>
     */
    @NameInMap("ConfirmCode")
    public String confirmCode;

    /**
     * <p>The Alibaba Cloud UID of the main account.</p>
     * 
     * <strong>example:</strong>
     * <p>1738376485192612</p>
     */
    @NameInMap("ParentUserId")
    public Long parentUserId;

    /**
     * <p>The permissions granted to the linked account. Valid values:</p>
     * <ul>
     * <li>SYNCHRONIZE_FINANCE_IDENTITY: Allows synchronizing the credit-based payment identity to the linked account.</li>
     * <li>SYNCHRONIZE_FINANCE_DISCOUNT_POLICY_TO_TARGET: Allows synchronizing discounts to the linked account.</li>
     * <li>FORBID_WITHDRAW_CASH: Prohibits the linked account from withdrawing cash from the balance.</li>
     * <li>FORBID_MANAGE_INVOICE: Prohibits the linked account from managing invoices.</li>
     * <li>CHECK_FINANCE_INFO: Allows requesting to view the account linking information.</li>
     * <li>MANAGE_TARGET_INVOICE: Allows managing invoices of the target account.</li>
     * <li>CHECK_TARGET_CONSUMPTION: Allows viewing the consumption information of the linked account.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SYNCHRONIZE_FINANCE_IDENTITY</p>
     */
    @NameInMap("PermissionCodes")
    public java.util.List<String> permissionCodes;

    /**
     * <p>The relationship ID. You can obtain the value from the relationId field in the response of the QueryRelationList operation.</p>
     * 
     * <strong>example:</strong>
     * <p>51463</p>
     */
    @NameInMap("RelationId")
    public Long relationId;

    /**
     * <p>The relationship type. Valid values: enterprise_group.</p>
     * 
     * <strong>example:</strong>
     * <p>enterprise_group</p>
     */
    @NameInMap("RelationType")
    public String relationType;

    /**
     * <p>The unique identifier of the request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>request_id</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ConfirmRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmRelationRequest self = new ConfirmRelationRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmRelationRequest setChildUserId(Long childUserId) {
        this.childUserId = childUserId;
        return this;
    }
    public Long getChildUserId() {
        return this.childUserId;
    }

    public ConfirmRelationRequest setConfirmCode(String confirmCode) {
        this.confirmCode = confirmCode;
        return this;
    }
    public String getConfirmCode() {
        return this.confirmCode;
    }

    public ConfirmRelationRequest setParentUserId(Long parentUserId) {
        this.parentUserId = parentUserId;
        return this;
    }
    public Long getParentUserId() {
        return this.parentUserId;
    }

    public ConfirmRelationRequest setPermissionCodes(java.util.List<String> permissionCodes) {
        this.permissionCodes = permissionCodes;
        return this;
    }
    public java.util.List<String> getPermissionCodes() {
        return this.permissionCodes;
    }

    public ConfirmRelationRequest setRelationId(Long relationId) {
        this.relationId = relationId;
        return this;
    }
    public Long getRelationId() {
        return this.relationId;
    }

    public ConfirmRelationRequest setRelationType(String relationType) {
        this.relationType = relationType;
        return this;
    }
    public String getRelationType() {
        return this.relationType;
    }

    public ConfirmRelationRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
