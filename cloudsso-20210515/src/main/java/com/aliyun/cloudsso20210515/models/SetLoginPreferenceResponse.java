// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class SetLoginPreferenceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetLoginPreferenceResponseBody body;

    public static SetLoginPreferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLoginPreferenceResponse self = new SetLoginPreferenceResponse();
        return TeaModel.build(map, self);
    }

    public SetLoginPreferenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetLoginPreferenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetLoginPreferenceResponse setBody(SetLoginPreferenceResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLoginPreferenceResponseBody getBody() {
        return this.body;
    }

}
