// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreatePluginAttachmentRequest extends TeaModel {
    @NameInMap("attachResourceIds")
    public java.util.List<String> attachResourceIds;

    /**
     * <strong>example:</strong>
     * <p>HttpApi</p>
     */
    @NameInMap("attachResourceType")
    public String attachResourceType;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <strong>example:</strong>
     * <p>env-xxx</p>
     */
    @NameInMap("environmentId")
    public String environmentId;

    /**
     * <strong>example:</strong>
     * <p>gw-cq7l5s5lhtg***</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <strong>example:</strong>
     * <p>cHJlcGVuZDoKLSByb2xlOiBzeXN0ZW0KICBjb250ZW50OiDor7fkvb/nlKjoi7Hor63lm57nrZTpl67popgKYXBwZW5kOgotIHJvbGU6IHVzZXIKICBjb250ZW50OiDmr4/mrKHlm57nrZTlrozpl67popjvvIzlsJ3or5Xov5vooYzlj43pl64K</p>
     */
    @NameInMap("pluginConfig")
    public String pluginConfig;

    /**
     * <strong>example:</strong>
     * <p>pl-cvo8udem1hkob1qd67i0</p>
     */
    @NameInMap("pluginId")
    public String pluginId;

    public static CreatePluginAttachmentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePluginAttachmentRequest self = new CreatePluginAttachmentRequest();
        return TeaModel.build(map, self);
    }

    public CreatePluginAttachmentRequest setAttachResourceIds(java.util.List<String> attachResourceIds) {
        this.attachResourceIds = attachResourceIds;
        return this;
    }
    public java.util.List<String> getAttachResourceIds() {
        return this.attachResourceIds;
    }

    public CreatePluginAttachmentRequest setAttachResourceType(String attachResourceType) {
        this.attachResourceType = attachResourceType;
        return this;
    }
    public String getAttachResourceType() {
        return this.attachResourceType;
    }

    public CreatePluginAttachmentRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public CreatePluginAttachmentRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public CreatePluginAttachmentRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public CreatePluginAttachmentRequest setPluginConfig(String pluginConfig) {
        this.pluginConfig = pluginConfig;
        return this;
    }
    public String getPluginConfig() {
        return this.pluginConfig;
    }

    public CreatePluginAttachmentRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

}
