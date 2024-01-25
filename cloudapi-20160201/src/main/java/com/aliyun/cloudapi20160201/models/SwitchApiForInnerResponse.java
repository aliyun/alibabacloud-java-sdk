// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class SwitchApiForInnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SwitchApiForInnerResponseBody body;

    public static SwitchApiForInnerResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchApiForInnerResponse self = new SwitchApiForInnerResponse();
        return TeaModel.build(map, self);
    }

    public SwitchApiForInnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchApiForInnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwitchApiForInnerResponse setBody(SwitchApiForInnerResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchApiForInnerResponseBody getBody() {
        return this.body;
    }

}
