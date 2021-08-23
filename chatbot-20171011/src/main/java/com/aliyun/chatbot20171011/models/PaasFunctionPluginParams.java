// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class PaasFunctionPluginParams extends TeaModel {
    // Method
    @NameInMap("Method")
    public String method;

    // Query
    @NameInMap("Query")
    public java.util.Map<String, String> query;

    // Header
    @NameInMap("Header")
    public java.util.Map<String, String> header;

    // Body
    @NameInMap("Body")
    public String body;

    // Url
    @NameInMap("Url")
    public String url;

    public static PaasFunctionPluginParams build(java.util.Map<String, ?> map) throws Exception {
        PaasFunctionPluginParams self = new PaasFunctionPluginParams();
        return TeaModel.build(map, self);
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

    public PaasFunctionPluginParams setHeader(java.util.Map<String, String> header) {
        this.header = header;
        return this;
    }
    public java.util.Map<String, String> getHeader() {
        return this.header;
    }

    public PaasFunctionPluginParams setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public PaasFunctionPluginParams setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
