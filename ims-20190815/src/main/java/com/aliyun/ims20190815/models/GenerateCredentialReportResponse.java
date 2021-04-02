// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GenerateCredentialReportResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("State")
    @Validation(required = true)
    public String state;

    public static GenerateCredentialReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateCredentialReportResponse self = new GenerateCredentialReportResponse();
        return TeaModel.build(map, self);
    }

    public GenerateCredentialReportResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateCredentialReportResponse setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
