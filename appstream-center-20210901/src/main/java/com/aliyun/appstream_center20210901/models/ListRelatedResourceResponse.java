// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListRelatedResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRelatedResourceResponseBody body;

    public static ListRelatedResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRelatedResourceResponse self = new ListRelatedResourceResponse();
        return TeaModel.build(map, self);
    }

    public ListRelatedResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRelatedResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRelatedResourceResponse setBody(ListRelatedResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRelatedResourceResponseBody getBody() {
        return this.body;
    }

}
