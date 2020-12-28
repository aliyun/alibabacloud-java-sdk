// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class RerunJobsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RerunJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RerunJobsResponseBody self = new RerunJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public RerunJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
