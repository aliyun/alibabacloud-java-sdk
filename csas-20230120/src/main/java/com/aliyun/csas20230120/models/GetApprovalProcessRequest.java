// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetApprovalProcessRequest extends TeaModel {
    /**
     * <p>The ID of the approval process. You can obtain the value by calling the following operation:</p>
     * <ul>
     * <li><a href="~~ListApprovalProcesses~~">ListApprovalProcesses</a>: Queries a list of approval processes.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>approval-process-fcc351b8a95b****</p>
     */
    @NameInMap("ProcessId")
    public String processId;

    public static GetApprovalProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApprovalProcessRequest self = new GetApprovalProcessRequest();
        return TeaModel.build(map, self);
    }

    public GetApprovalProcessRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

}
