// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class GetQueueAttributesRequest extends TeaModel {
    @NameInMap("QueueName")
    public String queueName;

    public static GetQueueAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQueueAttributesRequest self = new GetQueueAttributesRequest();
        return TeaModel.build(map, self);
    }

    public GetQueueAttributesRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

}
