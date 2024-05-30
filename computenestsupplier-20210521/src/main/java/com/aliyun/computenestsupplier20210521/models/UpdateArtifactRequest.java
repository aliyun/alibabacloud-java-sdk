// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpdateArtifactRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ArtifactId")
    public String artifactId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ArtifactProperty")
    public UpdateArtifactRequestArtifactProperty artifactProperty;

    @NameInMap("Description")
    public String description;

    @NameInMap("SupportRegionIds")
    public java.util.List<String> supportRegionIds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VersionName")
    public String versionName;

    public static UpdateArtifactRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateArtifactRequest self = new UpdateArtifactRequest();
        return TeaModel.build(map, self);
    }

    public UpdateArtifactRequest setArtifactId(String artifactId) {
        this.artifactId = artifactId;
        return this;
    }
    public String getArtifactId() {
        return this.artifactId;
    }

    public UpdateArtifactRequest setArtifactProperty(UpdateArtifactRequestArtifactProperty artifactProperty) {
        this.artifactProperty = artifactProperty;
        return this;
    }
    public UpdateArtifactRequestArtifactProperty getArtifactProperty() {
        return this.artifactProperty;
    }

    public UpdateArtifactRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateArtifactRequest setSupportRegionIds(java.util.List<String> supportRegionIds) {
        this.supportRegionIds = supportRegionIds;
        return this;
    }
    public java.util.List<String> getSupportRegionIds() {
        return this.supportRegionIds;
    }

    public UpdateArtifactRequest setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public static class UpdateArtifactRequestArtifactProperty extends TeaModel {
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

        @NameInMap("ScriptMetadata")
        public String scriptMetadata;

        @NameInMap("Url")
        public String url;

        public static UpdateArtifactRequestArtifactProperty build(java.util.Map<String, ?> map) throws Exception {
            UpdateArtifactRequestArtifactProperty self = new UpdateArtifactRequestArtifactProperty();
            return TeaModel.build(map, self);
        }

        public UpdateArtifactRequestArtifactProperty setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public UpdateArtifactRequestArtifactProperty setCommodityVersion(String commodityVersion) {
            this.commodityVersion = commodityVersion;
            return this;
        }
        public String getCommodityVersion() {
            return this.commodityVersion;
        }

        public UpdateArtifactRequestArtifactProperty setFileScriptMetadata(String fileScriptMetadata) {
            this.fileScriptMetadata = fileScriptMetadata;
            return this;
        }
        public String getFileScriptMetadata() {
            return this.fileScriptMetadata;
        }

        public UpdateArtifactRequestArtifactProperty setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public UpdateArtifactRequestArtifactProperty setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdateArtifactRequestArtifactProperty setScriptMetadata(String scriptMetadata) {
            this.scriptMetadata = scriptMetadata;
            return this;
        }
        public String getScriptMetadata() {
            return this.scriptMetadata;
        }

        public UpdateArtifactRequestArtifactProperty setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
