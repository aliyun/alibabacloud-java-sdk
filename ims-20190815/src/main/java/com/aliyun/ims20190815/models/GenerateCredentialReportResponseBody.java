// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GenerateCredentialReportResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The generation status of the user credential report. Valid values:</p>
     * <br>
     * <p>*   STARTED: The user credential report starts to generate.</p>
     * <p>*   INPROGRESS: The user credential report is being generated.</p>
     * <p>*   COMPLETED: The user credential report is generated.</p>
     */
    @NameInMap("State")
    public String state;

    public static GenerateCredentialReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateCredentialReportResponseBody self = new GenerateCredentialReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateCredentialReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateCredentialReportResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
