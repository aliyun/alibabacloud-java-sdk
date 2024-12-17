// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class DeleteArtifactRequest extends TeaModel {
    /**
     * <p>The ID of the artifact.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>artifact-eea08d1e2d3a43aexxxx</p>
     */
    @NameInMap("ArtifactId")
    public String artifactId;

    /**
     * <p>The version of the artifact.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ArtifactVersion")
    public String artifactVersion;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>788E7CP0EN9D51P</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    public static DeleteArtifactRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteArtifactRequest self = new DeleteArtifactRequest();
        return TeaModel.build(map, self);
    }

    public DeleteArtifactRequest setArtifactId(String artifactId) {
        this.artifactId = artifactId;
        return this;
    }
    public String getArtifactId() {
        return this.artifactId;
    }

    public DeleteArtifactRequest setArtifactVersion(String artifactVersion) {
        this.artifactVersion = artifactVersion;
        return this;
    }
    public String getArtifactVersion() {
        return this.artifactVersion;
    }

    public DeleteArtifactRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
