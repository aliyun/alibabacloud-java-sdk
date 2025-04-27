// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Id2MetaVerifyWithOCRResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Id2MetaVerifyWithOCRResponseBody body;

    public static Id2MetaVerifyWithOCRResponse build(java.util.Map<String, ?> map) throws Exception {
        Id2MetaVerifyWithOCRResponse self = new Id2MetaVerifyWithOCRResponse();
        return TeaModel.build(map, self);
    }

    public Id2MetaVerifyWithOCRResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public Id2MetaVerifyWithOCRResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public Id2MetaVerifyWithOCRResponse setBody(Id2MetaVerifyWithOCRResponseBody body) {
        this.body = body;
        return this;
    }
    public Id2MetaVerifyWithOCRResponseBody getBody() {
        return this.body;
    }

}
