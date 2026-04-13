// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class AssociateDetectConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssociateDetectConfigResponseBody body;

    public static AssociateDetectConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateDetectConfigResponse self = new AssociateDetectConfigResponse();
        return TeaModel.build(map, self);
    }

    public AssociateDetectConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateDetectConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateDetectConfigResponse setBody(AssociateDetectConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateDetectConfigResponseBody getBody() {
        return this.body;
    }

}
