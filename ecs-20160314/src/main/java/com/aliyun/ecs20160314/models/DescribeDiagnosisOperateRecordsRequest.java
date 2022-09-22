// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisOperateRecordsRequest extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("OperateRecordType")
    public String operateRecordType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

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

    public static DescribeDiagnosisOperateRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosisOperateRecordsRequest self = new DescribeDiagnosisOperateRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosisOperateRecordsRequest setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeDiagnosisOperateRecordsRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeDiagnosisOperateRecordsRequest setOperateRecordType(String operateRecordType) {
        this.operateRecordType = operateRecordType;
        return this;
    }
    public String getOperateRecordType() {
        return this.operateRecordType;
    }

    public DescribeDiagnosisOperateRecordsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDiagnosisOperateRecordsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDiagnosisOperateRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDiagnosisOperateRecordsRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeDiagnosisOperateRecordsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDiagnosisOperateRecordsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeDiagnosisOperateRecordsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeDiagnosisOperateRecordsRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
