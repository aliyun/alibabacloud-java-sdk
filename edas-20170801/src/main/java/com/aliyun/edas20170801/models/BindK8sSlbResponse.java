// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class BindK8sSlbResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindK8sSlbResponseBody body;

    public static BindK8sSlbResponse build(java.util.Map<String, ?> map) throws Exception {
        BindK8sSlbResponse self = new BindK8sSlbResponse();
        return TeaModel.build(map, self);
    }

    public BindK8sSlbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindK8sSlbResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindK8sSlbResponse setBody(BindK8sSlbResponseBody body) {
        this.body = body;
        return this;
    }
    public BindK8sSlbResponseBody getBody() {
        return this.body;
    }

}
