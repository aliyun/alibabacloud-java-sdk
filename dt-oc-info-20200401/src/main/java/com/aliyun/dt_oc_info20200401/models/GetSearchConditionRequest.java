// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetSearchConditionRequest extends TeaModel {
    @NameInMap("ConditionType")
    public String conditionType;

    public static GetSearchConditionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSearchConditionRequest self = new GetSearchConditionRequest();
        return TeaModel.build(map, self);
    }

    public GetSearchConditionRequest setConditionType(String conditionType) {
        this.conditionType = conditionType;
        return this;
    }
    public String getConditionType() {
        return this.conditionType;
    }

}
