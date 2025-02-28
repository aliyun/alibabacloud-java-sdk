// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpdateServiceTestCaseResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DB1FA13E-1087-5654-84D5-58A0ACAD1B18</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateServiceTestCaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceTestCaseResponseBody self = new UpdateServiceTestCaseResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateServiceTestCaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
