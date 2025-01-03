// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetMergeRequestChangeTreeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>f0b1e61db5961df5975a93f9129d2513</p>
     */
    @NameInMap("accessToken")
    public String accessToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5e733626d53f4b04a6aa0e23d4ff72b8</p>
     */
    @NameInMap("fromPatchSetBizId")
    public String fromPatchSetBizId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("localId")
    public Long localId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5ebbc0228123212b59xxxxx</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("repositoryIdentity")
    public String repositoryIdentity;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>513fcfd81a9142d2bb0db4f72c0aa15b</p>
     */
    @NameInMap("toPatchSetBizId")
    public String toPatchSetBizId;

    public static GetMergeRequestChangeTreeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMergeRequestChangeTreeRequest self = new GetMergeRequestChangeTreeRequest();
        return TeaModel.build(map, self);
    }

    public GetMergeRequestChangeTreeRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public GetMergeRequestChangeTreeRequest setFromPatchSetBizId(String fromPatchSetBizId) {
        this.fromPatchSetBizId = fromPatchSetBizId;
        return this;
    }
    public String getFromPatchSetBizId() {
        return this.fromPatchSetBizId;
    }

    public GetMergeRequestChangeTreeRequest setLocalId(Long localId) {
        this.localId = localId;
        return this;
    }
    public Long getLocalId() {
        return this.localId;
    }

    public GetMergeRequestChangeTreeRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public GetMergeRequestChangeTreeRequest setRepositoryIdentity(String repositoryIdentity) {
        this.repositoryIdentity = repositoryIdentity;
        return this;
    }
    public String getRepositoryIdentity() {
        return this.repositoryIdentity;
    }

    public GetMergeRequestChangeTreeRequest setToPatchSetBizId(String toPatchSetBizId) {
        this.toPatchSetBizId = toPatchSetBizId;
        return this;
    }
    public String getToPatchSetBizId() {
        return this.toPatchSetBizId;
    }

}
