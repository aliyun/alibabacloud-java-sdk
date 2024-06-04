// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListMetaCollectionEntitiesRequest extends TeaModel {
    /**
     * <p>The unique identifier of the collection.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CollectionQualifiedName")
    public String collectionQualifiedName;

    /**
     * <p>The type of the entities.</p>
     * <br>
     * <p>For example, if this parameter is set to maxcompute-table, the entity is a MaxCompute table.</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>The search keyword.</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The paging information. This parameter specifies the start point of the query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListMetaCollectionEntitiesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMetaCollectionEntitiesRequest self = new ListMetaCollectionEntitiesRequest();
        return TeaModel.build(map, self);
    }

    public ListMetaCollectionEntitiesRequest setCollectionQualifiedName(String collectionQualifiedName) {
        this.collectionQualifiedName = collectionQualifiedName;
        return this;
    }
    public String getCollectionQualifiedName() {
        return this.collectionQualifiedName;
    }

    public ListMetaCollectionEntitiesRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public ListMetaCollectionEntitiesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListMetaCollectionEntitiesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMetaCollectionEntitiesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
