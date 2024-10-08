// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class ReportSessionStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0EE5DE20-25F4-5870-9D56-C259A45B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReportSessionStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReportSessionStatusResponseBody self = new ReportSessionStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ReportSessionStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
