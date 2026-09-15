// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class PublicUpdateTemplateCopyAction extends TeaModel {
    /**
     * <p>The ID of the destination ACR Enterprise instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-abc123</p>
     */
    @NameInMap("acrInstanceId")
    public String acrInstanceId;

    /**
     * <p>Indicates whether image replication is enabled.</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>The destination image address for replication.</p>
     * 
     * <strong>example:</strong>
     * <p>registry.cn-hangzhou.aliyuncs.com/my/ns:v2</p>
     */
    @NameInMap("image")
    public String image;

    /**
     * <p>The image repository configuration.</p>
     */
    @NameInMap("registryConfig")
    public PublicUpdateTemplateRegistryConfig registryConfig;

    /**
     * <p>The destination repository type.</p>
     * 
     * <strong>example:</strong>
     * <p>acr</p>
     */
    @NameInMap("registryType")
    public String registryType;

    public static PublicUpdateTemplateCopyAction build(java.util.Map<String, ?> map) throws Exception {
        PublicUpdateTemplateCopyAction self = new PublicUpdateTemplateCopyAction();
        return TeaModel.build(map, self);
    }

    public PublicUpdateTemplateCopyAction setAcrInstanceId(String acrInstanceId) {
        this.acrInstanceId = acrInstanceId;
        return this;
    }
    public String getAcrInstanceId() {
        return this.acrInstanceId;
    }

    public PublicUpdateTemplateCopyAction setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public PublicUpdateTemplateCopyAction setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public PublicUpdateTemplateCopyAction setRegistryConfig(PublicUpdateTemplateRegistryConfig registryConfig) {
        this.registryConfig = registryConfig;
        return this;
    }
    public PublicUpdateTemplateRegistryConfig getRegistryConfig() {
        return this.registryConfig;
    }

    public PublicUpdateTemplateCopyAction setRegistryType(String registryType) {
        this.registryType = registryType;
        return this;
    }
    public String getRegistryType() {
        return this.registryType;
    }

}
