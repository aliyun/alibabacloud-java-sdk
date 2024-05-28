// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListRepositoryCommitDiffRequest extends TeaModel {
    /**
     * <p>accessToken</p>
     */
    @NameInMap("accessToken")
    public String accessToken;

    @NameInMap("contextLine")
    public Integer contextLine;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

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

    public ListRepositoryCommitDiffRequest setContextLine(Integer contextLine) {
        this.contextLine = contextLine;
        return this;
    }
    public Integer getContextLine() {
        return this.contextLine;
    }

    public ListRepositoryCommitDiffRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
