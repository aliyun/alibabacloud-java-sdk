// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SaveDataSourceOrderConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SaveDataSourceOrderConfigResponseBody body;

    public static SaveDataSourceOrderConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveDataSourceOrderConfigResponse self = new SaveDataSourceOrderConfigResponse();
        return TeaModel.build(map, self);
    }

    public SaveDataSourceOrderConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveDataSourceOrderConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveDataSourceOrderConfigResponse setBody(SaveDataSourceOrderConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveDataSourceOrderConfigResponseBody getBody() {
        return this.body;
    }

}
