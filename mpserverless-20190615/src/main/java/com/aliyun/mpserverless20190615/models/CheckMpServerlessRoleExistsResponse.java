// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class CheckMpServerlessRoleExistsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CheckMpServerlessRoleExistsResponse setBody(CheckMpServerlessRoleExistsResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckMpServerlessRoleExistsResponseBody getBody() {
        return this.body;
    }

}
