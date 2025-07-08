// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class UploadCardResWithDyncParamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadCardResWithDyncParamResponseBody body;

    public static UploadCardResWithDyncParamResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadCardResWithDyncParamResponse self = new UploadCardResWithDyncParamResponse();
        return TeaModel.build(map, self);
    }

    public UploadCardResWithDyncParamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadCardResWithDyncParamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadCardResWithDyncParamResponse setBody(UploadCardResWithDyncParamResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadCardResWithDyncParamResponseBody getBody() {
        return this.body;
    }

}
