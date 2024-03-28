// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class CheckMpServerlessRoleExistsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckMpServerlessRoleExistsResponseBody body;

    public static CheckMpServerlessRoleExistsResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckMpServerlessRoleExistsResponse self = new CheckMpServerlessRoleExistsResponse();
        return TeaModel.build(map, self);
    }

    public CheckMpServerlessRoleExistsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckMpServerlessRoleExistsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckMpServerlessRoleExistsResponse setBody(CheckMpServerlessRoleExistsResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckMpServerlessRoleExistsResponseBody getBody() {
        return this.body;
    }

}
