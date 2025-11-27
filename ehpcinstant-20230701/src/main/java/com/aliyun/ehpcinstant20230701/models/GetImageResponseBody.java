// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class GetImageResponseBody extends TeaModel {
    /**
     * <p>The details of the image.</p>
     */
    @NameInMap("Image")
    public GetImageResponseBodyImage image;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true: The task is successful.</li>
     * <li>false: The error occurred.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total amount of data in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

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

    public GetImageResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class GetImageResponseBodyImageAdditionalRegionsInfo extends TeaModel {
        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

        public static GetImageResponseBodyImageAdditionalRegionsInfo build(java.util.Map<String, ?> map) throws Exception {
            GetImageResponseBodyImageAdditionalRegionsInfo self = new GetImageResponseBodyImageAdditionalRegionsInfo();
            return TeaModel.build(map, self);
        }

        public GetImageResponseBodyImageAdditionalRegionsInfo setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public GetImageResponseBodyImageAdditionalRegionsInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetImageResponseBodyImageAdditionalRegionsInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetImageResponseBodyImageContainerImageSpecRegistryCredential extends TeaModel {
        /**
         * <p>The password of the logon user.</p>
         * 
         * <strong>example:</strong>
         * <p>userpassword</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The registered address of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-hangzhou.aliyuncs.com</p>
         */
        @NameInMap("Server")
        public String server;

        /**
         * <p>The username of the logon user.</p>
         * 
         * <strong>example:</strong>
         * <p>username</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static GetImageResponseBodyImageContainerImageSpecRegistryCredential build(java.util.Map<String, ?> map) throws Exception {
            GetImageResponseBodyImageContainerImageSpecRegistryCredential self = new GetImageResponseBodyImageContainerImageSpecRegistryCredential();
            return TeaModel.build(map, self);
        }

        public GetImageResponseBodyImageContainerImageSpecRegistryCredential setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public GetImageResponseBodyImageContainerImageSpecRegistryCredential setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

        public GetImageResponseBodyImageContainerImageSpecRegistryCredential setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class GetImageResponseBodyImageContainerImageSpec extends TeaModel {
        @NameInMap("Architecture")
        public String architecture;

        /**
         * <p>Whether the instance is an Alibaba Cloud image repository Enterprise Edition.</p>
         * <ul>
         * <li>True</li>
         * <li>False</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("IsACREnterprise")
        public Boolean isACREnterprise;

        /**
         * <p>Whether it is an Alibaba Cloud image repository.</p>
         * <ul>
         * <li>True</li>
         * <li>False</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("IsACRRegistry")
        public Boolean isACRRegistry;

        @NameInMap("OsTag")
        public String osTag;

        @NameInMap("Platform")
        public String platform;

        /**
         * <p>The authentication of the private image repository.</p>
         */
        @NameInMap("RegistryCredential")
        public GetImageResponseBodyImageContainerImageSpecRegistryCredential registryCredential;

        /**
         * <p>The ID of the Container Registry Enterprise Edition image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-xyz795ygf8k9****</p>
         */
        @NameInMap("RegistryCriId")
        public String registryCriId;

        /**
         * <p>The endpoint of the container image.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-hangzhou.aliyuncs.com/ehpc_open/nginx:latest</p>
         */
        @NameInMap("RegistryUrl")
        public String registryUrl;

        public static GetImageResponseBodyImageContainerImageSpec build(java.util.Map<String, ?> map) throws Exception {
            GetImageResponseBodyImageContainerImageSpec self = new GetImageResponseBodyImageContainerImageSpec();
            return TeaModel.build(map, self);
        }

        public GetImageResponseBodyImageContainerImageSpec setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public GetImageResponseBodyImageContainerImageSpec setIsACREnterprise(Boolean isACREnterprise) {
            this.isACREnterprise = isACREnterprise;
            return this;
        }
        public Boolean getIsACREnterprise() {
            return this.isACREnterprise;
        }

        public GetImageResponseBodyImageContainerImageSpec setIsACRRegistry(Boolean isACRRegistry) {
            this.isACRRegistry = isACRRegistry;
            return this;
        }
        public Boolean getIsACRRegistry() {
            return this.isACRRegistry;
        }

        public GetImageResponseBodyImageContainerImageSpec setOsTag(String osTag) {
            this.osTag = osTag;
            return this;
        }
        public String getOsTag() {
            return this.osTag;
        }

        public GetImageResponseBodyImageContainerImageSpec setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public GetImageResponseBodyImageContainerImageSpec setRegistryCredential(GetImageResponseBodyImageContainerImageSpecRegistryCredential registryCredential) {
            this.registryCredential = registryCredential;
            return this;
        }
        public GetImageResponseBodyImageContainerImageSpecRegistryCredential getRegistryCredential() {
            return this.registryCredential;
        }

        public GetImageResponseBodyImageContainerImageSpec setRegistryCriId(String registryCriId) {
            this.registryCriId = registryCriId;
            return this;
        }
        public String getRegistryCriId() {
            return this.registryCriId;
        }

        public GetImageResponseBodyImageContainerImageSpec setRegistryUrl(String registryUrl) {
            this.registryUrl = registryUrl;
            return this;
        }
        public String getRegistryUrl() {
            return this.registryUrl;
        }

    }

    public static class GetImageResponseBodyImageDocumentInfo extends TeaModel {
        @NameInMap("Document")
        public String document;

        @NameInMap("DocumentId")
        public String documentId;

        @NameInMap("EncodingMode")
        public String encodingMode;

        public static GetImageResponseBodyImageDocumentInfo build(java.util.Map<String, ?> map) throws Exception {
            GetImageResponseBodyImageDocumentInfo self = new GetImageResponseBodyImageDocumentInfo();
            return TeaModel.build(map, self);
        }

        public GetImageResponseBodyImageDocumentInfo setDocument(String document) {
            this.document = document;
            return this;
        }
        public String getDocument() {
            return this.document;
        }

        public GetImageResponseBodyImageDocumentInfo setDocumentId(String documentId) {
            this.documentId = documentId;
            return this;
        }
        public String getDocumentId() {
            return this.documentId;
        }

        public GetImageResponseBodyImageDocumentInfo setEncodingMode(String encodingMode) {
            this.encodingMode = encodingMode;
            return this;
        }
        public String getEncodingMode() {
            return this.encodingMode;
        }

    }

    public static class GetImageResponseBodyImageVMImageSpec extends TeaModel {
        /**
         * <p>The type of the architecture.</p>
         * 
         * <strong>example:</strong>
         * <p>x86_64</p>
         */
        @NameInMap("Architecture")
        public String architecture;

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>m-uf60twafjtaart******</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The ID of the specific OS version.</p>
         * 
         * <strong>example:</strong>
         * <p>CentOS  7.6 64 bit</p>
         */
        @NameInMap("OsTag")
        public String osTag;

        /**
         * <p>The type of the platform.</p>
         * 
         * <strong>example:</strong>
         * <p>CentOS</p>
         */
        @NameInMap("Platform")
        public String platform;

        public static GetImageResponseBodyImageVMImageSpec build(java.util.Map<String, ?> map) throws Exception {
            GetImageResponseBodyImageVMImageSpec self = new GetImageResponseBodyImageVMImageSpec();
            return TeaModel.build(map, self);
        }

        public GetImageResponseBodyImageVMImageSpec setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public GetImageResponseBodyImageVMImageSpec setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public GetImageResponseBodyImageVMImageSpec setOsTag(String osTag) {
            this.osTag = osTag;
            return this;
        }
        public String getOsTag() {
            return this.osTag;
        }

        public GetImageResponseBodyImageVMImageSpec setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

    }

    public static class GetImageResponseBodyImage extends TeaModel {
        @NameInMap("AdditionalRegionsInfo")
        public java.util.List<GetImageResponseBodyImageAdditionalRegionsInfo> additionalRegionsInfo;

        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The configuration details of the container image.</p>
         */
        @NameInMap("ContainerImageSpec")
        public GetImageResponseBodyImageContainerImageSpec containerImageSpec;

        /**
         * <p>The time when the image was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-23T09:51:39Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the image.</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("DocumentInfo")
        public GetImageResponseBodyImageDocumentInfo documentInfo;

        /**
         * <p>The type of the image.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VM</p>
         */
        @NameInMap("ImageType")
        public String imageType;

        /**
         * <p>The name of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>app-image</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The size of the image. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>40 GiB</p>
         */
        @NameInMap("Size")
        public String size;

        @NameInMap("Status")
        public String status;

        /**
         * <p>The configuration details of the virtual machine image.</p>
         */
        @NameInMap("VMImageSpec")
        public GetImageResponseBodyImageVMImageSpec VMImageSpec;

        /**
         * <p>The version.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static GetImageResponseBodyImage build(java.util.Map<String, ?> map) throws Exception {
            GetImageResponseBodyImage self = new GetImageResponseBodyImage();
            return TeaModel.build(map, self);
        }

        public GetImageResponseBodyImage setAdditionalRegionsInfo(java.util.List<GetImageResponseBodyImageAdditionalRegionsInfo> additionalRegionsInfo) {
            this.additionalRegionsInfo = additionalRegionsInfo;
            return this;
        }
        public java.util.List<GetImageResponseBodyImageAdditionalRegionsInfo> getAdditionalRegionsInfo() {
            return this.additionalRegionsInfo;
        }

        public GetImageResponseBodyImage setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetImageResponseBodyImage setContainerImageSpec(GetImageResponseBodyImageContainerImageSpec containerImageSpec) {
            this.containerImageSpec = containerImageSpec;
            return this;
        }
        public GetImageResponseBodyImageContainerImageSpec getContainerImageSpec() {
            return this.containerImageSpec;
        }

        public GetImageResponseBodyImage setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetImageResponseBodyImage setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetImageResponseBodyImage setDocumentInfo(GetImageResponseBodyImageDocumentInfo documentInfo) {
            this.documentInfo = documentInfo;
            return this;
        }
        public GetImageResponseBodyImageDocumentInfo getDocumentInfo() {
            return this.documentInfo;
        }

        public GetImageResponseBodyImage setImageType(String imageType) {
            this.imageType = imageType;
            return this;
        }
        public String getImageType() {
            return this.imageType;
        }

        public GetImageResponseBodyImage setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
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

        public GetImageResponseBodyImage setVMImageSpec(GetImageResponseBodyImageVMImageSpec VMImageSpec) {
            this.VMImageSpec = VMImageSpec;
            return this;
        }
        public GetImageResponseBodyImageVMImageSpec getVMImageSpec() {
            return this.VMImageSpec;
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
