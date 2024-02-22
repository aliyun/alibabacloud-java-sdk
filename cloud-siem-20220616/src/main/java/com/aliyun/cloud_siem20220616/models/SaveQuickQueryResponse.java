// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class SaveQuickQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveQuickQueryResponseBody body;

    public static SaveQuickQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveQuickQueryResponse self = new SaveQuickQueryResponse();
        return TeaModel.build(map, self);
    }

    public SaveQuickQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveQuickQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveQuickQueryResponse setBody(SaveQuickQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveQuickQueryResponseBody getBody() {
        return this.body;
    }

}
