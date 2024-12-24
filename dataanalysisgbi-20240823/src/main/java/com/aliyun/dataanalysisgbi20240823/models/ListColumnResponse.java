// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class ListColumnResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListColumnResponseBody body;

    public static ListColumnResponse build(java.util.Map<String, ?> map) throws Exception {
        ListColumnResponse self = new ListColumnResponse();
        return TeaModel.build(map, self);
    }

    public ListColumnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListColumnResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListColumnResponse setBody(ListColumnResponseBody body) {
        this.body = body;
        return this;
    }
    public ListColumnResponseBody getBody() {
        return this.body;
    }

}
