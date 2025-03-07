// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetSparkLocalClientInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSparkLocalClientInfoResponseBody body;

    public static GetSparkLocalClientInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSparkLocalClientInfoResponse self = new GetSparkLocalClientInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetSparkLocalClientInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSparkLocalClientInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSparkLocalClientInfoResponse setBody(GetSparkLocalClientInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSparkLocalClientInfoResponseBody getBody() {
        return this.body;
    }

}
