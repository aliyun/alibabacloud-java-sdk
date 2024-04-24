// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteRecognizeRuleRequest extends TeaModel {
    @NameInMap("SensitiveId")
    public String sensitiveId;

    @NameInMap("TenantId")
    public String tenantId;

    public static DeleteRecognizeRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRecognizeRuleRequest self = new DeleteRecognizeRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRecognizeRuleRequest setSensitiveId(String sensitiveId) {
        this.sensitiveId = sensitiveId;
        return this;
    }
    public String getSensitiveId() {
        return this.sensitiveId;
    }

    public DeleteRecognizeRuleRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
