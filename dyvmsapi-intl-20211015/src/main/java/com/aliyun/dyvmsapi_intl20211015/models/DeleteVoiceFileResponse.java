// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class DeleteVoiceFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteVoiceFileResponseBody body;

    public static DeleteVoiceFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVoiceFileResponse self = new DeleteVoiceFileResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVoiceFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVoiceFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVoiceFileResponse setBody(DeleteVoiceFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVoiceFileResponseBody getBody() {
        return this.body;
    }

}
