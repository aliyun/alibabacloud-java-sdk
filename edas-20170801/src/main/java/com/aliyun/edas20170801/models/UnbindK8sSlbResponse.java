// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UnbindK8sSlbResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnbindK8sSlbResponseBody body;

    public static UnbindK8sSlbResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindK8sSlbResponse self = new UnbindK8sSlbResponse();
        return TeaModel.build(map, self);
    }

    public UnbindK8sSlbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindK8sSlbResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindK8sSlbResponse setBody(UnbindK8sSlbResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindK8sSlbResponseBody getBody() {
        return this.body;
    }

}
