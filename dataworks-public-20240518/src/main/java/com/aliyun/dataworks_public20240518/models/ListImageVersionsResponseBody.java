// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListImageVersionsResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListImageVersionsResponseBodyPagingInfo pagingInfo;

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
         * <strong>example:</strong>
         * <p>PackageInstallation</p>
         */
        @NameInMap("BuildType")
        public String buildType;

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
         * <strong>example:</strong>
         * <p>Scheduler</p>
         */
        @NameInMap("Module")
        public String module;

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
        public ListImageVersionsResponseBodyPagingInfoImageVersionsBuildConfig buildConfig;

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
        public ListImageVersionsResponseBodyPagingInfoImageVersionsSupported supported;

        /**
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
        @NameInMap("ImageVersions")
        public java.util.List<ListImageVersionsResponseBodyPagingInfoImageVersions> imageVersions;

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
