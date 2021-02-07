// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetCredentialReportResponseBody extends TeaModel {
    @NameInMap("GeneratedTime")
    public String generatedTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Content")
    public String content;

    public static GetCredentialReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCredentialReportResponseBody self = new GetCredentialReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCredentialReportResponseBody setGeneratedTime(String generatedTime) {
        this.generatedTime = generatedTime;
        return this;
    }
    public String getGeneratedTime() {
        return this.generatedTime;
    }

    public GetCredentialReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCredentialReportResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
