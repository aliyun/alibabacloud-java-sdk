// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class CreateLayer4RuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateLayer4RuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLayer4RuleResponseBody self = new CreateLayer4RuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLayer4RuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
