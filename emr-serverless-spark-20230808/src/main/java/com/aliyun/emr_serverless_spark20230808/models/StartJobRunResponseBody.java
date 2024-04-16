// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class StartJobRunResponseBody extends TeaModel {
    @NameInMap("jobRunId")
    public String jobRunId;

    /**
     * <p>请求ID。</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static StartJobRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartJobRunResponseBody self = new StartJobRunResponseBody();
        return TeaModel.build(map, self);
    }

    public StartJobRunResponseBody setJobRunId(String jobRunId) {
        this.jobRunId = jobRunId;
        return this;
    }
    public String getJobRunId() {
        return this.jobRunId;
    }

    public StartJobRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
