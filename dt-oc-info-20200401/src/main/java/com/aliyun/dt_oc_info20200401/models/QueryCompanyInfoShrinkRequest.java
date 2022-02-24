// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class QueryCompanyInfoShrinkRequest extends TeaModel {
    @NameInMap("Conditions")
    public String conditionsShrink;

    @NameInMap("ReturnFields")
    public String returnFieldsShrink;

    @NameInMap("SQLId")
    public Integer SQLId;

    public static QueryCompanyInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCompanyInfoShrinkRequest self = new QueryCompanyInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryCompanyInfoShrinkRequest setConditionsShrink(String conditionsShrink) {
        this.conditionsShrink = conditionsShrink;
        return this;
    }
    public String getConditionsShrink() {
        return this.conditionsShrink;
    }

    public QueryCompanyInfoShrinkRequest setReturnFieldsShrink(String returnFieldsShrink) {
        this.returnFieldsShrink = returnFieldsShrink;
        return this;
    }
    public String getReturnFieldsShrink() {
        return this.returnFieldsShrink;
    }

    public QueryCompanyInfoShrinkRequest setSQLId(Integer SQLId) {
        this.SQLId = SQLId;
        return this;
    }
    public Integer getSQLId() {
        return this.SQLId;
    }

}
