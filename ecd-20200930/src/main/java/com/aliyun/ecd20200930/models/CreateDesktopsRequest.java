// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateDesktopsRequest extends TeaModel {
    /**
     * <p>The number of cloud desktops that you want to create. Valid values: 1 to 300. Default value: 1.</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <p>Specifies whether to enable automatic payment.</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal. This parameter takes effect only when the ChargeType parameter is set to PrePaid.````</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The ID of the desktop template.</p>
     */
    @NameInMap("BundleId")
    public String bundleId;

    /**
     * <p>The desktop templates that you want to use.</p>
     */
    @NameInMap("BundleModels")
    public java.util.List<CreateDesktopsRequestBundleModels> bundleModels;

    /**
     * <p>The billing method of the cloud desktop.</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("DesktopMemberIp")
    public String desktopMemberIp;

    /**
     * <p>The name of the cloud desktop. The name must meet the following requirements:</p>
     * <br>
     * <p>*   The name must be 1 to 64 characters in length.</p>
     * <p>*   The name can contain letters, digits, colons (:), underscores (\_), periods (.), and hyphens (-). It must start with a letter but cannot start with http:// or https://.</p>
     */
    @NameInMap("DesktopName")
    public String desktopName;

    /**
     * <p>Specifies whether to automatically add a suffix to the cloud desktop name when you create multiple cloud desktops at a time.</p>
     */
    @NameInMap("DesktopNameSuffix")
    public Boolean desktopNameSuffix;

    @NameInMap("DesktopTimers")
    public java.util.List<CreateDesktopsRequestDesktopTimers> desktopTimers;

    /**
     * <p>This parameter is not available.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The IDs of the users that you want to authorize to use the cloud desktop. The cloud desktop is assigned to the users. You can specify IDs of 1 to 100 users.</p>
     * <br>
     * <p>*   Only one user can use the cloud desktop at a time.</p>
     * <p>*   If you do not specify the `EndUserId` parameter, the cloud desktop that you create is not assigned to users.</p>
     */
    @NameInMap("EndUserId")
    public java.util.List<String> endUserId;

    /**
     * <p>The ID of the desktop group.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The hostname that you specify for the cloud desktop. You can specify only the hostname of a Windows cloud desktop in the workspace of the enterprise AD account type.</p>
     * <br>
     * <p>The hostname must meet the following requirements:</p>
     * <br>
     * <p>*   It must be 2 to 15 characters in length.</p>
     * <p>*   It can contain letters, digits, and hyphens (-). The hostname cannot start or end with a hyphen (-), contain consecutive hyphens (-), or contain only digits.</p>
     * <br>
     * <p>If you create multiple cloud desktops, you can use the`  name_prefix[begin_number,bits]name_suffix ` format to determine the hostnames of the cloud desktops. For example, if you set Hostname to ecd-\[1,4]-test, the hostname of the first cloud desktop is ecd-0001-test and the hostname of the second cloud desktop is ecd-0002-test. Other hostnames follow the same rule.</p>
     * <br>
     * <p>*   `name_prefix`: the prefix of the hostname.</p>
     * <p>*   `[begin_number,bits]`: the ordered numbers in the hostname. begin_number: the start number. Valid values: 0 to 999999. Default value: 0. bits: the digit. Valid values: 1 to 6. Default value: 6.</p>
     * <p>*   `name_suffix`: the suffix of the hostname.</p>
     */
    @NameInMap("Hostname")
    public String hostname;

    /**
     * <p>The ID of the workspace.</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The subscription duration of the cloud desktop that you want to create. The unit is specified by the `PeriodUnit` parameter. This parameter takes effect and is required only when the `ChargeType` parameter is set to `PrePaid`.</p>
     * <br>
     * <p>*   Valid values if the `PeriodUnit` parameter is set to `Month`:</p>
     * <br>
     * <p>    *   1</p>
     * <p>    *   2</p>
     * <p>    *   3</p>
     * <p>    *   6</p>
     * <br>
     * <p>*   Valid values if the `PeriodUnit` parameter is set to `Year`:</p>
     * <br>
     * <p>    *   1</p>
     * <p>    *   2</p>
     * <p>    *   3</p>
     * <p>    *   4</p>
     * <p>    *   5</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription duration.</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The ID of the policy.</p>
     */
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    /**
     * <p>The ID of the sales promotion.</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The tags that you want to add to the cloud desktop.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateDesktopsRequestTag> tag;

    /**
     * <p>The assignment mode of the cloud desktop.</p>
     * <br>
     * <p>> If you do not specify the `EndUserId` parameter, the cloud desktop that you create is not assigned to users.</p>
     */
    @NameInMap("UserAssignMode")
    public String userAssignMode;

    /**
     * <p>The custom command scripts of the user.</p>
     */
    @NameInMap("UserCommands")
    public java.util.List<CreateDesktopsRequestUserCommands> userCommands;

    /**
     * <p>This parameter is not available.</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>Specifies whether to enable disk encryption.</p>
     */
    @NameInMap("VolumeEncryptionEnabled")
    public Boolean volumeEncryptionEnabled;

    /**
     * <p>The ID of the Key Management Service (KMS) key that you want to use when disk encryption is enabled. You can call the [ListKeys](~~28951~~) operation to obtain a list of KMS keys.</p>
     */
    @NameInMap("VolumeEncryptionKey")
    public String volumeEncryptionKey;

    /**
     * <p>This parameter is not available.</p>
     */
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

    public CreateDesktopsRequest setDesktopMemberIp(String desktopMemberIp) {
        this.desktopMemberIp = desktopMemberIp;
        return this;
    }
    public String getDesktopMemberIp() {
        return this.desktopMemberIp;
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

    public CreateDesktopsRequest setDesktopTimers(java.util.List<CreateDesktopsRequestDesktopTimers> desktopTimers) {
        this.desktopTimers = desktopTimers;
        return this;
    }
    public java.util.List<CreateDesktopsRequestDesktopTimers> getDesktopTimers() {
        return this.desktopTimers;
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
        /**
         * <p>The number of cloud desktops that you want to create. Valid values: 1 to 300. Default value: 0.</p>
         */
        @NameInMap("Amount")
        public Integer amount;

        /**
         * <p>The ID of the desktop template.</p>
         */
        @NameInMap("BundleId")
        public String bundleId;

        /**
         * <p>The name of the cloud desktop.</p>
         */
        @NameInMap("DesktopName")
        public String desktopName;

        /**
         * <p>The users to whom you want to assign the cloud desktops.</p>
         */
        @NameInMap("EndUserIds")
        public java.util.List<String> endUserIds;

        /**
         * <p>The hostname that you specify for the cloud desktop. You can only specify the hostname of a Windows cloud desktop in the workspace of the enterprise AD account type.</p>
         * <br>
         * <p>The hostname must meet the following requirements:</p>
         * <br>
         * <p>*   It must be 2 to 15 characters in length.</p>
         * <p>*   It can contain letters, digits, and hyphens (-). The hostname cannot start or end with a hyphen (-), contain consecutive hyphens (-), or contain only digits.</p>
         * <br>
         * <p>If you create multiple cloud desktops, you can use the`  name_prefix[begin_number,bits]name_suffix ` format to determine the hostnames of the cloud desktops. For example, if you set Hostname to ecd-\[1,4]-test, the hostname of the first cloud desktop is ecd-0001-test and the hostname of the second cloud desktop is ecd-0002-test. Other hostnames follow the same rule.</p>
         * <br>
         * <p>*   `name_prefix`: the prefix of the hostname.</p>
         * <p>*   `[begin_number,bits]`: the ordered numbers in the hostname. begin_number: the start number. Valid values: 0 to 999999. Default value: 0. bits: the digit. Valid values: 1 to 6. Default value: 6.</p>
         * <p>*   `name_suffix`: the suffix of the hostname.</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <p>Specifies whether to enable disk encryption.</p>
         */
        @NameInMap("VolumeEncryptionEnabled")
        public Boolean volumeEncryptionEnabled;

        /**
         * <p>The ID of the Key Management Service (KMS) key that you want to use when disk encryption is enabled. You can call the [ListKeys](~~28951~~) operation to obtain a list of KMS keys.</p>
         */
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

    public static class CreateDesktopsRequestDesktopTimers extends TeaModel {
        @NameInMap("AllowClientSetting")
        public Boolean allowClientSetting;

        @NameInMap("CronExpression")
        public String cronExpression;

        @NameInMap("Enforce")
        public Boolean enforce;

        @NameInMap("Interval")
        public Integer interval;

        @NameInMap("OperationType")
        public String operationType;

        @NameInMap("ResetType")
        public String resetType;

        @NameInMap("TimerType")
        public String timerType;

        public static CreateDesktopsRequestDesktopTimers build(java.util.Map<String, ?> map) throws Exception {
            CreateDesktopsRequestDesktopTimers self = new CreateDesktopsRequestDesktopTimers();
            return TeaModel.build(map, self);
        }

        public CreateDesktopsRequestDesktopTimers setAllowClientSetting(Boolean allowClientSetting) {
            this.allowClientSetting = allowClientSetting;
            return this;
        }
        public Boolean getAllowClientSetting() {
            return this.allowClientSetting;
        }

        public CreateDesktopsRequestDesktopTimers setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public CreateDesktopsRequestDesktopTimers setEnforce(Boolean enforce) {
            this.enforce = enforce;
            return this;
        }
        public Boolean getEnforce() {
            return this.enforce;
        }

        public CreateDesktopsRequestDesktopTimers setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public CreateDesktopsRequestDesktopTimers setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public CreateDesktopsRequestDesktopTimers setResetType(String resetType) {
            this.resetType = resetType;
            return this;
        }
        public String getResetType() {
            return this.resetType;
        }

        public CreateDesktopsRequestDesktopTimers setTimerType(String timerType) {
            this.timerType = timerType;
            return this;
        }
        public String getTimerType() {
            return this.timerType;
        }

    }

    public static class CreateDesktopsRequestTag extends TeaModel {
        /**
         * <p>The key of the tag. You can specify 1 to 20 keys for a tag.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. You can specify 1 to 20 values for a tag.</p>
         */
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
        /**
         * <p>The command content.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The encoding mode of the command content (CommandContent).</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   Base64: encodes the command content in Base64.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   PlainText: does not encode the command content.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("ContentEncoding")
        public String contentEncoding;

        /**
         * <p>The command language.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   RunPowerShellScript: PowerShell command (applicable to Windows cloud desktops).</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   RunShellScript: shell command (applicable to Linux cloud desktops).</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   RunBatScript: batch command (applicable to Windows cloud desktops).</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
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
