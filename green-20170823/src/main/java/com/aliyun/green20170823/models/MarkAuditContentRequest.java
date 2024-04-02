// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class MarkAuditContentRequest extends TeaModel {
    @NameInMap("AuditIllegalReasons")
    public String auditIllegalReasons;

    @NameInMap("AuditResult")
    public String auditResult;

    @NameInMap("BizTypes")
    public String bizTypes;

    @NameInMap("Ids")
    public String ids;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static MarkAuditContentRequest build(java.util.Map<String, ?> map) throws Exception {
        MarkAuditContentRequest self = new MarkAuditContentRequest();
        return TeaModel.build(map, self);
    }

    public MarkAuditContentRequest setAuditIllegalReasons(String auditIllegalReasons) {
        this.auditIllegalReasons = auditIllegalReasons;
        return this;
    }
    public String getAuditIllegalReasons() {
        return this.auditIllegalReasons;
    }

    public MarkAuditContentRequest setAuditResult(String auditResult) {
        this.auditResult = auditResult;
        return this;
    }
    public String getAuditResult() {
        return this.auditResult;
    }

    public MarkAuditContentRequest setBizTypes(String bizTypes) {
        this.bizTypes = bizTypes;
        return this;
    }
    public String getBizTypes() {
        return this.bizTypes;
    }

    public MarkAuditContentRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public MarkAuditContentRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
