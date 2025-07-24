// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class MergeWebhook extends TeaModel {
    @NameInMap("contentType")
    public String contentType;

    @NameInMap("extend")
    public String extend;

    @NameInMap("gmtCreate")
    public String gmtCreate;

    @NameInMap("gmtModified")
    public java.util.Map<String, ?> gmtModified;

    @NameInMap("headers")
    public String headers;

    @NameInMap("identifier")
    public String identifier;

    @NameInMap("lang")
    public String lang;

    @NameInMap("method")
    public String method;

    @NameInMap("name")
    public String name;

    @NameInMap("source")
    public String source;

    @NameInMap("type")
    public String type;

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
