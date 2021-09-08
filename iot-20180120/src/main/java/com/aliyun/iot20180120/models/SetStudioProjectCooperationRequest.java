// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SetStudioProjectCooperationRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    public static SetStudioProjectCooperationRequest build(java.util.Map<String, ?> map) throws Exception {
        SetStudioProjectCooperationRequest self = new SetStudioProjectCooperationRequest();
        return TeaModel.build(map, self);
    }

    public SetStudioProjectCooperationRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public SetStudioProjectCooperationRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
