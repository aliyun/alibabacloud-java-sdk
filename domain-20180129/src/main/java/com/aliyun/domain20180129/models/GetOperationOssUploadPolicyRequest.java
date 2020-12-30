// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class GetOperationOssUploadPolicyRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("AuditType")
    public Integer auditType;

    public static GetOperationOssUploadPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOperationOssUploadPolicyRequest self = new GetOperationOssUploadPolicyRequest();
        return TeaModel.build(map, self);
    }

    public GetOperationOssUploadPolicyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetOperationOssUploadPolicyRequest setAuditType(Integer auditType) {
        this.auditType = auditType;
        return this;
    }
    public Integer getAuditType() {
        return this.auditType;
    }

}
