// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListAlertWebhooksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>8A33DBEA-<em><strong><strong>-</strong></strong></em>-<em><strong><strong>-</strong></strong></em></p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("total")
    public Long total;

    /**
     * <p>webhooks</p>
     */
    @NameInMap("webhooks")
    public java.util.List<ListAlertWebhooksResponseBodyWebhooks> webhooks;

    public static ListAlertWebhooksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlertWebhooksResponseBody self = new ListAlertWebhooksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlertWebhooksResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAlertWebhooksResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAlertWebhooksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlertWebhooksResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ListAlertWebhooksResponseBody setWebhooks(java.util.List<ListAlertWebhooksResponseBodyWebhooks> webhooks) {
        this.webhooks = webhooks;
        return this;
    }
    public java.util.List<ListAlertWebhooksResponseBodyWebhooks> getWebhooks() {
        return this.webhooks;
    }

    public static class ListAlertWebhooksResponseBodyWebhooks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>JSON</p>
         */
        @NameInMap("contentType")
        public String contentType;

        /**
         * <p>headers</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("headers")
        public java.util.Map<String, ?> headers;

        /**
         * <strong>example:</strong>
         * <p>zh_CN</p>
         */
        @NameInMap("lang")
        public String lang;

        /**
         * <strong>example:</strong>
         * <p>GET</p>
         */
        @NameInMap("method")
        public String method;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p><a href="http://aliyun.com/test">http://aliyun.com/test</a></p>
         */
        @NameInMap("url")
        public String url;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("webhookId")
        public String webhookId;

        public static ListAlertWebhooksResponseBodyWebhooks build(java.util.Map<String, ?> map) throws Exception {
            ListAlertWebhooksResponseBodyWebhooks self = new ListAlertWebhooksResponseBodyWebhooks();
            return TeaModel.build(map, self);
        }

        public ListAlertWebhooksResponseBodyWebhooks setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public ListAlertWebhooksResponseBodyWebhooks setHeaders(java.util.Map<String, ?> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.Map<String, ?> getHeaders() {
            return this.headers;
        }

        public ListAlertWebhooksResponseBodyWebhooks setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public ListAlertWebhooksResponseBodyWebhooks setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public ListAlertWebhooksResponseBodyWebhooks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAlertWebhooksResponseBodyWebhooks setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public ListAlertWebhooksResponseBodyWebhooks setWebhookId(String webhookId) {
            this.webhookId = webhookId;
            return this;
        }
        public String getWebhookId() {
            return this.webhookId;
        }

    }

}
