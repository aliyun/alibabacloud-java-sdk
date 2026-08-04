// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListForwardStrategyBindingItemsRequest extends TeaModel {
    /**
     * <p>The forwarding rule ID.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ForwardIds")
    public java.util.List<String> forwardIds;

    /**
     * <p>The binding item type. Valid values:</p>
     * <ul>
     * <li><strong>Application</strong>: internal-facing application</li>
     * <li><strong>UserGroup</strong>: user group.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Application</p>
     */
    @NameInMap("ItemType")
    public String itemType;

    public static ListForwardStrategyBindingItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListForwardStrategyBindingItemsRequest self = new ListForwardStrategyBindingItemsRequest();
        return TeaModel.build(map, self);
    }

    public ListForwardStrategyBindingItemsRequest setForwardIds(java.util.List<String> forwardIds) {
        this.forwardIds = forwardIds;
        return this;
    }
    public java.util.List<String> getForwardIds() {
        return this.forwardIds;
    }

    public ListForwardStrategyBindingItemsRequest setItemType(String itemType) {
        this.itemType = itemType;
        return this;
    }
    public String getItemType() {
        return this.itemType;
    }

}
