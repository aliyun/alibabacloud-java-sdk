// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryOperationAuditInfoDetailRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AuditRecordId")
    public Long auditRecordId;

    /**
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static QueryOperationAuditInfoDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOperationAuditInfoDetailRequest self = new QueryOperationAuditInfoDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryOperationAuditInfoDetailRequest setAuditRecordId(Long auditRecordId) {
        this.auditRecordId = auditRecordId;
        return this;
    }
    public Long getAuditRecordId() {
        return this.auditRecordId;
    }

    public QueryOperationAuditInfoDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
