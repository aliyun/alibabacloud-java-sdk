// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListColumnsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListColumnsResponseBody body;

    public static ListColumnsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListColumnsResponse self = new ListColumnsResponse();
        return TeaModel.build(map, self);
    }

    public ListColumnsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListColumnsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListColumnsResponse setBody(ListColumnsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListColumnsResponseBody getBody() {
        return this.body;
    }

}
