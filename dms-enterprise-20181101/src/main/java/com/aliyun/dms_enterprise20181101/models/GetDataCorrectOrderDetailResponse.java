// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataCorrectOrderDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataCorrectOrderDetailResponseBody body;

    public static GetDataCorrectOrderDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataCorrectOrderDetailResponse self = new GetDataCorrectOrderDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetDataCorrectOrderDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataCorrectOrderDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataCorrectOrderDetailResponse setBody(GetDataCorrectOrderDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataCorrectOrderDetailResponseBody getBody() {
        return this.body;
    }

}
