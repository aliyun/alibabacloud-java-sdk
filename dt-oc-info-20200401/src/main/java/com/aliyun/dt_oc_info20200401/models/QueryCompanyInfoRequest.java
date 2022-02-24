// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class QueryCompanyInfoRequest extends TeaModel {
    @NameInMap("Conditions")
    public java.util.Map<String, ?> conditions;

    @NameInMap("ReturnFields")
    public java.util.Map<String, ?> returnFields;

    @NameInMap("SQLId")
    public Integer SQLId;

    public static QueryCompanyInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCompanyInfoRequest self = new QueryCompanyInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryCompanyInfoRequest setConditions(java.util.Map<String, ?> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.Map<String, ?> getConditions() {
        return this.conditions;
    }

    public QueryCompanyInfoRequest setReturnFields(java.util.Map<String, ?> returnFields) {
        this.returnFields = returnFields;
        return this;
    }
    public java.util.Map<String, ?> getReturnFields() {
        return this.returnFields;
    }

    public QueryCompanyInfoRequest setSQLId(Integer SQLId) {
        this.SQLId = SQLId;
        return this;
    }
    public Integer getSQLId() {
        return this.SQLId;
    }

}
