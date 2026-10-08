// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryOperationAuditInfoDetailRequest extends TeaModel {
    /**
     * <p>Review record ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AuditRecordId")
    public Long auditRecordId;

    /**
     * <p>Language for error messages in API responses. Valid values:  </p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.  </li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * <p>Default value: <strong>en</strong>.</p>
     * 
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
