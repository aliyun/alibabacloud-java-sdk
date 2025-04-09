// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ChangeCloudPhoneNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChangeCloudPhoneNodeResponseBody body;

    public static ChangeCloudPhoneNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeCloudPhoneNodeResponse self = new ChangeCloudPhoneNodeResponse();
        return TeaModel.build(map, self);
    }

    public ChangeCloudPhoneNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeCloudPhoneNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeCloudPhoneNodeResponse setBody(ChangeCloudPhoneNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeCloudPhoneNodeResponseBody getBody() {
        return this.body;
    }

}
