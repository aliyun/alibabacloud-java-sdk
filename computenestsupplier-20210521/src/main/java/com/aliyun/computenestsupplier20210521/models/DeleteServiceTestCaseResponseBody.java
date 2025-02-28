// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class DeleteServiceTestCaseResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4DB0F536-B3BE-4F0D-BD29-E83FB56D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteServiceTestCaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceTestCaseResponseBody self = new DeleteServiceTestCaseResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteServiceTestCaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
