// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryAIActionRequest extends TeaModel {
    @NameInMap("PlanId")
    @Validation(required = true)
    public String planId;

    public static QueryAIActionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAIActionRequest self = new QueryAIActionRequest();
        return TeaModel.build(map, self);
    }

    public QueryAIActionRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

}
