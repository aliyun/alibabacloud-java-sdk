// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class DeleteGroupAuthorizationRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>A175C091-3910-51AF-8D84-D5717B9B8D38</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteGroupAuthorizationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGroupAuthorizationRuleResponseBody self = new DeleteGroupAuthorizationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGroupAuthorizationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
