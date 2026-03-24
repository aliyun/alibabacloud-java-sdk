// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class MergeWebhook extends TeaModel {
    /**
     * <p>内容类型。</p>
     * 
     * <strong>example:</strong>
     * <p>application/json</p>
     */
    @NameInMap("contentType")
    public String contentType;

    /**
     * <p>扩展字段，用于存储额外配置。</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;timeout&quot;: 3000}</p>
     */
    @NameInMap("extend")
    public String extend;

    /**
     * <p>创建时间。</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-11T08:21:58.789Z</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <p>最后修改时间。</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-11T08:21:58.789Z</p>
     */
    @NameInMap("gmtModified")
    public java.util.Map<String, ?> gmtModified;

    /**
     * <p>请求头信息。</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Authorization&quot;: &quot;Bearer abc123&quot;}</p>
     */
    @NameInMap("headers")
    public String headers;

    /**
     * <p>Webhook 唯一标识符。</p>
     * 
     * <strong>example:</strong>
     * <p>webhook-12345</p>
     */
    @NameInMap("identifier")
    public String identifier;

    /**
     * <p>语言偏好。</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("lang")
    public String lang;

    /**
     * <p>HTTP 请求方法。</p>
     * 
     * <strong>example:</strong>
     * <p>POST</p>
     */
    @NameInMap("method")
    public String method;

    /**
     * <p>Webhook 名称。</p>
     * 
     * <strong>example:</strong>
     * <p>运维告警通知</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Webhook 来源系统。</p>
     * 
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <p>Webhook 类型，表示其目标平台。</p>
     * 
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>Webhook 地址，用于发送请求。</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=abc123">https://oapi.dingtalk.com/robot/send?access_token=abc123</a></p>
     */
    @NameInMap("webhook")
    public String webhook;

    public static MergeWebhook build(java.util.Map<String, ?> map) throws Exception {
        MergeWebhook self = new MergeWebhook();
        return TeaModel.build(map, self);
    }

    public MergeWebhook setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public MergeWebhook setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public MergeWebhook setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public MergeWebhook setGmtModified(java.util.Map<String, ?> gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public java.util.Map<String, ?> getGmtModified() {
        return this.gmtModified;
    }

    public MergeWebhook setHeaders(String headers) {
        this.headers = headers;
        return this;
    }
    public String getHeaders() {
        return this.headers;
    }

    public MergeWebhook setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public MergeWebhook setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public MergeWebhook setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public MergeWebhook setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MergeWebhook setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public MergeWebhook setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public MergeWebhook setWebhook(String webhook) {
        this.webhook = webhook;
        return this;
    }
    public String getWebhook() {
        return this.webhook;
    }

}
