// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDataServiceApiErrorImpactResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataServiceApiErrorImpactResponseBody body;

    public static GetDataServiceApiErrorImpactResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceApiErrorImpactResponse self = new GetDataServiceApiErrorImpactResponse();
        return TeaModel.build(map, self);
    }

    public GetDataServiceApiErrorImpactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataServiceApiErrorImpactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataServiceApiErrorImpactResponse setBody(GetDataServiceApiErrorImpactResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataServiceApiErrorImpactResponseBody getBody() {
        return this.body;
    }

}
