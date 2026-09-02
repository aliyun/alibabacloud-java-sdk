// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetBatchChangeTableOwnerStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBatchChangeTableOwnerStatusResponseBody body;

    public static GetBatchChangeTableOwnerStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBatchChangeTableOwnerStatusResponse self = new GetBatchChangeTableOwnerStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetBatchChangeTableOwnerStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBatchChangeTableOwnerStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBatchChangeTableOwnerStatusResponse setBody(GetBatchChangeTableOwnerStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBatchChangeTableOwnerStatusResponseBody getBody() {
        return this.body;
    }

}
