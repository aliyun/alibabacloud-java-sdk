// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcJusticeDishonestyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcJusticeDishonestyResponseBody body;

    public static GetOcJusticeDishonestyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcJusticeDishonestyResponse self = new GetOcJusticeDishonestyResponse();
        return TeaModel.build(map, self);
    }

    public GetOcJusticeDishonestyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcJusticeDishonestyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcJusticeDishonestyResponse setBody(GetOcJusticeDishonestyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcJusticeDishonestyResponseBody getBody() {
        return this.body;
    }

}
