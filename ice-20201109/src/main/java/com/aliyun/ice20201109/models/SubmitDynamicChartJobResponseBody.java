// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitDynamicChartJobResponseBody extends TeaModel {
    // 任务Id
    @NameInMap("JobId")
    public String jobId;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitDynamicChartJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitDynamicChartJobResponseBody self = new SubmitDynamicChartJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitDynamicChartJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitDynamicChartJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
