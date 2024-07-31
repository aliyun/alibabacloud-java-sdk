// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListMetaCollectionsRequest extends TeaModel {
    /**
     * <p>The ID of the collection administrator.</p>
     * 
     * <strong>example:</strong>
     * <p>1200759642363000</p>
     */
    @NameInMap("Administrator")
    public String administrator;

    /**
     * <ul>
     * <li>ALBUM: data album </li>
     * <li>ALBUM_CATEGORY: category in a data album</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALBUM</p>
     */
    @NameInMap("CollectionType")
    public String collectionType;

    /**
     * <p>The ID of the collection creator.</p>
     * 
     * <strong>example:</strong>
     * <p>1200759642363000</p>
     */
    @NameInMap("Creator")
    public String creator;

    /**
     * <p>The ID of the collection follower.</p>
     * 
     * <strong>example:</strong>
     * <p>1200759642363000</p>
     */
    @NameInMap("Follower")
    public String follower;

    /**
     * <p>The keyword.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The name of the sorting field.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The unique identifier of the parent collection.</p>
     * 
     * <strong>example:</strong>
     * <p>Album.1234</p>
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
