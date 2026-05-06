// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListModelTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListModelTemplatesResponseBody body;

    public static ListModelTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListModelTemplatesResponse self = new ListModelTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListModelTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListModelTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListModelTemplatesResponse setBody(ListModelTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListModelTemplatesResponseBody getBody() {
        return this.body;
    }

}
