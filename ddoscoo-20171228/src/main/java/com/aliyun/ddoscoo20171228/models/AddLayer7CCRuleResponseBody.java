// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class AddLayer7CCRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddLayer7CCRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLayer7CCRuleResponseBody self = new AddLayer7CCRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLayer7CCRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
