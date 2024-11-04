// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class UpdateFileTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateFileTagResponseBody body;

    public static UpdateFileTagResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileTagResponse self = new UpdateFileTagResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFileTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFileTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFileTagResponse setBody(UpdateFileTagResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFileTagResponseBody getBody() {
        return this.body;
    }

}
