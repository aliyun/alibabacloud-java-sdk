// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class StopServerlessJobsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StopServerlessJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopServerlessJobsResponseBody self = new StopServerlessJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public StopServerlessJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
