// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentretailvision20260506.models;

import com.aliyun.tea.*;

public class RegisterWebhookRequest extends TeaModel {
    /**
     * <p>The key used for callback signature verification.</p>
     * 
     * <strong>example:</strong>
     * <p>your_secret_key</p>
     */
    @NameInMap("CallbackSecret")
    public String callbackSecret;

    /**
     * <p>The default callback URL. A public HTTPS URL is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/callback">https://example.com/callback</a></p>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    public static RegisterWebhookRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterWebhookRequest self = new RegisterWebhookRequest();
        return TeaModel.build(map, self);
    }

    public RegisterWebhookRequest setCallbackSecret(String callbackSecret) {
        this.callbackSecret = callbackSecret;
        return this;
    }
    public String getCallbackSecret() {
        return this.callbackSecret;
    }

    public RegisterWebhookRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

}
