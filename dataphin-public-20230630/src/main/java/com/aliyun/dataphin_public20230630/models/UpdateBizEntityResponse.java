// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateBizEntityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateBizEntityResponseBody body;

    public static UpdateBizEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBizEntityResponse self = new UpdateBizEntityResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBizEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBizEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBizEntityResponse setBody(UpdateBizEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBizEntityResponseBody getBody() {
        return this.body;
    }

}
