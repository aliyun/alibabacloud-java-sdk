// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteSubscribeRelationRequest extends TeaModel {
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
     * <p>The ProductKey of the product that is specified for the subscription.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The type of the subscription. Valid values:</p>
     * <br>
     * <p>*   **MNS**</p>
     * <p>*   **AMQP**</p>
     */
    @NameInMap("Type")
    public String type;

    public static DeleteSubscribeRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSubscribeRelationRequest self = new DeleteSubscribeRelationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSubscribeRelationRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public DeleteSubscribeRelationRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public DeleteSubscribeRelationRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
