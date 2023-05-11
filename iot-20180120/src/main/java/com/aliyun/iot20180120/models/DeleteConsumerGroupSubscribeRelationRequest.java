// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteConsumerGroupSubscribeRelationRequest extends TeaModel {
    /**
     * <p>The ID of the consumer group. You can call the [QuerySubscribeRelation](~~170352~~) operation to query the consumer group ID in an AMQP subscription. You can also go to the IoT Platform console,and choose **Rules** > **Server-side Subscription** to view the consumer group ID.</p>
     */
    @NameInMap("ConsumerGroupId")
    public String consumerGroupId;

    /**
     * <p>The ID of the instance. You can view the instance **ID** on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>>*   If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</p>
     * <p>>*   If your instance has no **Overview** page or ID, you do not need to set this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The **ProductKey** of the product that is specified for the subscription.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    public static DeleteConsumerGroupSubscribeRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteConsumerGroupSubscribeRelationRequest self = new DeleteConsumerGroupSubscribeRelationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteConsumerGroupSubscribeRelationRequest setConsumerGroupId(String consumerGroupId) {
        this.consumerGroupId = consumerGroupId;
        return this;
    }
    public String getConsumerGroupId() {
        return this.consumerGroupId;
    }

    public DeleteConsumerGroupSubscribeRelationRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public DeleteConsumerGroupSubscribeRelationRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
