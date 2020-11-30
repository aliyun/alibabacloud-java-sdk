// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DeleteLayer7CCRuleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteLayer7CCRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLayer7CCRuleResponse self = new DeleteLayer7CCRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLayer7CCRuleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
