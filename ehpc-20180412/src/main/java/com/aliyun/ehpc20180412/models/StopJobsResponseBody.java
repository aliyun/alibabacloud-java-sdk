// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class StopJobsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StopJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopJobsResponseBody self = new StopJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public StopJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
