// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListMetaCollectionEntitiesRequest extends TeaModel {
    @NameInMap("CollectionQualifiedName")
    public String collectionQualifiedName;

    @NameInMap("EntityType")
    public String entityType;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("NextToken")
    public String nextToken;

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
