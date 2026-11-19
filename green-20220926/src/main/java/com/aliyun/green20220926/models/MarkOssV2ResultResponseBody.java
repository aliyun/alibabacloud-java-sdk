// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class MarkOssV2ResultResponseBody extends TeaModel {
    /**
     * <p>The list of request IDs for failed operations.</p>
     */
    @NameInMap("FailureRequestIds")
    public java.util.List<String> failureRequestIds;

    /**
     * <p>The ID assigned by the backend to uniquely identify a request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of request IDs for successful operations.</p>
     */
    @NameInMap("SuccessRequestIds")
    public java.util.List<String> successRequestIds;

    public static MarkOssV2ResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MarkOssV2ResultResponseBody self = new MarkOssV2ResultResponseBody();
        return TeaModel.build(map, self);
    }

    public MarkOssV2ResultResponseBody setFailureRequestIds(java.util.List<String> failureRequestIds) {
        this.failureRequestIds = failureRequestIds;
        return this;
    }
    public java.util.List<String> getFailureRequestIds() {
        return this.failureRequestIds;
    }

    public MarkOssV2ResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MarkOssV2ResultResponseBody setSuccessRequestIds(java.util.List<String> successRequestIds) {
        this.successRequestIds = successRequestIds;
        return this;
    }
    public java.util.List<String> getSuccessRequestIds() {
        return this.successRequestIds;
    }

}
