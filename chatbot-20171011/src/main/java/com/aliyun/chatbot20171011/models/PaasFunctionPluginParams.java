// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class PaasFunctionPluginParams extends TeaModel {
    @NameInMap("Body")
    public String body;

    @NameInMap("Header")
    public java.util.Map<String, String> header;

    @NameInMap("Method")
    public String method;

    @NameInMap("Query")
    public java.util.Map<String, String> query;

    @NameInMap("Url")
    public String url;

    public static PaasFunctionPluginParams build(java.util.Map<String, ?> map) throws Exception {
        PaasFunctionPluginParams self = new PaasFunctionPluginParams();
        return TeaModel.build(map, self);
    }

    public PaasFunctionPluginParams setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public PaasFunctionPluginParams setHeader(java.util.Map<String, String> header) {
        this.header = header;
        return this;
    }
    public java.util.Map<String, String> getHeader() {
        return this.header;
    }

    public PaasFunctionPluginParams setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public PaasFunctionPluginParams setQuery(java.util.Map<String, String> query) {
        this.query = query;
        return this;
    }
    public java.util.Map<String, String> getQuery() {
        return this.query;
    }

    public PaasFunctionPluginParams setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
