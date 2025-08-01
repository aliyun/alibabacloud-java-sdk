// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateMetaCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMetaCategoryResponseBody body;

    public static UpdateMetaCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetaCategoryResponse self = new UpdateMetaCategoryResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMetaCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMetaCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMetaCategoryResponse setBody(UpdateMetaCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMetaCategoryResponseBody getBody() {
        return this.body;
    }

}
