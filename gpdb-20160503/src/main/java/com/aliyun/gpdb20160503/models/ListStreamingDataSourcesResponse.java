// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListStreamingDataSourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListStreamingDataSourcesResponseBody body;

    public static ListStreamingDataSourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStreamingDataSourcesResponse self = new ListStreamingDataSourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListStreamingDataSourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListStreamingDataSourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListStreamingDataSourcesResponse setBody(ListStreamingDataSourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStreamingDataSourcesResponseBody getBody() {
        return this.body;
    }

}
