// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgWhiteListQueryListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DsgWhiteListQueryListResponseBody body;

    public static DsgWhiteListQueryListResponse build(java.util.Map<String, ?> map) throws Exception {
        DsgWhiteListQueryListResponse self = new DsgWhiteListQueryListResponse();
        return TeaModel.build(map, self);
    }

    public DsgWhiteListQueryListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DsgWhiteListQueryListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DsgWhiteListQueryListResponse setBody(DsgWhiteListQueryListResponseBody body) {
        this.body = body;
        return this;
    }
    public DsgWhiteListQueryListResponseBody getBody() {
        return this.body;
    }

}
