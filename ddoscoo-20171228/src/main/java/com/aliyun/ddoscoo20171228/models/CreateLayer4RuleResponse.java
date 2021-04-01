// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class CreateLayer4RuleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CreateLayer4RuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLayer4RuleResponse self = new CreateLayer4RuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateLayer4RuleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
