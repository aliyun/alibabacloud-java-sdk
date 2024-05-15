// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class GetImageResponseBody extends TeaModel {
    @NameInMap("Image")
    public GetImageResponseBodyImage image;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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

    public static class GetImageResponseBodyImageContainerImageSpecRegistryCredential extends TeaModel {
        @NameInMap("Password")
        public String password;

        @NameInMap("Server")
        public String server;

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
        @NameInMap("IsACREnterprise")
        public Boolean isACREnterprise;

        @NameInMap("IsACRRegistry")
        public Boolean isACRRegistry;

        @NameInMap("RegistryCredential")
        public GetImageResponseBodyImageContainerImageSpecRegistryCredential registryCredential;

        @NameInMap("RegistryCriId")
        public String registryCriId;

        @NameInMap("RegistryUrl")
        public String registryUrl;

        public static GetImageResponseBodyImageContainerImageSpec build(java.util.Map<String, ?> map) throws Exception {
            GetImageResponseBodyImageContainerImageSpec self = new GetImageResponseBodyImageContainerImageSpec();
            return TeaModel.build(map, self);
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

    public static class GetImageResponseBodyImageVMImageSpec extends TeaModel {
        @NameInMap("Architecture")
        public String architecture;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("OsTag")
        public String osTag;

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
        @NameInMap("AppId")
        public String appId;

        @NameInMap("ContainerImageSpec")
        public GetImageResponseBodyImageContainerImageSpec containerImageSpec;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ImageType")
        public String imageType;

        @NameInMap("Name")
        public String name;

        @NameInMap("Size")
        public String size;

        @NameInMap("Status")
        public String status;

        @NameInMap("VMImageSpec")
        public GetImageResponseBodyImageVMImageSpec VMImageSpec;

        @NameInMap("Version")
        public String version;

        public static GetImageResponseBodyImage build(java.util.Map<String, ?> map) throws Exception {
            GetImageResponseBodyImage self = new GetImageResponseBodyImage();
            return TeaModel.build(map, self);
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
