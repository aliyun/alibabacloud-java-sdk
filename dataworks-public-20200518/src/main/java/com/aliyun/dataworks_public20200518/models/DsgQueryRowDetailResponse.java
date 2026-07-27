// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgQueryRowDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DsgQueryRowDetailResponseBody body;

    public static DsgQueryRowDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DsgQueryRowDetailResponse self = new DsgQueryRowDetailResponse();
        return TeaModel.build(map, self);
    }

    public DsgQueryRowDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DsgQueryRowDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DsgQueryRowDetailResponse setBody(DsgQueryRowDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DsgQueryRowDetailResponseBody getBody() {
        return this.body;
    }

}
