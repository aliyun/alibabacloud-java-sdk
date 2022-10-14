// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.autodriveclouddata20220830.models;

import com.aliyun.tea.*;

public class OpenapiSaveTaskStatusRequest extends TeaModel {
    @NameInMap("taskId")
    public Long taskId;

    public static OpenapiSaveTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenapiSaveTaskStatusRequest self = new OpenapiSaveTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public OpenapiSaveTaskStatusRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
