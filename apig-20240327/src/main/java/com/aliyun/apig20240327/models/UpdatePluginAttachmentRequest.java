// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdatePluginAttachmentRequest extends TeaModel {
    /**
     * <p>The IDs of the resources to which the plug-in is attached.</p>
     */
    @NameInMap("attachResourceIds")
    public java.util.List<String> attachResourceIds;

    /**
     * <p>Specifies whether to enable the plug-in.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <p>The Base64-encoded configurations of the plug-in.</p>
     * 
     * <strong>example:</strong>
     * <p>cHJlcGVuZDoKLSByb2xlOiBzeXN0ZW0KICBjb250ZW50OiDor7fkvb/nlKjoi7Hor63lm57nrZTpl67popgKYXBwZW5kOgotIHJvbGU6IHVzZXIKICBjb250ZW50OiDmr4/mrKHlm57nrZTlrozpl67popjvvIzlsJ3or5Xov5vooYzlj43pl64K</p>
     */
    @NameInMap("pluginConfig")
    public String pluginConfig;

    public static UpdatePluginAttachmentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePluginAttachmentRequest self = new UpdatePluginAttachmentRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePluginAttachmentRequest setAttachResourceIds(java.util.List<String> attachResourceIds) {
        this.attachResourceIds = attachResourceIds;
        return this;
    }
    public java.util.List<String> getAttachResourceIds() {
        return this.attachResourceIds;
    }

    public UpdatePluginAttachmentRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public UpdatePluginAttachmentRequest setPluginConfig(String pluginConfig) {
        this.pluginConfig = pluginConfig;
        return this;
    }
    public String getPluginConfig() {
        return this.pluginConfig;
    }

}
