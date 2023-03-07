// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ModifyAccountRelationRequest extends TeaModel {
    /**
     * <p>The display name of the member. This helps clarify the scenario in which the account is used.</p>
     */
    @NameInMap("ChildNick")
    public String childNick;

    /**
     * <p>The ID of the Alibaba Cloud account that is used as the member.</p>
     */
    @NameInMap("ChildUserId")
    public Long childUserId;

    /**
     * <p>The ID of the Alibaba Cloud account that is used as the management account.</p>
     */
    @NameInMap("ParentUserId")
    public Long parentUserId;

    /**
     * <p>The permissions that can be modified. Valid values:</p>
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
     * <p>The ID of the financial relationship. Set this parameter to the value of the relationId response parameter returned by calling the QueryRelationList operation.</p>
     */
    @NameInMap("RelationId")
    public Long relationId;

    /**
     * <p>The operation to be performed. Valid values:</p>
     * <br>
     * <p>*   ADD</p>
     * <p>*   DELETE</p>
     */
    @NameInMap("RelationOperation")
    public String relationOperation;

    /**
     * <p>The type of the financial relationship. Set the value to enterprise_group.</p>
     */
    @NameInMap("RelationType")
    public String relationType;

    /**
     * <p>The unique ID of the request. The ID is used to mark a request and troubleshoot a problem.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The roles that can be assigned to the member. You cannot modify the roles.</p>
     */
    @NameInMap("RoleCodes")
    public java.util.List<String> roleCodes;

    public static ModifyAccountRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountRelationRequest self = new ModifyAccountRelationRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAccountRelationRequest setChildNick(String childNick) {
        this.childNick = childNick;
        return this;
    }
    public String getChildNick() {
        return this.childNick;
    }

    public ModifyAccountRelationRequest setChildUserId(Long childUserId) {
        this.childUserId = childUserId;
        return this;
    }
    public Long getChildUserId() {
        return this.childUserId;
    }

    public ModifyAccountRelationRequest setParentUserId(Long parentUserId) {
        this.parentUserId = parentUserId;
        return this;
    }
    public Long getParentUserId() {
        return this.parentUserId;
    }

    public ModifyAccountRelationRequest setPermissionCodes(java.util.List<String> permissionCodes) {
        this.permissionCodes = permissionCodes;
        return this;
    }
    public java.util.List<String> getPermissionCodes() {
        return this.permissionCodes;
    }

    public ModifyAccountRelationRequest setRelationId(Long relationId) {
        this.relationId = relationId;
        return this;
    }
    public Long getRelationId() {
        return this.relationId;
    }

    public ModifyAccountRelationRequest setRelationOperation(String relationOperation) {
        this.relationOperation = relationOperation;
        return this;
    }
    public String getRelationOperation() {
        return this.relationOperation;
    }

    public ModifyAccountRelationRequest setRelationType(String relationType) {
        this.relationType = relationType;
        return this;
    }
    public String getRelationType() {
        return this.relationType;
    }

    public ModifyAccountRelationRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyAccountRelationRequest setRoleCodes(java.util.List<String> roleCodes) {
        this.roleCodes = roleCodes;
        return this;
    }
    public java.util.List<String> getRoleCodes() {
        return this.roleCodes;
    }

}
