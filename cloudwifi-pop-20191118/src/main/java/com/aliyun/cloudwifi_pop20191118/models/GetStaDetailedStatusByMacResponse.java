// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetStaDetailedStatusByMacResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetStaDetailedStatusByMacResponseBody body;

    public static GetStaDetailedStatusByMacResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStaDetailedStatusByMacResponse self = new GetStaDetailedStatusByMacResponse();
        return TeaModel.build(map, self);
    }

    public GetStaDetailedStatusByMacResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStaDetailedStatusByMacResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStaDetailedStatusByMacResponse setBody(GetStaDetailedStatusByMacResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStaDetailedStatusByMacResponseBody getBody() {
        return this.body;
    }

}
