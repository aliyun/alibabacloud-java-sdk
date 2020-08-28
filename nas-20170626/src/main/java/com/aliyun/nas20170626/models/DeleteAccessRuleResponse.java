// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteAccessRuleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteAccessRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessRuleResponse self = new DeleteAccessRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAccessRuleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
