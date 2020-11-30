// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DeleteLayer7RuleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteLayer7RuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLayer7RuleResponse self = new DeleteLayer7RuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLayer7RuleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
