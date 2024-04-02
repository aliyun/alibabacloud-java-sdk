// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateAuditSettingRequest extends TeaModel {
    @NameInMap("AuditRange")
    public String auditRange;

    @NameInMap("Callback")
    public String callback;

    @NameInMap("Seed")
    public String seed;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static UpdateAuditSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuditSettingRequest self = new UpdateAuditSettingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAuditSettingRequest setAuditRange(String auditRange) {
        this.auditRange = auditRange;
        return this;
    }
    public String getAuditRange() {
        return this.auditRange;
    }

    public UpdateAuditSettingRequest setCallback(String callback) {
        this.callback = callback;
        return this;
    }
    public String getCallback() {
        return this.callback;
    }

    public UpdateAuditSettingRequest setSeed(String seed) {
        this.seed = seed;
        return this;
    }
    public String getSeed() {
        return this.seed;
    }

    public UpdateAuditSettingRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
