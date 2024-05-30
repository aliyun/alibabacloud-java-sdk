// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class CreateArtifactShrinkRequest extends TeaModel {
    @NameInMap("ArtifactId")
    public String artifactId;

    @NameInMap("ArtifactProperty")
    public String artifactPropertyShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ArtifactType")
    public String artifactType;

    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SupportRegionIds")
    public java.util.List<String> supportRegionIds;

    @NameInMap("Tag")
    public java.util.List<CreateArtifactShrinkRequestTag> tag;

    /**
     * <p>This parameter is required.</p>
     */
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

    public CreateArtifactShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateArtifactShrinkRequest setSupportRegionIds(java.util.List<String> supportRegionIds) {
        this.supportRegionIds = supportRegionIds;
        return this;
    }
    public java.util.List<String> getSupportRegionIds() {
        return this.supportRegionIds;
    }

    public CreateArtifactShrinkRequest setTag(java.util.List<CreateArtifactShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateArtifactShrinkRequestTag> getTag() {
        return this.tag;
    }

    public CreateArtifactShrinkRequest setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public static class CreateArtifactShrinkRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateArtifactShrinkRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateArtifactShrinkRequestTag self = new CreateArtifactShrinkRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateArtifactShrinkRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateArtifactShrinkRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
