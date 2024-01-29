// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateDSEntityValueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDSEntityValueResponseBody body;

    public static UpdateDSEntityValueResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDSEntityValueResponse self = new UpdateDSEntityValueResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDSEntityValueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDSEntityValueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDSEntityValueResponse setBody(UpdateDSEntityValueResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDSEntityValueResponseBody getBody() {
        return this.body;
    }

}
