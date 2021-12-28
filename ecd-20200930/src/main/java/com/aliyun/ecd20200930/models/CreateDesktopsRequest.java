// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateDesktopsRequest extends TeaModel {
    @NameInMap("Amount")
    public Integer amount;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("BundleId")
    public String bundleId;

    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("DesktopName")
    public String desktopName;

    @NameInMap("DesktopNameSuffix")
    public Boolean desktopNameSuffix;

    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("EndUserId")
    public java.util.List<String> endUserId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Hostname")
    public String hostname;

    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    @NameInMap("PromotionId")
    public String promotionId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Tag")
    public java.util.List<CreateDesktopsRequestTag> tag;

    @NameInMap("UserAssignMode")
    public String userAssignMode;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("VpcId")
    public String vpcId;

    public static CreateDesktopsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDesktopsRequest self = new CreateDesktopsRequest();
        return TeaModel.build(map, self);
    }

    public CreateDesktopsRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public CreateDesktopsRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateDesktopsRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateDesktopsRequest setBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }
    public String getBundleId() {
        return this.bundleId;
    }

    public CreateDesktopsRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateDesktopsRequest setDesktopName(String desktopName) {
        this.desktopName = desktopName;
        return this;
    }
    public String getDesktopName() {
        return this.desktopName;
    }

    public CreateDesktopsRequest setDesktopNameSuffix(Boolean desktopNameSuffix) {
        this.desktopNameSuffix = desktopNameSuffix;
        return this;
    }
    public Boolean getDesktopNameSuffix() {
        return this.desktopNameSuffix;
    }

    public CreateDesktopsRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreateDesktopsRequest setEndUserId(java.util.List<String> endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public java.util.List<String> getEndUserId() {
        return this.endUserId;
    }

    public CreateDesktopsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateDesktopsRequest setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public CreateDesktopsRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public CreateDesktopsRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateDesktopsRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateDesktopsRequest setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public CreateDesktopsRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public CreateDesktopsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDesktopsRequest setTag(java.util.List<CreateDesktopsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateDesktopsRequestTag> getTag() {
        return this.tag;
    }

    public CreateDesktopsRequest setUserAssignMode(String userAssignMode) {
        this.userAssignMode = userAssignMode;
        return this;
    }
    public String getUserAssignMode() {
        return this.userAssignMode;
    }

    public CreateDesktopsRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CreateDesktopsRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class CreateDesktopsRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateDesktopsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateDesktopsRequestTag self = new CreateDesktopsRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateDesktopsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateDesktopsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
