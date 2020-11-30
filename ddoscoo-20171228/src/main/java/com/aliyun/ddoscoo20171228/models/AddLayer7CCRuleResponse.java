// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class AddLayer7CCRuleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AddLayer7CCRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLayer7CCRuleResponse self = new AddLayer7CCRuleResponse();
        return TeaModel.build(map, self);
    }

    public AddLayer7CCRuleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
