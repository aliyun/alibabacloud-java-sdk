// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListInstanceRegionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstanceRegionResponseBody body;

    public static ListInstanceRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceRegionResponse self = new ListInstanceRegionResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceRegionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceRegionResponse setBody(ListInstanceRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceRegionResponseBody getBody() {
        return this.body;
    }

}
