// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateAtiAlertSettingsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;[{\&quot;NoticeType\&quot;:\&quot;identity_cert_expiring\&quot;,\&quot;SmsNotice\&quot;:true,\&quot;EmailNotice\&quot;:true,\&quot;DingtalkNotice\&quot;:true},{\&quot;NoticeType\&quot;:\&quot;server_cert_expiring\&quot;,\&quot;SmsNotice\&quot;:true,\&quot;EmailNotice\&quot;:true,\&quot;DingtalkNotice\&quot;:true}]&quot;</p>
     */
    @NameInMap("AlertConfig")
    public String alertConfig;

    /**
     * <strong>example:</strong>
     * <p>[\&quot;云账号报警联系人\&quot;]</p>
     */
    @NameInMap("AlertGroup")
    public String alertGroup;

    /**
     * <strong>example:</strong>
     * <p>eyJhbGciOiJIUzI1NiIsInR5cC.....</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    public static UpdateAtiAlertSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAtiAlertSettingsRequest self = new UpdateAtiAlertSettingsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAtiAlertSettingsRequest setAlertConfig(String alertConfig) {
        this.alertConfig = alertConfig;
        return this;
    }
    public String getAlertConfig() {
        return this.alertConfig;
    }

    public UpdateAtiAlertSettingsRequest setAlertGroup(String alertGroup) {
        this.alertGroup = alertGroup;
        return this;
    }
    public String getAlertGroup() {
        return this.alertGroup;
    }

    public UpdateAtiAlertSettingsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
