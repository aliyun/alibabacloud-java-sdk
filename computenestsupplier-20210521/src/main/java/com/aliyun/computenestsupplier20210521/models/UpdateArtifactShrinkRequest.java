// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpdateArtifactShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>artifact-eea08d1e2d3a43aexxxx</p>
     */
    @NameInMap("ArtifactId")
    public String artifactId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ArtifactProperty")
    public String artifactPropertyShrink;

    @NameInMap("Description")
    public String description;

    @NameInMap("SupportRegionIds")
    public java.util.List<String> supportRegionIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("VersionName")
    public String versionName;

    public static UpdateArtifactShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateArtifactShrinkRequest self = new UpdateArtifactShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateArtifactShrinkRequest setArtifactId(String artifactId) {
        this.artifactId = artifactId;
        return this;
    }
    public String getArtifactId() {
        return this.artifactId;
    }

    public UpdateArtifactShrinkRequest setArtifactPropertyShrink(String artifactPropertyShrink) {
        this.artifactPropertyShrink = artifactPropertyShrink;
        return this;
    }
    public String getArtifactPropertyShrink() {
        return this.artifactPropertyShrink;
    }

    public UpdateArtifactShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateArtifactShrinkRequest setSupportRegionIds(java.util.List<String> supportRegionIds) {
        this.supportRegionIds = supportRegionIds;
        return this;
    }
    public java.util.List<String> getSupportRegionIds() {
        return this.supportRegionIds;
    }

    public UpdateArtifactShrinkRequest setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

}
