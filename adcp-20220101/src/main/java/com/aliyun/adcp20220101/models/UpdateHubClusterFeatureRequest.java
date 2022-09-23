// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class UpdateHubClusterFeatureRequest extends TeaModel {
    @NameInMap("ApiServerEipId")
    public String apiServerEipId;

    @NameInMap("AuditLogEnabled")
    public Boolean auditLogEnabled;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    @NameInMap("EnableArgoCD")
    public Boolean enableArgoCD;

    @NameInMap("EnableMesh")
    public Boolean enableMesh;

    @NameInMap("Name")
    public String name;

    @NameInMap("PublicApiServerEnabled")
    public Boolean publicApiServerEnabled;

    public static UpdateHubClusterFeatureRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHubClusterFeatureRequest self = new UpdateHubClusterFeatureRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHubClusterFeatureRequest setApiServerEipId(String apiServerEipId) {
        this.apiServerEipId = apiServerEipId;
        return this;
    }
    public String getApiServerEipId() {
        return this.apiServerEipId;
    }

    public UpdateHubClusterFeatureRequest setAuditLogEnabled(Boolean auditLogEnabled) {
        this.auditLogEnabled = auditLogEnabled;
        return this;
    }
    public Boolean getAuditLogEnabled() {
        return this.auditLogEnabled;
    }

    public UpdateHubClusterFeatureRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateHubClusterFeatureRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public UpdateHubClusterFeatureRequest setEnableArgoCD(Boolean enableArgoCD) {
        this.enableArgoCD = enableArgoCD;
        return this;
    }
    public Boolean getEnableArgoCD() {
        return this.enableArgoCD;
    }

    public UpdateHubClusterFeatureRequest setEnableMesh(Boolean enableMesh) {
        this.enableMesh = enableMesh;
        return this;
    }
    public Boolean getEnableMesh() {
        return this.enableMesh;
    }

    public UpdateHubClusterFeatureRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateHubClusterFeatureRequest setPublicApiServerEnabled(Boolean publicApiServerEnabled) {
        this.publicApiServerEnabled = publicApiServerEnabled;
        return this;
    }
    public Boolean getPublicApiServerEnabled() {
        return this.publicApiServerEnabled;
    }

}
