// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateProblemNoticeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateProblemNoticeResponseBody body;

    public static UpdateProblemNoticeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProblemNoticeResponse self = new UpdateProblemNoticeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProblemNoticeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProblemNoticeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateProblemNoticeResponse setBody(UpdateProblemNoticeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProblemNoticeResponseBody getBody() {
        return this.body;
    }

}
