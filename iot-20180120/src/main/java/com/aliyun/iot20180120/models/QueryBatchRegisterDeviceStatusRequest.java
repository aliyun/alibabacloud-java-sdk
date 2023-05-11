// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryBatchRegisterDeviceStatusRequest extends TeaModel {
    /**
     * <p>The application ID. If the call of the [BatchRegisterDeviceWithApplyId](~~69514~~) or [BatchRegisterDevice](~~69473~~) operation is successful, the application ID is returned.</p>
     */
    @NameInMap("ApplyId")
    public Long applyId;

    /**
     * <p>The ID of the instance. You can view the ID of the instance on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <br>
     * <p>**Important**</p>
     * <br>
     * <p>*   If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</p>
     * <p>*   If no **Overview** page or ID is generated for your instance, you do not need configure this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ProductKey of the product to which the device belongs.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    public static QueryBatchRegisterDeviceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBatchRegisterDeviceStatusRequest self = new QueryBatchRegisterDeviceStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryBatchRegisterDeviceStatusRequest setApplyId(Long applyId) {
        this.applyId = applyId;
        return this;
    }
    public Long getApplyId() {
        return this.applyId;
    }

    public QueryBatchRegisterDeviceStatusRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryBatchRegisterDeviceStatusRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
