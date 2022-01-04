// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class RunCrawlerWorkflowResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static RunCrawlerWorkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunCrawlerWorkflowResponseBody self = new RunCrawlerWorkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public RunCrawlerWorkflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunCrawlerWorkflowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
