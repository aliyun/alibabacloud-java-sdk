// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class GetFileLastCommitRequest extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("FilePath")
    public String filePath;

    @NameInMap("OrganizationId")
    public String organizationId;

    @NameInMap("Sha")
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

    public GetFileLastCommitRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
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
