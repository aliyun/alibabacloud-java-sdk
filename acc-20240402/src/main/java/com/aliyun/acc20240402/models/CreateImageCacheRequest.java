// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acc20240402.models;

import com.aliyun.tea.*;

public class CreateImageCacheRequest extends TeaModel {
    /**
     * <p>The ACR Enterprise instance information.</p>
     */
    @NameInMap("AcrRegistryInfos")
    public java.util.List<CreateImageCacheRequestAcrRegistryInfos> acrRegistryInfos;

    /**
     * <p>The idempotency token.</p>
     * 
     * <strong>example:</strong>
     * <p>7f3a2c18-6c47-4eb7-a6bb-8432a394a620</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to enable base image cache matching. Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableBaseImageCacheMatch")
    public Boolean enableBaseImageCacheMatch;

    /**
     * <p>The name of the image cache.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-imc</p>
     */
    @NameInMap("ImageCacheName")
    public String imageCacheName;

    /**
     * <p>The credentials of the image registry.</p>
     */
    @NameInMap("ImageRegistryCredentials")
    public java.util.List<CreateImageCacheRequestImageRegistryCredentials> imageRegistryCredentials;

    /**
     * <p>The container images used to create the image cache. Currently, only one image is supported.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Images")
    public java.util.List<String> images;

    /**
     * <p>The network configurations for pulling images when creating the image cache.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NetworkConfig")
    public CreateImageCacheRequestNetworkConfig networkConfig;

    /**
     * <p>The platform type of the image cache. Valid values: linux/amd64 and windows/amd64. Default value: linux/amd64.</p>
     * 
     * <strong>example:</strong>
     * <p>windows/amd64</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzh43v*****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags of the image cache. You can specify up to 20 tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateImageCacheRequestTags> tags;

    /**
     * <p>The type of the image cache. Valid values: <code>General</code> and <code>Base</code>. Default value: <code>General</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>General</p>
     */
    @NameInMap("Type")
    public String type;

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

    public CreateImageCacheRequest setEnableBaseImageCacheMatch(Boolean enableBaseImageCacheMatch) {
        this.enableBaseImageCacheMatch = enableBaseImageCacheMatch;
        return this;
    }
    public Boolean getEnableBaseImageCacheMatch() {
        return this.enableBaseImageCacheMatch;
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

    public CreateImageCacheRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
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

    public CreateImageCacheRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateImageCacheRequestAcrRegistryInfos extends TeaModel {
        /**
         * <p>The ID of the ACR Enterprise instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-nwj395hgf6f*****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The region to which the ACR Enterprise instance belongs.</p>
         * 
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
         * <p>The password of the image registry.</p>
         * 
         * <strong>example:</strong>
         * <p>mypassword</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The address of the image registry without the http:// or https:// prefix.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-hangzhou.aliyuncs.com</p>
         */
        @NameInMap("Server")
        public String server;

        /**
         * <p>Specifies whether to skip certificate verification when you create an image cache by using images from a self-managed image registry that uses a self-signed certificate to prevent image pull failures caused by certificate verification failures.
         * Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SkipCertVerification")
        public Boolean skipCertVerification;

        /**
         * <p>Specifies whether the service uses the HTTP protocol to pull images to prevent image pull failures caused by protocol mismatches.
         * Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("UsePlainHttp")
        public Boolean usePlainHttp;

        /**
         * <p>The username of the image registry.</p>
         * 
         * <strong>example:</strong>
         * <p>myusername</p>
         */
        @NameInMap("Username")
        public String username;

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

        public CreateImageCacheRequestImageRegistryCredentials setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class CreateImageCacheRequestNetworkConfigEipInstance extends TeaModel {
        /**
         * <p>Specifies whether automatic creation of an EIP is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoCreate")
        public Boolean autoCreate;

        /**
         * <p>The bandwidth of the EIP for automatic creation. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The elastic IP address. This parameter takes precedence. If you specify this parameter, other parameters are ignored.</p>
         * 
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
        /**
         * <p>The configurations of the elastic IP address (EIP) instance.</p>
         */
        @NameInMap("EipInstance")
        public CreateImageCacheRequestNetworkConfigEipInstance eipInstance;

        /**
         * <p>The ID of the security group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-0jlgektkddwa42n*****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The IDs of the vSwitches. You can specify up to 10 vSwitch IDs. One of the vSwitches is selected to pull the image.</p>
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
         * <p>The tag key of the image cache.</p>
         * 
         * <strong>example:</strong>
         * <p>imc</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the image cache.</p>
         * 
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
