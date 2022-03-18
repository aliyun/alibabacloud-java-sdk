// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetFileLastCommitRequest extends TeaModel {
    // 个人访问令牌
    @NameInMap("accessToken")
    public String accessToken;

    // 文件路径
    @NameInMap("filepath")
    public String filepath;

    // 云效企业ID
    @NameInMap("organizationId")
    public String organizationId;

    // 分支名称、标签名称或Commit ID
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
