// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SetAutomaticFrequencyControlConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetAutomaticFrequencyControlConfigResponseBody body;

    public static SetAutomaticFrequencyControlConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAutomaticFrequencyControlConfigResponse self = new SetAutomaticFrequencyControlConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetAutomaticFrequencyControlConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAutomaticFrequencyControlConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetAutomaticFrequencyControlConfigResponse setBody(SetAutomaticFrequencyControlConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAutomaticFrequencyControlConfigResponseBody getBody() {
        return this.body;
    }

}
