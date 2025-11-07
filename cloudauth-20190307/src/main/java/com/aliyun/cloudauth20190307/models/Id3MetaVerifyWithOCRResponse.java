// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Id3MetaVerifyWithOCRResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Id3MetaVerifyWithOCRResponseBody body;

    public static Id3MetaVerifyWithOCRResponse build(java.util.Map<String, ?> map) throws Exception {
        Id3MetaVerifyWithOCRResponse self = new Id3MetaVerifyWithOCRResponse();
        return TeaModel.build(map, self);
    }

    public Id3MetaVerifyWithOCRResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public Id3MetaVerifyWithOCRResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public Id3MetaVerifyWithOCRResponse setBody(Id3MetaVerifyWithOCRResponseBody body) {
        this.body = body;
        return this;
    }
    public Id3MetaVerifyWithOCRResponseBody getBody() {
        return this.body;
    }

}
