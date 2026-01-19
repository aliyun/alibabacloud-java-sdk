// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateCloudAccountDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCloudAccountDescriptionResponseBody body;

    public static UpdateCloudAccountDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudAccountDescriptionResponse self = new UpdateCloudAccountDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCloudAccountDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCloudAccountDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCloudAccountDescriptionResponse setBody(UpdateCloudAccountDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCloudAccountDescriptionResponseBody getBody() {
        return this.body;
    }

}
