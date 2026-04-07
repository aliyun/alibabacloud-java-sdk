// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgQueryDesensStatusListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DsgQueryDesensStatusListResponseBody body;

    public static DsgQueryDesensStatusListResponse build(java.util.Map<String, ?> map) throws Exception {
        DsgQueryDesensStatusListResponse self = new DsgQueryDesensStatusListResponse();
        return TeaModel.build(map, self);
    }

    public DsgQueryDesensStatusListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DsgQueryDesensStatusListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DsgQueryDesensStatusListResponse setBody(DsgQueryDesensStatusListResponseBody body) {
        this.body = body;
        return this;
    }
    public DsgQueryDesensStatusListResponseBody getBody() {
        return this.body;
    }

}
