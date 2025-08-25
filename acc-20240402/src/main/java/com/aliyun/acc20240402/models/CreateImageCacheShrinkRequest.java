// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acc20240402.models;

import com.aliyun.tea.*;

public class CreateImageCacheShrinkRequest extends TeaModel {
    @NameInMap("AcrRegistryInfos")
    public java.util.List<CreateImageCacheShrinkRequestAcrRegistryInfos> acrRegistryInfos;

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
    public java.util.List<CreateImageCacheShrinkRequestImageRegistryCredentials> imageRegistryCredentials;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Images")
    public java.util.List<String> images;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NetworkConfig")
    public String networkConfigShrink;

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
    public java.util.List<CreateImageCacheShrinkRequestTags> tags;

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

    public static class CreateImageCacheShrinkRequestAcrRegistryInfos extends TeaModel {
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

        public CreateImageCacheShrinkRequestImageRegistryCredentials setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class CreateImageCacheShrinkRequestTags extends TeaModel {
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
