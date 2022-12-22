// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListMetaCollectionsRequest extends TeaModel {
    @NameInMap("Administrator")
    public String administrator;

    @NameInMap("CollectionType")
    public String collectionType;

    @NameInMap("Creator")
    public String creator;

    @NameInMap("Follower")
    public String follower;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ParentQualifiedName")
    public String parentQualifiedName;

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

    public ListMetaCollectionsRequest setCollectionType(String collectionType) {
        this.collectionType = collectionType;
        return this;
    }
    public String getCollectionType() {
        return this.collectionType;
    }

    public ListMetaCollectionsRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public ListMetaCollectionsRequest setFollower(String follower) {
        this.follower = follower;
        return this;
    }
    public String getFollower() {
        return this.follower;
    }

    public ListMetaCollectionsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListMetaCollectionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMetaCollectionsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListMetaCollectionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMetaCollectionsRequest setParentQualifiedName(String parentQualifiedName) {
        this.parentQualifiedName = parentQualifiedName;
        return this;
    }
    public String getParentQualifiedName() {
        return this.parentQualifiedName;
    }

}
