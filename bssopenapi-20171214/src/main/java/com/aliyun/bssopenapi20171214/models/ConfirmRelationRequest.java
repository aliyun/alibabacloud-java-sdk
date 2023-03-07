// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ConfirmRelationRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account that is used as the member.</p>
     */
    @NameInMap("ChildUserId")
    public Long childUserId;

    /**
     * <p>The operation to be performed to confirm the invitation. Valid values:</p>
     * <br>
     * <p>*   child_agree: The member accepts the invitation.</p>
     * <p>*   child_disagree: The member rejects the invitation.</p>
     * <p>*   Canceled by the master account: The management account cancels the confirmation.</p>
     */
    @NameInMap("ConfirmCode")
    public String confirmCode;

    /**
     * <p>The ID of the Alibaba Cloud account that is used as the management account.</p>
     */
    @NameInMap("ParentUserId")
    public Long parentUserId;

    /**
     * <p>The permissions that can be granted to the member. Valid values:</p>
     * <br>
     * <p>*   SYNCHRONIZE_FINANCE_IDENTITY: allows the credit control identity to be shared with the member.</p>
     * <p>*   SYNCHRONIZE_FINANCE_DISCOUNT_POLICY_TO_TARGET: allows the discount policy to be shared with the member.</p>
     * <p>*   FORBID_WITHDRAW_CASH: does not allow the member to withdraw the balance.</p>
     * <p>*   FORBID_MANAGE_INVOICE: does not allow the member to manage invoices.</p>
     * <p>*   CHECK_FINANCE_INFO: requests to view information about the financial relationship.</p>
     * <p>*   MANAGE_TARGET_INVOICE: allows the member to manage invoices.</p>
     * <p>*   CHECK_TARGET_CONSUMPTION: allows the member to view the bills.</p>
     */
    @NameInMap("PermissionCodes")
    public java.util.List<String> permissionCodes;

    /**
     * <p>The ID of the financial relationship. Set this parameter to the value of the RelationId response parameter returned by calling the QueryRelationList operation.</p>
     */
    @NameInMap("RelationId")
    public Long relationId;

    /**
     * <p>The type of the financial relationship. Set the value to enterprise_group.</p>
     */
    @NameInMap("RelationType")
    public String relationType;

    /**
     * <p>The unique ID of the request.</p>
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
