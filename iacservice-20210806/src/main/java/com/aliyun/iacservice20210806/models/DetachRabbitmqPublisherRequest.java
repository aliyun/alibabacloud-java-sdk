// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DetachRabbitmqPublisherRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>task-518855d9a058cf1127d082bec5</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static DetachRabbitmqPublisherRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachRabbitmqPublisherRequest self = new DetachRabbitmqPublisherRequest();
        return TeaModel.build(map, self);
    }

    public DetachRabbitmqPublisherRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
