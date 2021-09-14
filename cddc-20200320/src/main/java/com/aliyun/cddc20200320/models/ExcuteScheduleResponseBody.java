// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class ExcuteScheduleResponseBody extends TeaModel {
    @NameInMap("ScheduleId")
    public String scheduleId;

    @NameInMap("RequestId")
    public String requestId;

    public static ExcuteScheduleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExcuteScheduleResponseBody self = new ExcuteScheduleResponseBody();
        return TeaModel.build(map, self);
    }

    public ExcuteScheduleResponseBody setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
        return this;
    }
    public String getScheduleId() {
        return this.scheduleId;
    }

    public ExcuteScheduleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
