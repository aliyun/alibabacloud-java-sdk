// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class SetDeviceRecordLifeCycleRequest extends TeaModel {
    @NameInMap("IotId")
    @Validation(required = true)
    public String iotId;

    @NameInMap("Day")
    @Validation(required = true)
    public Integer day;

    public static SetDeviceRecordLifeCycleRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDeviceRecordLifeCycleRequest self = new SetDeviceRecordLifeCycleRequest();
        return TeaModel.build(map, self);
    }

    public SetDeviceRecordLifeCycleRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public SetDeviceRecordLifeCycleRequest setDay(Integer day) {
        this.day = day;
        return this;
    }
    public Integer getDay() {
        return this.day;
    }

}
