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
