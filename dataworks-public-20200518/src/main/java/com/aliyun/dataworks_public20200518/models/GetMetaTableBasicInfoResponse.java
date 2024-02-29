// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableBasicInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMetaTableBasicInfoResponseBody body;

    public static GetMetaTableBasicInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableBasicInfoResponse self = new GetMetaTableBasicInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetMetaTableBasicInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMetaTableBasicInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMetaTableBasicInfoResponse setBody(GetMetaTableBasicInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMetaTableBasicInfoResponseBody getBody() {
        return this.body;
    }

}
