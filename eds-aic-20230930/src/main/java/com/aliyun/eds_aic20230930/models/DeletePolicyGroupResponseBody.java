// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DeletePolicyGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>17C731AB-AAEE-5844-A352-D8D0352D3F0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePolicyGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyGroupResponseBody self = new DeletePolicyGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePolicyGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
