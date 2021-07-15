// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateRulesAttributeResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 异步任务Id
    @NameInMap("JobId")
    public String jobId;

    public static UpdateRulesAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRulesAttributeResponseBody self = new UpdateRulesAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRulesAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateRulesAttributeResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
