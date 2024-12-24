// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class ListSynonymsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSynonymsResponseBody body;

    public static ListSynonymsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSynonymsResponse self = new ListSynonymsResponse();
        return TeaModel.build(map, self);
    }

    public ListSynonymsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSynonymsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSynonymsResponse setBody(ListSynonymsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSynonymsResponseBody getBody() {
        return this.body;
    }

}
