// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableResourceServerCustomSubjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableResourceServerCustomSubjectResponseBody body;

    public static EnableResourceServerCustomSubjectResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableResourceServerCustomSubjectResponse self = new EnableResourceServerCustomSubjectResponse();
        return TeaModel.build(map, self);
    }

    public EnableResourceServerCustomSubjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableResourceServerCustomSubjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableResourceServerCustomSubjectResponse setBody(EnableResourceServerCustomSubjectResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableResourceServerCustomSubjectResponseBody getBody() {
        return this.body;
    }

}
