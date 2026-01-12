// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListMemoryCollectionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMemoryCollectionsResult body;

    public static ListMemoryCollectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMemoryCollectionsResponse self = new ListMemoryCollectionsResponse();
        return TeaModel.build(map, self);
    }

    public ListMemoryCollectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMemoryCollectionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMemoryCollectionsResponse setBody(ListMemoryCollectionsResult body) {
        this.body = body;
        return this;
    }
    public ListMemoryCollectionsResult getBody() {
        return this.body;
    }

}
