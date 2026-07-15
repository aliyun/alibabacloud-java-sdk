// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class BatchRemoveConsumerGroupConsumersRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[&quot;cs-8c13d2b4f8a1&quot;]</p>
     */
    @NameInMap("consumerIds")
    public java.util.List<String> consumerIds;

    public static BatchRemoveConsumerGroupConsumersRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchRemoveConsumerGroupConsumersRequest self = new BatchRemoveConsumerGroupConsumersRequest();
        return TeaModel.build(map, self);
    }

    public BatchRemoveConsumerGroupConsumersRequest setConsumerIds(java.util.List<String> consumerIds) {
        this.consumerIds = consumerIds;
        return this;
    }
    public java.util.List<String> getConsumerIds() {
        return this.consumerIds;
    }

}
