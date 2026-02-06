// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateCustomResponseCodeRuleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C7518056-E30F-55F8-97DD-004D8030703B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateCustomResponseCodeRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomResponseCodeRuleResponseBody self = new UpdateCustomResponseCodeRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCustomResponseCodeRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
