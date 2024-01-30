// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListUserDefineRegionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserDefineRegionResponseBody body;

    public static ListUserDefineRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserDefineRegionResponse self = new ListUserDefineRegionResponse();
        return TeaModel.build(map, self);
    }

    public ListUserDefineRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserDefineRegionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserDefineRegionResponse setBody(ListUserDefineRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserDefineRegionResponseBody getBody() {
        return this.body;
    }

}
