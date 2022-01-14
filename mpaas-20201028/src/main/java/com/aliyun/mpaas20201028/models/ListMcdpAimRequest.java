// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMcdpAimRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("EmptyTag")
    public String emptyTag;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Sort")
    public String sort;

    @NameInMap("SortField")
    public String sortField;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("Type")
    public String type;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListMcdpAimRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMcdpAimRequest self = new ListMcdpAimRequest();
        return TeaModel.build(map, self);
    }

    public ListMcdpAimRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListMcdpAimRequest setEmptyTag(String emptyTag) {
        this.emptyTag = emptyTag;
        return this;
    }
    public String getEmptyTag() {
        return this.emptyTag;
    }

    public ListMcdpAimRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListMcdpAimRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListMcdpAimRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListMcdpAimRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListMcdpAimRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public ListMcdpAimRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public ListMcdpAimRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ListMcdpAimRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListMcdpAimRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
