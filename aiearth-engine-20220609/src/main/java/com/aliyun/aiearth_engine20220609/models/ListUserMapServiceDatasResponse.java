// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class ListUserMapServiceDatasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserMapServiceDatasResponseBody body;

    public static ListUserMapServiceDatasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserMapServiceDatasResponse self = new ListUserMapServiceDatasResponse();
        return TeaModel.build(map, self);
    }

    public ListUserMapServiceDatasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserMapServiceDatasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserMapServiceDatasResponse setBody(ListUserMapServiceDatasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserMapServiceDatasResponseBody getBody() {
        return this.body;
    }

}
