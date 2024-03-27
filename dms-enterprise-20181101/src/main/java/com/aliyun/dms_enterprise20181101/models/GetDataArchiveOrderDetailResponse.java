// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataArchiveOrderDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataArchiveOrderDetailResponseBody body;

    public static GetDataArchiveOrderDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataArchiveOrderDetailResponse self = new GetDataArchiveOrderDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetDataArchiveOrderDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataArchiveOrderDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataArchiveOrderDetailResponse setBody(GetDataArchiveOrderDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataArchiveOrderDetailResponseBody getBody() {
        return this.body;
    }

}
