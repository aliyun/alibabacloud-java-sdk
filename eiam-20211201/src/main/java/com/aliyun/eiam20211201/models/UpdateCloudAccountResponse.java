// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateCloudAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCloudAccountResponseBody body;

    public static UpdateCloudAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudAccountResponse self = new UpdateCloudAccountResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCloudAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCloudAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCloudAccountResponse setBody(UpdateCloudAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCloudAccountResponseBody getBody() {
        return this.body;
    }

}
