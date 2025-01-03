// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListChangeRequestsShrinkRequest extends TeaModel {
    @NameInMap("appNameList")
    public String appNameListShrink;

    /**
     * <strong>example:</strong>
     * <p>change1</p>
     */
    @NameInMap("displayNameKeyword")
    public String displayNameKeyword;

    /**
     * <strong>example:</strong>
     * <p>4dc150725770510122396e2476</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>id</p>
     */
    @NameInMap("orderBy")
    public String orderBy;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>66c0c9fffeb86b450c199fcd</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    @NameInMap("ownerIdList")
    public String ownerIdListShrink;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <strong>example:</strong>
     * <p>keyset</p>
     */
    @NameInMap("pagination")
    public String pagination;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("perPage")
    public Integer perPage;

    /**
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("sort")
    public String sort;

    @NameInMap("stateList")
    public String stateListShrink;

    public static ListChangeRequestsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListChangeRequestsShrinkRequest self = new ListChangeRequestsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListChangeRequestsShrinkRequest setAppNameListShrink(String appNameListShrink) {
        this.appNameListShrink = appNameListShrink;
        return this;
    }
    public String getAppNameListShrink() {
        return this.appNameListShrink;
    }

    public ListChangeRequestsShrinkRequest setDisplayNameKeyword(String displayNameKeyword) {
        this.displayNameKeyword = displayNameKeyword;
        return this;
    }
    public String getDisplayNameKeyword() {
        return this.displayNameKeyword;
    }

    public ListChangeRequestsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListChangeRequestsShrinkRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListChangeRequestsShrinkRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public ListChangeRequestsShrinkRequest setOwnerIdListShrink(String ownerIdListShrink) {
        this.ownerIdListShrink = ownerIdListShrink;
        return this;
    }
    public String getOwnerIdListShrink() {
        return this.ownerIdListShrink;
    }

    public ListChangeRequestsShrinkRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListChangeRequestsShrinkRequest setPagination(String pagination) {
        this.pagination = pagination;
        return this;
    }
    public String getPagination() {
        return this.pagination;
    }

    public ListChangeRequestsShrinkRequest setPerPage(Integer perPage) {
        this.perPage = perPage;
        return this;
    }
    public Integer getPerPage() {
        return this.perPage;
    }

    public ListChangeRequestsShrinkRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public ListChangeRequestsShrinkRequest setStateListShrink(String stateListShrink) {
        this.stateListShrink = stateListShrink;
        return this;
    }
    public String getStateListShrink() {
        return this.stateListShrink;
    }

}
