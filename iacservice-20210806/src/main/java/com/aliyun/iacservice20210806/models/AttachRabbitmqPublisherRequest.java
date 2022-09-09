// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class AttachRabbitmqPublisherRequest extends TeaModel {
    @NameInMap("taskId")
    public String taskId;

    public static AttachRabbitmqPublisherRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachRabbitmqPublisherRequest self = new AttachRabbitmqPublisherRequest();
        return TeaModel.build(map, self);
    }

    public AttachRabbitmqPublisherRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
