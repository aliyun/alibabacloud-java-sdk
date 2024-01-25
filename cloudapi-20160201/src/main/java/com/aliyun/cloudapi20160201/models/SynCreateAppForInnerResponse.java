// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class SynCreateAppForInnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SynCreateAppForInnerResponseBody body;

    public static SynCreateAppForInnerResponse build(java.util.Map<String, ?> map) throws Exception {
        SynCreateAppForInnerResponse self = new SynCreateAppForInnerResponse();
        return TeaModel.build(map, self);
    }

    public SynCreateAppForInnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SynCreateAppForInnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SynCreateAppForInnerResponse setBody(SynCreateAppForInnerResponseBody body) {
        this.body = body;
        return this;
    }
    public SynCreateAppForInnerResponseBody getBody() {
        return this.body;
    }

}
