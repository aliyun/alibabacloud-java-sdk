// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class UpdateBasicInfoQAResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateBasicInfoQAResponseBody body;

    public static UpdateBasicInfoQAResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBasicInfoQAResponse self = new UpdateBasicInfoQAResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBasicInfoQAResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBasicInfoQAResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBasicInfoQAResponse setBody(UpdateBasicInfoQAResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBasicInfoQAResponseBody getBody() {
        return this.body;
    }

}
