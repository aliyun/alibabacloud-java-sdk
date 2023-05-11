// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchRegisterDeviceRequest extends TeaModel {
    /**
     * <p>The number of devices to be registered.</p>
     * <br>
     * <p>>  You can register up to 10,000 devices in a single call.</p>
     */
    @NameInMap("Count")
    public Integer count;

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
     * <p>The ProductKey of the product to which the devices belong.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    public static BatchRegisterDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchRegisterDeviceRequest self = new BatchRegisterDeviceRequest();
        return TeaModel.build(map, self);
    }

    public BatchRegisterDeviceRequest setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public BatchRegisterDeviceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public BatchRegisterDeviceRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
