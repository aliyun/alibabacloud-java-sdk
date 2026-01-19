// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableResourceServerCustomSubjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableResourceServerCustomSubjectResponseBody body;

    public static DisableResourceServerCustomSubjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableResourceServerCustomSubjectResponse self = new DisableResourceServerCustomSubjectResponse();
        return TeaModel.build(map, self);
    }

    public DisableResourceServerCustomSubjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableResourceServerCustomSubjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableResourceServerCustomSubjectResponse setBody(DisableResourceServerCustomSubjectResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableResourceServerCustomSubjectResponseBody getBody() {
        return this.body;
    }

}
