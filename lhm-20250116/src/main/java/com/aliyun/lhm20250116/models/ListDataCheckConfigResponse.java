// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ListDataCheckConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataCheckConfigResponseBody body;

    public static ListDataCheckConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataCheckConfigResponse self = new ListDataCheckConfigResponse();
        return TeaModel.build(map, self);
    }

    public ListDataCheckConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataCheckConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataCheckConfigResponse setBody(ListDataCheckConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataCheckConfigResponseBody getBody() {
        return this.body;
    }

}
