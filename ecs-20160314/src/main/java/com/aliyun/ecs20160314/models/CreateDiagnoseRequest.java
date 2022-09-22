// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CreateDiagnoseRequest extends TeaModel {
    @NameInMap("Amount")
    public Integer amount;

    @NameInMap("DiagnoseAction")
    public String diagnoseAction;

    @NameInMap("DiagnoseErrorCode")
    public String diagnoseErrorCode;

    @NameInMap("DiagnoseProduct")
    public String diagnoseProduct;

    @NameInMap("DiagnoseRequestId")
    public String diagnoseRequestId;

    @NameInMap("DiagnoseRequestParams")
    public String diagnoseRequestParams;

    @NameInMap("DiagnoseResponse")
    public String diagnoseResponse;

    @NameInMap("DiskCategory")
    public String diskCategory;

    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("InstanceTypeName")
    public String instanceTypeName;

    @NameInMap("IzNo")
    public String izNo;

    @NameInMap("Mark")
    public String mark;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Tag")
    public java.util.List<Tag> tag;

    @NameInMap("Type")
    public Integer type;

    public static CreateDiagnoseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDiagnoseRequest self = new CreateDiagnoseRequest();
        return TeaModel.build(map, self);
    }

    public CreateDiagnoseRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public CreateDiagnoseRequest setDiagnoseAction(String diagnoseAction) {
        this.diagnoseAction = diagnoseAction;
        return this;
    }
    public String getDiagnoseAction() {
        return this.diagnoseAction;
    }

    public CreateDiagnoseRequest setDiagnoseErrorCode(String diagnoseErrorCode) {
        this.diagnoseErrorCode = diagnoseErrorCode;
        return this;
    }
    public String getDiagnoseErrorCode() {
        return this.diagnoseErrorCode;
    }

    public CreateDiagnoseRequest setDiagnoseProduct(String diagnoseProduct) {
        this.diagnoseProduct = diagnoseProduct;
        return this;
    }
    public String getDiagnoseProduct() {
        return this.diagnoseProduct;
    }

    public CreateDiagnoseRequest setDiagnoseRequestId(String diagnoseRequestId) {
        this.diagnoseRequestId = diagnoseRequestId;
        return this;
    }
    public String getDiagnoseRequestId() {
        return this.diagnoseRequestId;
    }

    public CreateDiagnoseRequest setDiagnoseRequestParams(String diagnoseRequestParams) {
        this.diagnoseRequestParams = diagnoseRequestParams;
        return this;
    }
    public String getDiagnoseRequestParams() {
        return this.diagnoseRequestParams;
    }

    public CreateDiagnoseRequest setDiagnoseResponse(String diagnoseResponse) {
        this.diagnoseResponse = diagnoseResponse;
        return this;
    }
    public String getDiagnoseResponse() {
        return this.diagnoseResponse;
    }

    public CreateDiagnoseRequest setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
        return this;
    }
    public String getDiskCategory() {
        return this.diskCategory;
    }

    public CreateDiagnoseRequest setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public CreateDiagnoseRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public CreateDiagnoseRequest setInstanceTypeName(String instanceTypeName) {
        this.instanceTypeName = instanceTypeName;
        return this;
    }
    public String getInstanceTypeName() {
        return this.instanceTypeName;
    }

    public CreateDiagnoseRequest setIzNo(String izNo) {
        this.izNo = izNo;
        return this;
    }
    public String getIzNo() {
        return this.izNo;
    }

    public CreateDiagnoseRequest setMark(String mark) {
        this.mark = mark;
        return this;
    }
    public String getMark() {
        return this.mark;
    }

    public CreateDiagnoseRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public CreateDiagnoseRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateDiagnoseRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDiagnoseRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateDiagnoseRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateDiagnoseRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDiagnoseRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDiagnoseRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDiagnoseRequest setTag(java.util.List<Tag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public CreateDiagnoseRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static Tag build(java.util.Map<String, ?> map) throws Exception {
            Tag self = new Tag();
            return TeaModel.build(map, self);
        }

        public Tag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public Tag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
