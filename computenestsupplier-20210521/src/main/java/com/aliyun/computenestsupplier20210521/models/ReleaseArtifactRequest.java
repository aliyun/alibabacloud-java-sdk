// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ReleaseArtifactRequest extends TeaModel {
    /**
     * <p>The ID of the artifact.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>artifact-9feded91880e4c78xxxx</p>
     */
    @NameInMap("ArtifactId")
    public String artifactId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>788E7CP0EN9D51P</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    public static ReleaseArtifactRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseArtifactRequest self = new ReleaseArtifactRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseArtifactRequest setArtifactId(String artifactId) {
        this.artifactId = artifactId;
        return this;
    }
    public String getArtifactId() {
        return this.artifactId;
    }

    public ReleaseArtifactRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
