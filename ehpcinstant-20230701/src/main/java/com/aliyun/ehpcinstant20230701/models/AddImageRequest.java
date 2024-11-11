// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class AddImageRequest extends TeaModel {
    @NameInMap("ContainerImageSpec")
    public AddImageRequestContainerImageSpec containerImageSpec;

    @NameInMap("Description")
    public String description;

    @NameInMap("ImageType")
    public String imageType;

    /**
     * <strong>example:</strong>
     * <p>V1.0</p>
     */
    @NameInMap("ImageVersion")
    public String imageVersion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app-image</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("VMImageSpec")
    public AddImageRequestVMImageSpec VMImageSpec;

    public static AddImageRequest build(java.util.Map<String, ?> map) throws Exception {
        AddImageRequest self = new AddImageRequest();
        return TeaModel.build(map, self);
    }

    public AddImageRequest setContainerImageSpec(AddImageRequestContainerImageSpec containerImageSpec) {
        this.containerImageSpec = containerImageSpec;
        return this;
    }
    public AddImageRequestContainerImageSpec getContainerImageSpec() {
        return this.containerImageSpec;
    }

    public AddImageRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddImageRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }
    public String getImageType() {
        return this.imageType;
    }

    public AddImageRequest setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
        return this;
    }
    public String getImageVersion() {
        return this.imageVersion;
    }

    public AddImageRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddImageRequest setVMImageSpec(AddImageRequestVMImageSpec VMImageSpec) {
        this.VMImageSpec = VMImageSpec;
        return this;
    }
    public AddImageRequestVMImageSpec getVMImageSpec() {
        return this.VMImageSpec;
    }

    public static class AddImageRequestContainerImageSpecRegistryCredential extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>userpassword</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <strong>example:</strong>
         * <p>registry-vpc.cn-hangzhou.aliyuncs.com</p>
         */
        @NameInMap("Server")
        public String server;

        /**
         * <strong>example:</strong>
         * <p>username</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static AddImageRequestContainerImageSpecRegistryCredential build(java.util.Map<String, ?> map) throws Exception {
            AddImageRequestContainerImageSpecRegistryCredential self = new AddImageRequestContainerImageSpecRegistryCredential();
            return TeaModel.build(map, self);
        }

        public AddImageRequestContainerImageSpecRegistryCredential setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public AddImageRequestContainerImageSpecRegistryCredential setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

        public AddImageRequestContainerImageSpecRegistryCredential setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class AddImageRequestContainerImageSpec extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("IsACREnterprise")
        public Boolean isACREnterprise;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("IsACRRegistry")
        public Boolean isACRRegistry;

        @NameInMap("RegistryCredential")
        public AddImageRequestContainerImageSpecRegistryCredential registryCredential;

        /**
         * <strong>example:</strong>
         * <p>cri-xyz795ygf8k9****</p>
         */
        @NameInMap("RegistryCriId")
        public String registryCriId;

        /**
         * <strong>example:</strong>
         * <p>registry-vpc.cn-hangzhou.aliyuncs.com/ehpc_open/nginx:latest</p>
         */
        @NameInMap("RegistryUrl")
        public String registryUrl;

        public static AddImageRequestContainerImageSpec build(java.util.Map<String, ?> map) throws Exception {
            AddImageRequestContainerImageSpec self = new AddImageRequestContainerImageSpec();
            return TeaModel.build(map, self);
        }

        public AddImageRequestContainerImageSpec setIsACREnterprise(Boolean isACREnterprise) {
            this.isACREnterprise = isACREnterprise;
            return this;
        }
        public Boolean getIsACREnterprise() {
            return this.isACREnterprise;
        }

        public AddImageRequestContainerImageSpec setIsACRRegistry(Boolean isACRRegistry) {
            this.isACRRegistry = isACRRegistry;
            return this;
        }
        public Boolean getIsACRRegistry() {
            return this.isACRRegistry;
        }

        public AddImageRequestContainerImageSpec setRegistryCredential(AddImageRequestContainerImageSpecRegistryCredential registryCredential) {
            this.registryCredential = registryCredential;
            return this;
        }
        public AddImageRequestContainerImageSpecRegistryCredential getRegistryCredential() {
            return this.registryCredential;
        }

        public AddImageRequestContainerImageSpec setRegistryCriId(String registryCriId) {
            this.registryCriId = registryCriId;
            return this;
        }
        public String getRegistryCriId() {
            return this.registryCriId;
        }

        public AddImageRequestContainerImageSpec setRegistryUrl(String registryUrl) {
            this.registryUrl = registryUrl;
            return this;
        }
        public String getRegistryUrl() {
            return this.registryUrl;
        }

    }

    public static class AddImageRequestVMImageSpec extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>m-bp1akkkr1rkxtb******</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        public static AddImageRequestVMImageSpec build(java.util.Map<String, ?> map) throws Exception {
            AddImageRequestVMImageSpec self = new AddImageRequestVMImageSpec();
            return TeaModel.build(map, self);
        }

        public AddImageRequestVMImageSpec setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

    }

}
