// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class DeleteVoiceTtsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteVoiceTtsResponseBody body;

    public static DeleteVoiceTtsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVoiceTtsResponse self = new DeleteVoiceTtsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVoiceTtsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVoiceTtsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVoiceTtsResponse setBody(DeleteVoiceTtsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVoiceTtsResponseBody getBody() {
        return this.body;
    }

}
