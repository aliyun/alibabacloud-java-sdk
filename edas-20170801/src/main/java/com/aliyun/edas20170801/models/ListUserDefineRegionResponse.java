// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListUserDefineRegionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
