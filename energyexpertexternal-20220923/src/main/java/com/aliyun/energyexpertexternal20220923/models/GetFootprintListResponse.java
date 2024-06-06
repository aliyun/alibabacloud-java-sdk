// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetFootprintListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFootprintListResponseBody body;

    public static GetFootprintListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFootprintListResponse self = new GetFootprintListResponse();
        return TeaModel.build(map, self);
    }

    public GetFootprintListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFootprintListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFootprintListResponse setBody(GetFootprintListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFootprintListResponseBody getBody() {
        return this.body;
    }

}
