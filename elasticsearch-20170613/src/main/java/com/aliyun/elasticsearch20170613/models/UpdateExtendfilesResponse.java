// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateExtendfilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateExtendfilesResponseBody body;

    public static UpdateExtendfilesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateExtendfilesResponse self = new UpdateExtendfilesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateExtendfilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateExtendfilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateExtendfilesResponse setBody(UpdateExtendfilesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateExtendfilesResponseBody getBody() {
        return this.body;
    }

}
