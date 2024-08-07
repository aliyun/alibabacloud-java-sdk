// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class GetWebhookResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Webhook")
    public GetWebhookResponseBodyWebhook webhook;

    public static GetWebhookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWebhookResponseBody self = new GetWebhookResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWebhookResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetWebhookResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWebhookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWebhookResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetWebhookResponseBody setWebhook(GetWebhookResponseBodyWebhook webhook) {
        this.webhook = webhook;
        return this;
    }
    public GetWebhookResponseBodyWebhook getWebhook() {
        return this.webhook;
    }

    public static class GetWebhookResponseBodyWebhook extends TeaModel {
        /**
         * <p>回调地址</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=">https://oapi.dingtalk.com/robot/send?access_token=</a></p>
         */
        @NameInMap("ServerUrl")
        public String serverUrl;

        /**
         * <p>代表资源一级ID的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>10086</p>
         */
        @NameInMap("WebhookId")
        public Long webhookId;

        /**
         * <p>名称</p>
         */
        @NameInMap("WebhookName")
        public String webhookName;

        public static GetWebhookResponseBodyWebhook build(java.util.Map<String, ?> map) throws Exception {
            GetWebhookResponseBodyWebhook self = new GetWebhookResponseBodyWebhook();
            return TeaModel.build(map, self);
        }

        public GetWebhookResponseBodyWebhook setServerUrl(String serverUrl) {
            this.serverUrl = serverUrl;
            return this;
        }
        public String getServerUrl() {
            return this.serverUrl;
        }

        public GetWebhookResponseBodyWebhook setWebhookId(Long webhookId) {
            this.webhookId = webhookId;
            return this;
        }
        public Long getWebhookId() {
            return this.webhookId;
        }

        public GetWebhookResponseBodyWebhook setWebhookName(String webhookName) {
            this.webhookName = webhookName;
            return this;
        }
        public String getWebhookName() {
            return this.webhookName;
        }

    }

}
