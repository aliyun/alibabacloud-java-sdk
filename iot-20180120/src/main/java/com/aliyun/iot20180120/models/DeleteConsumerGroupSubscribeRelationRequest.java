// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteConsumerGroupSubscribeRelationRequest extends TeaModel {
    /**
     * <p>The ID of the consumer group. You can call the <a href="https://help.aliyun.com/document_detail/170352.html">QuerySubscribeRelation</a> operation to query the consumer group ID in an AMQP subscription. You can also go to the IoT Platform console,and choose <strong>Rules</strong> &gt; <strong>Server-side Subscription</strong> to view the consumer group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nJRaJPn5U1JITGfjBO9l00****</p>
     */
    @NameInMap("ConsumerGroupId")
    public String consumerGroupId;

    /**
     * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
     * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
     * </ul>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-cn-0pp1n8t****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The <strong>ProductKey</strong> of the product that is specified for the subscription.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1fyXVF****</p>
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
