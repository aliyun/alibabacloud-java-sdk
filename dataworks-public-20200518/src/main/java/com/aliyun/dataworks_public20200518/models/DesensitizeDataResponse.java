// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DesensitizeDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DesensitizeDataResponseBody body;

    public static DesensitizeDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DesensitizeDataResponse self = new DesensitizeDataResponse();
        return TeaModel.build(map, self);
    }

    public DesensitizeDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DesensitizeDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DesensitizeDataResponse setBody(DesensitizeDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DesensitizeDataResponseBody getBody() {
        return this.body;
    }

}
