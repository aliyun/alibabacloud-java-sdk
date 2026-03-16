// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class DeleteScheduleRequest extends TeaModel {
    /**
     * <p>The name of the workflow with which the scheduling task that you want to delete is associated.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testFlowName</p>
     */
    @NameInMap("FlowName")
    public String flowName;

    /**
     * <p>The name of the scheduling task that you want to delete.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testScheduleName</p>
     */
    @NameInMap("ScheduleName")
    public String scheduleName;

    public static DeleteScheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteScheduleRequest self = new DeleteScheduleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteScheduleRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public DeleteScheduleRequest setScheduleName(String scheduleName) {
        this.scheduleName = scheduleName;
        return this;
    }
    public String getScheduleName() {
        return this.scheduleName;
    }

}
