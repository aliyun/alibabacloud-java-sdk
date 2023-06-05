// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListMetaCollectionsRequest extends TeaModel {
    /**
     * <p>The ID of the collection follower.</p>
     */
    @NameInMap("Administrator")
    public String administrator;

    /**
     * <p>The ID of the collection creator.</p>
     */
    @NameInMap("CollectionType")
    public String collectionType;

    /**
     * <p>The ID of the collection administrator.</p>
     */
    @NameInMap("Creator")
    public String creator;

    /**
     * <p>The ID of the request. You can use the ID to query logs and troubleshoot issues.</p>
     */
    @NameInMap("Follower")
    public String follower;

    /**
     * <p>The name of the sorting field.</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The number of entries to return on each page. Default value: 10. Maximum value: 100.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>ALBUM: data album</p>
     * <br>
     * <p>ALBUM_CATEGORY: category in a data album</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The keyword.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The paging information. This parameter specifies the start point of the query.</p>
     */
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
