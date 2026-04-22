// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListEnterprisePptTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEnterprisePptTemplatesResponseBody body;

    public static ListEnterprisePptTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnterprisePptTemplatesResponse self = new ListEnterprisePptTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListEnterprisePptTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnterprisePptTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEnterprisePptTemplatesResponse setBody(ListEnterprisePptTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnterprisePptTemplatesResponseBody getBody() {
        return this.body;
    }

}
