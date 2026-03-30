// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GenerateGovernanceReportResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>492E130C-76D3-55D5-BE5C-C023E431369A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The report generation status. Valid values:</p>
     * <ul>
     * <li>Started: The system starts to generate a governance report.</li>
     * <li>Progressing: The system is generating a governance report.</li>
     * <li>Completed: A governance report is generated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Started</p>
     */
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
