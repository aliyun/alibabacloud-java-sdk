// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetBizUnitInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBizUnitInfoResponseBody body;

    public static GetBizUnitInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBizUnitInfoResponse self = new GetBizUnitInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetBizUnitInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBizUnitInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBizUnitInfoResponse setBody(GetBizUnitInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBizUnitInfoResponseBody getBody() {
        return this.body;
    }

}
