// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetProjectSettingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetProjectSettingResponseBody body;

    public static GetProjectSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProjectSettingResponse self = new GetProjectSettingResponse();
        return TeaModel.build(map, self);
    }

    public GetProjectSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProjectSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProjectSettingResponse setBody(GetProjectSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProjectSettingResponseBody getBody() {
        return this.body;
    }

}
