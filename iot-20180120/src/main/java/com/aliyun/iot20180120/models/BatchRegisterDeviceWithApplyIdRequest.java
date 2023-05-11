// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchRegisterDeviceWithApplyIdRequest extends TeaModel {
    /**
     * <p>The ID of the application. The application ID is returned by the [BatchCheckDeviceNames](~~69482~~) operation.</p>
     */
    @NameInMap("ApplyId")
    public Long applyId;

    /**
     * <p>The ID of the instance. You can view the **ID** of the instance on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>>*   If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</p>
     * <p>>*   If no **Overview** page or ID is generated for your instance, you do not need to configure this parameter.</p>
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

    public static BatchRegisterDeviceWithApplyIdRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchRegisterDeviceWithApplyIdRequest self = new BatchRegisterDeviceWithApplyIdRequest();
        return TeaModel.build(map, self);
    }

    public BatchRegisterDeviceWithApplyIdRequest setApplyId(Long applyId) {
        this.applyId = applyId;
        return this;
    }
    public Long getApplyId() {
        return this.applyId;
    }

    public BatchRegisterDeviceWithApplyIdRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public BatchRegisterDeviceWithApplyIdRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
