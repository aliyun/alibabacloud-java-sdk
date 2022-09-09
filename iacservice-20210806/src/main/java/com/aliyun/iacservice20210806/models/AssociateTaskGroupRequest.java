// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class AssociateTaskGroupRequest extends TeaModel {
    @NameInMap("taskIds")
    public java.util.List<String> taskIds;

    public static AssociateTaskGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateTaskGroupRequest self = new AssociateTaskGroupRequest();
        return TeaModel.build(map, self);
    }

    public AssociateTaskGroupRequest setTaskIds(java.util.List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

}
