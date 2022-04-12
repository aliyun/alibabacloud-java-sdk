// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ReplicateVersionRequest extends TeaModel {
    // 应用Id
    @NameInMap("AppId")
    public String appId;

    // 源头版本Id
    @NameInMap("SourceVersionId")
    public String sourceVersionId;

    // 复制目标版本Id
    @NameInMap("TargetVersionId")
    public String targetVersionId;

    // 租户Id
    @NameInMap("TenantId")
    public Long tenantId;

    public static ReplicateVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplicateVersionRequest self = new ReplicateVersionRequest();
        return TeaModel.build(map, self);
    }

    public ReplicateVersionRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ReplicateVersionRequest setSourceVersionId(String sourceVersionId) {
        this.sourceVersionId = sourceVersionId;
        return this;
    }
    public String getSourceVersionId() {
        return this.sourceVersionId;
    }

    public ReplicateVersionRequest setTargetVersionId(String targetVersionId) {
        this.targetVersionId = targetVersionId;
        return this;
    }
    public String getTargetVersionId() {
        return this.targetVersionId;
    }

    public ReplicateVersionRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
