// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateStandardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateStandardResponseBody body;

    public static UpdateStandardResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateStandardResponse self = new UpdateStandardResponse();
        return TeaModel.build(map, self);
    }

    public UpdateStandardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateStandardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateStandardResponse setBody(UpdateStandardResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateStandardResponseBody getBody() {
        return this.body;
    }

}
