// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class CancelJobRunResponseBody extends TeaModel {
    @NameInMap("jobRunId")
    public String jobRunId;

    /**
     * <p>请求ID。</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CancelJobRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelJobRunResponseBody self = new CancelJobRunResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelJobRunResponseBody setJobRunId(String jobRunId) {
        this.jobRunId = jobRunId;
        return this;
    }
    public String getJobRunId() {
        return this.jobRunId;
    }

    public CancelJobRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
