// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListMergeRequestLabelsRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    @NameInMap("localId")
    public Long localId;

    @NameInMap("organizationId")
    public String organizationId;

    @NameInMap("repositoryIdentity")
    public String repositoryIdentity;

    public static ListMergeRequestLabelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMergeRequestLabelsRequest self = new ListMergeRequestLabelsRequest();
        return TeaModel.build(map, self);
    }

    public ListMergeRequestLabelsRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public ListMergeRequestLabelsRequest setLocalId(Long localId) {
        this.localId = localId;
        return this;
    }
    public Long getLocalId() {
        return this.localId;
    }

    public ListMergeRequestLabelsRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public ListMergeRequestLabelsRequest setRepositoryIdentity(String repositoryIdentity) {
        this.repositoryIdentity = repositoryIdentity;
        return this;
    }
    public String getRepositoryIdentity() {
        return this.repositoryIdentity;
    }

}
