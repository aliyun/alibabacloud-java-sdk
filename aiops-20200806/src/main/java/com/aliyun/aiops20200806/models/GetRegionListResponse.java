// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetRegionListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRegionListResponseBody body;

    public static GetRegionListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRegionListResponse self = new GetRegionListResponse();
        return TeaModel.build(map, self);
    }

    public GetRegionListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRegionListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRegionListResponse setBody(GetRegionListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRegionListResponseBody getBody() {
        return this.body;
    }

}
