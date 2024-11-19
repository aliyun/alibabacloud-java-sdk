// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class ModifyLindormV2WhiteIpListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyLindormV2WhiteIpListResponseBody body;

    public static ModifyLindormV2WhiteIpListResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLindormV2WhiteIpListResponse self = new ModifyLindormV2WhiteIpListResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLindormV2WhiteIpListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLindormV2WhiteIpListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyLindormV2WhiteIpListResponse setBody(ModifyLindormV2WhiteIpListResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLindormV2WhiteIpListResponseBody getBody() {
        return this.body;
    }

}
