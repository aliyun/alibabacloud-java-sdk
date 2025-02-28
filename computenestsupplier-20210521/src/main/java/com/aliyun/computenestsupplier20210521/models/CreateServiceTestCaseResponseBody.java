// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class CreateServiceTestCaseResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E50287CB-AABF-4877-92C0-289B339A1546</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The test case Id</p>
     * 
     * <strong>example:</strong>
     * <p>stc-5ba03a6a9a2746be8739</p>
     */
    @NameInMap("TestCaseId")
    public String testCaseId;

    public static CreateServiceTestCaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceTestCaseResponseBody self = new CreateServiceTestCaseResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServiceTestCaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateServiceTestCaseResponseBody setTestCaseId(String testCaseId) {
        this.testCaseId = testCaseId;
        return this;
    }
    public String getTestCaseId() {
        return this.testCaseId;
    }

}
