// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class GetEnterpriseDataByDataIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetEnterpriseDataByDataIdResponseBody body;

    public static GetEnterpriseDataByDataIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEnterpriseDataByDataIdResponse self = new GetEnterpriseDataByDataIdResponse();
        return TeaModel.build(map, self);
    }

    public GetEnterpriseDataByDataIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEnterpriseDataByDataIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEnterpriseDataByDataIdResponse setBody(GetEnterpriseDataByDataIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEnterpriseDataByDataIdResponseBody getBody() {
        return this.body;
    }

}
