// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyDatasetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDatasetResponseBody body;

    public static ModifyDatasetResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDatasetResponse self = new ModifyDatasetResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDatasetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDatasetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDatasetResponse setBody(ModifyDatasetResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDatasetResponseBody getBody() {
        return this.body;
    }

}
