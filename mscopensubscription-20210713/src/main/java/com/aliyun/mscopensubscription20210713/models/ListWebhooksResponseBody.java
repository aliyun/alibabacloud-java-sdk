// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class ListWebhooksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>qwe-rty</p>
     */
    @NameInMap("NextToken")
    public Integer nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CFA1882C-493D-1986-922D-6AF5085C0F91</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Webhooks")
    public java.util.List<ListWebhooksResponseBodyWebhooks> webhooks;

    public static ListWebhooksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWebhooksResponseBody self = new ListWebhooksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWebhooksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListWebhooksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListWebhooksResponseBody setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListWebhooksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWebhooksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListWebhooksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListWebhooksResponseBody setWebhooks(java.util.List<ListWebhooksResponseBodyWebhooks> webhooks) {
        this.webhooks = webhooks;
        return this;
    }
    public java.util.List<ListWebhooksResponseBodyWebhooks> getWebhooks() {
        return this.webhooks;
    }

    public static class ListWebhooksResponseBodyWebhooks extends TeaModel {
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

        public static ListWebhooksResponseBodyWebhooks build(java.util.Map<String, ?> map) throws Exception {
            ListWebhooksResponseBodyWebhooks self = new ListWebhooksResponseBodyWebhooks();
            return TeaModel.build(map, self);
        }

        public ListWebhooksResponseBodyWebhooks setServerUrl(String serverUrl) {
            this.serverUrl = serverUrl;
            return this;
        }
        public String getServerUrl() {
            return this.serverUrl;
        }

        public ListWebhooksResponseBodyWebhooks setWebhookId(Long webhookId) {
            this.webhookId = webhookId;
            return this;
        }
        public Long getWebhookId() {
            return this.webhookId;
        }

        public ListWebhooksResponseBodyWebhooks setWebhookName(String webhookName) {
            this.webhookName = webhookName;
            return this;
        }
        public String getWebhookName() {
            return this.webhookName;
        }

    }

}
