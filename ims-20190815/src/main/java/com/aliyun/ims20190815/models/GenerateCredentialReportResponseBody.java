// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GenerateCredentialReportResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BBCCA90A-A1F0-4B16-B355-692247197805</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The generation status of the user credential report. Valid values:</p>
     * <ul>
     * <li>STARTED: The system starts to generate the user credential report.</li>
     * <li>INPROGRESS: The user credential report is being generated.</li>
     * <li>COMPLETED: The user credential report is generated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>STARTED</p>
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
