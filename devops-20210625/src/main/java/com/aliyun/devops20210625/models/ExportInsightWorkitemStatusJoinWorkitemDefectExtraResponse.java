// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBody body;

    public static ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponse self = new ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponse();
        return TeaModel.build(map, self);
    }

    public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponse setBody(ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBody getBody() {
        return this.body;
    }

}
