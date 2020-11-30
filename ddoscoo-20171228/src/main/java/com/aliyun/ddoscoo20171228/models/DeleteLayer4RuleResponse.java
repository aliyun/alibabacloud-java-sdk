// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DeleteLayer4RuleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteLayer4RuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLayer4RuleResponse self = new DeleteLayer4RuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLayer4RuleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
