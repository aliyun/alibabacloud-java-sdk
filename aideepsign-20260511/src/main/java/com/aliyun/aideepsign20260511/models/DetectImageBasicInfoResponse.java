// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class DetectImageBasicInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetectImageBasicInfoResponseBody body;

    public static DetectImageBasicInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectImageBasicInfoResponse self = new DetectImageBasicInfoResponse();
        return TeaModel.build(map, self);
    }

    public DetectImageBasicInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectImageBasicInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectImageBasicInfoResponse setBody(DetectImageBasicInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectImageBasicInfoResponseBody getBody() {
        return this.body;
    }

}
