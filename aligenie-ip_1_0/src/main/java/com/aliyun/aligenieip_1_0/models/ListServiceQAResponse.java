// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListServiceQAResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListServiceQAResponseBody body;

    public static ListServiceQAResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceQAResponse self = new ListServiceQAResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceQAResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceQAResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServiceQAResponse setBody(ListServiceQAResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceQAResponseBody getBody() {
        return this.body;
    }

}
