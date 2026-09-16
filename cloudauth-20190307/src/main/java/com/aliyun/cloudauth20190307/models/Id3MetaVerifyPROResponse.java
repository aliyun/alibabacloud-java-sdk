// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Id3MetaVerifyPROResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Id3MetaVerifyPROResponseBody body;

    public static Id3MetaVerifyPROResponse build(java.util.Map<String, ?> map) throws Exception {
        Id3MetaVerifyPROResponse self = new Id3MetaVerifyPROResponse();
        return TeaModel.build(map, self);
    }

    public Id3MetaVerifyPROResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public Id3MetaVerifyPROResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public Id3MetaVerifyPROResponse setBody(Id3MetaVerifyPROResponseBody body) {
        this.body = body;
        return this;
    }
    public Id3MetaVerifyPROResponseBody getBody() {
        return this.body;
    }

}
