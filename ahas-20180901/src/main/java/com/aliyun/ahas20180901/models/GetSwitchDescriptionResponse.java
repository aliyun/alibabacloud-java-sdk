// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetSwitchDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetSwitchDescriptionResponseBody body;

    public static GetSwitchDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSwitchDescriptionResponse self = new GetSwitchDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public GetSwitchDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSwitchDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSwitchDescriptionResponse setBody(GetSwitchDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSwitchDescriptionResponseBody getBody() {
        return this.body;
    }

}
