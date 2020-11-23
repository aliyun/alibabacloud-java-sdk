// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetCredentialReportResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Content")
    @Validation(required = true)
    public String content;

    @NameInMap("GeneratedTime")
    @Validation(required = true)
    public String generatedTime;

    public static GetCredentialReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCredentialReportResponse self = new GetCredentialReportResponse();
        return TeaModel.build(map, self);
    }

    public GetCredentialReportResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCredentialReportResponse setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public GetCredentialReportResponse setGeneratedTime(String generatedTime) {
        this.generatedTime = generatedTime;
        return this;
    }
    public String getGeneratedTime() {
        return this.generatedTime;
    }

}
