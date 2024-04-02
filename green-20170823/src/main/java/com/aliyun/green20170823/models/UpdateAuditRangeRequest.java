// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateAuditRangeRequest extends TeaModel {
    @NameInMap("AuditRange")
    public String auditRange;

    public static UpdateAuditRangeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuditRangeRequest self = new UpdateAuditRangeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAuditRangeRequest setAuditRange(String auditRange) {
        this.auditRange = auditRange;
        return this;
    }
    public String getAuditRange() {
        return this.auditRange;
    }

}
