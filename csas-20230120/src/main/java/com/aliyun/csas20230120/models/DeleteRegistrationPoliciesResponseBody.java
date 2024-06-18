// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteRegistrationPoliciesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D6707286-A50E-57B1-B2CF-EFAC59E850D8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRegistrationPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRegistrationPoliciesResponseBody self = new DeleteRegistrationPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRegistrationPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
