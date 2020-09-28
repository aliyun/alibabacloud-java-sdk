// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class ListPidDataProcessRequest extends TeaModel {
    @NameInMap("PidLoopId")
    @Validation(required = true)
    public String pidLoopId;

    @NameInMap("OnlyCompleteStatus")
    @Validation(required = true)
    public Boolean onlyCompleteStatus;

    @NameInMap("PidDataProcessType")
    @Validation(required = true)
    public String pidDataProcessType;

    public static ListPidDataProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPidDataProcessRequest self = new ListPidDataProcessRequest();
        return TeaModel.build(map, self);
    }

    public ListPidDataProcessRequest setPidLoopId(String pidLoopId) {
        this.pidLoopId = pidLoopId;
        return this;
    }
    public String getPidLoopId() {
        return this.pidLoopId;
    }

    public ListPidDataProcessRequest setOnlyCompleteStatus(Boolean onlyCompleteStatus) {
        this.onlyCompleteStatus = onlyCompleteStatus;
        return this;
    }
    public Boolean getOnlyCompleteStatus() {
        return this.onlyCompleteStatus;
    }

    public ListPidDataProcessRequest setPidDataProcessType(String pidDataProcessType) {
        this.pidDataProcessType = pidDataProcessType;
        return this;
    }
    public String getPidDataProcessType() {
        return this.pidDataProcessType;
    }

}
