// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListImageVersionsResponseBody extends TeaModel {
    /**
     * <p>The pagination details.</p>
     */
    @NameInMap("PagingInfo")
    public ListImageVersionsResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID, used to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>6A6CBE87-9F91-1323-B680-E7A7065XXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListImageVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListImageVersionsResponseBody self = new ListImageVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListImageVersionsResponseBody setPagingInfo(ListImageVersionsResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListImageVersionsResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListImageVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListImageVersionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListImageVersionsResponseBodyPagingInfoImageVersionsBuildConfigPackageInstallationScripts extends TeaModel {
        /**
         * <p>The script content. Separate multiple package names with a comma (,).</p>
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

        public static ListImageVersionsResponseBodyPagingInfoImageVersionsBuildConfigPackageInstallationScripts build(java.util.Map<String, ?> map) throws Exception {
            ListImageVersionsResponseBodyPagingInfoImageVersionsBuildConfigPackageInstallationScripts self = new ListImageVersionsResponseBodyPagingInfoImageVersionsBuildConfigPackageInstallationScripts();
            return TeaModel.build(map, self);
        }

        public ListImageVersionsResponseBodyPagingInfoImageVersionsBuildConfigPackageInstallationScripts setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListImageVersionsResponseBodyPagingInfoImageVersionsBuildConfigPackageInstallationScripts setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListImageVersionsResponseBodyPagingInfoImageVersionsBuildConfig extends TeaModel {
        /**
         * <p>The build type.</p>
         * 
         * <strong>example:</strong>
         * <p>PackageInstallation</p>
         */
        @NameInMap("BuildType")
        public String buildType;

        /**
         * <p>The pre-installation scripts.</p>
         */
        @NameInMap("PackageInstallationScripts")
        public java.util.List<ListImageVersionsResponseBodyPagingInfoImageVersionsBuildConfigPackageInstallationScripts> packageInstallationScripts;

        public static ListImageVersionsResponseBodyPagingInfoImageVersionsBuildConfig build(java.util.Map<String, ?> map) throws Exception {
            ListImageVersionsResponseBodyPagingInfoImageVersionsBuildConfig self = new ListImageVersionsResponseBodyPagingInfoImageVersionsBuildConfig();
            return TeaModel.build(map, self);
        }

        public ListImageVersionsResponseBodyPagingInfoImageVersionsBuildConfig setBuildType(String buildType) {
            this.buildType = buildType;
            return this;
        }
        public String getBuildType() {
            return this.buildType;
        }

        public ListImageVersionsResponseBodyPagingInfoImageVersionsBuildConfig setPackageInstallationScripts(java.util.List<ListImageVersionsResponseBodyPagingInfoImageVersionsBuildConfigPackageInstallationScripts> packageInstallationScripts) {
            this.packageInstallationScripts = packageInstallationScripts;
            return this;
        }
        public java.util.List<ListImageVersionsResponseBodyPagingInfoImageVersionsBuildConfigPackageInstallationScripts> getPackageInstallationScripts() {
            return this.packageInstallationScripts;
        }

    }

    public static class ListImageVersionsResponseBodyPagingInfoImageVersionsSupported extends TeaModel {
        /**
         * <p>The supported module. Valid value:</p>
         * <ul>
         * <li><code>Scheduler</code>: The scheduler module.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Scheduler</p>
         */
        @NameInMap("Module")
        public String module;

        /**
         * <p>The supported task types.</p>
         */
        @NameInMap("TaskTypes")
        public java.util.List<String> taskTypes;

        public static ListImageVersionsResponseBodyPagingInfoImageVersionsSupported build(java.util.Map<String, ?> map) throws Exception {
            ListImageVersionsResponseBodyPagingInfoImageVersionsSupported self = new ListImageVersionsResponseBodyPagingInfoImageVersionsSupported();
            return TeaModel.build(map, self);
        }

        public ListImageVersionsResponseBodyPagingInfoImageVersionsSupported setModule(String module) {
            this.module = module;
            return this;
        }
        public String getModule() {
            return this.module;
        }

        public ListImageVersionsResponseBodyPagingInfoImageVersionsSupported setTaskTypes(java.util.List<String> taskTypes) {
            this.taskTypes = taskTypes;
            return this;
        }
        public java.util.List<String> getTaskTypes() {
            return this.taskTypes;
        }

    }

    public static class ListImageVersionsResponseBodyPagingInfoImageVersions extends TeaModel {
        /**
         * <p>The accessibility of the image. Valid values:</p>
         * <ul>
         * <li><p><code>Public</code>: The image is visible to all users.</p>
         * </li>
         * <li><p><code>Private</code>: The image is visible only to the creator.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Public</p>
         */
        @NameInMap("Accessibility")
        public String accessibility;

        /**
         * <p>The ID of the VPC associated with the ACR instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-xxx</p>
         */
        @NameInMap("AcrAssociatedVpcId")
        public String acrAssociatedVpcId;

        /**
         * <p>The ACR endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.cn-hangzhou.aliyuncs.com</p>
         */
        @NameInMap("AcrEndpoint")
        public String acrEndpoint;

        /**
         * <p>The ACR instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-xxx</p>
         */
        @NameInMap("AcrInstanceId")
        public String acrInstanceId;

        /**
         * <p>The image build configuration.</p>
         */
        @NameInMap("BuildConfig")
        public ListImageVersionsResponseBodyPagingInfoImageVersionsBuildConfig buildConfig;

        /**
         * <p>The time when the image was created, as a 64-bit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1727055811000</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The ID of the user who created the image.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The image description.</p>
         * 
         * <strong>example:</strong>
         * <p>Test image created by xxx</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether MaxCompute synchronization is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableSyncMaxCompute")
        public Boolean enableSyncMaxCompute;

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom_image_xxxx_xxxx</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The image tag.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.0.0</p>
         */
        @NameInMap("ImageTag")
        public String imageTag;

        /**
         * <p>The image URI.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.cn-hangzhou.aliyuncs.com/xxx/xxx:tag</p>
         */
        @NameInMap("ImageUri")
        public String imageUri;

        /**
         * <p>The VPC URI of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-hangzhou.aliyuncs.com/xxx/xxx:tag</p>
         */
        @NameInMap("ImageVpcUri")
        public String imageVpcUri;

        /**
         * <p>Indicates whether the image is the default image.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The time when the image was last modified, as a 64-bit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1727055811000</p>
         */
        @NameInMap("LastModifiedTime")
        public Long lastModifiedTime;

        /**
         * <p>The ID of the user who last modified the image.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Modifier")
        public String modifier;

        /**
         * <p>The image name.</p>
         * 
         * <strong>example:</strong>
         * <p>dataworks_image</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>namespace</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>Indicates whether the image is an official image.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Official")
        public Boolean official;

        /**
         * <p>The ID of the image from the provider.</p>
         * 
         * <strong>example:</strong>
         * <p>acr_image_id</p>
         */
        @NameInMap("ProviderImageId")
        public String providerImageId;

        /**
         * <p>The type of the image provider. Valid values:</p>
         * <ul>
         * <li><p><code>ACR</code>: The image is from an ACR repository.</p>
         * </li>
         * <li><p><code>DataWorks</code>: The image is an official image provided by DataWorks.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACR</p>
         */
        @NameInMap("ProviderType")
        public String providerType;

        /**
         * <p>The publishing stage of the image. Valid values:</p>
         * <ul>
         * <li><p><code>Untest</code>: Not tested.</p>
         * </li>
         * <li><p><code>Testing</code>: Being tested.</p>
         * </li>
         * <li><p><code>TestFailed</code>: Test failed.</p>
         * </li>
         * <li><p><code>Unpublished</code>: Not published.</p>
         * </li>
         * <li><p><code>Publishing</code>: Being published.</p>
         * </li>
         * <li><p><code>Published</code>: Published.</p>
         * </li>
         * <li><p><code>PublishFailed</code>: Publishing failed.</p>
         * </li>
         * <li><p><code>Building</code>: Being built.</p>
         * </li>
         * <li><p><code>BuildSuccess</code>: Build succeeded.</p>
         * </li>
         * <li><p><code>BuildFailed</code>: Build failed.</p>
         * </li>
         * <li><p><code>Accelerating</code>: Being accelerated.</p>
         * </li>
         * <li><p><code>AccelerateSuccess</code>: Acceleration succeeded.</p>
         * </li>
         * <li><p><code>AccelerateFailed</code>: Acceleration failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Published</p>
         */
        @NameInMap("PublishStage")
        public String publishStage;

        /**
         * <p>The repository name.</p>
         * 
         * <strong>example:</strong>
         * <p>repo_name</p>
         */
        @NameInMap("RepositoryName")
        public String repositoryName;

        /**
         * <p>The image size.</p>
         * 
         * <strong>example:</strong>
         * <p>1GB</p>
         */
        @NameInMap("Size")
        public String size;

        /**
         * <p>The status of the image. Valid values:</p>
         * <ul>
         * <li><p><code>Disabled</code>: The image is disabled.</p>
         * </li>
         * <li><p><code>Expired</code>: The image is expired.</p>
         * </li>
         * <li><p><code>Available</code>: The image is available.</p>
         * </li>
         * <li><p><code>ReadOnly</code>: The image is read-only.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The supported modules and task types.</p>
         */
        @NameInMap("Supported")
        public ListImageVersionsResponseBodyPagingInfoImageVersionsSupported supported;

        /**
         * <p>The image version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListImageVersionsResponseBodyPagingInfoImageVersions build(java.util.Map<String, ?> map) throws Exception {
            ListImageVersionsResponseBodyPagingInfoImageVersions self = new ListImageVersionsResponseBodyPagingInfoImageVersions();
            return TeaModel.build(map, self);
        }

        public ListImageVersionsResponseBodyPagingInfoImageVersions setAccessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }
        public String getAccessibility() {
            return this.accessibility;
        }

        public ListImageVersionsResponseBodyPagingInfoImageVersions setAcrAssociatedVpcId(String acrAssociatedVpcId) {
            this.acrAssociatedVpcId = acrAssociatedVpcId;
            return this;
        }
        public String getAcrAssociatedVpcId() {
            return this.acrAssociatedVpcId;
        }

        public ListImageVersionsResponseBodyPagingInfoImageVersions setAcrEndpoint(String acrEndpoint) {
            this.acrEndpoint = acrEndpoint;
            return this;
        }
        public String getAcrEndpoint() {
            return this.acrEndpoint;
        }

        public ListImageVersionsResponseBodyPagingInfoImageVersions setAcrInstanceId(String acrInstanceId) {
            this.acrInstanceId = acrInstanceId;
            return this;
        }
        public String getAcrInstanceId() {
            return this.acrInstanceId;
        }

        public ListImageVersionsResponseBodyPagingInfoImageVersions setBuildConfig(ListImageVersionsResponseBodyPagingInfoImageVersionsBuildConfig buildConfig) {
            this.buildConfig = buildConfig;
            return this;
        }
        public ListImageVersionsResponseBodyPagingInfoImageVersionsBuildConfig getBuildConfig() {
            return this.buildConfig;
        }

        public ListImageVersionsResponseBodyPagingInfoImageVersions setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public ListImageVersionsResponseBodyPagingInfoImageVersions setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListImageVersionsResponseBodyPagingInfoImageVersions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListImageVersionsResponseBodyPagingInfoImageVersions setEnableSyncMaxCompute(Boolean enableSyncMaxCompute) {
            this.enableSyncMaxCompute = enableSyncMaxCompute;
            return this;
        }
        public Boolean getEnableSyncMaxCompute() {
            return this.enableSyncMaxCompute;
        }

        public ListImageVersionsResponseBodyPagingInfoImageVersions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListImageVersionsResponseBodyPagingInfoImageVersions setImageTag(String imageTag) {
            this.imageTag = imageTag;
            return this;
        }
        public String getImageTag() {
            return this.imageTag;
        }

        public ListImageVersionsResponseBodyPagingInfoImageVersions setImageUri(String imageUri) {
            this.imageUri = imageUri;
            return this;
        }
        public String getImageUri() {
            return this.imageUri;
        }

        public ListImageVersionsResponseBodyPagingInfoImageVersions setImageVpcUri(String imageVpcUri) {
            this.imageVpcUri = imageVpcUri;
            return this;
        }
        public String getImageVpcUri() {
            return this.imageVpcUri;
        }

        public ListImageVersionsResponseBodyPagingInfoImageVersions setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListImageVersionsResponseBodyPagingInfoImageVersions setLastModifiedTime(Long lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public Long getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public ListImageVersionsResponseBodyPagingInfoImageVersions setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListImageVersionsResponseBodyPagingInfoImageVersions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListImageVersionsResponseBodyPagingInfoImageVersions setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListImageVersionsResponseBodyPagingInfoImageVersions setOfficial(Boolean official) {
            this.official = official;
            return this;
        }
        public Boolean getOfficial() {
            return this.official;
        }

        public ListImageVersionsResponseBodyPagingInfoImageVersions setProviderImageId(String providerImageId) {
            this.providerImageId = providerImageId;
            return this;
        }
        public String getProviderImageId() {
            return this.providerImageId;
        }

        public ListImageVersionsResponseBodyPagingInfoImageVersions setProviderType(String providerType) {
            this.providerType = providerType;
            return this;
        }
        public String getProviderType() {
            return this.providerType;
        }

        public ListImageVersionsResponseBodyPagingInfoImageVersions setPublishStage(String publishStage) {
            this.publishStage = publishStage;
            return this;
        }
        public String getPublishStage() {
            return this.publishStage;
        }

        public ListImageVersionsResponseBodyPagingInfoImageVersions setRepositoryName(String repositoryName) {
            this.repositoryName = repositoryName;
            return this;
        }
        public String getRepositoryName() {
            return this.repositoryName;
        }

        public ListImageVersionsResponseBodyPagingInfoImageVersions setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public ListImageVersionsResponseBodyPagingInfoImageVersions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListImageVersionsResponseBodyPagingInfoImageVersions setSupported(ListImageVersionsResponseBodyPagingInfoImageVersionsSupported supported) {
            this.supported = supported;
            return this;
        }
        public ListImageVersionsResponseBodyPagingInfoImageVersionsSupported getSupported() {
            return this.supported;
        }

        public ListImageVersionsResponseBodyPagingInfoImageVersions setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListImageVersionsResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>A list of image version details.</p>
         */
        @NameInMap("ImageVersions")
        public java.util.List<ListImageVersionsResponseBodyPagingInfoImageVersions> imageVersions;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListImageVersionsResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListImageVersionsResponseBodyPagingInfo self = new ListImageVersionsResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListImageVersionsResponseBodyPagingInfo setImageVersions(java.util.List<ListImageVersionsResponseBodyPagingInfoImageVersions> imageVersions) {
            this.imageVersions = imageVersions;
            return this;
        }
        public java.util.List<ListImageVersionsResponseBodyPagingInfoImageVersions> getImageVersions() {
            return this.imageVersions;
        }

        public ListImageVersionsResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListImageVersionsResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListImageVersionsResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
