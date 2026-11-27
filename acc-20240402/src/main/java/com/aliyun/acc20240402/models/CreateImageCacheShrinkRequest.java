// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acc20240402.models;

import com.aliyun.tea.*;

public class CreateImageCacheShrinkRequest extends TeaModel {
    /**
     * <p>The ACR Enterprise instance information.</p>
     */
    @NameInMap("AcrRegistryInfos")
    public java.util.List<CreateImageCacheShrinkRequestAcrRegistryInfos> acrRegistryInfos;

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
    public java.util.List<CreateImageCacheShrinkRequestImageRegistryCredentials> imageRegistryCredentials;

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
    public String networkConfigShrink;

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
    public java.util.List<CreateImageCacheShrinkRequestTags> tags;

    /**
     * <p>The type of the image cache. Valid values: <code>General</code> and <code>Base</code>. Default value: <code>General</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>General</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateImageCacheShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageCacheShrinkRequest self = new CreateImageCacheShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageCacheShrinkRequest setAcrRegistryInfos(java.util.List<CreateImageCacheShrinkRequestAcrRegistryInfos> acrRegistryInfos) {
        this.acrRegistryInfos = acrRegistryInfos;
        return this;
    }
    public java.util.List<CreateImageCacheShrinkRequestAcrRegistryInfos> getAcrRegistryInfos() {
        return this.acrRegistryInfos;
    }

    public CreateImageCacheShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateImageCacheShrinkRequest setEnableBaseImageCacheMatch(Boolean enableBaseImageCacheMatch) {
        this.enableBaseImageCacheMatch = enableBaseImageCacheMatch;
        return this;
    }
    public Boolean getEnableBaseImageCacheMatch() {
        return this.enableBaseImageCacheMatch;
    }

    public CreateImageCacheShrinkRequest setImageCacheName(String imageCacheName) {
        this.imageCacheName = imageCacheName;
        return this;
    }
    public String getImageCacheName() {
        return this.imageCacheName;
    }

    public CreateImageCacheShrinkRequest setImageRegistryCredentials(java.util.List<CreateImageCacheShrinkRequestImageRegistryCredentials> imageRegistryCredentials) {
        this.imageRegistryCredentials = imageRegistryCredentials;
        return this;
    }
    public java.util.List<CreateImageCacheShrinkRequestImageRegistryCredentials> getImageRegistryCredentials() {
        return this.imageRegistryCredentials;
    }

    public CreateImageCacheShrinkRequest setImages(java.util.List<String> images) {
        this.images = images;
        return this;
    }
    public java.util.List<String> getImages() {
        return this.images;
    }

    public CreateImageCacheShrinkRequest setNetworkConfigShrink(String networkConfigShrink) {
        this.networkConfigShrink = networkConfigShrink;
        return this;
    }
    public String getNetworkConfigShrink() {
        return this.networkConfigShrink;
    }

    public CreateImageCacheShrinkRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public CreateImageCacheShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateImageCacheShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateImageCacheShrinkRequest setTags(java.util.List<CreateImageCacheShrinkRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateImageCacheShrinkRequestTags> getTags() {
        return this.tags;
    }

    public CreateImageCacheShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateImageCacheShrinkRequestAcrRegistryInfos extends TeaModel {
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

        public static CreateImageCacheShrinkRequestAcrRegistryInfos build(java.util.Map<String, ?> map) throws Exception {
            CreateImageCacheShrinkRequestAcrRegistryInfos self = new CreateImageCacheShrinkRequestAcrRegistryInfos();
            return TeaModel.build(map, self);
        }

        public CreateImageCacheShrinkRequestAcrRegistryInfos setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateImageCacheShrinkRequestAcrRegistryInfos setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class CreateImageCacheShrinkRequestImageRegistryCredentials extends TeaModel {
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

        public static CreateImageCacheShrinkRequestImageRegistryCredentials build(java.util.Map<String, ?> map) throws Exception {
            CreateImageCacheShrinkRequestImageRegistryCredentials self = new CreateImageCacheShrinkRequestImageRegistryCredentials();
            return TeaModel.build(map, self);
        }

        public CreateImageCacheShrinkRequestImageRegistryCredentials setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateImageCacheShrinkRequestImageRegistryCredentials setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

        public CreateImageCacheShrinkRequestImageRegistryCredentials setSkipCertVerification(Boolean skipCertVerification) {
            this.skipCertVerification = skipCertVerification;
            return this;
        }
        public Boolean getSkipCertVerification() {
            return this.skipCertVerification;
        }

        public CreateImageCacheShrinkRequestImageRegistryCredentials setUsePlainHttp(Boolean usePlainHttp) {
            this.usePlainHttp = usePlainHttp;
            return this;
        }
        public Boolean getUsePlainHttp() {
            return this.usePlainHttp;
        }

        public CreateImageCacheShrinkRequestImageRegistryCredentials setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class CreateImageCacheShrinkRequestTags extends TeaModel {
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

        public static CreateImageCacheShrinkRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateImageCacheShrinkRequestTags self = new CreateImageCacheShrinkRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateImageCacheShrinkRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateImageCacheShrinkRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
