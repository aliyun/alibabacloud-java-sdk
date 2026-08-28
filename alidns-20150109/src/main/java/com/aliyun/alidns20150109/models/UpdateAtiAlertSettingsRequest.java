// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateAtiAlertSettingsRequest extends TeaModel {
    /**
     * <p>The list of alert configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;[{\&quot;NoticeType\&quot;:\&quot;identity_cert_expiring\&quot;,\&quot;SmsNotice\&quot;:true,\&quot;EmailNotice\&quot;:true,\&quot;DingtalkNotice\&quot;:true},{\&quot;NoticeType\&quot;:\&quot;server_cert_expiring\&quot;,\&quot;SmsNotice\&quot;:true,\&quot;EmailNotice\&quot;:true,\&quot;DingtalkNotice\&quot;:true}]&quot;</p>
     */
    @NameInMap("AlertConfig")
    public String alertConfig;

    /**
     * <p>The list of alert notification groups.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;Cloud account alert contact\&quot;]</p>
     */
    @NameInMap("AlertGroup")
    public String alertGroup;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId may be different for each API request.</p>
     * 
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
