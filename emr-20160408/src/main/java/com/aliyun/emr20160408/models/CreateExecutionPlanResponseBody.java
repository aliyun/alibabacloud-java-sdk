// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class CreateExecutionPlanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Id")
    public String id;

    public static CreateExecutionPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateExecutionPlanResponseBody self = new CreateExecutionPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateExecutionPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateExecutionPlanResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
