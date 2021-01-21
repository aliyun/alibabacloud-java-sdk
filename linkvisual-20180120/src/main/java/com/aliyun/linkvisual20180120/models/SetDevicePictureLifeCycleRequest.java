// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class SetDevicePictureLifeCycleRequest extends TeaModel {
    @NameInMap("IotId")
    @Validation(required = true)
    public String iotId;

    @NameInMap("Day")
    @Validation(required = true)
    public Integer day;

    public static SetDevicePictureLifeCycleRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDevicePictureLifeCycleRequest self = new SetDevicePictureLifeCycleRequest();
        return TeaModel.build(map, self);
    }

    public SetDevicePictureLifeCycleRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public SetDevicePictureLifeCycleRequest setDay(Integer day) {
        this.day = day;
        return this;
    }
    public Integer getDay() {
        return this.day;
    }

}
