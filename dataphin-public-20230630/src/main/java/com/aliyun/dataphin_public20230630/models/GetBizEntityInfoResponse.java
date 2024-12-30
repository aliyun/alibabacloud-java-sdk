// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetBizEntityInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBizEntityInfoResponseBody body;

    public static GetBizEntityInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBizEntityInfoResponse self = new GetBizEntityInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetBizEntityInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBizEntityInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBizEntityInfoResponse setBody(GetBizEntityInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBizEntityInfoResponseBody getBody() {
        return this.body;
    }

}
