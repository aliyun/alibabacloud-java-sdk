// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603.models;

import com.aliyun.tea.*;

public class GeneralAnalyzeImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GeneralAnalyzeImageResponseBody body;

    public static GeneralAnalyzeImageResponse build(java.util.Map<String, ?> map) throws Exception {
        GeneralAnalyzeImageResponse self = new GeneralAnalyzeImageResponse();
        return TeaModel.build(map, self);
    }

    public GeneralAnalyzeImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GeneralAnalyzeImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GeneralAnalyzeImageResponse setBody(GeneralAnalyzeImageResponseBody body) {
        this.body = body;
        return this;
    }
    public GeneralAnalyzeImageResponseBody getBody() {
        return this.body;
    }

}
