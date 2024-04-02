// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class MarkAuditContentItemRequest extends TeaModel {
    @NameInMap("AuditIllegalReasons")
    public String auditIllegalReasons;

    @NameInMap("AuditResult")
    public String auditResult;

    @NameInMap("BizTypes")
    public String bizTypes;

    @NameInMap("Ids")
    public String ids;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static MarkAuditContentItemRequest build(java.util.Map<String, ?> map) throws Exception {
        MarkAuditContentItemRequest self = new MarkAuditContentItemRequest();
        return TeaModel.build(map, self);
    }

    public MarkAuditContentItemRequest setAuditIllegalReasons(String auditIllegalReasons) {
        this.auditIllegalReasons = auditIllegalReasons;
        return this;
    }
    public String getAuditIllegalReasons() {
        return this.auditIllegalReasons;
    }

    public MarkAuditContentItemRequest setAuditResult(String auditResult) {
        this.auditResult = auditResult;
        return this;
    }
    public String getAuditResult() {
        return this.auditResult;
    }

    public MarkAuditContentItemRequest setBizTypes(String bizTypes) {
        this.bizTypes = bizTypes;
        return this;
    }
    public String getBizTypes() {
        return this.bizTypes;
    }

    public MarkAuditContentItemRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public MarkAuditContentItemRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public MarkAuditContentItemRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
