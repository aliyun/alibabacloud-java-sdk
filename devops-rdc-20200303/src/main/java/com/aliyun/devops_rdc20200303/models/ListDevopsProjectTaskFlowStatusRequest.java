// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ListDevopsProjectTaskFlowStatusRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("TaskFlowId")
    public String taskFlowId;

    public static ListDevopsProjectTaskFlowStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDevopsProjectTaskFlowStatusRequest self = new ListDevopsProjectTaskFlowStatusRequest();
        return TeaModel.build(map, self);
    }

    public ListDevopsProjectTaskFlowStatusRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public ListDevopsProjectTaskFlowStatusRequest setTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
        return this;
    }
    public String getTaskFlowId() {
        return this.taskFlowId;
    }

}
