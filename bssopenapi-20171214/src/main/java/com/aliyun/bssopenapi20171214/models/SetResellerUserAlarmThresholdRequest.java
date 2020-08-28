// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SetResellerUserAlarmThresholdRequest extends TeaModel {
    @NameInMap("AlarmType")
    @Validation(required = true)
    public String alarmType;

    @NameInMap("AlarmThresholds")
    public String alarmThresholds;

    public static SetResellerUserAlarmThresholdRequest build(java.util.Map<String, ?> map) throws Exception {
        SetResellerUserAlarmThresholdRequest self = new SetResellerUserAlarmThresholdRequest();
        return TeaModel.build(map, self);
    }

}
