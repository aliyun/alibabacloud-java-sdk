// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class ListEncryptWebhooksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListEncryptWebhooksResponseBodyData> data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>FF1EFA25-9DB3-13E4-9643-5D3AD301C1D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static ListEncryptWebhooksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEncryptWebhooksResponseBody self = new ListEncryptWebhooksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEncryptWebhooksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListEncryptWebhooksResponseBody setData(java.util.List<ListEncryptWebhooksResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListEncryptWebhooksResponseBodyData> getData() {
        return this.data;
    }

    public ListEncryptWebhooksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEncryptWebhooksResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class ListEncryptWebhooksResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>izRofgO3nzDo4D1kJjJ+wKKeYsLa4F...</p>
         */
        @NameInMap("EncryptSecurityToken")
        public String encryptSecurityToken;

        /**
         * <strong>example:</strong>
         * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=">https://oapi.dingtalk.com/robot/send?access_token=</a></p>
         */
        @NameInMap("ServerUrl")
        public String serverUrl;

        /**
         * <strong>example:</strong>
         * <p>153369</p>
         */
        @NameInMap("WebhookId")
        public Long webhookId;

        @NameInMap("WebhookName")
        public String webhookName;

        public static ListEncryptWebhooksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEncryptWebhooksResponseBodyData self = new ListEncryptWebhooksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEncryptWebhooksResponseBodyData setEncryptSecurityToken(String encryptSecurityToken) {
            this.encryptSecurityToken = encryptSecurityToken;
            return this;
        }
        public String getEncryptSecurityToken() {
            return this.encryptSecurityToken;
        }

        public ListEncryptWebhooksResponseBodyData setServerUrl(String serverUrl) {
            this.serverUrl = serverUrl;
            return this;
        }
        public String getServerUrl() {
            return this.serverUrl;
        }

        public ListEncryptWebhooksResponseBodyData setWebhookId(Long webhookId) {
            this.webhookId = webhookId;
            return this;
        }
        public Long getWebhookId() {
            return this.webhookId;
        }

        public ListEncryptWebhooksResponseBodyData setWebhookName(String webhookName) {
            this.webhookName = webhookName;
            return this;
        }
        public String getWebhookName() {
            return this.webhookName;
        }

    }

}
