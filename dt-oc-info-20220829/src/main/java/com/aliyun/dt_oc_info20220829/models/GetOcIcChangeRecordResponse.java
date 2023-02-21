// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIcChangeRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcIcChangeRecordResponseBody body;

    public static GetOcIcChangeRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcIcChangeRecordResponse self = new GetOcIcChangeRecordResponse();
        return TeaModel.build(map, self);
    }

    public GetOcIcChangeRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcIcChangeRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcIcChangeRecordResponse setBody(GetOcIcChangeRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcIcChangeRecordResponseBody getBody() {
        return this.body;
    }

}
