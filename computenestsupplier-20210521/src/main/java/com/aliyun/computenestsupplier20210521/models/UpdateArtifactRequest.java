// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpdateArtifactRequest extends TeaModel {
    /**
     * <p>The build properties of the artifact, utilized for hosting and building the deployment package.</p>
     */
    @NameInMap("ArtifactBuildProperty")
    public UpdateArtifactRequestArtifactBuildProperty artifactBuildProperty;

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

    public UpdateArtifactRequest setArtifactBuildProperty(UpdateArtifactRequestArtifactBuildProperty artifactBuildProperty) {
        this.artifactBuildProperty = artifactBuildProperty;
        return this;
    }
    public UpdateArtifactRequestArtifactBuildProperty getArtifactBuildProperty() {
        return this.artifactBuildProperty;
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

    public static class UpdateArtifactRequestArtifactBuildPropertyBuildArgs extends TeaModel {
        @NameInMap("ArgumentName")
        public String argumentName;

        @NameInMap("ArgumentValue")
        public String argumentValue;

        public static UpdateArtifactRequestArtifactBuildPropertyBuildArgs build(java.util.Map<String, ?> map) throws Exception {
            UpdateArtifactRequestArtifactBuildPropertyBuildArgs self = new UpdateArtifactRequestArtifactBuildPropertyBuildArgs();
            return TeaModel.build(map, self);
        }

        public UpdateArtifactRequestArtifactBuildPropertyBuildArgs setArgumentName(String argumentName) {
            this.argumentName = argumentName;
            return this;
        }
        public String getArgumentName() {
            return this.argumentName;
        }

        public UpdateArtifactRequestArtifactBuildPropertyBuildArgs setArgumentValue(String argumentValue) {
            this.argumentValue = argumentValue;
            return this;
        }
        public String getArgumentValue() {
            return this.argumentValue;
        }

    }

    public static class UpdateArtifactRequestArtifactBuildPropertyCodeRepo extends TeaModel {
        @NameInMap("Branch")
        public String branch;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("RepoName")
        public String repoName;

        public static UpdateArtifactRequestArtifactBuildPropertyCodeRepo build(java.util.Map<String, ?> map) throws Exception {
            UpdateArtifactRequestArtifactBuildPropertyCodeRepo self = new UpdateArtifactRequestArtifactBuildPropertyCodeRepo();
            return TeaModel.build(map, self);
        }

        public UpdateArtifactRequestArtifactBuildPropertyCodeRepo setBranch(String branch) {
            this.branch = branch;
            return this;
        }
        public String getBranch() {
            return this.branch;
        }

        public UpdateArtifactRequestArtifactBuildPropertyCodeRepo setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public UpdateArtifactRequestArtifactBuildPropertyCodeRepo setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public UpdateArtifactRequestArtifactBuildPropertyCodeRepo setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

    }

    public static class UpdateArtifactRequestArtifactBuildProperty extends TeaModel {
        @NameInMap("BuildArgs")
        public java.util.List<UpdateArtifactRequestArtifactBuildPropertyBuildArgs> buildArgs;

        @NameInMap("CodeRepo")
        public UpdateArtifactRequestArtifactBuildPropertyCodeRepo codeRepo;

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

        public static UpdateArtifactRequestArtifactBuildProperty build(java.util.Map<String, ?> map) throws Exception {
            UpdateArtifactRequestArtifactBuildProperty self = new UpdateArtifactRequestArtifactBuildProperty();
            return TeaModel.build(map, self);
        }

        public UpdateArtifactRequestArtifactBuildProperty setBuildArgs(java.util.List<UpdateArtifactRequestArtifactBuildPropertyBuildArgs> buildArgs) {
            this.buildArgs = buildArgs;
            return this;
        }
        public java.util.List<UpdateArtifactRequestArtifactBuildPropertyBuildArgs> getBuildArgs() {
            return this.buildArgs;
        }

        public UpdateArtifactRequestArtifactBuildProperty setCodeRepo(UpdateArtifactRequestArtifactBuildPropertyCodeRepo codeRepo) {
            this.codeRepo = codeRepo;
            return this;
        }
        public UpdateArtifactRequestArtifactBuildPropertyCodeRepo getCodeRepo() {
            return this.codeRepo;
        }

        public UpdateArtifactRequestArtifactBuildProperty setCommandContent(String commandContent) {
            this.commandContent = commandContent;
            return this;
        }
        public String getCommandContent() {
            return this.commandContent;
        }

        public UpdateArtifactRequestArtifactBuildProperty setCommandType(String commandType) {
            this.commandType = commandType;
            return this;
        }
        public String getCommandType() {
            return this.commandType;
        }

        public UpdateArtifactRequestArtifactBuildProperty setDockerfilePath(String dockerfilePath) {
            this.dockerfilePath = dockerfilePath;
            return this;
        }
        public String getDockerfilePath() {
            return this.dockerfilePath;
        }

        public UpdateArtifactRequestArtifactBuildProperty setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdateArtifactRequestArtifactBuildProperty setSourceContainerImage(String sourceContainerImage) {
            this.sourceContainerImage = sourceContainerImage;
            return this;
        }
        public String getSourceContainerImage() {
            return this.sourceContainerImage;
        }

        public UpdateArtifactRequestArtifactBuildProperty setSourceImageId(String sourceImageId) {
            this.sourceImageId = sourceImageId;
            return this;
        }
        public String getSourceImageId() {
            return this.sourceImageId;
        }

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

        @NameInMap("RepoId")
        public String repoId;

        @NameInMap("RepoName")
        public String repoName;

        @NameInMap("RepoType")
        public String repoType;

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

        @NameInMap("Tag")
        public String tag;

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

        public UpdateArtifactRequestArtifactProperty setRepoId(String repoId) {
            this.repoId = repoId;
            return this;
        }
        public String getRepoId() {
            return this.repoId;
        }

        public UpdateArtifactRequestArtifactProperty setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public UpdateArtifactRequestArtifactProperty setRepoType(String repoType) {
            this.repoType = repoType;
            return this;
        }
        public String getRepoType() {
            return this.repoType;
        }

        public UpdateArtifactRequestArtifactProperty setScriptMetadata(String scriptMetadata) {
            this.scriptMetadata = scriptMetadata;
            return this;
        }
        public String getScriptMetadata() {
            return this.scriptMetadata;
        }

        public UpdateArtifactRequestArtifactProperty setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
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
