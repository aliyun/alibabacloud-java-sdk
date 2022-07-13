// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class AssetsAuditAssetRequest extends TeaModel {
    // AppId
    @NameInMap("AppId")
    public String appId;

    // 审核状态
    @NameInMap("AuditStatus")
    public String auditStatus;

    // AssetId
    @NameInMap("Id")
    public String id;

    public static AssetsAuditAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        AssetsAuditAssetRequest self = new AssetsAuditAssetRequest();
        return TeaModel.build(map, self);
    }

    public AssetsAuditAssetRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AssetsAuditAssetRequest setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }
    public String getAuditStatus() {
        return this.auditStatus;
    }

    public AssetsAuditAssetRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
