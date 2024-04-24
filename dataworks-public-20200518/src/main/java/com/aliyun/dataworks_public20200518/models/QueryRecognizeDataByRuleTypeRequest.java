// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class QueryRecognizeDataByRuleTypeRequest extends TeaModel {
    @NameInMap("RecognizeRulesType")
    public String recognizeRulesType;

    @NameInMap("TenantId")
    public String tenantId;

    public static QueryRecognizeDataByRuleTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRecognizeDataByRuleTypeRequest self = new QueryRecognizeDataByRuleTypeRequest();
        return TeaModel.build(map, self);
    }

    public QueryRecognizeDataByRuleTypeRequest setRecognizeRulesType(String recognizeRulesType) {
        this.recognizeRulesType = recognizeRulesType;
        return this;
    }
    public String getRecognizeRulesType() {
        return this.recognizeRulesType;
    }

    public QueryRecognizeDataByRuleTypeRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
