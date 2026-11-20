// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ArtifactRelease extends TeaModel {
    /**
     * <p>The artifact reference name.</p>
     * 
     * <strong>example:</strong>
     * <p>python-env</p>
     */
    @NameInMap("ArtifactRef")
    public String artifactRef;

    /**
     * <p>The creation time of the artifact release record.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-15T10:30:00Z</p>
     */
    @NameInMap("CreatedAt")
    public String createdAt;

    /**
     * <p>The artifact description.</p>
     * 
     * <strong>example:</strong>
     * <p>Container image for model inference</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The container image address used by the artifact.</p>
     * 
     * <strong>example:</strong>
     * <p>registry.cn-shanghai.aliyuncs.com/eas/echo_cn-shanghai:v0.0.1-20210129111320</p>
     */
    @NameInMap("Image")
    public String image;

    /**
     * <p>The artifact type.</p>
     * 
     * <strong>example:</strong>
     * <p>Image</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The artifact version.</p>
     * 
     * <strong>example:</strong>
     * <p>V2.0</p>
     */
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
