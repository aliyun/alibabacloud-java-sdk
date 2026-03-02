// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GenerateGovernanceReportResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("State")
    public String state;

    public static GenerateGovernanceReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateGovernanceReportResponseBody self = new GenerateGovernanceReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateGovernanceReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateGovernanceReportResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
