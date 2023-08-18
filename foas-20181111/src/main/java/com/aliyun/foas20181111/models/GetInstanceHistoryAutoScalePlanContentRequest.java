// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetInstanceHistoryAutoScalePlanContentRequest extends TeaModel {
    @NameInMap("planName")
    public String planName;

    public static GetInstanceHistoryAutoScalePlanContentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceHistoryAutoScalePlanContentRequest self = new GetInstanceHistoryAutoScalePlanContentRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceHistoryAutoScalePlanContentRequest setPlanName(String planName) {
        this.planName = planName;
        return this;
    }
    public String getPlanName() {
        return this.planName;
    }

}
