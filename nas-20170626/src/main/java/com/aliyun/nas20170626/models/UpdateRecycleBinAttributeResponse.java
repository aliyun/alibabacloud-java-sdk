// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class UpdateRecycleBinAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRecycleBinAttributeResponseBody body;

    public static UpdateRecycleBinAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecycleBinAttributeResponse self = new UpdateRecycleBinAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRecycleBinAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRecycleBinAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRecycleBinAttributeResponse setBody(UpdateRecycleBinAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRecycleBinAttributeResponseBody getBody() {
        return this.body;
    }

}
