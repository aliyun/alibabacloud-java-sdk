// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListMetaCollectionsRequest extends TeaModel {
    /**
     * <p>The administrator ID. Valid only for album types. Default: The current user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("Administrator")
    public String administrator;

    /**
     * <p>The creator user ID. Valid only for album types. Default: The current user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("CreateUser")
    public String createUser;

    /**
     * <p>The collection description. Supports fuzzy matching.</p>
     * 
     * <strong>example:</strong>
     * <p>Test collection</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The collection name. Supports fuzzy matching.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li><p>Asc (default): Ascending order</p>
     * </li>
     * <li><p>Desc</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Asc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. Default: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default: 10. Maximum: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the parent collection.</p>
     * 
     * <strong>example:</strong>
     * <p>as78d756asd</p>
     */
    @NameInMap("ParentId")
    public String parentId;

    /**
     * <p>The sort field. Valid values:</p>
     * <ul>
     * <li><p>Id (default)</p>
     * </li>
     * <li><p>Name</p>
     * </li>
     * <li><p>CreateUser: Creator ID</p>
     * </li>
     * <li><p>CreateTime: Creation time</p>
     * </li>
     * <li><p>ModifyTime: Modification time</p>
     * </li>
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
     * <li><p>Category</p>
     * </li>
     * <li><p>Album</p>
     * </li>
     * <li><p>AlbumCategory: Album subcategory</p>
     * </li>
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
