// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DeleteLayer7RuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLayer7RuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLayer7RuleResponseBody self = new DeleteLayer7RuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLayer7RuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
