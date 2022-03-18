// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListRepositoryWebhookRequest extends TeaModel {
    // accessToken
    @NameInMap("accessToken")
    public String accessToken;

    // 企业Id
    @NameInMap("organizationId")
    public String organizationId;

    // 页码
    @NameInMap("page")
    public Long page;

    // 每页数据量
    @NameInMap("pageSize")
    public Long pageSize;

    public static ListRepositoryWebhookRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryWebhookRequest self = new ListRepositoryWebhookRequest();
        return TeaModel.build(map, self);
    }

    public ListRepositoryWebhookRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public ListRepositoryWebhookRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public ListRepositoryWebhookRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListRepositoryWebhookRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
