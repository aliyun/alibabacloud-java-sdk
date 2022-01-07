// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchRegisterDeviceWithApplyIdRequest extends TeaModel {
    @NameInMap("ApplyId")
    public Long applyId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

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
