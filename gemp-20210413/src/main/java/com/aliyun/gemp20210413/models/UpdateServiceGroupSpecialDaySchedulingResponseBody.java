// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateServiceGroupSpecialDaySchedulingResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static UpdateServiceGroupSpecialDaySchedulingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceGroupSpecialDaySchedulingResponseBody self = new UpdateServiceGroupSpecialDaySchedulingResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateServiceGroupSpecialDaySchedulingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
