// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateDesktopsRequest extends TeaModel {
    /**
     * <p>The number of cloud computers that you want to create. Valid values: 1 to 300. Default value: 1.</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <p>Specifies whether to enable automatic payment.</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal. This parameter takes effect only when the ChargeType parameter is set to PrePaid.</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The ID of the cloud computer template.</p>
     */
    @NameInMap("BundleId")
    public String bundleId;

    /**
     * <p>The cloud computer templates.</p>
     */
    @NameInMap("BundleModels")
    public java.util.List<CreateDesktopsRequestBundleModels> bundleModels;

    /**
     * <p>The billing method of the cloud computers.</p>
     * <br>
     * <p>Default value: PostPaid. Valid values:</p>
     * <br>
     * <p>*   Postpaid: pay-as-you-go</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   PrePaid: subscription</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The private IP address of the cloud computer.</p>
     */
    @NameInMap("DesktopMemberIp")
    public String desktopMemberIp;

    /**
     * <p>The name of the cloud computer. The name must meet the following requirements:</p>
     * <br>
     * <p>*   The name must be 1 to 64 characters in length.</p>
     * <p>*   The name must start with a letter but cannot start with `http://` or `https://`.</p>
     * <p>*   The name can only contain letters, digits, colons (:), underscores (\_), periods (.), and hyphens (-).</p>
     */
    @NameInMap("DesktopName")
    public String desktopName;

    /**
     * <p>Specifies whether to automatically add suffixes to the names of cloud computers when you create multiple cloud computers at the same time.</p>
     * <br>
     * <p>Default value: true. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   False</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("DesktopNameSuffix")
    public Boolean desktopNameSuffix;

    /**
     * <p>The details of the scheduled task on cloud computers.</p>
     */
    @NameInMap("DesktopTimers")
    public java.util.List<CreateDesktopsRequestDesktopTimers> desktopTimers;

    /**
     * <p>>  This parameter is not publicly available.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The IDs of the end users to which you want to assign the cloud computers. You can specify 1 to 100 IDs.</p>
     */
    @NameInMap("EndUserId")
    public java.util.List<String> endUserId;

    /**
     * <p>The ID of the cloud computer pool.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The custom hostnames of the cloud computers. This parameter is valid only if the office network is an AD office network and the operating system type of the cloud computers is Windows.</p>
     * <br>
     * <p>The hostnames must meet the following requirements:</p>
     * <br>
     * <p>*   The hostnames must be 2 to 15 characters in length.</p>
     * <p>*   The hostnames can contain only letters, digits, and hyphens (-). The hostnames cannot start or end with a hyphen (-), contain consecutive hyphens (-), or contain only digits.</p>
     * <br>
     * <p>When you create multiple cloud computers, you can use the `name_prefix[begin_number,bits]name_suffix` naming format to name the cloud computers. For example, if you set the value of the Hostname parameter to ecd-\[1,4]-test, the hostname of the first cloud computer is ecd-0001-test, the hostname of the second cloud computer is ecd-0002-test, and so on.</p>
     * <br>
     * <p>*   `name_prefix`: the prefix of the hostname.</p>
     * <p>*   `[begin_number,bits]`: the sequential number in the hostname. The `begin_number` value is the starting digit. Valid values of begin_number: 0 to 999999. Default value: 0. The `bits` value is the number of digits. Valid values: 1 to 6. Default value: 6.</p>
     * <p>*   `name_suffix`: the suffix of the hostname.</p>
     */
    @NameInMap("Hostname")
    public String hostname;

    @NameInMap("MonthDesktopSetting")
    public CreateDesktopsRequestMonthDesktopSetting monthDesktopSetting;

    /**
     * <p>The office network ID.</p>
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
     * <p>How the cloud computers are assigned.</p>
     * <br>
     * <p>>  If you do not specify the `EndUserId` parameter, the cloud computers are not assigned to end users after the cloud computers are created.</p>
     * <br>
     * <p>Default value: ALL. Valid values:</p>
     * <br>
     * <p>*   ALL: If you specify the EndUserId parameter, the cloud computers are assigned to all specified end users after the cloud computers are created.</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   PER_USER: If you specify the EndUserId parameter, the cloud computers are evenly assigned to the specified end users after the cloud computers are created.</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    In this case, you must make sure that the value of the Amount parameter can be divided by the N value of the EndUserId.N parameter that you specify.</p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("UserAssignMode")
    public String userAssignMode;

    /**
     * <p>Details about the custom command scripts.</p>
     */
    @NameInMap("UserCommands")
    public java.util.List<CreateDesktopsRequestUserCommands> userCommands;

    /**
     * <p>>  This parameter is not publicly available.</p>
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
     * <p>>  This parameter is not publicly available.</p>
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

    public CreateDesktopsRequest setMonthDesktopSetting(CreateDesktopsRequestMonthDesktopSetting monthDesktopSetting) {
        this.monthDesktopSetting = monthDesktopSetting;
        return this;
    }
    public CreateDesktopsRequestMonthDesktopSetting getMonthDesktopSetting() {
        return this.monthDesktopSetting;
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
         * <p>The number of cloud computers that you want to create. Valid values: 1 to 300. Default value: null.</p>
         */
        @NameInMap("Amount")
        public Integer amount;

        /**
         * <p>The ID of a cloud computer template.</p>
         */
        @NameInMap("BundleId")
        public String bundleId;

        /**
         * <p>The name of the cloud computer. The name must meet the following requirements:</p>
         * <br>
         * <p>*   The name must be 1 to 64 characters in length.</p>
         * <p>*   The name must start with a letter but cannot start with `http://` or `https://`.</p>
         * <p>*   The name can only contain letters, digits, colons (:), underscores (\_), periods (.), and hyphens (-).</p>
         */
        @NameInMap("DesktopName")
        public String desktopName;

        /**
         * <p>The IDs of the end users to whom the cloud computer are assigned.</p>
         */
        @NameInMap("EndUserIds")
        public java.util.List<String> endUserIds;

        /**
         * <p>The custom hostnames of the cloud computers. This parameter is valid only if the office network is an AD office network and the operating system type of the cloud computers is Windows.</p>
         * <br>
         * <p>The hostnames must meet the following requirements:</p>
         * <br>
         * <p>*   The hostnames must be 2 to 15 characters in length.</p>
         * <p>*   The hostnames can contain only letters, digits, and hyphens (-). The hostnames cannot start or end with a hyphen (-), contain consecutive hyphens (-), or contain only digits.</p>
         * <br>
         * <p>When you create multiple cloud computers, you can use the `name_prefix[begin_number,bits]name_suffix` naming format to name the cloud computers. For example, if you set the value of the Hostname parameter to ecd-\[1,4]-test, the hostname of the first cloud computer is ecd-0001-test, the hostname of the second cloud computer is ecd-0002-test, and so on.</p>
         * <br>
         * <p>*   `name_prefix`: the prefix of the hostname.</p>
         * <p>*   `[begin_number,bits]`: the sequential number in the hostname. The `begin_number` value is the starting digit. Valid values of begin_number: 0 to 999999. Default value: 0. The `bits` value is the number of digits. Valid values: 1 to 6. Default value: 6.</p>
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
         * <p>The ID of the Key Management Service (KMS) key that is used when disk encryption is enabled. You can call the [ListKeys](~~28951~~) operation to query the list of KMS keys.</p>
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
        /**
         * <p>Specifies whether to allow the end user to configure the scheduled task.</p>
         */
        @NameInMap("AllowClientSetting")
        public Boolean allowClientSetting;

        /**
         * <p>The cron expression for the scheduled task.</p>
         * <br>
         * <p>>  The time must be in UTC. For example, for 24:00 (UTC+8), you must set the value to 0 0 16 ? \* 1,2,3,4,5,6,7</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <p>Specifies whether to forcibly execute the scheduled task.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   true: forcibly executes the scheduled task regardless of the status and connection of the cloud computers.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   false: does not forcibly execute the scheduled task.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("Enforce")
        public Boolean enforce;

        /**
         * <p>The interval at which cloud computers are created. Unit: minutes.</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The operations that scheduled tasks support. This parameter is valid only when TimerType is set to NoConnect.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   Hibernate: hibernates the cloud computers.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   Shutdown: stops the cloud computers.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("OperationType")
        public String operationType;

        /**
         * <p>The reset type of the cloud computers.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   RESET_TYPE_SYSTEM: resets the system disks.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   RESET_TYPE_BOTH: resets the system disks and data disks.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("ResetType")
        public String resetType;

        /**
         * <p>The type of the scheduled task.</p>
         */
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

    public static class CreateDesktopsRequestMonthDesktopSetting extends TeaModel {
        @NameInMap("BuyerId")
        public Long buyerId;

        @NameInMap("DesktopId")
        public String desktopId;

        @NameInMap("UseDuration")
        public Integer useDuration;

        public static CreateDesktopsRequestMonthDesktopSetting build(java.util.Map<String, ?> map) throws Exception {
            CreateDesktopsRequestMonthDesktopSetting self = new CreateDesktopsRequestMonthDesktopSetting();
            return TeaModel.build(map, self);
        }

        public CreateDesktopsRequestMonthDesktopSetting setBuyerId(Long buyerId) {
            this.buyerId = buyerId;
            return this;
        }
        public Long getBuyerId() {
            return this.buyerId;
        }

        public CreateDesktopsRequestMonthDesktopSetting setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public CreateDesktopsRequestMonthDesktopSetting setUseDuration(Integer useDuration) {
            this.useDuration = useDuration;
            return this;
        }
        public Integer getUseDuration() {
            return this.useDuration;
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
         * <p>The encoding mode of the command content.</p>
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
         * <p>The language type of the command.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   RunPowerShellScript: PowerShell commands (applicable to Windows cloud computers).</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   RunShellScript: shell commands (applicable to Linux cloud computers).</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   RunBatScript: batch commands (applicable to Windows cloud computers).</p>
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
