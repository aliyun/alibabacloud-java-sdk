// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class UpdateLindormV2WhiteIpListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLindormV2WhiteIpListResponseBody body;

    public static UpdateLindormV2WhiteIpListResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLindormV2WhiteIpListResponse self = new UpdateLindormV2WhiteIpListResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLindormV2WhiteIpListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLindormV2WhiteIpListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLindormV2WhiteIpListResponse setBody(UpdateLindormV2WhiteIpListResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLindormV2WhiteIpListResponseBody getBody() {
        return this.body;
    }

}
