// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetFileLastCommitRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    @NameInMap("filepath")
    public String filepath;

    @NameInMap("organizationId")
    public String organizationId;

    @NameInMap("sha")
    public String sha;

    public static GetFileLastCommitRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFileLastCommitRequest self = new GetFileLastCommitRequest();
        return TeaModel.build(map, self);
    }

    public GetFileLastCommitRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public GetFileLastCommitRequest setFilepath(String filepath) {
        this.filepath = filepath;
        return this;
    }
    public String getFilepath() {
        return this.filepath;
    }

    public GetFileLastCommitRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public GetFileLastCommitRequest setSha(String sha) {
        this.sha = sha;
        return this;
    }
    public String getSha() {
        return this.sha;
    }

}
