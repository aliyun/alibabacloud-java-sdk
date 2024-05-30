// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class DeleteArtifactRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ArtifactId")
    public String artifactId;

    @NameInMap("ArtifactVersion")
    public String artifactVersion;

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

}
