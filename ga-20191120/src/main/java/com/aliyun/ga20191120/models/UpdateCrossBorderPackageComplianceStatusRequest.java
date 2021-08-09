// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateCrossBorderPackageComplianceStatusRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("ComplianceStatus")
    public String complianceStatus;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Description")
    public String description;

    public static UpdateCrossBorderPackageComplianceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCrossBorderPackageComplianceStatusRequest self = new UpdateCrossBorderPackageComplianceStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCrossBorderPackageComplianceStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateCrossBorderPackageComplianceStatusRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateCrossBorderPackageComplianceStatusRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateCrossBorderPackageComplianceStatusRequest setComplianceStatus(String complianceStatus) {
        this.complianceStatus = complianceStatus;
        return this;
    }
    public String getComplianceStatus() {
        return this.complianceStatus;
    }

    public UpdateCrossBorderPackageComplianceStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateCrossBorderPackageComplianceStatusRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
