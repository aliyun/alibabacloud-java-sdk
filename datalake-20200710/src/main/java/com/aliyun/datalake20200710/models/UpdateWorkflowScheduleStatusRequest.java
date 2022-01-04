// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdateWorkflowScheduleStatusRequest extends TeaModel {
    @NameInMap("BlueprintInstanceId")
    public String blueprintInstanceId;

    @NameInMap("UnderSchedule")
    public Boolean underSchedule;

    public static UpdateWorkflowScheduleStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkflowScheduleStatusRequest self = new UpdateWorkflowScheduleStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkflowScheduleStatusRequest setBlueprintInstanceId(String blueprintInstanceId) {
        this.blueprintInstanceId = blueprintInstanceId;
        return this;
    }
    public String getBlueprintInstanceId() {
        return this.blueprintInstanceId;
    }

    public UpdateWorkflowScheduleStatusRequest setUnderSchedule(Boolean underSchedule) {
        this.underSchedule = underSchedule;
        return this;
    }
    public Boolean getUnderSchedule() {
        return this.underSchedule;
    }

}
