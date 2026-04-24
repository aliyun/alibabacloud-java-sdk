// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetImageResponseBody extends TeaModel {
    @NameInMap("Image")
    public GetImageResponseBodyImage image;

    /**
     * <strong>example:</strong>
     * <p>6A6CBE87-9F91-1323-B680-E7A7065XXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImageResponseBody self = new GetImageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImageResponseBody setImage(GetImageResponseBodyImage image) {
        this.image = image;
        return this;
    }
    public GetImageResponseBodyImage getImage() {
        return this.image;
    }

    public GetImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetImageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetImageResponseBodyImageBuildConfigPackageInstallationScripts extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>requests</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>Python3</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetImageResponseBodyImageBuildConfigPackageInstallationScripts build(java.util.Map<String, ?> map) throws Exception {
            GetImageResponseBodyImageBuildConfigPackageInstallationScripts self = new GetImageResponseBodyImageBuildConfigPackageInstallationScripts();
            return TeaModel.build(map, self);
        }

        public GetImageResponseBodyImageBuildConfigPackageInstallationScripts setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetImageResponseBodyImageBuildConfigPackageInstallationScripts setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetImageResponseBodyImageBuildConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>PackageInstallation</p>
         */
        @NameInMap("BuildType")
        public String buildType;

        @NameInMap("PackageInstallationScripts")
        public java.util.List<GetImageResponseBodyImageBuildConfigPackageInstallationScripts> packageInstallationScripts;

        public static GetImageResponseBodyImageBuildConfig build(java.util.Map<String, ?> map) throws Exception {
            GetImageResponseBodyImageBuildConfig self = new GetImageResponseBodyImageBuildConfig();
            return TeaModel.build(map, self);
        }

        public GetImageResponseBodyImageBuildConfig setBuildType(String buildType) {
            this.buildType = buildType;
            return this;
        }
        public String getBuildType() {
            return this.buildType;
        }

        public GetImageResponseBodyImageBuildConfig setPackageInstallationScripts(java.util.List<GetImageResponseBodyImageBuildConfigPackageInstallationScripts> packageInstallationScripts) {
            this.packageInstallationScripts = packageInstallationScripts;
            return this;
        }
        public java.util.List<GetImageResponseBodyImageBuildConfigPackageInstallationScripts> getPackageInstallationScripts() {
            return this.packageInstallationScripts;
        }

    }

    public static class GetImageResponseBodyImageSupported extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Scheduler</p>
         */
        @NameInMap("Module")
        public String module;

        @NameInMap("TaskTypes")
        public java.util.List<String> taskTypes;

        public static GetImageResponseBodyImageSupported build(java.util.Map<String, ?> map) throws Exception {
            GetImageResponseBodyImageSupported self = new GetImageResponseBodyImageSupported();
            return TeaModel.build(map, self);
        }

        public GetImageResponseBodyImageSupported setModule(String module) {
            this.module = module;
            return this;
        }
        public String getModule() {
            return this.module;
        }

        public GetImageResponseBodyImageSupported setTaskTypes(java.util.List<String> taskTypes) {
            this.taskTypes = taskTypes;
            return this;
        }
        public java.util.List<String> getTaskTypes() {
            return this.taskTypes;
        }

    }

    public static class GetImageResponseBodyImage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Public</p>
         */
        @NameInMap("Accessibility")
        public String accessibility;

        /**
         * <strong>example:</strong>
         * <p>vpc-xxx</p>
         */
        @NameInMap("AcrAssociatedVpcId")
        public String acrAssociatedVpcId;

        /**
         * <p>ACR Endpoint</p>
         * 
         * <strong>example:</strong>
         * <p>registry.cn-hangzhou.aliyuncs.com</p>
         */
        @NameInMap("AcrEndpoint")
        public String acrEndpoint;

        /**
         * <strong>example:</strong>
         * <p>cri-xxx</p>
         */
        @NameInMap("AcrInstanceId")
        public String acrInstanceId;

        @NameInMap("BuildConfig")
        public GetImageResponseBodyImageBuildConfig buildConfig;

        /**
         * <strong>example:</strong>
         * <p>1727055811000</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>Test image created by xxx</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableSyncMaxCompute")
        public Boolean enableSyncMaxCompute;

        /**
         * <strong>example:</strong>
         * <p>Custom_image_xxxx_xxxx</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>v1.0.0</p>
         */
        @NameInMap("ImageTag")
        public String imageTag;

        /**
         * <strong>example:</strong>
         * <p>registry.cn-hangzhou.aliyuncs.com/xxx/xxx:tag</p>
         */
        @NameInMap("ImageUri")
        public String imageUri;

        /**
         * <strong>example:</strong>
         * <p>registry-vpc.cn-hangzhou.aliyuncs.com/xxx/xxx:tag</p>
         */
        @NameInMap("ImageVpcUri")
        public String imageVpcUri;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <strong>example:</strong>
         * <p>1727055811000</p>
         */
        @NameInMap("LastModifiedTime")
        public Long lastModifiedTime;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Modifier")
        public String modifier;

        /**
         * <strong>example:</strong>
         * <p>dataworks_image</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>namespace</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Official")
        public Boolean official;

        /**
         * <strong>example:</strong>
         * <p>acr_image_id</p>
         */
        @NameInMap("ProviderImageId")
        public String providerImageId;

        /**
         * <strong>example:</strong>
         * <p>ACR</p>
         */
        @NameInMap("ProviderType")
        public String providerType;

        /**
         * <strong>example:</strong>
         * <p>Published</p>
         */
        @NameInMap("PublishStage")
        public String publishStage;

        /**
         * <strong>example:</strong>
         * <p>repo_name</p>
         */
        @NameInMap("RepositoryName")
        public String repositoryName;

        /**
         * <strong>example:</strong>
         * <p>1GB</p>
         */
        @NameInMap("Size")
        public String size;

        /**
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Supported")
        public GetImageResponseBodyImageSupported supported;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public String version;

        public static GetImageResponseBodyImage build(java.util.Map<String, ?> map) throws Exception {
            GetImageResponseBodyImage self = new GetImageResponseBodyImage();
            return TeaModel.build(map, self);
        }

        public GetImageResponseBodyImage setAccessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }
        public String getAccessibility() {
            return this.accessibility;
        }

        public GetImageResponseBodyImage setAcrAssociatedVpcId(String acrAssociatedVpcId) {
            this.acrAssociatedVpcId = acrAssociatedVpcId;
            return this;
        }
        public String getAcrAssociatedVpcId() {
            return this.acrAssociatedVpcId;
        }

        public GetImageResponseBodyImage setAcrEndpoint(String acrEndpoint) {
            this.acrEndpoint = acrEndpoint;
            return this;
        }
        public String getAcrEndpoint() {
            return this.acrEndpoint;
        }

        public GetImageResponseBodyImage setAcrInstanceId(String acrInstanceId) {
            this.acrInstanceId = acrInstanceId;
            return this;
        }
        public String getAcrInstanceId() {
            return this.acrInstanceId;
        }

        public GetImageResponseBodyImage setBuildConfig(GetImageResponseBodyImageBuildConfig buildConfig) {
            this.buildConfig = buildConfig;
            return this;
        }
        public GetImageResponseBodyImageBuildConfig getBuildConfig() {
            return this.buildConfig;
        }

        public GetImageResponseBodyImage setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public GetImageResponseBodyImage setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetImageResponseBodyImage setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetImageResponseBodyImage setEnableSyncMaxCompute(Boolean enableSyncMaxCompute) {
            this.enableSyncMaxCompute = enableSyncMaxCompute;
            return this;
        }
        public Boolean getEnableSyncMaxCompute() {
            return this.enableSyncMaxCompute;
        }

        public GetImageResponseBodyImage setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetImageResponseBodyImage setImageTag(String imageTag) {
            this.imageTag = imageTag;
            return this;
        }
        public String getImageTag() {
            return this.imageTag;
        }

        public GetImageResponseBodyImage setImageUri(String imageUri) {
            this.imageUri = imageUri;
            return this;
        }
        public String getImageUri() {
            return this.imageUri;
        }

        public GetImageResponseBodyImage setImageVpcUri(String imageVpcUri) {
            this.imageVpcUri = imageVpcUri;
            return this;
        }
        public String getImageVpcUri() {
            return this.imageVpcUri;
        }

        public GetImageResponseBodyImage setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public GetImageResponseBodyImage setLastModifiedTime(Long lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public Long getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public GetImageResponseBodyImage setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public GetImageResponseBodyImage setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetImageResponseBodyImage setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetImageResponseBodyImage setOfficial(Boolean official) {
            this.official = official;
            return this;
        }
        public Boolean getOfficial() {
            return this.official;
        }

        public GetImageResponseBodyImage setProviderImageId(String providerImageId) {
            this.providerImageId = providerImageId;
            return this;
        }
        public String getProviderImageId() {
            return this.providerImageId;
        }

        public GetImageResponseBodyImage setProviderType(String providerType) {
            this.providerType = providerType;
            return this;
        }
        public String getProviderType() {
            return this.providerType;
        }

        public GetImageResponseBodyImage setPublishStage(String publishStage) {
            this.publishStage = publishStage;
            return this;
        }
        public String getPublishStage() {
            return this.publishStage;
        }

        public GetImageResponseBodyImage setRepositoryName(String repositoryName) {
            this.repositoryName = repositoryName;
            return this;
        }
        public String getRepositoryName() {
            return this.repositoryName;
        }

        public GetImageResponseBodyImage setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public GetImageResponseBodyImage setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetImageResponseBodyImage setSupported(GetImageResponseBodyImageSupported supported) {
            this.supported = supported;
            return this;
        }
        public GetImageResponseBodyImageSupported getSupported() {
            return this.supported;
        }

        public GetImageResponseBodyImage setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
