// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class UploadMcubeMiniPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadMcubeMiniPackageResponseBody body;

    public static UploadMcubeMiniPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadMcubeMiniPackageResponse self = new UploadMcubeMiniPackageResponse();
        return TeaModel.build(map, self);
    }

    public UploadMcubeMiniPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadMcubeMiniPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadMcubeMiniPackageResponse setBody(UploadMcubeMiniPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadMcubeMiniPackageResponseBody getBody() {
        return this.body;
    }

}
