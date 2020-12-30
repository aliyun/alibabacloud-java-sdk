// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class CreateLayer7RuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateLayer7RuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLayer7RuleResponseBody self = new CreateLayer7RuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLayer7RuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
