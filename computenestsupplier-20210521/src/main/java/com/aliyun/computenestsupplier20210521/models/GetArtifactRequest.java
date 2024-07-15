// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetArtifactRequest extends TeaModel {
    /**
     * <p>The ID of the deployment package.</p>
     * 
     * <strong>example:</strong>
     * <p>artifact-eea08d1e2d3a43aexxxx</p>
     */
    @NameInMap("ArtifactId")
    public String artifactId;

    /**
     * <p>The name of the deployment package.</p>
     * 
     * <strong>example:</strong>
     * <p>gpu-test</p>
     */
    @NameInMap("ArtifactName")
    public String artifactName;

    /**
     * <p>The version of the deployment package.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ArtifactVersion")
    public String artifactVersion;

    public static GetArtifactRequest build(java.util.Map<String, ?> map) throws Exception {
        GetArtifactRequest self = new GetArtifactRequest();
        return TeaModel.build(map, self);
    }

    public GetArtifactRequest setArtifactId(String artifactId) {
        this.artifactId = artifactId;
        return this;
    }
    public String getArtifactId() {
        return this.artifactId;
    }

    public GetArtifactRequest setArtifactName(String artifactName) {
        this.artifactName = artifactName;
        return this;
    }
    public String getArtifactName() {
        return this.artifactName;
    }

    public GetArtifactRequest setArtifactVersion(String artifactVersion) {
        this.artifactVersion = artifactVersion;
        return this;
    }
    public String getArtifactVersion() {
        return this.artifactVersion;
    }

}
