// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DeleteReportEmailConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteReportEmailConfigResponseBody body;

    public static DeleteReportEmailConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteReportEmailConfigResponse self = new DeleteReportEmailConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteReportEmailConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteReportEmailConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteReportEmailConfigResponse setBody(DeleteReportEmailConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteReportEmailConfigResponseBody getBody() {
        return this.body;
    }

}
