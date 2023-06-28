// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class GetLayerVersionByArnResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public Layer body;

    public static GetLayerVersionByArnResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLayerVersionByArnResponse self = new GetLayerVersionByArnResponse();
        return TeaModel.build(map, self);
    }

    public GetLayerVersionByArnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLayerVersionByArnResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLayerVersionByArnResponse setBody(Layer body) {
        this.body = body;
        return this;
    }
    public Layer getBody() {
        return this.body;
    }

}
