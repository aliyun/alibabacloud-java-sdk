// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateImageRequest extends TeaModel {
    /**
     * <p>The visibility of the image. Valid values:</p>
     * <ul>
     * <li>Public: The image is visible to all users.</li>
     * <li>Private: The image is visible only to the creator.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Public</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The ID of the virtual private cloud (VPC) associated with the ACR instance. This parameter is required if you reference an ACR image.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-xxx</p>
     */
    @NameInMap("AcrAssociatedVpcId")
    public String acrAssociatedVpcId;

    /**
     * <p>The ACR instance ID. This parameter is required if you reference an ACR image.</p>
     * 
     * <strong>example:</strong>
     * <p>acr_instance_id</p>
     */
    @NameInMap("AcrInstanceId")
    public String acrInstanceId;

    /**
     * <p>The build configuration of the image.</p>
     */
    @NameInMap("BuildConfig")
    public CreateImageRequestBuildConfig buildConfig;

    /**
     * <p>The client token that is used to ensure idempotence.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dasfsd-94fqwe-da8d</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the image. The description can be up to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>create by xxxx</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to synchronize the image to MaxCompute. Specify this parameter when you reference an ACR image. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableSyncMaxCompute")
    public Boolean enableSyncMaxCompute;

    /**
     * <p>The URI of the image. This parameter is required if you reference an ACR image.</p>
     * 
     * <strong>example:</strong>
     * <p>registry-vpc.cn-beijing.cr.aliyuncs.com/namespace/image:0.1.0</p>
     */
    @NameInMap("ImageUri")
    public String imageUri;

    /**
     * <p>The name of the image. The name can contain lowercase letters, digits, and underscores (_), and can be up to 128 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>task_image_001</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The namespace of the image. If you reference a DataWorks official image, set this parameter to DataWorks Default.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>namespace_name</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The ID of the image provided by the image provider. This parameter is required if you reference a DataWorks official image.</p>
     * 
     * <strong>example:</strong>
     * <p>System_shell_20251201</p>
     */
    @NameInMap("ProviderImageId")
    public String providerImageId;

    /**
     * <p>The reference data type of the image. Valid values:</p>
     * <ul>
     * <li>ACR: ACR image repository.</li>
     * <li>DataWorks: DataWorks official image.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ACR</p>
     */
    @NameInMap("ProviderType")
    public String providerType;

    /**
     * <p>The name of the image repository. If you reference a DataWorks official image, set this parameter to DataWorks Default.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>repo_name</p>
     */
    @NameInMap("RepositoryName")
    public String repositoryName;

    /**
     * <p>The sub-purpose of the image.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Supported")
    public CreateImageRequestSupported supported;

    public static CreateImageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageRequest self = new CreateImageRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public CreateImageRequest setAcrAssociatedVpcId(String acrAssociatedVpcId) {
        this.acrAssociatedVpcId = acrAssociatedVpcId;
        return this;
    }
    public String getAcrAssociatedVpcId() {
        return this.acrAssociatedVpcId;
    }

    public CreateImageRequest setAcrInstanceId(String acrInstanceId) {
        this.acrInstanceId = acrInstanceId;
        return this;
    }
    public String getAcrInstanceId() {
        return this.acrInstanceId;
    }

    public CreateImageRequest setBuildConfig(CreateImageRequestBuildConfig buildConfig) {
        this.buildConfig = buildConfig;
        return this;
    }
    public CreateImageRequestBuildConfig getBuildConfig() {
        return this.buildConfig;
    }

    public CreateImageRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateImageRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateImageRequest setEnableSyncMaxCompute(Boolean enableSyncMaxCompute) {
        this.enableSyncMaxCompute = enableSyncMaxCompute;
        return this;
    }
    public Boolean getEnableSyncMaxCompute() {
        return this.enableSyncMaxCompute;
    }

    public CreateImageRequest setImageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }
    public String getImageUri() {
        return this.imageUri;
    }

    public CreateImageRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateImageRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateImageRequest setProviderImageId(String providerImageId) {
        this.providerImageId = providerImageId;
        return this;
    }
    public String getProviderImageId() {
        return this.providerImageId;
    }

    public CreateImageRequest setProviderType(String providerType) {
        this.providerType = providerType;
        return this;
    }
    public String getProviderType() {
        return this.providerType;
    }

    public CreateImageRequest setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }
    public String getRepositoryName() {
        return this.repositoryName;
    }

    public CreateImageRequest setSupported(CreateImageRequestSupported supported) {
        this.supported = supported;
        return this;
    }
    public CreateImageRequestSupported getSupported() {
        return this.supported;
    }

    public static class CreateImageRequestBuildConfigPackageInstallationScripts extends TeaModel {
        /**
         * <p>The content of the script. If the content is a list of installation package names, separate the names with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>requests</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The type of the script.</p>
         * 
         * <strong>example:</strong>
         * <p>Python3</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateImageRequestBuildConfigPackageInstallationScripts build(java.util.Map<String, ?> map) throws Exception {
            CreateImageRequestBuildConfigPackageInstallationScripts self = new CreateImageRequestBuildConfigPackageInstallationScripts();
            return TeaModel.build(map, self);
        }

        public CreateImageRequestBuildConfigPackageInstallationScripts setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateImageRequestBuildConfigPackageInstallationScripts setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateImageRequestBuildConfig extends TeaModel {
        /**
         * <p>The build type.</p>
         * 
         * <strong>example:</strong>
         * <p>PackageInstallation</p>
         */
        @NameInMap("BuildType")
        public String buildType;

        /**
         * <p>The list of pre-installation execution scripts.</p>
         */
        @NameInMap("PackageInstallationScripts")
        public java.util.List<CreateImageRequestBuildConfigPackageInstallationScripts> packageInstallationScripts;

        public static CreateImageRequestBuildConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateImageRequestBuildConfig self = new CreateImageRequestBuildConfig();
            return TeaModel.build(map, self);
        }

        public CreateImageRequestBuildConfig setBuildType(String buildType) {
            this.buildType = buildType;
            return this;
        }
        public String getBuildType() {
            return this.buildType;
        }

        public CreateImageRequestBuildConfig setPackageInstallationScripts(java.util.List<CreateImageRequestBuildConfigPackageInstallationScripts> packageInstallationScripts) {
            this.packageInstallationScripts = packageInstallationScripts;
            return this;
        }
        public java.util.List<CreateImageRequestBuildConfigPackageInstallationScripts> getPackageInstallationScripts() {
            return this.packageInstallationScripts;
        }

    }

    public static class CreateImageRequestSupported extends TeaModel {
        /**
         * <p>The sub-module of the image. Valid values:</p>
         * <ul>
         * <li>Scheduler: Data Studio.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Scheduler</p>
         */
        @NameInMap("Module")
        public String module;

        /**
         * <p>The list of task types supported by the image.</p>
         */
        @NameInMap("TaskTypes")
        public java.util.List<String> taskTypes;

        public static CreateImageRequestSupported build(java.util.Map<String, ?> map) throws Exception {
            CreateImageRequestSupported self = new CreateImageRequestSupported();
            return TeaModel.build(map, self);
        }

        public CreateImageRequestSupported setModule(String module) {
            this.module = module;
            return this;
        }
        public String getModule() {
            return this.module;
        }

        public CreateImageRequestSupported setTaskTypes(java.util.List<String> taskTypes) {
            this.taskTypes = taskTypes;
            return this;
        }
        public java.util.List<String> getTaskTypes() {
            return this.taskTypes;
        }

    }

}
