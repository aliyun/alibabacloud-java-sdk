// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateAuditRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AuditContent")
    public String auditContent;

    public static CreateAuditRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAuditRequest self = new CreateAuditRequest();
        return TeaModel.build(map, self);
    }

    public CreateAuditRequest setAuditContent(String auditContent) {
        this.auditContent = auditContent;
        return this;
    }
    public String getAuditContent() {
        return this.auditContent;
    }

}
