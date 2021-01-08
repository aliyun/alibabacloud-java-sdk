// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListRepositoryMemberRequest extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("OrganizationId")
    public String organizationId;

    @NameInMap("Query")
    public String query;

    @NameInMap("Page")
    public Long page;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SubUserId")
    public String subUserId;

    public static ListRepositoryMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryMemberRequest self = new ListRepositoryMemberRequest();
        return TeaModel.build(map, self);
    }

    public ListRepositoryMemberRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public ListRepositoryMemberRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public ListRepositoryMemberRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ListRepositoryMemberRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListRepositoryMemberRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListRepositoryMemberRequest setSubUserId(String subUserId) {
        this.subUserId = subUserId;
        return this;
    }
    public String getSubUserId() {
        return this.subUserId;
    }

}
