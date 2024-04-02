// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateKeywordLibResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateKeywordLibResponseBody body;

    public static UpdateKeywordLibResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateKeywordLibResponse self = new UpdateKeywordLibResponse();
        return TeaModel.build(map, self);
    }

    public UpdateKeywordLibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateKeywordLibResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateKeywordLibResponse setBody(UpdateKeywordLibResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateKeywordLibResponseBody getBody() {
        return this.body;
    }

}
