// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDataLakeTablebaseInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataLakeTablebaseInfoResponseBody body;

    public static ListDataLakeTablebaseInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataLakeTablebaseInfoResponse self = new ListDataLakeTablebaseInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListDataLakeTablebaseInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataLakeTablebaseInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataLakeTablebaseInfoResponse setBody(ListDataLakeTablebaseInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataLakeTablebaseInfoResponseBody getBody() {
        return this.body;
    }

}
