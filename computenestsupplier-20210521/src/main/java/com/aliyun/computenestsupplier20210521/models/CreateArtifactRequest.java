// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class CreateArtifactRequest extends TeaModel {
    @NameInMap("ArtifactId")
    public String artifactId;

    @NameInMap("ArtifactProperty")
    public CreateArtifactRequestArtifactProperty artifactProperty;

    @NameInMap("ArtifactType")
    public String artifactType;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SupportRegionIds")
    public java.util.List<String> supportRegionIds;

    @NameInMap("Tag")
    public java.util.List<CreateArtifactRequestTag> tag;

    @NameInMap("VersionName")
    public String versionName;

    public static CreateArtifactRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateArtifactRequest self = new CreateArtifactRequest();
        return TeaModel.build(map, self);
    }

    public CreateArtifactRequest setArtifactId(String artifactId) {
        this.artifactId = artifactId;
        return this;
    }
    public String getArtifactId() {
        return this.artifactId;
    }

    public CreateArtifactRequest setArtifactProperty(CreateArtifactRequestArtifactProperty artifactProperty) {
        this.artifactProperty = artifactProperty;
        return this;
    }
    public CreateArtifactRequestArtifactProperty getArtifactProperty() {
        return this.artifactProperty;
    }

    public CreateArtifactRequest setArtifactType(String artifactType) {
        this.artifactType = artifactType;
        return this;
    }
    public String getArtifactType() {
        return this.artifactType;
    }

    public CreateArtifactRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateArtifactRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateArtifactRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateArtifactRequest setSupportRegionIds(java.util.List<String> supportRegionIds) {
        this.supportRegionIds = supportRegionIds;
        return this;
    }
    public java.util.List<String> getSupportRegionIds() {
        return this.supportRegionIds;
    }

    public CreateArtifactRequest setTag(java.util.List<CreateArtifactRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateArtifactRequestTag> getTag() {
        return this.tag;
    }

    public CreateArtifactRequest setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public static class CreateArtifactRequestArtifactProperty extends TeaModel {
        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("CommodityVersion")
        public String commodityVersion;

        @NameInMap("FileScriptMetadata")
        public String fileScriptMetadata;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RepoId")
        public String repoId;

        @NameInMap("RepoName")
        public String repoName;

        @NameInMap("ScriptMetadata")
        public String scriptMetadata;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("Url")
        public String url;

        public static CreateArtifactRequestArtifactProperty build(java.util.Map<String, ?> map) throws Exception {
            CreateArtifactRequestArtifactProperty self = new CreateArtifactRequestArtifactProperty();
            return TeaModel.build(map, self);
        }

        public CreateArtifactRequestArtifactProperty setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public CreateArtifactRequestArtifactProperty setCommodityVersion(String commodityVersion) {
            this.commodityVersion = commodityVersion;
            return this;
        }
        public String getCommodityVersion() {
            return this.commodityVersion;
        }

        public CreateArtifactRequestArtifactProperty setFileScriptMetadata(String fileScriptMetadata) {
            this.fileScriptMetadata = fileScriptMetadata;
            return this;
        }
        public String getFileScriptMetadata() {
            return this.fileScriptMetadata;
        }

        public CreateArtifactRequestArtifactProperty setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public CreateArtifactRequestArtifactProperty setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateArtifactRequestArtifactProperty setRepoId(String repoId) {
            this.repoId = repoId;
            return this;
        }
        public String getRepoId() {
            return this.repoId;
        }

        public CreateArtifactRequestArtifactProperty setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public CreateArtifactRequestArtifactProperty setScriptMetadata(String scriptMetadata) {
            this.scriptMetadata = scriptMetadata;
            return this;
        }
        public String getScriptMetadata() {
            return this.scriptMetadata;
        }

        public CreateArtifactRequestArtifactProperty setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public CreateArtifactRequestArtifactProperty setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class CreateArtifactRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateArtifactRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateArtifactRequestTag self = new CreateArtifactRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateArtifactRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateArtifactRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
