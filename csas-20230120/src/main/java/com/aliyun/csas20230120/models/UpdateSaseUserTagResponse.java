// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateSaseUserTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSaseUserTagResponseBody body;

    public static UpdateSaseUserTagResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSaseUserTagResponse self = new UpdateSaseUserTagResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSaseUserTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSaseUserTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSaseUserTagResponse setBody(UpdateSaseUserTagResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSaseUserTagResponseBody getBody() {
        return this.body;
    }

}
