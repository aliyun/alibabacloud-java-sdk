// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgDesensPlanUpdateStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DsgDesensPlanUpdateStatusResponseBody body;

    public static DsgDesensPlanUpdateStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DsgDesensPlanUpdateStatusResponse self = new DsgDesensPlanUpdateStatusResponse();
        return TeaModel.build(map, self);
    }

    public DsgDesensPlanUpdateStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DsgDesensPlanUpdateStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DsgDesensPlanUpdateStatusResponse setBody(DsgDesensPlanUpdateStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DsgDesensPlanUpdateStatusResponseBody getBody() {
        return this.body;
    }

}
