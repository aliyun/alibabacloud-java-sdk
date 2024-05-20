// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgWhiteListDeleteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DsgWhiteListDeleteListResponseBody body;

    public static DsgWhiteListDeleteListResponse build(java.util.Map<String, ?> map) throws Exception {
        DsgWhiteListDeleteListResponse self = new DsgWhiteListDeleteListResponse();
        return TeaModel.build(map, self);
    }

    public DsgWhiteListDeleteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DsgWhiteListDeleteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DsgWhiteListDeleteListResponse setBody(DsgWhiteListDeleteListResponseBody body) {
        this.body = body;
        return this;
    }
    public DsgWhiteListDeleteListResponseBody getBody() {
        return this.body;
    }

}
