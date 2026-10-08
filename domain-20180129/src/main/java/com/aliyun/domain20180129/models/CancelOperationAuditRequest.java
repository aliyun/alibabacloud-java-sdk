// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CancelOperationAuditRequest extends TeaModel {
    /**
     * <p>The audit record ID. You can query the audit record ID by using the <a href="https://help.aliyun.com/document_detail/172568.html">QueryOperationAuditInfoList</a> API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AuditRecordId")
    public Long auditRecordId;

    /**
     * <p>The language of the error message returned by the API. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * <p>Default value: <strong>en</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
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
