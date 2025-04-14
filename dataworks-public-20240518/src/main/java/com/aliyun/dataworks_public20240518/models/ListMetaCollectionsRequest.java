// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListMetaCollectionsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("Administrator")
    public String administrator;

    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("CreateUser")
    public String createUser;

    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>Asc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>category.123</p>
     */
    @NameInMap("ParentId")
    public String parentId;

    /**
     * <strong>example:</strong>
     * <p>Name</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
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
