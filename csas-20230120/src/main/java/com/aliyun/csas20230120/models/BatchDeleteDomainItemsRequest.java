// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class BatchDeleteDomainItemsRequest extends TeaModel {
    /**
     * <p>The IDs of domain name list entries.</p>
     */
    @NameInMap("ItemIds")
    public java.util.List<Long> itemIds;

    /**
     * <p>The list ID. This is the unique business identifier used for policy references and CRUD operations.</p>
     * 
     * <strong>example:</strong>
     * <p>ladl-61aae0c0ba715e3b</p>
     */
    @NameInMap("ListId")
    public String listId;

    /**
     * <p>The list type (Blacklist/Whitelist).</p>
     * 
     * <strong>example:</strong>
     * <p>la_domain_white_list</p>
     */
    @NameInMap("ListType")
    public String listType;

    public static BatchDeleteDomainItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteDomainItemsRequest self = new BatchDeleteDomainItemsRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteDomainItemsRequest setItemIds(java.util.List<Long> itemIds) {
        this.itemIds = itemIds;
        return this;
    }
    public java.util.List<Long> getItemIds() {
        return this.itemIds;
    }

    public BatchDeleteDomainItemsRequest setListId(String listId) {
        this.listId = listId;
        return this;
    }
    public String getListId() {
        return this.listId;
    }

    public BatchDeleteDomainItemsRequest setListType(String listType) {
        this.listType = listType;
        return this;
    }
    public String getListType() {
        return this.listType;
    }

}
