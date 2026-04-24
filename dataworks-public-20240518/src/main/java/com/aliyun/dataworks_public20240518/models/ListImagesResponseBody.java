// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListImagesResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListImagesResponseBodyPagingInfo pagingInfo;

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
         * <strong>example:</strong>
         * <p>PackageInstallation</p>
         */
        @NameInMap("BuildType")
        public String buildType;

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
         * <strong>example:</strong>
         * <p>Scheduler</p>
         */
        @NameInMap("Module")
        public String module;

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
        public ListImagesResponseBodyPagingInfoImageListBuildConfig buildConfig;

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
        public ListImagesResponseBodyPagingInfoImageListSupported supported;

        /**
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
        @NameInMap("ImageList")
        public java.util.List<ListImagesResponseBodyPagingInfoImageList> imageList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
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
