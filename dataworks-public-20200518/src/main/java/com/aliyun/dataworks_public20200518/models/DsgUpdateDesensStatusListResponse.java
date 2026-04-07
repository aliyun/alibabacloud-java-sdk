// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgUpdateDesensStatusListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DsgUpdateDesensStatusListResponseBody body;

    public static DsgUpdateDesensStatusListResponse build(java.util.Map<String, ?> map) throws Exception {
        DsgUpdateDesensStatusListResponse self = new DsgUpdateDesensStatusListResponse();
        return TeaModel.build(map, self);
    }

    public DsgUpdateDesensStatusListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DsgUpdateDesensStatusListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DsgUpdateDesensStatusListResponse setBody(DsgUpdateDesensStatusListResponseBody body) {
        this.body = body;
        return this;
    }
    public DsgUpdateDesensStatusListResponseBody getBody() {
        return this.body;
    }

}
