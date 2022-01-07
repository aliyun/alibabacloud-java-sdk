// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryBatchRegisterDeviceStatusRequest extends TeaModel {
    @NameInMap("ApplyId")
    public Long applyId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

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
