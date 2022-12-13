// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateDesktopsRequest extends TeaModel {
    // The number of cloud desktops that you want to create. Valid values: 1 to 300. Default value: 1.
    @NameInMap("Amount")
    public Integer amount;

    // Specifies whether to enable automatic payment. Valid values:
    // 
    // *   true: enables automatic payment. You must make sure that your Alibaba Cloud account has sufficient balance. If your Alibaba Cloud account does not have sufficient balance, abnormal orders are generated.
    // *   false: disables automatic payment. In this case, an order is generated, and no payment is automatically made. You can log on to the EDS console and complete the payment based on the order ID on the **Orders** page.
    // 
    // Default value: true.
    @NameInMap("AutoPay")
    public Boolean autoPay;

    // Specifies whether to enable auto-renewal for the cloud desktop. This parameter takes effect only when the ChargeType parameter is set to PrePaid.
    // 
    // Valid values:
    // 
    // *   true: enables auto-renewal. The renewal duration is the same as the subscription duration that you specified for the Period parameter when you purchased the cloud desktop.
    // *   false: does not enable auto-renewal.
    // 
    // Default value: false.
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    // The ID of the cloud desktop template.
    @NameInMap("BundleId")
    public String bundleId;

    @NameInMap("BundleModels")
    public java.util.List<CreateDesktopsRequestBundleModels> bundleModels;

    // The billing method of the cloud desktop. Valid values:
    // 
    // *   PostPaid: pay-as-you-go
    // *   PrePaid: subscription
    // 
    // Default value: PostPaid.
    @NameInMap("ChargeType")
    public String chargeType;

    // The name of the cloud desktop.
    @NameInMap("DesktopName")
    public String desktopName;

    // Specifies whether to automatically add a suffix to the cloud desktop name when you create multiple cloud desktops at a time.
    // 
    // *   True: automatically adds a suffix.
    // *   False: does not add a suffix.
    @NameInMap("DesktopNameSuffix")
    public Boolean desktopNameSuffix;

    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("EndUserId")
    public java.util.List<String> endUserId;

    @NameInMap("GroupId")
    public String groupId;

    // The custom hostname that you specify for the cloud desktop. You can only specify the hostname of a Windows cloud desktop in the workspace of the enterprise AD account type.
    // 
    // The hostname must meet the following requirements:
    // 
    // *   The hostname must be 2 to 15 characters in length.
    // *   The hostname can contain letters, digits, and hyphens (-). It cannot start or end with a hyphen (-), contain consecutive hyphens (-), or contain only digits.
    // 
    // If you create multiple cloud desktops, you can specify the names of the cloud desktops in the `name_prefix[begin_number,bits]name_suffix` format. For example, if you set Hostname to ecd--1,4-test, the hostname of the first cloud desktop is ecd-0001-test and the hostname of the second cloud desktop is ecd-0002-test. The rest may be deduced by analogy.
    // 
    // *   `name_prefix`: the prefix of the hostname.
    // *   `[begin_number,bits]`: the ordered numbers in the hostname. begin_number: the start number. Valid values: 0 to 999999. Default value: 0. bits: the digit. Valid values: 1 to 6. Default value: 6.
    // *   `name_suffix`: the suffix of the hostname.
    @NameInMap("Hostname")
    public String hostname;

    // The ID of the workspace.
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    // The subscription duration. The unit of the value is specified by the `PeriodUnit` parameter. This parameter takes effect and is required only when the `ChargeType` parameter is set to `PrePaid`.
    // 
    // *   Valid values if the `PeriodUnit` parameter is set to `Month`:
    // 
    //     *   1
    // 
    //     <!---->
    // 
    //     *   2
    //     *   3
    //     *   6
    // 
    // *   Valid values if the `PeriodUnit` parameter is set to `Year`:
    // 
    //     *   1
    //     *   2
    //     *   3
    //     *   4
    //     *   5
    @NameInMap("Period")
    public Integer period;

    // The unit of the subscription duration. Valid values:
    // 
    // *   Month
    // *   Year
    // 
    // Default value: Month.
    @NameInMap("PeriodUnit")
    public String periodUnit;

    // The ID of the policy.
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    @NameInMap("PromotionId")
    public String promotionId;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Tag")
    public java.util.List<CreateDesktopsRequestTag> tag;

    // The assignment mode of the cloud desktop. Default value: ALL.
    // 
    // *   ALL: If you specify the EndUserId parameter, the cloud desktops that you create are assigned to each regular user that you specify.
    // *   PER_USER: If you specify the EndUserId parameter, the cloud desktops that you create are evenly assigned to all regular users that you specify. In this case, you must make sure that the value of the Amount parameter can be divided by the N value of the EndUserId.N parameter that you specify.
    // 
    // >  If you do not specify the EndUserId parameter, the cloud desktop that you create is not assigned to regular users.
    @NameInMap("UserAssignMode")
    public String userAssignMode;

    @NameInMap("UserCommands")
    public java.util.List<CreateDesktopsRequestUserCommands> userCommands;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("VolumeEncryptionEnabled")
    public Boolean volumeEncryptionEnabled;

    @NameInMap("VolumeEncryptionKey")
    public String volumeEncryptionKey;

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

    public CreateDesktopsRequest setBundleModels(java.util.List<CreateDesktopsRequestBundleModels> bundleModels) {
        this.bundleModels = bundleModels;
        return this;
    }
    public java.util.List<CreateDesktopsRequestBundleModels> getBundleModels() {
        return this.bundleModels;
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

    public CreateDesktopsRequest setUserCommands(java.util.List<CreateDesktopsRequestUserCommands> userCommands) {
        this.userCommands = userCommands;
        return this;
    }
    public java.util.List<CreateDesktopsRequestUserCommands> getUserCommands() {
        return this.userCommands;
    }

    public CreateDesktopsRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CreateDesktopsRequest setVolumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
        this.volumeEncryptionEnabled = volumeEncryptionEnabled;
        return this;
    }
    public Boolean getVolumeEncryptionEnabled() {
        return this.volumeEncryptionEnabled;
    }

    public CreateDesktopsRequest setVolumeEncryptionKey(String volumeEncryptionKey) {
        this.volumeEncryptionKey = volumeEncryptionKey;
        return this;
    }
    public String getVolumeEncryptionKey() {
        return this.volumeEncryptionKey;
    }

    public CreateDesktopsRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class CreateDesktopsRequestBundleModels extends TeaModel {
        @NameInMap("Amount")
        public Integer amount;

        @NameInMap("BundleId")
        public String bundleId;

        @NameInMap("DesktopName")
        public String desktopName;

        @NameInMap("EndUserIds")
        public java.util.List<String> endUserIds;

        @NameInMap("Hostname")
        public String hostname;

        @NameInMap("VolumeEncryptionEnabled")
        public Boolean volumeEncryptionEnabled;

        @NameInMap("VolumeEncryptionKey")
        public String volumeEncryptionKey;

        public static CreateDesktopsRequestBundleModels build(java.util.Map<String, ?> map) throws Exception {
            CreateDesktopsRequestBundleModels self = new CreateDesktopsRequestBundleModels();
            return TeaModel.build(map, self);
        }

        public CreateDesktopsRequestBundleModels setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public CreateDesktopsRequestBundleModels setBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public String getBundleId() {
            return this.bundleId;
        }

        public CreateDesktopsRequestBundleModels setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
        }

        public CreateDesktopsRequestBundleModels setEndUserIds(java.util.List<String> endUserIds) {
            this.endUserIds = endUserIds;
            return this;
        }
        public java.util.List<String> getEndUserIds() {
            return this.endUserIds;
        }

        public CreateDesktopsRequestBundleModels setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public CreateDesktopsRequestBundleModels setVolumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
            this.volumeEncryptionEnabled = volumeEncryptionEnabled;
            return this;
        }
        public Boolean getVolumeEncryptionEnabled() {
            return this.volumeEncryptionEnabled;
        }

        public CreateDesktopsRequestBundleModels setVolumeEncryptionKey(String volumeEncryptionKey) {
            this.volumeEncryptionKey = volumeEncryptionKey;
            return this;
        }
        public String getVolumeEncryptionKey() {
            return this.volumeEncryptionKey;
        }

    }

    public static class CreateDesktopsRequestTag extends TeaModel {
        // The key of tag N. Valid values of N: 1 to 20.
        @NameInMap("Key")
        public String key;

        // The value of tag N. Valid values of N: 1 to 20.
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

    public static class CreateDesktopsRequestUserCommands extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("ContentEncoding")
        public String contentEncoding;

        @NameInMap("ContentType")
        public String contentType;

        public static CreateDesktopsRequestUserCommands build(java.util.Map<String, ?> map) throws Exception {
            CreateDesktopsRequestUserCommands self = new CreateDesktopsRequestUserCommands();
            return TeaModel.build(map, self);
        }

        public CreateDesktopsRequestUserCommands setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateDesktopsRequestUserCommands setContentEncoding(String contentEncoding) {
            this.contentEncoding = contentEncoding;
            return this;
        }
        public String getContentEncoding() {
            return this.contentEncoding;
        }

        public CreateDesktopsRequestUserCommands setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

    }

}
