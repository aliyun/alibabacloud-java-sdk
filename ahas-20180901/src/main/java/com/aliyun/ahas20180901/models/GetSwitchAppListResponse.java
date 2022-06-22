// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetSwitchAppListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetSwitchAppListResponseBody body;

    public static GetSwitchAppListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSwitchAppListResponse self = new GetSwitchAppListResponse();
        return TeaModel.build(map, self);
    }

    public GetSwitchAppListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSwitchAppListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSwitchAppListResponse setBody(GetSwitchAppListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSwitchAppListResponseBody getBody() {
        return this.body;
    }

}
