// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetWorkflowStatusRequest extends TeaModel {
    @NameInMap("workflowType")
    public String workflowType;

    @NameInMap("xuid")
    public String xuid;

    public static GetWorkflowStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowStatusRequest self = new GetWorkflowStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkflowStatusRequest setWorkflowType(String workflowType) {
        this.workflowType = workflowType;
        return this;
    }
    public String getWorkflowType() {
        return this.workflowType;
    }

    public GetWorkflowStatusRequest setXuid(String xuid) {
        this.xuid = xuid;
        return this;
    }
    public String getXuid() {
        return this.xuid;
    }

}
