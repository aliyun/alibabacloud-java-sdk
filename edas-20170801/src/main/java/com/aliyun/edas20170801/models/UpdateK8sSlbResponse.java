// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateK8sSlbResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateK8sSlbResponseBody body;

    public static UpdateK8sSlbResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateK8sSlbResponse self = new UpdateK8sSlbResponse();
        return TeaModel.build(map, self);
    }

    public UpdateK8sSlbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateK8sSlbResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateK8sSlbResponse setBody(UpdateK8sSlbResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateK8sSlbResponseBody getBody() {
        return this.body;
    }

}
