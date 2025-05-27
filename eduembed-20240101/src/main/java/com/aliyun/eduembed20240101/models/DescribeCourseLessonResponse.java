// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduembed20240101.models;

import com.aliyun.tea.*;

public class DescribeCourseLessonResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCourseLessonResponseBody body;

    public static DescribeCourseLessonResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCourseLessonResponse self = new DescribeCourseLessonResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCourseLessonResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCourseLessonResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCourseLessonResponse setBody(DescribeCourseLessonResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCourseLessonResponseBody getBody() {
        return this.body;
    }

}
