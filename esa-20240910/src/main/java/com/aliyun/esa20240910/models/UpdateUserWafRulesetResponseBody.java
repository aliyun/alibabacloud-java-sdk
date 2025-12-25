// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateUserWafRulesetResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateUserWafRulesetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserWafRulesetResponseBody self = new UpdateUserWafRulesetResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateUserWafRulesetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
