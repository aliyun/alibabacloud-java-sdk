// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetLindormFsUsedDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLindormFsUsedDetailResponseBody body;

    public static GetLindormFsUsedDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLindormFsUsedDetailResponse self = new GetLindormFsUsedDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetLindormFsUsedDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLindormFsUsedDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLindormFsUsedDetailResponse setBody(GetLindormFsUsedDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLindormFsUsedDetailResponseBody getBody() {
        return this.body;
    }

}
