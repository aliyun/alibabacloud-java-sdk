// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.educloud20220202.models;

import com.aliyun.tea.*;

public class DescribeCourseLessonResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
