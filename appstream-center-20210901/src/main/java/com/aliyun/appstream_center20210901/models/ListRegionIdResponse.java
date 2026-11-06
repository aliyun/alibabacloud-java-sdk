// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListRegionIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRegionIdResponseBody body;

    public static ListRegionIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRegionIdResponse self = new ListRegionIdResponse();
        return TeaModel.build(map, self);
    }

    public ListRegionIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRegionIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRegionIdResponse setBody(ListRegionIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRegionIdResponseBody getBody() {
        return this.body;
    }

}
