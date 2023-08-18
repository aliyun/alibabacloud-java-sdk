// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class DeleteQueueRequest extends TeaModel {
    @NameInMap("queueName")
    public String queueName;

    public static DeleteQueueRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteQueueRequest self = new DeleteQueueRequest();
        return TeaModel.build(map, self);
    }

    public DeleteQueueRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

}
