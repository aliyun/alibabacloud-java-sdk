// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListDomainItemsRequest extends TeaModel {
    /**
     * <p>The page number of the current page in a paged query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The domain name value filter. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("ItemValue")
    public String itemValue;

    /**
     * <p>The list ID. This is a unique business identifier used for policy references and create, delete, and update operations.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ladl-6f1exxxxx6ab59</p>
     */
    @NameInMap("ListId")
    public String listId;

    /**
     * <p>The list type (Blacklist/Whitelist). Valid values:</p>
     * <ul>
     * <li>la_domain_white_list: domain name whitelist.</li>
     * <li>la_domain_black_list: domain name blacklist.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>la_domain_white_list</p>
     */
    @NameInMap("ListType")
    public String listType;

    /**
     * <p>The number of entries per page in a paged query. Valid values: 1 to 1000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListDomainItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDomainItemsRequest self = new ListDomainItemsRequest();
        return TeaModel.build(map, self);
    }

    public ListDomainItemsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListDomainItemsRequest setItemValue(String itemValue) {
        this.itemValue = itemValue;
        return this;
    }
    public String getItemValue() {
        return this.itemValue;
    }

    public ListDomainItemsRequest setListId(String listId) {
        this.listId = listId;
        return this;
    }
    public String getListId() {
        return this.listId;
    }

    public ListDomainItemsRequest setListType(String listType) {
        this.listType = listType;
        return this;
    }
    public String getListType() {
        return this.listType;
    }

    public ListDomainItemsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
