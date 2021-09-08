// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetDeviceBindStatusRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("IotIds")
    public java.util.List<String> iotIds;

    public static BatchGetDeviceBindStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetDeviceBindStatusRequest self = new BatchGetDeviceBindStatusRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetDeviceBindStatusRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public BatchGetDeviceBindStatusRequest setIotIds(java.util.List<String> iotIds) {
        this.iotIds = iotIds;
        return this;
    }
    public java.util.List<String> getIotIds() {
        return this.iotIds;
    }

}
