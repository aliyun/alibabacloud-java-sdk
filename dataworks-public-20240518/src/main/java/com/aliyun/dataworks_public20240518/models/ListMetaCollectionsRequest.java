// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListMetaCollectionsRequest extends TeaModel {
    /**
     * <p>The ID of the collection administrator. This parameter is valid only for the album type. Default value: the current user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("Administrator")
    public String administrator;

    /**
     * <p>The user ID of the creator. This parameter is valid only for the album type. Default value: the current user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("CreateUser")
    public String createUser;

    /**
     * <p>The collection description. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Test collection</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The collection name. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Data Asset Subject Domain</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The sort direction. Valid values:</p>
     * <ul>
     * <li>Asc (default)</li>
     * <li>Desc</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Asc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the parent node collection object.</p>
     * 
     * <strong>example:</strong>
     * <p>as78d756asd</p>
     */
    @NameInMap("ParentId")
    public String parentId;

    /**
     * <p>The sort field. Valid values:</p>
     * <ul>
     * <li>Id (default)</li>
     * <li>Name: name.</li>
     * <li>CreateUser: creator ID.</li>
     * <li>CreateTime: creation time.</li>
     * <li>ModifyTime: modification time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Name</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The collection type. Valid values:</p>
     * <ul>
     * <li>Category: category.</li>
     * <li>Album: data album.</li>
     * <li>AlbumCategory: album subcategory.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Category</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListMetaCollectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMetaCollectionsRequest self = new ListMetaCollectionsRequest();
        return TeaModel.build(map, self);
    }

    public ListMetaCollectionsRequest setAdministrator(String administrator) {
        this.administrator = administrator;
        return this;
    }
    public String getAdministrator() {
        return this.administrator;
    }

    public ListMetaCollectionsRequest setCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }
    public String getCreateUser() {
        return this.createUser;
    }

    public ListMetaCollectionsRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ListMetaCollectionsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListMetaCollectionsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListMetaCollectionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMetaCollectionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMetaCollectionsRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public ListMetaCollectionsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListMetaCollectionsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
