// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateImageRequest extends TeaModel {
    /**
     * <p>The image visibility. Valid values:</p>
     * <ul>
     * <li>Public: visible to all users.</li>
     * <li>Private: visible only to the creator.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Public</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The VPC ID associated with the ACR instance. This parameter is required when referencing an ACR image.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-xxx</p>
     */
    @NameInMap("AcrAssociatedVpcId")
    public String acrAssociatedVpcId;

    /**
     * <p>The Container Registry (ACR) instance ID. This parameter is required when referencing an ACR image.</p>
     * 
     * <strong>example:</strong>
     * <p>acr_instance_id</p>
     */
    @NameInMap("AcrInstanceId")
    public String acrInstanceId;

    /**
     * <p>The image build configuration.</p>
     */
    @NameInMap("BuildConfig")
    public UpdateImageRequestBuildConfig buildConfig;

    /**
     * <p>The image description.</p>
     * 
     * <strong>example:</strong>
     * <p>create by xxxx</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The image ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom_image_xxxx_xxxx</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The image URI. This parameter is required when referencing an ACR image.</p>
     * 
     * <strong>example:</strong>
     * <p>registry-vpc.cn-beijing.cr.aliyuncs.com/namespace/image:0.1.0</p>
     */
    @NameInMap("ImageUri")
    public String imageUri;

    /**
     * <p>The image name.</p>
     * 
     * <strong>example:</strong>
     * <p>task_image_001</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The image namespace. Set this parameter to DataWorks Default when referencing a DataWorks official image.</p>
     * 
     * <strong>example:</strong>
     * <p>namespace_name</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The provider image ID. This parameter is required when referencing a DataWorks official image.</p>
     * 
     * <strong>example:</strong>
     * <p>System_shell_20251201</p>
     */
    @NameInMap("ProviderImageId")
    public String providerImageId;

    /**
     * <p>The image repository name. Set this parameter to DataWorks Default when referencing a DataWorks official image.</p>
     * 
     * <strong>example:</strong>
     * <p>repo_name</p>
     */
    @NameInMap("RepositoryName")
    public String repositoryName;

    /**
     * <p>The image sub-purpose.</p>
     */
    @NameInMap("Supported")
    public UpdateImageRequestSupported supported;

    public static UpdateImageRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageRequest self = new UpdateImageRequest();
        return TeaModel.build(map, self);
    }

    public UpdateImageRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public UpdateImageRequest setAcrAssociatedVpcId(String acrAssociatedVpcId) {
        this.acrAssociatedVpcId = acrAssociatedVpcId;
        return this;
    }
    public String getAcrAssociatedVpcId() {
        return this.acrAssociatedVpcId;
    }

    public UpdateImageRequest setAcrInstanceId(String acrInstanceId) {
        this.acrInstanceId = acrInstanceId;
        return this;
    }
    public String getAcrInstanceId() {
        return this.acrInstanceId;
    }

    public UpdateImageRequest setBuildConfig(UpdateImageRequestBuildConfig buildConfig) {
        this.buildConfig = buildConfig;
        return this;
    }
    public UpdateImageRequestBuildConfig getBuildConfig() {
        return this.buildConfig;
    }

    public UpdateImageRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateImageRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateImageRequest setImageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }
    public String getImageUri() {
        return this.imageUri;
    }

    public UpdateImageRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateImageRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateImageRequest setProviderImageId(String providerImageId) {
        this.providerImageId = providerImageId;
        return this;
    }
    public String getProviderImageId() {
        return this.providerImageId;
    }

    public UpdateImageRequest setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }
    public String getRepositoryName() {
        return this.repositoryName;
    }

    public UpdateImageRequest setSupported(UpdateImageRequestSupported supported) {
        this.supported = supported;
        return this;
    }
    public UpdateImageRequestSupported getSupported() {
        return this.supported;
    }

    public static class UpdateImageRequestBuildConfigPackageInstallationScripts extends TeaModel {
        /**
         * <p>The script content. If the content consists of package names, separate them with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>requests</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The script type.</p>
         * 
         * <strong>example:</strong>
         * <p>Python3</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateImageRequestBuildConfigPackageInstallationScripts build(java.util.Map<String, ?> map) throws Exception {
            UpdateImageRequestBuildConfigPackageInstallationScripts self = new UpdateImageRequestBuildConfigPackageInstallationScripts();
            return TeaModel.build(map, self);
        }

        public UpdateImageRequestBuildConfigPackageInstallationScripts setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateImageRequestBuildConfigPackageInstallationScripts setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateImageRequestBuildConfig extends TeaModel {
        /**
         * <p>The build type.</p>
         * 
         * <strong>example:</strong>
         * <p>PackageInstallation</p>
         */
        @NameInMap("BuildType")
        public String buildType;

        /**
         * <p>The list of pre-installation scripts.</p>
         */
        @NameInMap("PackageInstallationScripts")
        public java.util.List<UpdateImageRequestBuildConfigPackageInstallationScripts> packageInstallationScripts;

        public static UpdateImageRequestBuildConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateImageRequestBuildConfig self = new UpdateImageRequestBuildConfig();
            return TeaModel.build(map, self);
        }

        public UpdateImageRequestBuildConfig setBuildType(String buildType) {
            this.buildType = buildType;
            return this;
        }
        public String getBuildType() {
            return this.buildType;
        }

        public UpdateImageRequestBuildConfig setPackageInstallationScripts(java.util.List<UpdateImageRequestBuildConfigPackageInstallationScripts> packageInstallationScripts) {
            this.packageInstallationScripts = packageInstallationScripts;
            return this;
        }
        public java.util.List<UpdateImageRequestBuildConfigPackageInstallationScripts> getPackageInstallationScripts() {
            return this.packageInstallationScripts;
        }

    }

    public static class UpdateImageRequestSupported extends TeaModel {
        /**
         * <p>The image sub-module. Valid values:</p>
         * <ul>
         * <li>Scheduler: data development.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Scheduler</p>
         */
        @NameInMap("Module")
        public String module;

        /**
         * <p>The list of node types supported by the image.</p>
         */
        @NameInMap("TaskTypes")
        public java.util.List<String> taskTypes;

        public static UpdateImageRequestSupported build(java.util.Map<String, ?> map) throws Exception {
            UpdateImageRequestSupported self = new UpdateImageRequestSupported();
            return TeaModel.build(map, self);
        }

        public UpdateImageRequestSupported setModule(String module) {
            this.module = module;
            return this;
        }
        public String getModule() {
            return this.module;
        }

        public UpdateImageRequestSupported setTaskTypes(java.util.List<String> taskTypes) {
            this.taskTypes = taskTypes;
            return this;
        }
        public java.util.List<String> getTaskTypes() {
            return this.taskTypes;
        }

    }

}
