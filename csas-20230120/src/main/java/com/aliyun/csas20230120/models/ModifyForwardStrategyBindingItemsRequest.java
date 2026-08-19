// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ModifyForwardStrategyBindingItemsRequest extends TeaModel {
    /**
     * <p>The forwarding rule ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fs-849ac29396d9ea98</p>
     */
    @NameInMap("ForwardId")
    public String forwardId;

    /**
     * <p>The list of binding item IDs. Must be empty when MatchMode is <strong>UserGroupAll</strong> or <strong>ApplicationAll</strong>. Required for other values. Duplicates are not allowed in the list, and the specified objects must already exist.</p>
     */
    @NameInMap("ItemIds")
    public java.util.List<String> itemIds;

    /**
     * <p>The policy matching target type. Required. Valid values:</p>
     * <ul>
     * <li><strong>UserGroupAll</strong>: associates with all users.</li>
     * <li><strong>UserGroupNormal</strong>: associates with specific user groups.</li>
     * <li><strong>ApplicationAll</strong>: all private network applications.</li>
     * <li><strong>Application</strong>: specific private network applications.</li>
     * <li><strong>Tag</strong>: private network application tags.</li>
     * </ul>
     * <p>When the value is <strong>UserGroupAll</strong> or <strong>ApplicationAll</strong>, ItemIds must be empty. When the value is <strong>UserGroupNormal</strong>, <strong>Application</strong>, or <strong>Tag</strong>, ItemIds is required.</p>
     * <p>When ModifyType is not <strong>Cover</strong>, switching the matching target type is not allowed: <strong>Application</strong>, <strong>Tag</strong>, and <strong>ApplicationAll</strong> are mutually exclusive, and <strong>UserGroupNormal</strong> and <strong>UserGroupAll</strong> are mutually exclusive. If a binding item of a mutually exclusive type already exists on the same forwarding rule, the request is rejected.</p>
     * 
     * <strong>example:</strong>
     * <p>Application</p>
     */
    @NameInMap("MatchMode")
    public String matchMode;

    /**
     * <p>The modification method. Required. Valid values:</p>
     * <ul>
     * <li><strong>Append</strong>: appends to existing binding items. ItemIds cannot contain objects that are already bound.</li>
     * <li><strong>Delete</strong>: deletes specified binding items. All objects in ItemIds must be already bound.</li>
     * <li><strong>Cover</strong>: overwrites binding items of the same category by clearing all existing binding items of the same category on the forwarding rule and then writing ItemIds. The same category refers to <strong>ApplicationAll</strong>, <strong>Application</strong>, and <strong>Tag</strong>, or <strong>UserGroupAll</strong> and <strong>UserGroupNormal</strong>.</li>
     * </ul>
     * <p>When the value is <strong>Append</strong> or <strong>Delete</strong>, MatchMode cannot be <strong>UserGroupAll</strong> or <strong>ApplicationAll</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>Cover</p>
     */
    @NameInMap("ModifyType")
    public String modifyType;

    public static ModifyForwardStrategyBindingItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyForwardStrategyBindingItemsRequest self = new ModifyForwardStrategyBindingItemsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyForwardStrategyBindingItemsRequest setForwardId(String forwardId) {
        this.forwardId = forwardId;
        return this;
    }
    public String getForwardId() {
        return this.forwardId;
    }

    public ModifyForwardStrategyBindingItemsRequest setItemIds(java.util.List<String> itemIds) {
        this.itemIds = itemIds;
        return this;
    }
    public java.util.List<String> getItemIds() {
        return this.itemIds;
    }

    public ModifyForwardStrategyBindingItemsRequest setMatchMode(String matchMode) {
        this.matchMode = matchMode;
        return this;
    }
    public String getMatchMode() {
        return this.matchMode;
    }

    public ModifyForwardStrategyBindingItemsRequest setModifyType(String modifyType) {
        this.modifyType = modifyType;
        return this;
    }
    public String getModifyType() {
        return this.modifyType;
    }

}
