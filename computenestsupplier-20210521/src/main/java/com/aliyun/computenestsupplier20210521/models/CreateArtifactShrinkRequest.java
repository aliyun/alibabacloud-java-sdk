// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class CreateArtifactShrinkRequest extends TeaModel {
    @NameInMap("ArtifactId")
    public String artifactId;

    @NameInMap("ArtifactProperty")
    public String artifactPropertyShrink;

    @NameInMap("ArtifactType")
    public String artifactType;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("SupportRegionIds")
    public java.util.List<String> supportRegionIds;

    @NameInMap("VersionName")
    public String versionName;

    public static CreateArtifactShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateArtifactShrinkRequest self = new CreateArtifactShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateArtifactShrinkRequest setArtifactId(String artifactId) {
        this.artifactId = artifactId;
        return this;
    }
    public String getArtifactId() {
        return this.artifactId;
    }

    public CreateArtifactShrinkRequest setArtifactPropertyShrink(String artifactPropertyShrink) {
        this.artifactPropertyShrink = artifactPropertyShrink;
        return this;
    }
    public String getArtifactPropertyShrink() {
        return this.artifactPropertyShrink;
    }

    public CreateArtifactShrinkRequest setArtifactType(String artifactType) {
        this.artifactType = artifactType;
        return this;
    }
    public String getArtifactType() {
        return this.artifactType;
    }

    public CreateArtifactShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateArtifactShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateArtifactShrinkRequest setSupportRegionIds(java.util.List<String> supportRegionIds) {
        this.supportRegionIds = supportRegionIds;
        return this;
    }
    public java.util.List<String> getSupportRegionIds() {
        return this.supportRegionIds;
    }

    public CreateArtifactShrinkRequest setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

}
