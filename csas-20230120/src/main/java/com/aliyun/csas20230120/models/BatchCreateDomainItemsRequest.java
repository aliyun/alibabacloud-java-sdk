// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class BatchCreateDomainItemsRequest extends TeaModel {
    /**
     * <p>The domain name list.</p>
     */
    @NameInMap("DomainItems")
    public java.util.List<String> domainItems;

    /**
     * <p>The list ID. This is a unique business identifier used for policy references and add, delete, and modify operations.</p>
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

    public static BatchCreateDomainItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateDomainItemsRequest self = new BatchCreateDomainItemsRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateDomainItemsRequest setDomainItems(java.util.List<String> domainItems) {
        this.domainItems = domainItems;
        return this;
    }
    public java.util.List<String> getDomainItems() {
        return this.domainItems;
    }

    public BatchCreateDomainItemsRequest setListId(String listId) {
        this.listId = listId;
        return this;
    }
    public String getListId() {
        return this.listId;
    }

    public BatchCreateDomainItemsRequest setListType(String listType) {
        this.listType = listType;
        return this;
    }
    public String getListType() {
        return this.listType;
    }

}
