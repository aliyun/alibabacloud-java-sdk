// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class SaveLearningStatusNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveLearningStatusNewResponseBody body;

    public static SaveLearningStatusNewResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveLearningStatusNewResponse self = new SaveLearningStatusNewResponse();
        return TeaModel.build(map, self);
    }

    public SaveLearningStatusNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveLearningStatusNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveLearningStatusNewResponse setBody(SaveLearningStatusNewResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveLearningStatusNewResponseBody getBody() {
        return this.body;
    }

}
