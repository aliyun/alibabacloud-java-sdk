// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CancelOperationAuditRequest extends TeaModel {
    @NameInMap("AuditRecordId")
    public Long auditRecordId;

    @NameInMap("Lang")
    public String lang;

    public static CancelOperationAuditRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelOperationAuditRequest self = new CancelOperationAuditRequest();
        return TeaModel.build(map, self);
    }

    public CancelOperationAuditRequest setAuditRecordId(Long auditRecordId) {
        this.auditRecordId = auditRecordId;
        return this;
    }
    public Long getAuditRecordId() {
        return this.auditRecordId;
    }

    public CancelOperationAuditRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
