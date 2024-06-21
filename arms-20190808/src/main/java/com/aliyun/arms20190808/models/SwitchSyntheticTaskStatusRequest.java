// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SwitchSyntheticTaskStatusRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SwitchStatus")
    public Long switchStatus;

    @NameInMap("TaskIds")
    public java.util.List<Long> taskIds;

    public static SwitchSyntheticTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchSyntheticTaskStatusRequest self = new SwitchSyntheticTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public SwitchSyntheticTaskStatusRequest setSwitchStatus(Long switchStatus) {
        this.switchStatus = switchStatus;
        return this;
    }
    public Long getSwitchStatus() {
        return this.switchStatus;
    }

    public SwitchSyntheticTaskStatusRequest setTaskIds(java.util.List<Long> taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public java.util.List<Long> getTaskIds() {
        return this.taskIds;
    }

}
