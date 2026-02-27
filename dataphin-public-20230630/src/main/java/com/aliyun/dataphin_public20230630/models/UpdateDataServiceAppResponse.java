// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateDataServiceAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataServiceAppResponseBody body;

    public static UpdateDataServiceAppResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataServiceAppResponse self = new UpdateDataServiceAppResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataServiceAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataServiceAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataServiceAppResponse setBody(UpdateDataServiceAppResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataServiceAppResponseBody getBody() {
        return this.body;
    }

}
