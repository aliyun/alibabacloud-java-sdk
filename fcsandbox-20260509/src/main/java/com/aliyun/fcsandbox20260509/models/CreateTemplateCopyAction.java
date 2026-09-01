// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class CreateTemplateCopyAction extends TeaModel {
    /**
     * <p>The ID of the ACR Enterprise instance where the source image resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-abcd1234efgh</p>
     */
    @NameInMap("acrInstanceId")
    public String acrInstanceId;

    /**
     * <p>Specifies whether to enable image replication.</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>The source image address.</p>
     * 
     * <strong>example:</strong>
     * <p>registry.cn-hangzhou.aliyuncs.com/demo/nginx:latest</p>
     */
    @NameInMap("image")
    public String image;

    /**
     * <p>The source image repository configuration.</p>
     */
    @NameInMap("registryConfig")
    public CreateTemplateRegistryConfig registryConfig;

    /**
     * <p>The source image repository type.</p>
     * 
     * <strong>example:</strong>
     * <p>acr</p>
     */
    @NameInMap("registryType")
    public String registryType;

    public static CreateTemplateCopyAction build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateCopyAction self = new CreateTemplateCopyAction();
        return TeaModel.build(map, self);
    }

    public CreateTemplateCopyAction setAcrInstanceId(String acrInstanceId) {
        this.acrInstanceId = acrInstanceId;
        return this;
    }
    public String getAcrInstanceId() {
        return this.acrInstanceId;
    }

    public CreateTemplateCopyAction setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public CreateTemplateCopyAction setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public CreateTemplateCopyAction setRegistryConfig(CreateTemplateRegistryConfig registryConfig) {
        this.registryConfig = registryConfig;
        return this;
    }
    public CreateTemplateRegistryConfig getRegistryConfig() {
        return this.registryConfig;
    }

    public CreateTemplateCopyAction setRegistryType(String registryType) {
        this.registryType = registryType;
        return this;
    }
    public String getRegistryType() {
        return this.registryType;
    }

}
