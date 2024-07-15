// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpdateArtifactRequest extends TeaModel {
    /**
     * <p>The ID of the deployment package.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>artifact-eea08d1e2d3a43aexxxx</p>
     */
    @NameInMap("ArtifactId")
    public String artifactId;

    /**
     * <p>The properties of the deployment package.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ArtifactProperty")
    public UpdateArtifactRequestArtifactProperty artifactProperty;

    /**
     * <p>The description of the deployment package.</p>
     * 
     * <strong>example:</strong>
     * <p>Description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The IDs of the regions that support the deployment package.</p>
     */
    @NameInMap("SupportRegionIds")
    public java.util.List<String> supportRegionIds;

    /**
     * <p>The version name of the deployment package.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
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
        /**
         * <p>The commodity code of the service in Alibaba Cloud Marketplace.</p>
         * <blockquote>
         * <p> This parameter is available only if the deployment package is an image.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cmjj00xxxx</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The commodity version of the service in Alibaba Cloud Marketplace.</p>
         * <blockquote>
         * <p> This parameter is available only if the deployment package is an image.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>V1.0</p>
         */
        @NameInMap("CommodityVersion")
        public String commodityVersion;

        /**
         * <p>The metadata of the Object Storage Service (OSS) object.</p>
         * <blockquote>
         * <p> This parameter is available only if the deployment package is an OSS object.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;WorkDir\&quot;:\&quot;/root\&quot;,\&quot;CommandType\&quot;:\&quot;RunShellScript\&quot;,\&quot;Platform\&quot;:\&quot;Linux\&quot;,\&quot;Script\&quot;:\&quot;echo hello\&quot;}</p>
         */
        @NameInMap("FileScriptMetadata")
        public String fileScriptMetadata;

        /**
         * <p>The image ID.</p>
         * <blockquote>
         * <p> This parameter is available only if the deployment package is an image.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>m-0xij191j9cuev6ucxxxx</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The region ID.</p>
         * <blockquote>
         * <p> This parameter is available only if the deployment package is an image.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The script content of the deployment package.</p>
         * <blockquote>
         * <p> This parameter is available only if the deployment package is a script.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ScriptMetadata&quot;:&quot;{\&quot;CommandType\&quot;:\&quot;RunShellScript\&quot;,\&quot;Platform\&quot;:\&quot;Linux\&quot;,\&quot;Script\&quot;:\&quot;ls\&quot;}&quot;}</p>
         */
        @NameInMap("ScriptMetadata")
        public String scriptMetadata;

        /**
         * <p>The URL of the deployment package object.</p>
         * <blockquote>
         * <p>Note This parameter is available only if the deployment package is an file.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="https://service-info-private.oss-cn-hangzhou.aliyuncs.com/1309208528xxxxxx/template/2e1ce8fc-xxxx-481c-9e8e-789ba9db487d.json">https://service-info-private.oss-cn-hangzhou.aliyuncs.com/1309208528xxxxxx/template/2e1ce8fc-xxxx-481c-9e8e-789ba9db487d.json</a></p>
         */
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
