// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListRepositoryCommitDiffRequest extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("OrganizationId")
    public String organizationId;

    @NameInMap("ContextLine")
    public Integer contextLine;

    public static ListRepositoryCommitDiffRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryCommitDiffRequest self = new ListRepositoryCommitDiffRequest();
        return TeaModel.build(map, self);
    }

    public ListRepositoryCommitDiffRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public ListRepositoryCommitDiffRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public ListRepositoryCommitDiffRequest setContextLine(Integer contextLine) {
        this.contextLine = contextLine;
        return this;
    }
    public Integer getContextLine() {
        return this.contextLine;
    }

}
