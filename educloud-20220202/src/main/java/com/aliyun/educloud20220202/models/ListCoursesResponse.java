// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.educloud20220202.models;

import com.aliyun.tea.*;

public class ListCoursesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCoursesResponseBody body;

    public static ListCoursesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCoursesResponse self = new ListCoursesResponse();
        return TeaModel.build(map, self);
    }

    public ListCoursesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCoursesResponse setBody(ListCoursesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCoursesResponseBody getBody() {
        return this.body;
    }

}
