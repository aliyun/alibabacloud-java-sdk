// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class CreateJobFileResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateJobFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateJobFileResponseBody self = new CreateJobFileResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateJobFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
