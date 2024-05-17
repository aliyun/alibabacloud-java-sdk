// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListStreamingDataServicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListStreamingDataServicesResponseBody body;

    public static ListStreamingDataServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStreamingDataServicesResponse self = new ListStreamingDataServicesResponse();
        return TeaModel.build(map, self);
    }

    public ListStreamingDataServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListStreamingDataServicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListStreamingDataServicesResponse setBody(ListStreamingDataServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStreamingDataServicesResponseBody getBody() {
        return this.body;
    }

}
