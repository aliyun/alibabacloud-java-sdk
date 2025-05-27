// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduembed20240101.models;

import com.aliyun.tea.*;

public class DescribeCourseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCourseResponseBody body;

    public static DescribeCourseResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCourseResponse self = new DescribeCourseResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCourseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCourseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCourseResponse setBody(DescribeCourseResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCourseResponseBody getBody() {
        return this.body;
    }

}
