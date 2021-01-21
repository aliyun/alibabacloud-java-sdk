// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class TriggerCapturePictureRequest extends TeaModel {
    @NameInMap("IotId")
    @Validation(required = true)
    public String iotId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static TriggerCapturePictureRequest build(java.util.Map<String, ?> map) throws Exception {
        TriggerCapturePictureRequest self = new TriggerCapturePictureRequest();
        return TeaModel.build(map, self);
    }

    public TriggerCapturePictureRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public TriggerCapturePictureRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
