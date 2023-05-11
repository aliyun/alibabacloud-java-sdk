// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceSubTopicRequest extends TeaModel {
    /**
     * <p>The name of the device.</p>
     * <br>
     * <p>You can use the IoT Platform console or call the [QueryDeviceInfo](~~257184~~) operation to view the information about the device.</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The ID of the instance. You can view the ID of an instance on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>>*   If your instance has an ID, you must specify the ID for this parameter. If you do not specify the instance ID, the call fails.</p>
     * <p>>*   If the **Overview** page or instance ID is not displayed in the IoT Platform console, you do not need to configure this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ProductKey of the product to which the device belongs.</p>
     * <br>
     * <p>You can use the IoT Platform console or call the [QueryProductList](~~69271~~) operation to view the information about all products within the current Alibaba Cloud account.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    public static QueryDeviceSubTopicRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceSubTopicRequest self = new QueryDeviceSubTopicRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceSubTopicRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryDeviceSubTopicRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryDeviceSubTopicRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
