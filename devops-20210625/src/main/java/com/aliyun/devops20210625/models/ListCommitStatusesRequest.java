// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListCommitStatusesRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    @NameInMap("page")
    public Long page;

    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("repositoryIdentity")
    public String repositoryIdentity;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("sha")
    public String sha;

    public static ListCommitStatusesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCommitStatusesRequest self = new ListCommitStatusesRequest();
        return TeaModel.build(map, self);
    }

    public ListCommitStatusesRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public ListCommitStatusesRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public ListCommitStatusesRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListCommitStatusesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListCommitStatusesRequest setRepositoryIdentity(String repositoryIdentity) {
        this.repositoryIdentity = repositoryIdentity;
        return this;
    }
    public String getRepositoryIdentity() {
        return this.repositoryIdentity;
    }

    public ListCommitStatusesRequest setSha(String sha) {
        this.sha = sha;
        return this;
    }
    public String getSha() {
        return this.sha;
    }

}
