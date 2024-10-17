// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class LicenseInstanceAppDTO extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("BeginOn")
    public String beginOn;

    @NameInMap("ContractNo")
    public String contractNo;

    @NameInMap("CreationTime")
    public String creationTime;

    @NameInMap("ExpiredOn")
    public String expiredOn;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ItemId")
    public String itemId;

    @NameInMap("LicenseConfigs")
    public java.util.List<LicenseInstanceAppDTOLicenseConfigs> licenseConfigs;

    @NameInMap("ModificationTime")
    public String modificationTime;

    @NameInMap("Status")
    public String status;

    @NameInMap("UserId")
    public Long userId;

    public static LicenseInstanceAppDTO build(java.util.Map<String, ?> map) throws Exception {
        LicenseInstanceAppDTO self = new LicenseInstanceAppDTO();
        return TeaModel.build(map, self);
    }

    public LicenseInstanceAppDTO setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public LicenseInstanceAppDTO setBeginOn(String beginOn) {
        this.beginOn = beginOn;
        return this;
    }
    public String getBeginOn() {
        return this.beginOn;
    }

    public LicenseInstanceAppDTO setContractNo(String contractNo) {
        this.contractNo = contractNo;
        return this;
    }
    public String getContractNo() {
        return this.contractNo;
    }

    public LicenseInstanceAppDTO setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public LicenseInstanceAppDTO setExpiredOn(String expiredOn) {
        this.expiredOn = expiredOn;
        return this;
    }
    public String getExpiredOn() {
        return this.expiredOn;
    }

    public LicenseInstanceAppDTO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public LicenseInstanceAppDTO setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

    public LicenseInstanceAppDTO setLicenseConfigs(java.util.List<LicenseInstanceAppDTOLicenseConfigs> licenseConfigs) {
        this.licenseConfigs = licenseConfigs;
        return this;
    }
    public java.util.List<LicenseInstanceAppDTOLicenseConfigs> getLicenseConfigs() {
        return this.licenseConfigs;
    }

    public LicenseInstanceAppDTO setModificationTime(String modificationTime) {
        this.modificationTime = modificationTime;
        return this;
    }
    public String getModificationTime() {
        return this.modificationTime;
    }

    public LicenseInstanceAppDTO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public LicenseInstanceAppDTO setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public static class LicenseInstanceAppDTOLicenseConfigs extends TeaModel {
        @NameInMap("BusinessType")
        public String businessType;

        @NameInMap("FeatureIds")
        public String featureIds;

        @NameInMap("SdkId")
        public Integer sdkId;

        @NameInMap("SdkName")
        public String sdkName;

        @NameInMap("Subscription")
        public String subscription;

        @NameInMap("SubscriptionImp")
        public String subscriptionImp;

        @NameInMap("SubscriptionPkg")
        public String subscriptionPkg;

        public static LicenseInstanceAppDTOLicenseConfigs build(java.util.Map<String, ?> map) throws Exception {
            LicenseInstanceAppDTOLicenseConfigs self = new LicenseInstanceAppDTOLicenseConfigs();
            return TeaModel.build(map, self);
        }

        public LicenseInstanceAppDTOLicenseConfigs setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public LicenseInstanceAppDTOLicenseConfigs setFeatureIds(String featureIds) {
            this.featureIds = featureIds;
            return this;
        }
        public String getFeatureIds() {
            return this.featureIds;
        }

        public LicenseInstanceAppDTOLicenseConfigs setSdkId(Integer sdkId) {
            this.sdkId = sdkId;
            return this;
        }
        public Integer getSdkId() {
            return this.sdkId;
        }

        public LicenseInstanceAppDTOLicenseConfigs setSdkName(String sdkName) {
            this.sdkName = sdkName;
            return this;
        }
        public String getSdkName() {
            return this.sdkName;
        }

        public LicenseInstanceAppDTOLicenseConfigs setSubscription(String subscription) {
            this.subscription = subscription;
            return this;
        }
        public String getSubscription() {
            return this.subscription;
        }

        public LicenseInstanceAppDTOLicenseConfigs setSubscriptionImp(String subscriptionImp) {
            this.subscriptionImp = subscriptionImp;
            return this;
        }
        public String getSubscriptionImp() {
            return this.subscriptionImp;
        }

        public LicenseInstanceAppDTOLicenseConfigs setSubscriptionPkg(String subscriptionPkg) {
            this.subscriptionPkg = subscriptionPkg;
            return this;
        }
        public String getSubscriptionPkg() {
            return this.subscriptionPkg;
        }

    }

}
