// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListImagesResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListImagesResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID, which is used to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>6A6CBE87-9F91-1323-B680-E7A7065XXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListImagesResponseBody self = new ListImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListImagesResponseBody setPagingInfo(ListImagesResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListImagesResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListImagesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListImagesResponseBodyPagingInfoImageListBuildConfigPackageInstallationScripts extends TeaModel {
        /**
         * <p>The script content. If the content specifies package names, separate them with commas (,).</p>
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

        public static ListImagesResponseBodyPagingInfoImageListBuildConfigPackageInstallationScripts build(java.util.Map<String, ?> map) throws Exception {
            ListImagesResponseBodyPagingInfoImageListBuildConfigPackageInstallationScripts self = new ListImagesResponseBodyPagingInfoImageListBuildConfigPackageInstallationScripts();
            return TeaModel.build(map, self);
        }

        public ListImagesResponseBodyPagingInfoImageListBuildConfigPackageInstallationScripts setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListImagesResponseBodyPagingInfoImageListBuildConfigPackageInstallationScripts setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListImagesResponseBodyPagingInfoImageListBuildConfig extends TeaModel {
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
        public java.util.List<ListImagesResponseBodyPagingInfoImageListBuildConfigPackageInstallationScripts> packageInstallationScripts;

        public static ListImagesResponseBodyPagingInfoImageListBuildConfig build(java.util.Map<String, ?> map) throws Exception {
            ListImagesResponseBodyPagingInfoImageListBuildConfig self = new ListImagesResponseBodyPagingInfoImageListBuildConfig();
            return TeaModel.build(map, self);
        }

        public ListImagesResponseBodyPagingInfoImageListBuildConfig setBuildType(String buildType) {
            this.buildType = buildType;
            return this;
        }
        public String getBuildType() {
            return this.buildType;
        }

        public ListImagesResponseBodyPagingInfoImageListBuildConfig setPackageInstallationScripts(java.util.List<ListImagesResponseBodyPagingInfoImageListBuildConfigPackageInstallationScripts> packageInstallationScripts) {
            this.packageInstallationScripts = packageInstallationScripts;
            return this;
        }
        public java.util.List<ListImagesResponseBodyPagingInfoImageListBuildConfigPackageInstallationScripts> getPackageInstallationScripts() {
            return this.packageInstallationScripts;
        }

    }

    public static class ListImagesResponseBodyPagingInfoImageListSupported extends TeaModel {
        /**
         * <p>The supported module:</p>
         * <ul>
         * <li>Scheduler: Scheduling.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Scheduler</p>
         */
        @NameInMap("Module")
        public String module;

        /**
         * <p>The list of supported task types.</p>
         */
        @NameInMap("TaskTypes")
        public java.util.List<String> taskTypes;

        public static ListImagesResponseBodyPagingInfoImageListSupported build(java.util.Map<String, ?> map) throws Exception {
            ListImagesResponseBodyPagingInfoImageListSupported self = new ListImagesResponseBodyPagingInfoImageListSupported();
            return TeaModel.build(map, self);
        }

        public ListImagesResponseBodyPagingInfoImageListSupported setModule(String module) {
            this.module = module;
            return this;
        }
        public String getModule() {
            return this.module;
        }

        public ListImagesResponseBodyPagingInfoImageListSupported setTaskTypes(java.util.List<String> taskTypes) {
            this.taskTypes = taskTypes;
            return this;
        }
        public java.util.List<String> getTaskTypes() {
            return this.taskTypes;
        }

    }

    public static class ListImagesResponseBodyPagingInfoImageList extends TeaModel {
        /**
         * <p>The accessibility:</p>
         * <ul>
         * <li><p>Public: Visible to all members.</p>
         * </li>
         * <li><p>Private: Visible only to the creator.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Public</p>
         */
        @NameInMap("Accessibility")
        public String accessibility;

        /**
         * <p>The VPC ID associated with the ACR instance.</p>
         * 
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
        public ListImagesResponseBodyPagingInfoImageListBuildConfig buildConfig;

        /**
         * <p>The creation time, represented as a 64-bit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1727055811000</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The ID of the creator.</p>
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
         * <p>Indicates whether synchronization with MaxCompute is enabled.</p>
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
         * <p>The image VPC URI.</p>
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
         * <p>The last modification time, represented as a 64-bit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1727055811000</p>
         */
        @NameInMap("LastModifiedTime")
        public Long lastModifiedTime;

        /**
         * <p>The ID of the modifier.</p>
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
         * <p>The image ID assigned by the provider.</p>
         * 
         * <strong>example:</strong>
         * <p>acr_image_id</p>
         */
        @NameInMap("ProviderImageId")
        public String providerImageId;

        /**
         * <p>The image provider type:</p>
         * <ul>
         * <li><p>ACR: ACR image repository.</p>
         * </li>
         * <li><p>DataWorks: DataWorks official image.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACR</p>
         */
        @NameInMap("ProviderType")
        public String providerType;

        /**
         * <p>The publish stage:</p>
         * <ul>
         * <li><p>Untest: Not tested.</p>
         * </li>
         * <li><p>Testing: Being tested.</p>
         * </li>
         * <li><p>TestFailed: Test failed.</p>
         * </li>
         * <li><p>Unpublished: Not published.</p>
         * </li>
         * <li><p>Publishing: Being published.</p>
         * </li>
         * <li><p>Published: Published.</p>
         * </li>
         * <li><p>PublishFailed: Publish failed.</p>
         * </li>
         * <li><p>Building: Being built.</p>
         * </li>
         * <li><p>BuildSuccess: Build succeeded.</p>
         * </li>
         * <li><p>BuildFailed: Build failed.</p>
         * </li>
         * <li><p>Accelerating: Being accelerated.</p>
         * </li>
         * <li><p>AccelerateSuccess: Acceleration succeeded.</p>
         * </li>
         * <li><p>AccelerateFailed: Acceleration failed.</p>
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
         * <p>The image status:</p>
         * <ul>
         * <li><p>Disabled: The image is disabled.</p>
         * </li>
         * <li><p>Expired: The image has expired.</p>
         * </li>
         * <li><p>Available: The image is available.</p>
         * </li>
         * <li><p>ReadOnly: The image is read-only.</p>
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
        public ListImagesResponseBodyPagingInfoImageListSupported supported;

        /**
         * <p>The image version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListImagesResponseBodyPagingInfoImageList build(java.util.Map<String, ?> map) throws Exception {
            ListImagesResponseBodyPagingInfoImageList self = new ListImagesResponseBodyPagingInfoImageList();
            return TeaModel.build(map, self);
        }

        public ListImagesResponseBodyPagingInfoImageList setAccessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }
        public String getAccessibility() {
            return this.accessibility;
        }

        public ListImagesResponseBodyPagingInfoImageList setAcrAssociatedVpcId(String acrAssociatedVpcId) {
            this.acrAssociatedVpcId = acrAssociatedVpcId;
            return this;
        }
        public String getAcrAssociatedVpcId() {
            return this.acrAssociatedVpcId;
        }

        public ListImagesResponseBodyPagingInfoImageList setAcrEndpoint(String acrEndpoint) {
            this.acrEndpoint = acrEndpoint;
            return this;
        }
        public String getAcrEndpoint() {
            return this.acrEndpoint;
        }

        public ListImagesResponseBodyPagingInfoImageList setAcrInstanceId(String acrInstanceId) {
            this.acrInstanceId = acrInstanceId;
            return this;
        }
        public String getAcrInstanceId() {
            return this.acrInstanceId;
        }

        public ListImagesResponseBodyPagingInfoImageList setBuildConfig(ListImagesResponseBodyPagingInfoImageListBuildConfig buildConfig) {
            this.buildConfig = buildConfig;
            return this;
        }
        public ListImagesResponseBodyPagingInfoImageListBuildConfig getBuildConfig() {
            return this.buildConfig;
        }

        public ListImagesResponseBodyPagingInfoImageList setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public ListImagesResponseBodyPagingInfoImageList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListImagesResponseBodyPagingInfoImageList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListImagesResponseBodyPagingInfoImageList setEnableSyncMaxCompute(Boolean enableSyncMaxCompute) {
            this.enableSyncMaxCompute = enableSyncMaxCompute;
            return this;
        }
        public Boolean getEnableSyncMaxCompute() {
            return this.enableSyncMaxCompute;
        }

        public ListImagesResponseBodyPagingInfoImageList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListImagesResponseBodyPagingInfoImageList setImageTag(String imageTag) {
            this.imageTag = imageTag;
            return this;
        }
        public String getImageTag() {
            return this.imageTag;
        }

        public ListImagesResponseBodyPagingInfoImageList setImageUri(String imageUri) {
            this.imageUri = imageUri;
            return this;
        }
        public String getImageUri() {
            return this.imageUri;
        }

        public ListImagesResponseBodyPagingInfoImageList setImageVpcUri(String imageVpcUri) {
            this.imageVpcUri = imageVpcUri;
            return this;
        }
        public String getImageVpcUri() {
            return this.imageVpcUri;
        }

        public ListImagesResponseBodyPagingInfoImageList setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListImagesResponseBodyPagingInfoImageList setLastModifiedTime(Long lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public Long getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public ListImagesResponseBodyPagingInfoImageList setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListImagesResponseBodyPagingInfoImageList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListImagesResponseBodyPagingInfoImageList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListImagesResponseBodyPagingInfoImageList setOfficial(Boolean official) {
            this.official = official;
            return this;
        }
        public Boolean getOfficial() {
            return this.official;
        }

        public ListImagesResponseBodyPagingInfoImageList setProviderImageId(String providerImageId) {
            this.providerImageId = providerImageId;
            return this;
        }
        public String getProviderImageId() {
            return this.providerImageId;
        }

        public ListImagesResponseBodyPagingInfoImageList setProviderType(String providerType) {
            this.providerType = providerType;
            return this;
        }
        public String getProviderType() {
            return this.providerType;
        }

        public ListImagesResponseBodyPagingInfoImageList setPublishStage(String publishStage) {
            this.publishStage = publishStage;
            return this;
        }
        public String getPublishStage() {
            return this.publishStage;
        }

        public ListImagesResponseBodyPagingInfoImageList setRepositoryName(String repositoryName) {
            this.repositoryName = repositoryName;
            return this;
        }
        public String getRepositoryName() {
            return this.repositoryName;
        }

        public ListImagesResponseBodyPagingInfoImageList setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public ListImagesResponseBodyPagingInfoImageList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListImagesResponseBodyPagingInfoImageList setSupported(ListImagesResponseBodyPagingInfoImageListSupported supported) {
            this.supported = supported;
            return this;
        }
        public ListImagesResponseBodyPagingInfoImageListSupported getSupported() {
            return this.supported;
        }

        public ListImagesResponseBodyPagingInfoImageList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListImagesResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>The list of image details.</p>
         */
        @NameInMap("ImageList")
        public java.util.List<ListImagesResponseBodyPagingInfoImageList> imageList;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The page size.</p>
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

        public static ListImagesResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListImagesResponseBodyPagingInfo self = new ListImagesResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListImagesResponseBodyPagingInfo setImageList(java.util.List<ListImagesResponseBodyPagingInfoImageList> imageList) {
            this.imageList = imageList;
            return this;
        }
        public java.util.List<ListImagesResponseBodyPagingInfoImageList> getImageList() {
            return this.imageList;
        }

        public ListImagesResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListImagesResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListImagesResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
