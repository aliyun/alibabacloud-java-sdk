// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class QueryRecognizeRuleDetailRequest extends TeaModel {
    @NameInMap("SensitiveName")
    public String sensitiveName;

    @NameInMap("TenantId")
    public String tenantId;

    public static QueryRecognizeRuleDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRecognizeRuleDetailRequest self = new QueryRecognizeRuleDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryRecognizeRuleDetailRequest setSensitiveName(String sensitiveName) {
        this.sensitiveName = sensitiveName;
        return this;
    }
    public String getSensitiveName() {
        return this.sensitiveName;
    }

    public QueryRecognizeRuleDetailRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
