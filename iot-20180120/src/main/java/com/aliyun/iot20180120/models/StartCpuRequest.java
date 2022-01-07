// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class StartCpuRequest extends TeaModel {
    @NameInMap("IotId")
    public String iotId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("TargetValue")
    public String targetValue;

    public static StartCpuRequest build(java.util.Map<String, ?> map) throws Exception {
        StartCpuRequest self = new StartCpuRequest();
        return TeaModel.build(map, self);
    }

    public StartCpuRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public StartCpuRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public StartCpuRequest setTargetValue(String targetValue) {
        this.targetValue = targetValue;
        return this;
    }
    public String getTargetValue() {
        return this.targetValue;
    }

}
