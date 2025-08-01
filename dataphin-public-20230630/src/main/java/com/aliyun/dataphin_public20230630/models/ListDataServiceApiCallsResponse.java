// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListDataServiceApiCallsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataServiceApiCallsResponseBody body;

    public static ListDataServiceApiCallsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceApiCallsResponse self = new ListDataServiceApiCallsResponse();
        return TeaModel.build(map, self);
    }

    public ListDataServiceApiCallsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataServiceApiCallsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataServiceApiCallsResponse setBody(ListDataServiceApiCallsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataServiceApiCallsResponseBody getBody() {
        return this.body;
    }

}
