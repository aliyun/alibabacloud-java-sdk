// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class GetAuditItemDetailRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("Type")
    public String type;

    public static GetAuditItemDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAuditItemDetailRequest self = new GetAuditItemDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetAuditItemDetailRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetAuditItemDetailRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
