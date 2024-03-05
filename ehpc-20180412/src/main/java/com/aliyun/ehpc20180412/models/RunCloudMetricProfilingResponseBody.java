// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class RunCloudMetricProfilingResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunCloudMetricProfilingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunCloudMetricProfilingResponseBody self = new RunCloudMetricProfilingResponseBody();
        return TeaModel.build(map, self);
    }

    public RunCloudMetricProfilingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
