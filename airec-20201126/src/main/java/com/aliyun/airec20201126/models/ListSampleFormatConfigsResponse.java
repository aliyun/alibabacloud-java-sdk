// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListSampleFormatConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSampleFormatConfigsResponseBody body;

    public static ListSampleFormatConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSampleFormatConfigsResponse self = new ListSampleFormatConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListSampleFormatConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSampleFormatConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSampleFormatConfigsResponse setBody(ListSampleFormatConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSampleFormatConfigsResponseBody getBody() {
        return this.body;
    }

}
