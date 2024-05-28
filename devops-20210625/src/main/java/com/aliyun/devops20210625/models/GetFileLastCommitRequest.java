// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetFileLastCommitRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("filePath")
    public String filePath;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("sha")
    public String sha;

    @NameInMap("showSignature")
    public Boolean showSignature;

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

    public GetFileLastCommitRequest setShowSignature(Boolean showSignature) {
        this.showSignature = showSignature;
        return this;
    }
    public Boolean getShowSignature() {
        return this.showSignature;
    }

}
