// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ModifyAccountRelationRequest extends TeaModel {
    /**
     * <p>The display name. This name is shown on the page to help you identify the use case of the account.</p>
     * 
     * <strong>example:</strong>
     * <p>用户昵称</p>
     */
    @NameInMap("ChildNick")
    public String childNick;

    /**
     * <p>The UID of the member account.</p>
     * 
     * <strong>example:</strong>
     * <p>1512996702208737</p>
     */
    @NameInMap("ChildUserId")
    public Long childUserId;

    /**
     * <p>The UID of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>1738376485192612</p>
     */
    @NameInMap("ParentUserId")
    public Long parentUserId;

    /**
     * <p>The permissions that can be modified. Valid values:</p>
     * <ul>
     * <li><p>SYNCHRONIZE_FINANCE_IDENTITY: Allow synchronizing the credit control identity with the linked account.</p>
     * </li>
     * <li><p>SYNCHRONIZE_FINANCE_DISCOUNT_POLICY_TO_TARGET: Allow synchronizing discounts with the linked account.</p>
     * </li>
     * <li><p>FORBID_WITHDRAW_CASH: Prohibit the linked account from withdrawing its balance.</p>
     * </li>
     * <li><p>FORBID_MANAGE_INVOICE: Prohibit the linked account from managing invoices.</p>
     * </li>
     * <li><p>CHECK_FINANCE_INFO: View information about the account linking relationship.</p>
     * </li>
     * <li><p>MANAGE_TARGET_INVOICE: Manage invoices for the linked account.</p>
     * </li>
     * <li><p>CHECK_TARGET_CONSUMPTION: View the consumption details of the linked account.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SYNCHRONIZE_FINANCE_IDENTITY</p>
     */
    @NameInMap("PermissionCodes")
    public java.util.List<String> permissionCodes;

    /**
     * <p>The relationship ID. Obtain this value from the relationId field returned by the QueryRelationList operation.</p>
     * 
     * <strong>example:</strong>
     * <p>51463</p>
     */
    @NameInMap("RelationId")
    public Long relationId;

    /**
     * <p>The action to perform. Valid values:</p>
     * <ul>
     * <li><p>ADD: Adds the permission.</p>
     * </li>
     * <li><p>DELETE: Deletes the permission.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ADD</p>
     */
    @NameInMap("RelationOperation")
    public String relationOperation;

    /**
     * <p>The relationship type. Currently, only enterprise_group is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>enterprise_group</p>
     */
    @NameInMap("RelationType")
    public String relationType;

    /**
     * <p>The unique ID of the request. This ID is used to mark a request and troubleshoot issues.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>request_id</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Modifying roles is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>trusteeship</p>
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
