// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeSdlEventSdListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSdlEventSdListResponseBody body;

    public static DescribeSdlEventSdListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSdlEventSdListResponse self = new DescribeSdlEventSdListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSdlEventSdListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSdlEventSdListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSdlEventSdListResponse setBody(DescribeSdlEventSdListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSdlEventSdListResponseBody getBody() {
        return this.body;
    }

}
