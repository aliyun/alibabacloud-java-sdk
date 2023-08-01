// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class TransferRepositoryRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    @NameInMap("groupId")
    public String groupId;

    @NameInMap("organizationId")
    public String organizationId;

    @NameInMap("repositoryId")
    public String repositoryId;

    public static TransferRepositoryRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferRepositoryRequest self = new TransferRepositoryRequest();
        return TeaModel.build(map, self);
    }

    public TransferRepositoryRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public TransferRepositoryRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public TransferRepositoryRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public TransferRepositoryRequest setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }
    public String getRepositoryId() {
        return this.repositoryId;
    }

}
