// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20230701.models;

import com.aliyun.tea.*;

public class ListJobExecutorsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListJobExecutorsResponseBody body;

    public static ListJobExecutorsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListJobExecutorsResponse self = new ListJobExecutorsResponse();
        return TeaModel.build(map, self);
    }

    public ListJobExecutorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListJobExecutorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListJobExecutorsResponse setBody(ListJobExecutorsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListJobExecutorsResponseBody getBody() {
        return this.body;
    }

}
