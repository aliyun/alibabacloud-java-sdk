// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ModifyResourceDiagnosisStatusRequest extends TeaModel {
    @NameInMap("DiagnosisStatus")
    public String diagnosisStatus;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static ModifyResourceDiagnosisStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyResourceDiagnosisStatusRequest self = new ModifyResourceDiagnosisStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyResourceDiagnosisStatusRequest setDiagnosisStatus(String diagnosisStatus) {
        this.diagnosisStatus = diagnosisStatus;
        return this;
    }
    public String getDiagnosisStatus() {
        return this.diagnosisStatus;
    }

    public ModifyResourceDiagnosisStatusRequest setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ModifyResourceDiagnosisStatusRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ModifyResourceDiagnosisStatusRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyResourceDiagnosisStatusRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public ModifyResourceDiagnosisStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyResourceDiagnosisStatusRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyResourceDiagnosisStatusRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyResourceDiagnosisStatusRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
