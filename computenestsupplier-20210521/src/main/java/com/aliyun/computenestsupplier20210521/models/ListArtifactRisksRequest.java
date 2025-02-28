// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListArtifactRisksRequest extends TeaModel {
    /**
     * <p>Artifact ID.</p>
     * 
     * <strong>example:</strong>
     * <p>artifact-3fd95cdfdf0d4b1fa00c</p>
     */
    @NameInMap("ArtifactId")
    public String artifactId;

    /**
     * <p>Artifact version.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ArtifactVersion")
    public String artifactVersion;

    public static ListArtifactRisksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListArtifactRisksRequest self = new ListArtifactRisksRequest();
        return TeaModel.build(map, self);
    }

    public ListArtifactRisksRequest setArtifactId(String artifactId) {
        this.artifactId = artifactId;
        return this;
    }
    public String getArtifactId() {
        return this.artifactId;
    }

    public ListArtifactRisksRequest setArtifactVersion(String artifactVersion) {
        this.artifactVersion = artifactVersion;
        return this;
    }
    public String getArtifactVersion() {
        return this.artifactVersion;
    }

}
