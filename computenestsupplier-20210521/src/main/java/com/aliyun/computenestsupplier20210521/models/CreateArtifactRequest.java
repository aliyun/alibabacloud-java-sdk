// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class CreateArtifactRequest extends TeaModel {
    /**
     * <p>The build properties of the artifact, utilized for hosting and building the deployment package.</p>
     */
    @NameInMap("ArtifactBuildProperty")
    public CreateArtifactRequestArtifactBuildProperty artifactBuildProperty;

    /**
     * <p>The type of the artifact build task. Valid values:</p>
     * <ul>
     * <li><p>EcsImage: Build ECS (Elastic Container Service) image.</p>
     * </li>
     * <li><p>Dockerfile: Build container image based on Dockerfile.</p>
     * </li>
     * <li><p>Buildpacks: Build container image based on Buildpacks.</p>
     * </li>
     * <li><p>ContainerImage: Rebuild container image by renaming an existing container image.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Dockerfile</p>
     */
    @NameInMap("ArtifactBuildType")
    public String artifactBuildType;

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
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>10CM943JP0EN9D51H</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

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

    public CreateArtifactRequest setArtifactBuildProperty(CreateArtifactRequestArtifactBuildProperty artifactBuildProperty) {
        this.artifactBuildProperty = artifactBuildProperty;
        return this;
    }
    public CreateArtifactRequestArtifactBuildProperty getArtifactBuildProperty() {
        return this.artifactBuildProperty;
    }

    public CreateArtifactRequest setArtifactBuildType(String artifactBuildType) {
        this.artifactBuildType = artifactBuildType;
        return this;
    }
    public String getArtifactBuildType() {
        return this.artifactBuildType;
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

    public CreateArtifactRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
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

    public static class CreateArtifactRequestArtifactBuildPropertyBuildArgs extends TeaModel {
        /**
         * <p>The name of a specific build argument.</p>
         * 
         * <strong>example:</strong>
         * <p>ENV</p>
         */
        @NameInMap("ArgumentName")
        public String argumentName;

        /**
         * <p>The value of a specific build argument.</p>
         * 
         * <strong>example:</strong>
         * <p>nginx:latest</p>
         */
        @NameInMap("ArgumentValue")
        public String argumentValue;

        public static CreateArtifactRequestArtifactBuildPropertyBuildArgs build(java.util.Map<String, ?> map) throws Exception {
            CreateArtifactRequestArtifactBuildPropertyBuildArgs self = new CreateArtifactRequestArtifactBuildPropertyBuildArgs();
            return TeaModel.build(map, self);
        }

        public CreateArtifactRequestArtifactBuildPropertyBuildArgs setArgumentName(String argumentName) {
            this.argumentName = argumentName;
            return this;
        }
        public String getArgumentName() {
            return this.argumentName;
        }

        public CreateArtifactRequestArtifactBuildPropertyBuildArgs setArgumentValue(String argumentValue) {
            this.argumentValue = argumentValue;
            return this;
        }
        public String getArgumentValue() {
            return this.argumentValue;
        }

    }

    public static class CreateArtifactRequestArtifactBuildPropertyCodeRepo extends TeaModel {
        /**
         * <p>The name of the branch in the code repository.</p>
         * 
         * <strong>example:</strong>
         * <p>main</p>
         */
        @NameInMap("Branch")
        public String branch;

        /**
         * <p>The endpoint. 
         * The URL address used to access the privately deployed GitLab instance.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://121.40.25.0">http://121.40.25.0</a></p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The organization ID.</p>
         * 
         * <strong>example:</strong>
         * <p>455231</p>
         */
        @NameInMap("OrgId")
        public String orgId;

        /**
         * <p>The owner of the code repository.</p>
         * <blockquote>
         * <p> This parameter is available only if the git repository is private.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>aliyun-computenest</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The platform type. Valid values: </p>
         * <ul>
         * <li><p>github</p>
         * </li>
         * <li><p>gitee</p>
         * </li>
         * <li><p>gitlab</p>
         * </li>
         * <li><p>codeup</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>github</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>The repository ID.</p>
         * 
         * <strong>example:</strong>
         * <p>103</p>
         */
        @NameInMap("RepoId")
        public Long repoId;

        /**
         * <p>The name of the repository.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun-computenest/quickstart-Lobexxx</p>
         */
        @NameInMap("RepoName")
        public String repoName;

        public static CreateArtifactRequestArtifactBuildPropertyCodeRepo build(java.util.Map<String, ?> map) throws Exception {
            CreateArtifactRequestArtifactBuildPropertyCodeRepo self = new CreateArtifactRequestArtifactBuildPropertyCodeRepo();
            return TeaModel.build(map, self);
        }

        public CreateArtifactRequestArtifactBuildPropertyCodeRepo setBranch(String branch) {
            this.branch = branch;
            return this;
        }
        public String getBranch() {
            return this.branch;
        }

        public CreateArtifactRequestArtifactBuildPropertyCodeRepo setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateArtifactRequestArtifactBuildPropertyCodeRepo setOrgId(String orgId) {
            this.orgId = orgId;
            return this;
        }
        public String getOrgId() {
            return this.orgId;
        }

        public CreateArtifactRequestArtifactBuildPropertyCodeRepo setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public CreateArtifactRequestArtifactBuildPropertyCodeRepo setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public CreateArtifactRequestArtifactBuildPropertyCodeRepo setRepoId(Long repoId) {
            this.repoId = repoId;
            return this;
        }
        public Long getRepoId() {
            return this.repoId;
        }

        public CreateArtifactRequestArtifactBuildPropertyCodeRepo setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

    }

    public static class CreateArtifactRequestArtifactBuildProperty extends TeaModel {
        /**
         * <p>The build arguments used during the image build process.</p>
         * <blockquote>
         * <p> This parameter is available only if the ArtifactBuildType is Dockerfile type.</p>
         * </blockquote>
         */
        @NameInMap("BuildArgs")
        public java.util.List<CreateArtifactRequestArtifactBuildPropertyBuildArgs> buildArgs;

        /**
         * <p>The address of the code repository.</p>
         * <blockquote>
         * <p> This parameter is available only if the ArtifactBuildType is Dockerfile or Buildpacks type.</p>
         * </blockquote>
         */
        @NameInMap("CodeRepo")
        public CreateArtifactRequestArtifactBuildPropertyCodeRepo codeRepo;

        /**
         * <p>The command content.</p>
         * <blockquote>
         * <p> This parameter is available only if the deployment package is a ecs image type.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>echo &quot;start run command&quot;</p>
         */
        @NameInMap("CommandContent")
        public String commandContent;

        /**
         * <p>The command type. Valid values:</p>
         * <ul>
         * <li>RunBatScript: batch command, applicable to Windows instances.</li>
         * <li>RunPowerShellScript: PowerShell command, applicable to Windows instances.</li>
         * <li>RunShellScript: shell command, applicable to Linux instances.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is available only if the deployment package is a ecs image type.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>RunShellScript</p>
         */
        @NameInMap("CommandType")
        public String commandType;

        /**
         * <p>The relative path to the Dockerfile within the code repository.</p>
         * <blockquote>
         * <p> This parameter is available only if the ArtifactBuildType is Dockerfile type.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>./file/Dockerfile</p>
         */
        @NameInMap("DockerfilePath")
        public String dockerfilePath;

        /**
         * <p>The region ID where the source mirror image is located.</p>
         * <blockquote>
         * <p> This parameter is available only if the deployment package is a ecs image type.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The pull location of the source container image. This is used for the command docker pull ${SourceContainerImage}.</p>
         * <blockquote>
         * <p> This parameter is available only if the ArtifactBuildType is ContainerImage type.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pytorch/pytorch:2.5.1-cuda12.4-cudnn9-devel</p>
         */
        @NameInMap("SourceContainerImage")
        public String sourceContainerImage;

        /**
         * <p>The source image id. Supported Types:</p>
         * <ul>
         * <li><p>Image ID: Pass the Image ID of the Ecs image directly.</p>
         * </li>
         * <li><p>OOS Common Parameter Name: Obtain the corresponding Image ID automatically by using the OOS common parameter name.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p> This parameter is available only if the deployment package is a ecs image type.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Image ID：m-t4nhenrdc38pe4*****
         * ubuntu_22_04_x64_20G_alibase_20240926.vhd
         * OOS Common Parameter Name：aliyun/services/computenest/images/aliyun_3_2104_python_3_11</p>
         */
        @NameInMap("SourceImageId")
        public String sourceImageId;

        @NameInMap("SystemDiskSize")
        public Long systemDiskSize;

        public static CreateArtifactRequestArtifactBuildProperty build(java.util.Map<String, ?> map) throws Exception {
            CreateArtifactRequestArtifactBuildProperty self = new CreateArtifactRequestArtifactBuildProperty();
            return TeaModel.build(map, self);
        }

        public CreateArtifactRequestArtifactBuildProperty setBuildArgs(java.util.List<CreateArtifactRequestArtifactBuildPropertyBuildArgs> buildArgs) {
            this.buildArgs = buildArgs;
            return this;
        }
        public java.util.List<CreateArtifactRequestArtifactBuildPropertyBuildArgs> getBuildArgs() {
            return this.buildArgs;
        }

        public CreateArtifactRequestArtifactBuildProperty setCodeRepo(CreateArtifactRequestArtifactBuildPropertyCodeRepo codeRepo) {
            this.codeRepo = codeRepo;
            return this;
        }
        public CreateArtifactRequestArtifactBuildPropertyCodeRepo getCodeRepo() {
            return this.codeRepo;
        }

        public CreateArtifactRequestArtifactBuildProperty setCommandContent(String commandContent) {
            this.commandContent = commandContent;
            return this;
        }
        public String getCommandContent() {
            return this.commandContent;
        }

        public CreateArtifactRequestArtifactBuildProperty setCommandType(String commandType) {
            this.commandType = commandType;
            return this;
        }
        public String getCommandType() {
            return this.commandType;
        }

        public CreateArtifactRequestArtifactBuildProperty setDockerfilePath(String dockerfilePath) {
            this.dockerfilePath = dockerfilePath;
            return this;
        }
        public String getDockerfilePath() {
            return this.dockerfilePath;
        }

        public CreateArtifactRequestArtifactBuildProperty setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateArtifactRequestArtifactBuildProperty setSourceContainerImage(String sourceContainerImage) {
            this.sourceContainerImage = sourceContainerImage;
            return this;
        }
        public String getSourceContainerImage() {
            return this.sourceContainerImage;
        }

        public CreateArtifactRequestArtifactBuildProperty setSourceImageId(String sourceImageId) {
            this.sourceImageId = sourceImageId;
            return this;
        }
        public String getSourceImageId() {
            return this.sourceImageId;
        }

        public CreateArtifactRequestArtifactBuildProperty setSystemDiskSize(Long systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Long getSystemDiskSize() {
            return this.systemDiskSize;
        }

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
         * <p>The default repository type. Valid values:</p>
         * <ul>
         * <li><code>Public</code>: a public repository.</li>
         * <li><code>Private</code>: a private repository.</li>
         * </ul>
         * <p>You can specify the RepoType or Summary parameter. The RepoType parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>Public</p>
         */
        @NameInMap("RepoType")
        public String repoType;

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

        public CreateArtifactRequestArtifactProperty setRepoType(String repoType) {
            this.repoType = repoType;
            return this;
        }
        public String getRepoType() {
            return this.repoType;
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
