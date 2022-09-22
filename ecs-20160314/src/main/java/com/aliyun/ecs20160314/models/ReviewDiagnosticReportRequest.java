// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ReviewDiagnosticReportRequest extends TeaModel {
    @NameInMap("Category")
    public String category;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SourceSystem")
    public String sourceSystem;

    @NameInMap("Status")
    public String status;

    public static ReviewDiagnosticReportRequest build(java.util.Map<String, ?> map) throws Exception {
        ReviewDiagnosticReportRequest self = new ReviewDiagnosticReportRequest();
        return TeaModel.build(map, self);
    }

    public ReviewDiagnosticReportRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ReviewDiagnosticReportRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ReviewDiagnosticReportRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ReviewDiagnosticReportRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ReviewDiagnosticReportRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ReviewDiagnosticReportRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ReviewDiagnosticReportRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ReviewDiagnosticReportRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ReviewDiagnosticReportRequest setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
        return this;
    }
    public String getSourceSystem() {
        return this.sourceSystem;
    }

    public ReviewDiagnosticReportRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
