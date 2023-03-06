// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ResumeElasticsearchTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return results:</p>
     * <br>
     * <p>*   true: resume the interrupted change successfully</p>
     * <p>*   false: resume the interrupted change successfully failed</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static ResumeElasticsearchTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResumeElasticsearchTaskResponseBody self = new ResumeElasticsearchTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ResumeElasticsearchTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResumeElasticsearchTaskResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
