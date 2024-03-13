// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class PedestrianDetectAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PedestrianDetectAttributeResponseBody body;

    public static PedestrianDetectAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        PedestrianDetectAttributeResponse self = new PedestrianDetectAttributeResponse();
        return TeaModel.build(map, self);
    }

    public PedestrianDetectAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PedestrianDetectAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PedestrianDetectAttributeResponse setBody(PedestrianDetectAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public PedestrianDetectAttributeResponseBody getBody() {
        return this.body;
    }

}
