// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetOpenNLUHighRecallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOpenNLUHighRecallResponseBody body;

    public static GetOpenNLUHighRecallResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOpenNLUHighRecallResponse self = new GetOpenNLUHighRecallResponse();
        return TeaModel.build(map, self);
    }

    public GetOpenNLUHighRecallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOpenNLUHighRecallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOpenNLUHighRecallResponse setBody(GetOpenNLUHighRecallResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOpenNLUHighRecallResponseBody getBody() {
        return this.body;
    }

}
