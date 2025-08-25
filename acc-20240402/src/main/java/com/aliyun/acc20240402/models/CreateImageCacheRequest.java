// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acc20240402.models;

import com.aliyun.tea.*;

public class CreateImageCacheRequest extends TeaModel {
    @NameInMap("AcrRegistryInfos")
    public java.util.List<CreateImageCacheRequestAcrRegistryInfos> acrRegistryInfos;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-imc</p>
     */
    @NameInMap("ImageCacheName")
    public String imageCacheName;

    @NameInMap("ImageRegistryCredentials")
    public java.util.List<CreateImageCacheRequestImageRegistryCredentials> imageRegistryCredentials;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Images")
    public java.util.List<String> images;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NetworkConfig")
    public CreateImageCacheRequestNetworkConfig networkConfig;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>rg-aekzh43v*****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tags")
    public java.util.List<CreateImageCacheRequestTags> tags;

    public static CreateImageCacheRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageCacheRequest self = new CreateImageCacheRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageCacheRequest setAcrRegistryInfos(java.util.List<CreateImageCacheRequestAcrRegistryInfos> acrRegistryInfos) {
        this.acrRegistryInfos = acrRegistryInfos;
        return this;
    }
    public java.util.List<CreateImageCacheRequestAcrRegistryInfos> getAcrRegistryInfos() {
        return this.acrRegistryInfos;
    }

    public CreateImageCacheRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateImageCacheRequest setImageCacheName(String imageCacheName) {
        this.imageCacheName = imageCacheName;
        return this;
    }
    public String getImageCacheName() {
        return this.imageCacheName;
    }

    public CreateImageCacheRequest setImageRegistryCredentials(java.util.List<CreateImageCacheRequestImageRegistryCredentials> imageRegistryCredentials) {
        this.imageRegistryCredentials = imageRegistryCredentials;
        return this;
    }
    public java.util.List<CreateImageCacheRequestImageRegistryCredentials> getImageRegistryCredentials() {
        return this.imageRegistryCredentials;
    }

    public CreateImageCacheRequest setImages(java.util.List<String> images) {
        this.images = images;
        return this;
    }
    public java.util.List<String> getImages() {
        return this.images;
    }

    public CreateImageCacheRequest setNetworkConfig(CreateImageCacheRequestNetworkConfig networkConfig) {
        this.networkConfig = networkConfig;
        return this;
    }
    public CreateImageCacheRequestNetworkConfig getNetworkConfig() {
        return this.networkConfig;
    }

    public CreateImageCacheRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateImageCacheRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateImageCacheRequest setTags(java.util.List<CreateImageCacheRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateImageCacheRequestTags> getTags() {
        return this.tags;
    }

    public static class CreateImageCacheRequestAcrRegistryInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cri-nwj395hgf6f*****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static CreateImageCacheRequestAcrRegistryInfos build(java.util.Map<String, ?> map) throws Exception {
            CreateImageCacheRequestAcrRegistryInfos self = new CreateImageCacheRequestAcrRegistryInfos();
            return TeaModel.build(map, self);
        }

        public CreateImageCacheRequestAcrRegistryInfos setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateImageCacheRequestAcrRegistryInfos setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class CreateImageCacheRequestImageRegistryCredentials extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>mypassword</p>
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
         * <p>false</p>
         */
        @NameInMap("SkipCertVerification")
        public Boolean skipCertVerification;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("UsePlainHttp")
        public Boolean usePlainHttp;

        /**
         * <strong>example:</strong>
         * <p>myusername</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static CreateImageCacheRequestImageRegistryCredentials build(java.util.Map<String, ?> map) throws Exception {
            CreateImageCacheRequestImageRegistryCredentials self = new CreateImageCacheRequestImageRegistryCredentials();
            return TeaModel.build(map, self);
        }

        public CreateImageCacheRequestImageRegistryCredentials setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateImageCacheRequestImageRegistryCredentials setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

        public CreateImageCacheRequestImageRegistryCredentials setSkipCertVerification(Boolean skipCertVerification) {
            this.skipCertVerification = skipCertVerification;
            return this;
        }
        public Boolean getSkipCertVerification() {
            return this.skipCertVerification;
        }

        public CreateImageCacheRequestImageRegistryCredentials setUsePlainHttp(Boolean usePlainHttp) {
            this.usePlainHttp = usePlainHttp;
            return this;
        }
        public Boolean getUsePlainHttp() {
            return this.usePlainHttp;
        }

        public CreateImageCacheRequestImageRegistryCredentials setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class CreateImageCacheRequestNetworkConfigEipInstance extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoCreate")
        public Boolean autoCreate;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <strong>example:</strong>
         * <p>eip-0jl0bx3fnpnjc9i4*****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static CreateImageCacheRequestNetworkConfigEipInstance build(java.util.Map<String, ?> map) throws Exception {
            CreateImageCacheRequestNetworkConfigEipInstance self = new CreateImageCacheRequestNetworkConfigEipInstance();
            return TeaModel.build(map, self);
        }

        public CreateImageCacheRequestNetworkConfigEipInstance setAutoCreate(Boolean autoCreate) {
            this.autoCreate = autoCreate;
            return this;
        }
        public Boolean getAutoCreate() {
            return this.autoCreate;
        }

        public CreateImageCacheRequestNetworkConfigEipInstance setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public CreateImageCacheRequestNetworkConfigEipInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class CreateImageCacheRequestNetworkConfig extends TeaModel {
        @NameInMap("EipInstance")
        public CreateImageCacheRequestNetworkConfigEipInstance eipInstance;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-0jlgektkddwa42n*****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        public static CreateImageCacheRequestNetworkConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateImageCacheRequestNetworkConfig self = new CreateImageCacheRequestNetworkConfig();
            return TeaModel.build(map, self);
        }

        public CreateImageCacheRequestNetworkConfig setEipInstance(CreateImageCacheRequestNetworkConfigEipInstance eipInstance) {
            this.eipInstance = eipInstance;
            return this;
        }
        public CreateImageCacheRequestNetworkConfigEipInstance getEipInstance() {
            return this.eipInstance;
        }

        public CreateImageCacheRequestNetworkConfig setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateImageCacheRequestNetworkConfig setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

    }

    public static class CreateImageCacheRequestTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>imc</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateImageCacheRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateImageCacheRequestTags self = new CreateImageCacheRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateImageCacheRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateImageCacheRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
