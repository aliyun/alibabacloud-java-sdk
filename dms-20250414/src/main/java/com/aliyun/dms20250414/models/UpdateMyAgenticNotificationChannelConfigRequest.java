// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class UpdateMyAgenticNotificationChannelConfigRequest extends TeaModel {
    /**
     * <p>The notification channel type. Currently, only FEISHU (Lark) is supported. Specifying other values results in a parameter error.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FEISHU</p>
     */
    @NameInMap("Channel")
    public String channel;

    /**
     * <p>The channel configuration in the format of a JSON object string. This parameter is not required if you do not update the binding information. Supports mobile (phone number) or email. You can bind or rebind a Lark account by using one of them at a time. If the existing masked values of mobile or email are passed as ******, they are not modified. openId is a read-only field and cannot be specified.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;email&quot;:&quot;<a href="mailto:user@example.com">user@example.com</a>&quot;}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>Specifies whether to enable the notification channel. If this parameter is not specified, the original value is retained. When you only modify the switch, the Config parameter is not required, and the existing binding information remains unchanged.</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    public static UpdateMyAgenticNotificationChannelConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMyAgenticNotificationChannelConfigRequest self = new UpdateMyAgenticNotificationChannelConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMyAgenticNotificationChannelConfigRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public UpdateMyAgenticNotificationChannelConfigRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public UpdateMyAgenticNotificationChannelConfigRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

}
