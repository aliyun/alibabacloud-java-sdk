// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DeleteLayer7CCRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLayer7CCRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLayer7CCRuleResponseBody self = new DeleteLayer7CCRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLayer7CCRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
