// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SaveOrUpdateOssConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveOrUpdateOssConfigResponseBody body;

    public static SaveOrUpdateOssConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveOrUpdateOssConfigResponse self = new SaveOrUpdateOssConfigResponse();
        return TeaModel.build(map, self);
    }

    public SaveOrUpdateOssConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveOrUpdateOssConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveOrUpdateOssConfigResponse setBody(SaveOrUpdateOssConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveOrUpdateOssConfigResponseBody getBody() {
        return this.body;
    }

}
