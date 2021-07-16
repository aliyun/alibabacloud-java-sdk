// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateProblemNoticeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateProblemNoticeResponse setBody(UpdateProblemNoticeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProblemNoticeResponseBody getBody() {
        return this.body;
    }

}
