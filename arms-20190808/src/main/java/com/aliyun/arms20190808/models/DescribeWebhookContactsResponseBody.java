// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeWebhookContactsResponseBody extends TeaModel {
    // 分页对象
    @NameInMap("PageBean")
    public DescribeWebhookContactsResponseBodyPageBean pageBean;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeWebhookContactsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebhookContactsResponseBody self = new DescribeWebhookContactsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebhookContactsResponseBody setPageBean(DescribeWebhookContactsResponseBodyPageBean pageBean) {
        this.pageBean = pageBean;
        return this;
    }
    public DescribeWebhookContactsResponseBodyPageBean getPageBean() {
        return this.pageBean;
    }

    public DescribeWebhookContactsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeWebhookContactsResponseBodyPageBeanWebhookContactsWebhook extends TeaModel {
        // HTTP请求头
        @NameInMap("BizHeaders")
        public String bizHeaders;

        // HTTP请求参数
        @NameInMap("BizParams")
        public String bizParams;

        // 告警通知模板
        @NameInMap("Body")
        public String body;

        // http请求方式
        @NameInMap("Method")
        public String method;

        // 告警恢复模板
        @NameInMap("RecoverBody")
        public String recoverBody;

        // Url
        @NameInMap("Url")
        public String url;

        public static DescribeWebhookContactsResponseBodyPageBeanWebhookContactsWebhook build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebhookContactsResponseBodyPageBeanWebhookContactsWebhook self = new DescribeWebhookContactsResponseBodyPageBeanWebhookContactsWebhook();
            return TeaModel.build(map, self);
        }

        public DescribeWebhookContactsResponseBodyPageBeanWebhookContactsWebhook setBizHeaders(String bizHeaders) {
            this.bizHeaders = bizHeaders;
            return this;
        }
        public String getBizHeaders() {
            return this.bizHeaders;
        }

        public DescribeWebhookContactsResponseBodyPageBeanWebhookContactsWebhook setBizParams(String bizParams) {
            this.bizParams = bizParams;
            return this;
        }
        public String getBizParams() {
            return this.bizParams;
        }

        public DescribeWebhookContactsResponseBodyPageBeanWebhookContactsWebhook setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public DescribeWebhookContactsResponseBodyPageBeanWebhookContactsWebhook setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribeWebhookContactsResponseBodyPageBeanWebhookContactsWebhook setRecoverBody(String recoverBody) {
            this.recoverBody = recoverBody;
            return this;
        }
        public String getRecoverBody() {
            return this.recoverBody;
        }

        public DescribeWebhookContactsResponseBodyPageBeanWebhookContactsWebhook setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class DescribeWebhookContactsResponseBodyPageBeanWebhookContacts extends TeaModel {
        // webhook对象
        @NameInMap("Webhook")
        public DescribeWebhookContactsResponseBodyPageBeanWebhookContactsWebhook webhook;

        // 告警webhookID
        @NameInMap("WebhookId")
        public Float webhookId;

        // 告警webhook名称
        @NameInMap("WebhookName")
        public String webhookName;

        public static DescribeWebhookContactsResponseBodyPageBeanWebhookContacts build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebhookContactsResponseBodyPageBeanWebhookContacts self = new DescribeWebhookContactsResponseBodyPageBeanWebhookContacts();
            return TeaModel.build(map, self);
        }

        public DescribeWebhookContactsResponseBodyPageBeanWebhookContacts setWebhook(DescribeWebhookContactsResponseBodyPageBeanWebhookContactsWebhook webhook) {
            this.webhook = webhook;
            return this;
        }
        public DescribeWebhookContactsResponseBodyPageBeanWebhookContactsWebhook getWebhook() {
            return this.webhook;
        }

        public DescribeWebhookContactsResponseBodyPageBeanWebhookContacts setWebhookId(Float webhookId) {
            this.webhookId = webhookId;
            return this;
        }
        public Float getWebhookId() {
            return this.webhookId;
        }

        public DescribeWebhookContactsResponseBodyPageBeanWebhookContacts setWebhookName(String webhookName) {
            this.webhookName = webhookName;
            return this;
        }
        public String getWebhookName() {
            return this.webhookName;
        }

    }

    public static class DescribeWebhookContactsResponseBodyPageBean extends TeaModel {
        // 页数
        @NameInMap("Page")
        public Long page;

        // 每一页数目
        @NameInMap("Size")
        public Long size;

        // 总数
        @NameInMap("Total")
        public Long total;

        // 告警webhook联系人列表
        @NameInMap("WebhookContacts")
        public java.util.List<DescribeWebhookContactsResponseBodyPageBeanWebhookContacts> webhookContacts;

        public static DescribeWebhookContactsResponseBodyPageBean build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebhookContactsResponseBodyPageBean self = new DescribeWebhookContactsResponseBodyPageBean();
            return TeaModel.build(map, self);
        }

        public DescribeWebhookContactsResponseBodyPageBean setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public DescribeWebhookContactsResponseBodyPageBean setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeWebhookContactsResponseBodyPageBean setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public DescribeWebhookContactsResponseBodyPageBean setWebhookContacts(java.util.List<DescribeWebhookContactsResponseBodyPageBeanWebhookContacts> webhookContacts) {
            this.webhookContacts = webhookContacts;
            return this;
        }
        public java.util.List<DescribeWebhookContactsResponseBodyPageBeanWebhookContacts> getWebhookContacts() {
            return this.webhookContacts;
        }

    }

}
