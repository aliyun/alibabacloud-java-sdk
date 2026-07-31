// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ArtifactRelease extends TeaModel {
    @NameInMap("ArtifactRef")
    public String artifactRef;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("Description")
    public String description;

    @NameInMap("Image")
    public String image;

    @NameInMap("Type")
    public String type;

    @NameInMap("Version")
    public String version;

    public static ArtifactRelease build(java.util.Map<String, ?> map) throws Exception {
        ArtifactRelease self = new ArtifactRelease();
        return TeaModel.build(map, self);
    }

    public ArtifactRelease setArtifactRef(String artifactRef) {
        this.artifactRef = artifactRef;
        return this;
    }
    public String getArtifactRef() {
        return this.artifactRef;
    }

    public ArtifactRelease setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public ArtifactRelease setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ArtifactRelease setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public ArtifactRelease setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ArtifactRelease setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
