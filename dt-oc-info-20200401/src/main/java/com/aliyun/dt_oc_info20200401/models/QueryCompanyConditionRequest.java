// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class QueryCompanyConditionRequest extends TeaModel {
    @NameInMap("ConditionType")
    public String conditionType;

    public static QueryCompanyConditionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCompanyConditionRequest self = new QueryCompanyConditionRequest();
        return TeaModel.build(map, self);
    }

    public QueryCompanyConditionRequest setConditionType(String conditionType) {
        this.conditionType = conditionType;
        return this;
    }
    public String getConditionType() {
        return this.conditionType;
    }

}
