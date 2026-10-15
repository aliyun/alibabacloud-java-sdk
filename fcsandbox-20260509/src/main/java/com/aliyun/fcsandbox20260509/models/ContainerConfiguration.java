// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class ContainerConfiguration extends TeaModel {
    /**
     * <p>The ID of the ACR Enterprise instance to which the container image belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-abcd1234efgh</p>
     */
    @NameInMap("acrInstanceId")
    public String acrInstanceId;

    /**
     * <p>The container image address.</p>
     * 
     * <strong>example:</strong>
     * <p>registry.cn-hangzhou.aliyuncs.com/demo/nginx:latest</p>
     */
    @NameInMap("image")
    public String image;

    /**
     * <p>The repository credentials used to pull private images.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;username&quot;:&quot;registry-user&quot;,&quot;password&quot;:&quot;******&quot;}</p>
     */
    @NameInMap("registryCredential")
    public ContainerConfigurationRegistryCredential registryCredential;

    public static ContainerConfiguration build(java.util.Map<String, ?> map) throws Exception {
        ContainerConfiguration self = new ContainerConfiguration();
        return TeaModel.build(map, self);
    }

    public ContainerConfiguration setAcrInstanceId(String acrInstanceId) {
        this.acrInstanceId = acrInstanceId;
        return this;
    }
    public String getAcrInstanceId() {
        return this.acrInstanceId;
    }

    public ContainerConfiguration setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public ContainerConfiguration setRegistryCredential(ContainerConfigurationRegistryCredential registryCredential) {
        this.registryCredential = registryCredential;
        return this;
    }
    public ContainerConfigurationRegistryCredential getRegistryCredential() {
        return this.registryCredential;
    }

    public static class ContainerConfigurationRegistryCredential extends TeaModel {
        /**
         * <p>The password of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("password")
        public String password;

        /**
         * <p>The username of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-user</p>
         */
        @NameInMap("username")
        public String username;

        public static ContainerConfigurationRegistryCredential build(java.util.Map<String, ?> map) throws Exception {
            ContainerConfigurationRegistryCredential self = new ContainerConfigurationRegistryCredential();
            return TeaModel.build(map, self);
        }

        public ContainerConfigurationRegistryCredential setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ContainerConfigurationRegistryCredential setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
