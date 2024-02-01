// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateLocalRecordDownloadByTimeJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLocalRecordDownloadByTimeJobResponseBody body;

    public static CreateLocalRecordDownloadByTimeJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLocalRecordDownloadByTimeJobResponse self = new CreateLocalRecordDownloadByTimeJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateLocalRecordDownloadByTimeJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLocalRecordDownloadByTimeJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLocalRecordDownloadByTimeJobResponse setBody(CreateLocalRecordDownloadByTimeJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLocalRecordDownloadByTimeJobResponseBody getBody() {
        return this.body;
    }

}
