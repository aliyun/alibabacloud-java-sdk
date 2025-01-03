// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListChangeRequestsRequest extends TeaModel {
    @NameInMap("appNameList")
    public java.util.List<String> appNameList;

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
    public java.util.List<String> ownerIdList;

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
    public java.util.List<String> stateList;

    public static ListChangeRequestsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListChangeRequestsRequest self = new ListChangeRequestsRequest();
        return TeaModel.build(map, self);
    }

    public ListChangeRequestsRequest setAppNameList(java.util.List<String> appNameList) {
        this.appNameList = appNameList;
        return this;
    }
    public java.util.List<String> getAppNameList() {
        return this.appNameList;
    }

    public ListChangeRequestsRequest setDisplayNameKeyword(String displayNameKeyword) {
        this.displayNameKeyword = displayNameKeyword;
        return this;
    }
    public String getDisplayNameKeyword() {
        return this.displayNameKeyword;
    }

    public ListChangeRequestsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListChangeRequestsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListChangeRequestsRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public ListChangeRequestsRequest setOwnerIdList(java.util.List<String> ownerIdList) {
        this.ownerIdList = ownerIdList;
        return this;
    }
    public java.util.List<String> getOwnerIdList() {
        return this.ownerIdList;
    }

    public ListChangeRequestsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListChangeRequestsRequest setPagination(String pagination) {
        this.pagination = pagination;
        return this;
    }
    public String getPagination() {
        return this.pagination;
    }

    public ListChangeRequestsRequest setPerPage(Integer perPage) {
        this.perPage = perPage;
        return this;
    }
    public Integer getPerPage() {
        return this.perPage;
    }

    public ListChangeRequestsRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public ListChangeRequestsRequest setStateList(java.util.List<String> stateList) {
        this.stateList = stateList;
        return this;
    }
    public java.util.List<String> getStateList() {
        return this.stateList;
    }

}
