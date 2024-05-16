// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgDesensPlanDeleteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DsgDesensPlanDeleteResponseBody body;

    public static DsgDesensPlanDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        DsgDesensPlanDeleteResponse self = new DsgDesensPlanDeleteResponse();
        return TeaModel.build(map, self);
    }

    public DsgDesensPlanDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DsgDesensPlanDeleteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DsgDesensPlanDeleteResponse setBody(DsgDesensPlanDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public DsgDesensPlanDeleteResponseBody getBody() {
        return this.body;
    }

}
