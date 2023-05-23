// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetArtifactRequest extends TeaModel {
    @NameInMap("ArtifactId")
    public String artifactId;

    @NameInMap("ArtifactName")
    public String artifactName;

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
