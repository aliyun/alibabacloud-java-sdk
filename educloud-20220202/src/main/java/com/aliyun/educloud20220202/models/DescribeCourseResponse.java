// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.educloud20220202.models;

import com.aliyun.tea.*;

public class DescribeCourseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeCourseResponse setBody(DescribeCourseResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCourseResponseBody getBody() {
        return this.body;
    }

}
