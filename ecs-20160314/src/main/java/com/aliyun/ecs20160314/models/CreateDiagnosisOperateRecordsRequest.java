// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CreateDiagnosisOperateRecordsRequest extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("NewInstanceType")
    public String newInstanceType;

    @NameInMap("NewZoneId")
    public String newZoneId;

    @NameInMap("OperateRecordType")
    public String operateRecordType;

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

    public static CreateDiagnosisOperateRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDiagnosisOperateRecordsRequest self = new CreateDiagnosisOperateRecordsRequest();
        return TeaModel.build(map, self);
    }

    public CreateDiagnosisOperateRecordsRequest setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateDiagnosisOperateRecordsRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateDiagnosisOperateRecordsRequest setNewInstanceType(String newInstanceType) {
        this.newInstanceType = newInstanceType;
        return this;
    }
    public String getNewInstanceType() {
        return this.newInstanceType;
    }

    public CreateDiagnosisOperateRecordsRequest setNewZoneId(String newZoneId) {
        this.newZoneId = newZoneId;
        return this;
    }
    public String getNewZoneId() {
        return this.newZoneId;
    }

    public CreateDiagnosisOperateRecordsRequest setOperateRecordType(String operateRecordType) {
        this.operateRecordType = operateRecordType;
        return this;
    }
    public String getOperateRecordType() {
        return this.operateRecordType;
    }

    public CreateDiagnosisOperateRecordsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDiagnosisOperateRecordsRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateDiagnosisOperateRecordsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDiagnosisOperateRecordsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDiagnosisOperateRecordsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDiagnosisOperateRecordsRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
