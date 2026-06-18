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

    /**
     * <p>The deployment percentage for the target version after the rollback. Valid values: <strong>1 to 100</strong>. Default value: <strong>0</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("Percentage")
    public Integer percentage;

    /**
     * <p>Additional information about the rollback.</p>
     * 
     * <strong>example:</strong>
     * <p>test rollback app</p>
     */
    @NameInMap("Remarks")
    public String remarks;

    /**
     * <p>Specifies whether to use percentage rollback.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UsedPercent")
    public Boolean usedPercent;

    /**
     * <p>The ID of the version to roll back to.</p>
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
