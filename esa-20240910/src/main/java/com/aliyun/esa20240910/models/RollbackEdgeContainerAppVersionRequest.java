// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class RollbackEdgeContainerAppVersionRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app-88068867578379****</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Percentage")
    public Integer percentage;

    /**
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>test rollback app</p>
     */
    @NameInMap("Remarks")
    public String remarks;

    @NameInMap("UsedPercent")
    public Boolean usedPercent;

    /**
     * <p>The ID of version that you want to roll back.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ver-87962637161651****</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    public static RollbackEdgeContainerAppVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackEdgeContainerAppVersionRequest self = new RollbackEdgeContainerAppVersionRequest();
        return TeaModel.build(map, self);
    }

    public RollbackEdgeContainerAppVersionRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RollbackEdgeContainerAppVersionRequest setPercentage(Integer percentage) {
        this.percentage = percentage;
        return this;
    }
    public Integer getPercentage() {
        return this.percentage;
    }

    public RollbackEdgeContainerAppVersionRequest setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }
    public String getRemarks() {
        return this.remarks;
    }

    public RollbackEdgeContainerAppVersionRequest setUsedPercent(Boolean usedPercent) {
        this.usedPercent = usedPercent;
        return this;
    }
    public Boolean getUsedPercent() {
        return this.usedPercent;
    }

    public RollbackEdgeContainerAppVersionRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
