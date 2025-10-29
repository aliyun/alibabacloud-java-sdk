// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListEntitiesInMetaCollectionRequest extends TeaModel {
    /**
     * <p>The description specified when the entity was added to the collection. Supports fuzzy matching. Valid only for the album type.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("EntityDescription")
    public String entityDescription;

    /**
     * <p>The entity name. Supports fuzzy matching.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("EntityName")
    public String entityName;

    /**
     * <p>The entity type.</p>
     * 
     * <strong>example:</strong>
     * <p>dlf-table</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>The collection ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>category.123</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li>Asc (default): ascending order.</li>
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
     * <p>The number of records per page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The sort field. Valid values:</p>
     * <ul>
     * <li>Name (default)</li>
     * <li>CreateTime</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Name</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    public static ListEntitiesInMetaCollectionRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEntitiesInMetaCollectionRequest self = new ListEntitiesInMetaCollectionRequest();
        return TeaModel.build(map, self);
    }

    public ListEntitiesInMetaCollectionRequest setEntityDescription(String entityDescription) {
        this.entityDescription = entityDescription;
        return this;
    }
    public String getEntityDescription() {
        return this.entityDescription;
    }

    public ListEntitiesInMetaCollectionRequest setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
    public String getEntityName() {
        return this.entityName;
    }

    public ListEntitiesInMetaCollectionRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public ListEntitiesInMetaCollectionRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ListEntitiesInMetaCollectionRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListEntitiesInMetaCollectionRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListEntitiesInMetaCollectionRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEntitiesInMetaCollectionRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
