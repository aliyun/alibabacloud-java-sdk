// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListGroupRepositoriesRequest extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("IsMember")
    public Boolean isMember;

    @NameInMap("OrganizationId")
    public String organizationId;

    @NameInMap("Page")
    public Long page;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Search")
    public String search;

    @NameInMap("SubUserId")
    public String subUserId;

    public static ListGroupRepositoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGroupRepositoriesRequest self = new ListGroupRepositoriesRequest();
        return TeaModel.build(map, self);
    }

    public ListGroupRepositoriesRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public ListGroupRepositoriesRequest setIsMember(Boolean isMember) {
        this.isMember = isMember;
        return this;
    }
    public Boolean getIsMember() {
        return this.isMember;
    }

    public ListGroupRepositoriesRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public ListGroupRepositoriesRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListGroupRepositoriesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListGroupRepositoriesRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

    public ListGroupRepositoriesRequest setSubUserId(String subUserId) {
        this.subUserId = subUserId;
        return this;
    }
    public String getSubUserId() {
        return this.subUserId;
    }

}
