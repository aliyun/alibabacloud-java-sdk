// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SubmitDomainSpecialBizCredentialsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitDomainSpecialBizCredentialsResponseBody body;

    public static SubmitDomainSpecialBizCredentialsResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitDomainSpecialBizCredentialsResponse self = new SubmitDomainSpecialBizCredentialsResponse();
        return TeaModel.build(map, self);
    }

    public SubmitDomainSpecialBizCredentialsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitDomainSpecialBizCredentialsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitDomainSpecialBizCredentialsResponse setBody(SubmitDomainSpecialBizCredentialsResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitDomainSpecialBizCredentialsResponseBody getBody() {
        return this.body;
    }

}
