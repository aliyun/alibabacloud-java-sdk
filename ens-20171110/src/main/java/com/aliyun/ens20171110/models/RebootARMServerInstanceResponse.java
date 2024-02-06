// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RebootARMServerInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RebootARMServerInstanceResponseBody body;

    public static RebootARMServerInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RebootARMServerInstanceResponse self = new RebootARMServerInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RebootARMServerInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RebootARMServerInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RebootARMServerInstanceResponse setBody(RebootARMServerInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RebootARMServerInstanceResponseBody getBody() {
        return this.body;
    }

}
