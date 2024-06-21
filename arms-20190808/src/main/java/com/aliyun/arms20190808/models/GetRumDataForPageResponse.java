// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRumDataForPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRumDataForPageResponseBody body;

    public static GetRumDataForPageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRumDataForPageResponse self = new GetRumDataForPageResponse();
        return TeaModel.build(map, self);
    }

    public GetRumDataForPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRumDataForPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRumDataForPageResponse setBody(GetRumDataForPageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRumDataForPageResponseBody getBody() {
        return this.body;
    }

}
