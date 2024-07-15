// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class CreateArtifactRequest extends TeaModel {
    /**
     * <p>The ID of the deployment package.</p>
     * 
     * <strong>example:</strong>
     * <p>artifact-eea08d1e2d3a43aexxxx</p>
     */
    @NameInMap("ArtifactId")
    public String artifactId;

    /**
     * <p>The properties of the deployment object.</p>
     */
    @NameInMap("ArtifactProperty")
    public CreateArtifactRequestArtifactProperty artifactProperty;

    /**
     * <p>The type of the deployment package. Valid values:</p>
     * <ul>
     * <li>EcsImage: Elastic Compute Service (ECS) image.</li>
     * <li>AcrImage: container image.</li>
     * <li>File: Object Storage Service (OSS) object.</li>
     * <li>Script: script.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>EcsImage</p>
     */
    @NameInMap("ArtifactType")
    public String artifactType;

    /**
     * <p>The description of the deployment package.</p>
     * 
     * <strong>example:</strong>
     * <p>Test artifact</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the deployment package.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzkt5buxxxxxx</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The supported regions.</p>
     */
    @NameInMap("SupportRegionIds")
    public java.util.List<String> supportRegionIds;

    /**
     * <p>The custom tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateArtifactRequestTag> tag;

    /**
     * <p>The version name of the deployment package.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
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
         * <p>The script metadata.</p>
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
         * <p>m-0xij191j9cuev6xxxxxx</p>
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
         * <p>The ID of the image repository.</p>
         * <blockquote>
         * <p> This parameter is available only if the deployment package is a container image or of the Helm chart type.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>crr-d8o1nponyc2t1gcg</p>
         */
        @NameInMap("RepoId")
        public String repoId;

        /**
         * <p>The name of the image repository.</p>
         * <blockquote>
         * <p> This parameter is available only if the deployment package is a container image or of the Helm chart type.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>wordpress</p>
         */
        @NameInMap("RepoName")
        public String repoName;

        /**
         * <p>The script content.</p>
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
         * <p>The version tag of the image repository.</p>
         * <blockquote>
         * <p> This parameter is available only if the deployment package is a container image or of the Helm chart type.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The object URL of the deployment package.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://service-info-private.oss-cn-hangzhou.aliyuncs.com/1309208528xxxxxx/template/2e1ce8fc-xxxx-481c-9e8e-789ba9db487d.json">https://service-info-private.oss-cn-hangzhou.aliyuncs.com/1309208528xxxxxx/template/2e1ce8fc-xxxx-481c-9e8e-789ba9db487d.json</a></p>
         */
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
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
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
