// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetArtifactRepositoryCredentialsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>File</p>
     */
    @NameInMap("ArtifactType")
    public String artifactType;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DeployRegionId")
    public String deployRegionId;

    public static GetArtifactRepositoryCredentialsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetArtifactRepositoryCredentialsRequest self = new GetArtifactRepositoryCredentialsRequest();
        return TeaModel.build(map, self);
    }

    public GetArtifactRepositoryCredentialsRequest setArtifactType(String artifactType) {
        this.artifactType = artifactType;
        return this;
    }
    public String getArtifactType() {
        return this.artifactType;
    }

    public GetArtifactRepositoryCredentialsRequest setDeployRegionId(String deployRegionId) {
        this.deployRegionId = deployRegionId;
        return this;
    }
    public String getDeployRegionId() {
        return this.deployRegionId;
    }

}
