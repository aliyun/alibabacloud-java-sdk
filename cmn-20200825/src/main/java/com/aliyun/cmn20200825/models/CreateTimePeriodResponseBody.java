// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateTimePeriodResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 时间段ID
    @NameInMap("TimePeriodId")
    public String timePeriodId;

    public static CreateTimePeriodResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTimePeriodResponseBody self = new CreateTimePeriodResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTimePeriodResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTimePeriodResponseBody setTimePeriodId(String timePeriodId) {
        this.timePeriodId = timePeriodId;
        return this;
    }
    public String getTimePeriodId() {
        return this.timePeriodId;
    }

}
