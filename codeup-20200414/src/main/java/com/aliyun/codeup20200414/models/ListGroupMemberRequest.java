// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListGroupMemberRequest extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("OrganizationId")
    public String organizationId;

    @NameInMap("Page")
    public Long page;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SubUserId")
    public String subUserId;

    public static ListGroupMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGroupMemberRequest self = new ListGroupMemberRequest();
        return TeaModel.build(map, self);
    }

    public ListGroupMemberRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public ListGroupMemberRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public ListGroupMemberRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListGroupMemberRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListGroupMemberRequest setSubUserId(String subUserId) {
        this.subUserId = subUserId;
        return this;
    }
    public String getSubUserId() {
        return this.subUserId;
    }

}
