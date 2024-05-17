// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyStreamingDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyStreamingDataSourceResponseBody body;

    public static ModifyStreamingDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyStreamingDataSourceResponse self = new ModifyStreamingDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyStreamingDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyStreamingDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyStreamingDataSourceResponse setBody(ModifyStreamingDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyStreamingDataSourceResponseBody getBody() {
        return this.body;
    }

}
