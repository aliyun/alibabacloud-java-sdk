// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListApiTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApiTemplatesResponseBody body;

    public static ListApiTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApiTemplatesResponse self = new ListApiTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListApiTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApiTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApiTemplatesResponse setBody(ListApiTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApiTemplatesResponseBody getBody() {
        return this.body;
    }

}
