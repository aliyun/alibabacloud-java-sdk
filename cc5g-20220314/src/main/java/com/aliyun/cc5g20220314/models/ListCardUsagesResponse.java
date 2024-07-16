// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListCardUsagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCardUsagesResponseBody body;

    public static ListCardUsagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCardUsagesResponse self = new ListCardUsagesResponse();
        return TeaModel.build(map, self);
    }

    public ListCardUsagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCardUsagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCardUsagesResponse setBody(ListCardUsagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCardUsagesResponseBody getBody() {
        return this.body;
    }

}
