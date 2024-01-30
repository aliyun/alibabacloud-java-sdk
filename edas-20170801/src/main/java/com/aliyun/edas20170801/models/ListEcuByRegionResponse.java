// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListEcuByRegionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEcuByRegionResponseBody body;

    public static ListEcuByRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEcuByRegionResponse self = new ListEcuByRegionResponse();
        return TeaModel.build(map, self);
    }

    public ListEcuByRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEcuByRegionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEcuByRegionResponse setBody(ListEcuByRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEcuByRegionResponseBody getBody() {
        return this.body;
    }

}
