// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListProblemTimeLinesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListProblemTimeLinesResponseBody body;

    public static ListProblemTimeLinesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProblemTimeLinesResponse self = new ListProblemTimeLinesResponse();
        return TeaModel.build(map, self);
    }

    public ListProblemTimeLinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProblemTimeLinesResponse setBody(ListProblemTimeLinesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProblemTimeLinesResponseBody getBody() {
        return this.body;
    }

}
