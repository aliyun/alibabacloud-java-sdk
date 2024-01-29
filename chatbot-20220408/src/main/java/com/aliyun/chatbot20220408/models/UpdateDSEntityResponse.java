// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateDSEntityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDSEntityResponseBody body;

    public static UpdateDSEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDSEntityResponse self = new UpdateDSEntityResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDSEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDSEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDSEntityResponse setBody(UpdateDSEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDSEntityResponseBody getBody() {
        return this.body;
    }

}
