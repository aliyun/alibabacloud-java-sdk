// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteProjectLabelRequest extends TeaModel {
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
     * <p>5ebbc0228123212b59xxxxx</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("repositoryIdentity")
    public String repositoryIdentity;

    public static DeleteProjectLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProjectLabelRequest self = new DeleteProjectLabelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProjectLabelRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public DeleteProjectLabelRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public DeleteProjectLabelRequest setRepositoryIdentity(String repositoryIdentity) {
        this.repositoryIdentity = repositoryIdentity;
        return this;
    }
    public String getRepositoryIdentity() {
        return this.repositoryIdentity;
    }

}
