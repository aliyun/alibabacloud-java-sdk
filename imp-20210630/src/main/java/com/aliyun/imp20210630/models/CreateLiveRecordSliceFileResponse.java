// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CreateLiveRecordSliceFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLiveRecordSliceFileResponseBody body;

    public static CreateLiveRecordSliceFileResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveRecordSliceFileResponse self = new CreateLiveRecordSliceFileResponse();
        return TeaModel.build(map, self);
    }

    public CreateLiveRecordSliceFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLiveRecordSliceFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLiveRecordSliceFileResponse setBody(CreateLiveRecordSliceFileResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLiveRecordSliceFileResponseBody getBody() {
        return this.body;
    }

}
