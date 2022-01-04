// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class StopCrawlerWorkflowResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static StopCrawlerWorkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopCrawlerWorkflowResponseBody self = new StopCrawlerWorkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public StopCrawlerWorkflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopCrawlerWorkflowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
