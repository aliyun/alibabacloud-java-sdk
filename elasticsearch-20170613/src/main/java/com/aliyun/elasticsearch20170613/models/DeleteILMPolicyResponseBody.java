// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeleteILMPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>694FDC20-0FDD-47C4-B921-BFF902FA****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static DeleteILMPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteILMPolicyResponseBody self = new DeleteILMPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteILMPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteILMPolicyResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
