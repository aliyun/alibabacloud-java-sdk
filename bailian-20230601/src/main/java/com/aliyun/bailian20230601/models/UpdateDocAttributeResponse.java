// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class UpdateDocAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDocAttributeResponseBody body;

    public static UpdateDocAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDocAttributeResponse self = new UpdateDocAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDocAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDocAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDocAttributeResponse setBody(UpdateDocAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDocAttributeResponseBody getBody() {
        return this.body;
    }

}
