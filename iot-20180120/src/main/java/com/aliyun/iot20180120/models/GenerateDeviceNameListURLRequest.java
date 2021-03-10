// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GenerateDeviceNameListURLRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static GenerateDeviceNameListURLRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateDeviceNameListURLRequest self = new GenerateDeviceNameListURLRequest();
        return TeaModel.build(map, self);
    }

    public GenerateDeviceNameListURLRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
