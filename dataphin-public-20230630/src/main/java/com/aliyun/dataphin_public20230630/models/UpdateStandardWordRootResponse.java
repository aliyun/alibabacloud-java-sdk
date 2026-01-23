// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateStandardWordRootResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateStandardWordRootResponseBody body;

    public static UpdateStandardWordRootResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateStandardWordRootResponse self = new UpdateStandardWordRootResponse();
        return TeaModel.build(map, self);
    }

    public UpdateStandardWordRootResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateStandardWordRootResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateStandardWordRootResponse setBody(UpdateStandardWordRootResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateStandardWordRootResponseBody getBody() {
        return this.body;
    }

}
