// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DissociateTaskGroupRequest extends TeaModel {
    @NameInMap("taskIds")
    public java.util.List<String> taskIds;

    public static DissociateTaskGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DissociateTaskGroupRequest self = new DissociateTaskGroupRequest();
        return TeaModel.build(map, self);
    }

    public DissociateTaskGroupRequest setTaskIds(java.util.List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

}
