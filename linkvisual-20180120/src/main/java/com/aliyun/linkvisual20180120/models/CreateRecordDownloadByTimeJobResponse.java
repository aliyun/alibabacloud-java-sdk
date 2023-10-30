// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateRecordDownloadByTimeJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRecordDownloadByTimeJobResponseBody body;

    public static CreateRecordDownloadByTimeJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRecordDownloadByTimeJobResponse self = new CreateRecordDownloadByTimeJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateRecordDownloadByTimeJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRecordDownloadByTimeJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRecordDownloadByTimeJobResponse setBody(CreateRecordDownloadByTimeJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRecordDownloadByTimeJobResponseBody getBody() {
        return this.body;
    }

}
