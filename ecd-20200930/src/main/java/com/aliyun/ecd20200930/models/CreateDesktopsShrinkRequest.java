// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateDesktopsShrinkRequest extends TeaModel {
    /**
     * <p>The number of cloud desktops to create. Valid values: 1 to 300. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <p>The ID of the application control policy.</p>
     * 
     * <strong>example:</strong>
     * <p>bwr-245d4e0e6b7d42f5afa97eb3fbc7e488</p>
     */
    @NameInMap("AppRuleId")
    public String appRuleId;

    /**
     * <p>Specifies whether to enable automatic payment.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal for the cloud desktops. This parameter is valid only when <code>ChargeType</code> is set to <code>PrePaid</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The bundle ID. If you do not specify this parameter, you must use the <code>DesktopAttachment</code> parameter to configure the cloud desktop.</p>
     * 
     * <strong>example:</strong>
     * <p>b-je9hani001wfn****</p>
     */
    @NameInMap("BundleId")
    public String bundleId;

    /**
     * <p>An array of bundle objects. Use this parameter to create cloud desktops from one or more bundles in a single call.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("BundleModels")
    public java.util.List<CreateDesktopsShrinkRequestBundleModels> bundleModels;

    /**
     * <blockquote>
     * <p>This parameter is for internal use only.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PBKB1QbqEl2tslEuU6gRrLxvCFBU2M%2FVD0Eru6Oo%2FI9LTU3XQhvq3PGMWarE%2BPJdkNvCqT3blqlRSthNy4A%2BJQ%3D%3D</p>
     */
    @NameInMap("ChannelCookie")
    public String channelCookie;

    /**
     * <p>The billing method of the cloud desktops.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The parameters for creating a cloud desktop without a bundle. This parameter is used only if <code>BundleId</code> is not specified.</p>
     */
    @NameInMap("DesktopAttachment")
    public String desktopAttachmentShrink;

    /**
     * <p>The private IP address of the cloud desktop.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.1</p>
     */
    @NameInMap("DesktopMemberIp")
    public String desktopMemberIp;

    /**
     * <p>The name of the cloud desktop. The name must meet the following requirements:</p>
     * <ul>
     * <li><p>The name must be 1 to 64 characters in length.</p>
     * </li>
     * <li><p>The name must start with a letter or a Chinese character. It cannot start with <code>http://</code> or <code>https://</code>.</p>
     * </li>
     * <li><p>The name can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DemoComputer01</p>
     */
    @NameInMap("DesktopName")
    public String desktopName;

    /**
     * <p>Specifies whether to automatically append a suffix to the value of <code>DesktopName</code> when you create multiple cloud desktops.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DesktopNameSuffix")
    public Boolean desktopNameSuffix;

    /**
     * <p>The details of the scheduled tasks for the cloud desktops. This parameter is being deprecated. We recommend that you use <code>TimerGroupId</code> instead.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("DesktopTimers")
    public java.util.List<CreateDesktopsShrinkRequestDesktopTimers> desktopTimers;

    /**
     * <blockquote>
     * <p>This parameter is for internal use only.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-300943****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The IDs of the end users to assign to the cloud desktops. You can specify up to 100 IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("EndUserId")
    public java.util.List<String> endUserId;

    /**
     * <p>The extended information in a JSON string. This parameter is for internal use only.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ExtendInfo")
    public String extendInfo;

    /**
     * <p>The ID of the desktop pool.</p>
     * 
     * <strong>example:</strong>
     * <p>dg-boyczi8enfyc5****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The custom hostname of the cloud desktop. This parameter is supported only for Windows cloud desktops that are in an AD office network.</p>
     * <p>The hostname must meet the following requirements:</p>
     * <ul>
     * <li><p>The hostname must be 2 to 15 characters in length.</p>
     * </li>
     * <li><p>The hostname can contain letters, digits, and hyphens (-). The hostname cannot start or end with a hyphen, contain consecutive hyphens, or consist of only digits.</p>
     * </li>
     * </ul>
     * <p>If you create multiple cloud desktops, you can use the <code>name_prefix[begin_number,bits]name_suffix</code> format to specify sequential hostnames for the cloud desktops. For example, if you set the <code>Hostname</code> parameter to <code>ecd-[1,4]-test</code>, the hostname of the first cloud desktop is <code>ecd-0001-test</code>, the second is <code>ecd-0002-test</code>, and so on.</p>
     * <ul>
     * <li><p><code>name_prefix</code>: the prefix of the hostname.</p>
     * </li>
     * <li><p><code>[begin_number,bits]</code>: The sequential part of the hostname.</p>
     * </li>
     * <li><p><code>name_suffix</code>: the suffix of the hostname.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>testhost</p>
     */
    @NameInMap("Hostname")
    public String hostname;

    /**
     * <p>The parameters for purchasing a monthly usage package.</p>
     */
    @NameInMap("MonthDesktopSetting")
    public CreateDesktopsShrinkRequestMonthDesktopSetting monthDesktopSetting;

    /**
     * <p>The ID of the office network.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-387822****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The subscription duration. The unit is specified by the <code>PeriodUnit</code> parameter. This parameter is required only when <code>ChargeType</code> is set to <code>PrePaid</code>.</p>
     * <ul>
     * <li><p>If <code>PeriodUnit</code> is set to <code>Month</code>, valid values are:</p>
     * <ul>
     * <li><p>1</p>
     * </li>
     * <li><p>2</p>
     * </li>
     * <li><p>3</p>
     * </li>
     * <li><p>6</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>If <code>PeriodUnit</code> is set to <code>Year</code>, valid values are:</p>
     * <ul>
     * <li><p>1</p>
     * </li>
     * <li><p>2</p>
     * </li>
     * <li><p>3</p>
     * </li>
     * <li><p>4</p>
     * </li>
     * <li><p>5</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription duration.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The ID of the policy.</p>
     * 
     * <strong>example:</strong>
     * <p>system-all-enabled-policy</p>
     */
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    /**
     * <p>The promotion ID.</p>
     * 
     * <strong>example:</strong>
     * <p>23141</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The additional parameters for a specific purchase type.</p>
     */
    @NameInMap("PurchaseOptions")
    public String purchaseOptionsShrink;

    /**
     * <p>The ID of the bandwidth QoS policy.</p>
     * 
     * <strong>example:</strong>
     * <p>qos-52fqmg6kvyro7zu4l</p>
     */
    @NameInMap("QosRuleId")
    public String qosRuleId;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the regions that support Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The UID of the resource owner in reseller mode. This parameter is required only in reseller mode.</p>
     * 
     * <strong>example:</strong>
     * <p>1828644634819902</p>
     */
    @NameInMap("ResellerOwnerUid")
    public Long resellerOwnerUid;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-3mtuc28rx95lx****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <blockquote>
     * <p>This parameter is for internal use only.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>spn-26c1b7bcrjcI****</p>
     */
    @NameInMap("SavingPlanId")
    public String savingPlanId;

    /**
     * <p>The ID of the automatic snapshot policy.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-28mp6my0l6zow****</p>
     */
    @NameInMap("SnapshotPolicyId")
    public String snapshotPolicyId;

    /**
     * <p>The ID of the vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1m*****</p>
     */
    @NameInMap("SubnetId")
    public String subnetId;

    /**
     * <p>The tags to add to the cloud desktops. A resource can have up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateDesktopsShrinkRequestTag> tag;

    /**
     * <p>The ID of the scheduled task group.</p>
     * 
     * <strong>example:</strong>
     * <p>ccg-0caoeogrk9m5****</p>
     */
    @NameInMap("TimerGroupId")
    public String timerGroupId;

    /**
     * <p>The user assignment mode for the cloud desktops.</p>
     * <blockquote>
     * <p>If you do not specify the <code>EndUserId</code> parameter, the created cloud desktops are unassigned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("UserAssignMode")
    public String userAssignMode;

    /**
     * <p>The custom scripts to run on the cloud desktops after they start.</p>
     */
    @NameInMap("UserCommands")
    public java.util.List<CreateDesktopsShrinkRequestUserCommands> userCommands;

    /**
     * <blockquote>
     * <p>This parameter is for internal use only.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>username</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>Specifies whether to enable disk encryption.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("VolumeEncryptionEnabled")
    public Boolean volumeEncryptionEnabled;

    /**
     * <p>The ID of the KMS key to use for disk encryption. You can call the <a href="https://help.aliyun.com/document_detail/28951.html">ListKeys</a> operation to obtain a list of key IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>08c33a6f-4e0a-4a1b-a3fa-7ddfa1d4****</p>
     */
    @NameInMap("VolumeEncryptionKey")
    public String volumeEncryptionKey;

    /**
     * <blockquote>
     * <p>This parameter is for internal use only.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf6w8u60n8xbkg5el****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateDesktopsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDesktopsShrinkRequest self = new CreateDesktopsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDesktopsShrinkRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public CreateDesktopsShrinkRequest setAppRuleId(String appRuleId) {
        this.appRuleId = appRuleId;
        return this;
    }
    public String getAppRuleId() {
        return this.appRuleId;
    }

    public CreateDesktopsShrinkRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateDesktopsShrinkRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateDesktopsShrinkRequest setBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }
    public String getBundleId() {
        return this.bundleId;
    }

    public CreateDesktopsShrinkRequest setBundleModels(java.util.List<CreateDesktopsShrinkRequestBundleModels> bundleModels) {
        this.bundleModels = bundleModels;
        return this;
    }
    public java.util.List<CreateDesktopsShrinkRequestBundleModels> getBundleModels() {
        return this.bundleModels;
    }

    public CreateDesktopsShrinkRequest setChannelCookie(String channelCookie) {
        this.channelCookie = channelCookie;
        return this;
    }
    public String getChannelCookie() {
        return this.channelCookie;
    }

    public CreateDesktopsShrinkRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateDesktopsShrinkRequest setDesktopAttachmentShrink(String desktopAttachmentShrink) {
        this.desktopAttachmentShrink = desktopAttachmentShrink;
        return this;
    }
    public String getDesktopAttachmentShrink() {
        return this.desktopAttachmentShrink;
    }

    public CreateDesktopsShrinkRequest setDesktopMemberIp(String desktopMemberIp) {
        this.desktopMemberIp = desktopMemberIp;
        return this;
    }
    public String getDesktopMemberIp() {
        return this.desktopMemberIp;
    }

    public CreateDesktopsShrinkRequest setDesktopName(String desktopName) {
        this.desktopName = desktopName;
        return this;
    }
    public String getDesktopName() {
        return this.desktopName;
    }

    public CreateDesktopsShrinkRequest setDesktopNameSuffix(Boolean desktopNameSuffix) {
        this.desktopNameSuffix = desktopNameSuffix;
        return this;
    }
    public Boolean getDesktopNameSuffix() {
        return this.desktopNameSuffix;
    }

    public CreateDesktopsShrinkRequest setDesktopTimers(java.util.List<CreateDesktopsShrinkRequestDesktopTimers> desktopTimers) {
        this.desktopTimers = desktopTimers;
        return this;
    }
    public java.util.List<CreateDesktopsShrinkRequestDesktopTimers> getDesktopTimers() {
        return this.desktopTimers;
    }

    public CreateDesktopsShrinkRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreateDesktopsShrinkRequest setEndUserId(java.util.List<String> endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public java.util.List<String> getEndUserId() {
        return this.endUserId;
    }

    public CreateDesktopsShrinkRequest setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public String getExtendInfo() {
        return this.extendInfo;
    }

    public CreateDesktopsShrinkRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateDesktopsShrinkRequest setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public CreateDesktopsShrinkRequest setMonthDesktopSetting(CreateDesktopsShrinkRequestMonthDesktopSetting monthDesktopSetting) {
        this.monthDesktopSetting = monthDesktopSetting;
        return this;
    }
    public CreateDesktopsShrinkRequestMonthDesktopSetting getMonthDesktopSetting() {
        return this.monthDesktopSetting;
    }

    public CreateDesktopsShrinkRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public CreateDesktopsShrinkRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateDesktopsShrinkRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateDesktopsShrinkRequest setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public CreateDesktopsShrinkRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public CreateDesktopsShrinkRequest setPurchaseOptionsShrink(String purchaseOptionsShrink) {
        this.purchaseOptionsShrink = purchaseOptionsShrink;
        return this;
    }
    public String getPurchaseOptionsShrink() {
        return this.purchaseOptionsShrink;
    }

    public CreateDesktopsShrinkRequest setQosRuleId(String qosRuleId) {
        this.qosRuleId = qosRuleId;
        return this;
    }
    public String getQosRuleId() {
        return this.qosRuleId;
    }

    public CreateDesktopsShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDesktopsShrinkRequest setResellerOwnerUid(Long resellerOwnerUid) {
        this.resellerOwnerUid = resellerOwnerUid;
        return this;
    }
    public Long getResellerOwnerUid() {
        return this.resellerOwnerUid;
    }

    public CreateDesktopsShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDesktopsShrinkRequest setSavingPlanId(String savingPlanId) {
        this.savingPlanId = savingPlanId;
        return this;
    }
    public String getSavingPlanId() {
        return this.savingPlanId;
    }

    public CreateDesktopsShrinkRequest setSnapshotPolicyId(String snapshotPolicyId) {
        this.snapshotPolicyId = snapshotPolicyId;
        return this;
    }
    public String getSnapshotPolicyId() {
        return this.snapshotPolicyId;
    }

    public CreateDesktopsShrinkRequest setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }
    public String getSubnetId() {
        return this.subnetId;
    }

    public CreateDesktopsShrinkRequest setTag(java.util.List<CreateDesktopsShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateDesktopsShrinkRequestTag> getTag() {
        return this.tag;
    }

    public CreateDesktopsShrinkRequest setTimerGroupId(String timerGroupId) {
        this.timerGroupId = timerGroupId;
        return this;
    }
    public String getTimerGroupId() {
        return this.timerGroupId;
    }

    public CreateDesktopsShrinkRequest setUserAssignMode(String userAssignMode) {
        this.userAssignMode = userAssignMode;
        return this;
    }
    public String getUserAssignMode() {
        return this.userAssignMode;
    }

    public CreateDesktopsShrinkRequest setUserCommands(java.util.List<CreateDesktopsShrinkRequestUserCommands> userCommands) {
        this.userCommands = userCommands;
        return this;
    }
    public java.util.List<CreateDesktopsShrinkRequestUserCommands> getUserCommands() {
        return this.userCommands;
    }

    public CreateDesktopsShrinkRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CreateDesktopsShrinkRequest setVolumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
        this.volumeEncryptionEnabled = volumeEncryptionEnabled;
        return this;
    }
    public Boolean getVolumeEncryptionEnabled() {
        return this.volumeEncryptionEnabled;
    }

    public CreateDesktopsShrinkRequest setVolumeEncryptionKey(String volumeEncryptionKey) {
        this.volumeEncryptionKey = volumeEncryptionKey;
        return this;
    }
    public String getVolumeEncryptionKey() {
        return this.volumeEncryptionKey;
    }

    public CreateDesktopsShrinkRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class CreateDesktopsShrinkRequestBundleModels extends TeaModel {
        /**
         * <p>The number of cloud desktops to create. Valid values: 1 to 300. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Amount")
        public Integer amount;

        /**
         * <p>The bundle ID.</p>
         * 
         * <strong>example:</strong>
         * <p>b-je9hani001wfn****</p>
         */
        @NameInMap("BundleId")
        public String bundleId;

        /**
         * <p>The name of the cloud desktop. The name must meet the following requirements:</p>
         * <ul>
         * <li><p>The name must be 1 to 64 characters in length.</p>
         * </li>
         * <li><p>The name must start with a letter or a Chinese character. It cannot start with <code>http://</code> or <code>https://</code>.</p>
         * </li>
         * <li><p>The name can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DemoComputer02</p>
         */
        @NameInMap("DesktopName")
        public String desktopName;

        /**
         * <p>The list of end user IDs to whom the cloud desktops are assigned.</p>
         */
        @NameInMap("EndUserIds")
        public java.util.List<String> endUserIds;

        /**
         * <p>The custom hostname of the cloud desktop. This parameter is supported only for Windows cloud desktops that are in an AD office network.</p>
         * <p>The hostname must meet the following requirements:</p>
         * <ul>
         * <li><p>The hostname must be 2 to 15 characters in length.</p>
         * </li>
         * <li><p>The hostname can contain letters, digits, and hyphens (-). The hostname cannot start or end with a hyphen, contain consecutive hyphens, or consist of only digits.</p>
         * </li>
         * </ul>
         * <p>If you create multiple cloud desktops, you can use the <code>name_prefix[begin_number,bits]name_suffix</code> format to specify sequential hostnames for the cloud desktops. For example, if you set the <code>Hostname</code> parameter to <code>ecd-[1,4]-test</code>, the hostname of the first cloud desktop is <code>ecd-0001-test</code>, the second is <code>ecd-0002-test</code>, and so on.</p>
         * <ul>
         * <li><p><code>name_prefix</code>: the prefix of the hostname.</p>
         * </li>
         * <li><p><code>[begin_number,bits]</code>: The sequential part of the hostname.</p>
         * </li>
         * <li><p><code>name_suffix</code>: the suffix of the hostname.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>testhost</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <p>Specifies whether to enable disk encryption.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("VolumeEncryptionEnabled")
        public Boolean volumeEncryptionEnabled;

        /**
         * <p>The ID of the KMS key to use for disk encryption. You can call the <a href="https://help.aliyun.com/document_detail/28951.html">ListKeys</a> operation to obtain a list of key IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>08c33a6f-4e0a-4a1b-a3fa-7ddfa1d4****</p>
         */
        @NameInMap("VolumeEncryptionKey")
        public String volumeEncryptionKey;

        public static CreateDesktopsShrinkRequestBundleModels build(java.util.Map<String, ?> map) throws Exception {
            CreateDesktopsShrinkRequestBundleModels self = new CreateDesktopsShrinkRequestBundleModels();
            return TeaModel.build(map, self);
        }

        public CreateDesktopsShrinkRequestBundleModels setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public CreateDesktopsShrinkRequestBundleModels setBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public String getBundleId() {
            return this.bundleId;
        }

        public CreateDesktopsShrinkRequestBundleModels setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
        }

        public CreateDesktopsShrinkRequestBundleModels setEndUserIds(java.util.List<String> endUserIds) {
            this.endUserIds = endUserIds;
            return this;
        }
        public java.util.List<String> getEndUserIds() {
            return this.endUserIds;
        }

        public CreateDesktopsShrinkRequestBundleModels setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public CreateDesktopsShrinkRequestBundleModels setVolumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
            this.volumeEncryptionEnabled = volumeEncryptionEnabled;
            return this;
        }
        public Boolean getVolumeEncryptionEnabled() {
            return this.volumeEncryptionEnabled;
        }

        public CreateDesktopsShrinkRequestBundleModels setVolumeEncryptionKey(String volumeEncryptionKey) {
            this.volumeEncryptionKey = volumeEncryptionKey;
            return this;
        }
        public String getVolumeEncryptionKey() {
            return this.volumeEncryptionKey;
        }

    }

    public static class CreateDesktopsShrinkRequestDesktopTimers extends TeaModel {
        /**
         * <p>Specifies whether to allow end users to configure the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowClientSetting")
        public Boolean allowClientSetting;

        /**
         * <p>The cron expression for the scheduled task.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>The cron expression is evaluated in UTC. For example, to specify 00:00 (UTC+8) every day, set the value to <code>0 0 16 ? * 1,2,3,4,5,6,7</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>0 40 7 ? * 1,2,3,4,5,6,7</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <p>Specifies whether to forcibly execute the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enforce")
        public Boolean enforce;

        /**
         * <p>The interval in minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The operation to perform for the scheduled task. This parameter is valid only for scheduled tasks that are triggered by user disconnection.</p>
         * 
         * <strong>example:</strong>
         * <p>Shutdown</p>
         */
        @NameInMap("OperationType")
        public String operationType;

        /**
         * <p>The disk reset type.</p>
         * 
         * <strong>example:</strong>
         * <p>RESET_TYPE_SYSTEM</p>
         */
        @NameInMap("ResetType")
        public String resetType;

        /**
         * <p>The type of the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>NoOperationReboot</p>
         */
        @NameInMap("TimerType")
        public String timerType;

        public static CreateDesktopsShrinkRequestDesktopTimers build(java.util.Map<String, ?> map) throws Exception {
            CreateDesktopsShrinkRequestDesktopTimers self = new CreateDesktopsShrinkRequestDesktopTimers();
            return TeaModel.build(map, self);
        }

        public CreateDesktopsShrinkRequestDesktopTimers setAllowClientSetting(Boolean allowClientSetting) {
            this.allowClientSetting = allowClientSetting;
            return this;
        }
        public Boolean getAllowClientSetting() {
            return this.allowClientSetting;
        }

        public CreateDesktopsShrinkRequestDesktopTimers setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public CreateDesktopsShrinkRequestDesktopTimers setEnforce(Boolean enforce) {
            this.enforce = enforce;
            return this;
        }
        public Boolean getEnforce() {
            return this.enforce;
        }

        public CreateDesktopsShrinkRequestDesktopTimers setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public CreateDesktopsShrinkRequestDesktopTimers setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public CreateDesktopsShrinkRequestDesktopTimers setResetType(String resetType) {
            this.resetType = resetType;
            return this;
        }
        public String getResetType() {
            return this.resetType;
        }

        public CreateDesktopsShrinkRequestDesktopTimers setTimerType(String timerType) {
            this.timerType = timerType;
            return this;
        }
        public String getTimerType() {
            return this.timerType;
        }

    }

    public static class CreateDesktopsShrinkRequestMonthDesktopSetting extends TeaModel {
        /**
         * <blockquote>
         * <p>This parameter is for internal use only.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("BuyerId")
        public Long buyerId;

        /**
         * <blockquote>
         * <p>This parameter is for internal use only.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The duration in hours for the monthly usage package. Valid values: 120, 250, and 360.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("UseDuration")
        public Integer useDuration;

        public static CreateDesktopsShrinkRequestMonthDesktopSetting build(java.util.Map<String, ?> map) throws Exception {
            CreateDesktopsShrinkRequestMonthDesktopSetting self = new CreateDesktopsShrinkRequestMonthDesktopSetting();
            return TeaModel.build(map, self);
        }

        public CreateDesktopsShrinkRequestMonthDesktopSetting setBuyerId(Long buyerId) {
            this.buyerId = buyerId;
            return this;
        }
        public Long getBuyerId() {
            return this.buyerId;
        }

        public CreateDesktopsShrinkRequestMonthDesktopSetting setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public CreateDesktopsShrinkRequestMonthDesktopSetting setUseDuration(Integer useDuration) {
            this.useDuration = useDuration;
            return this;
        }
        public Integer getUseDuration() {
            return this.useDuration;
        }

    }

    public static class CreateDesktopsShrinkRequestTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateDesktopsShrinkRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateDesktopsShrinkRequestTag self = new CreateDesktopsShrinkRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateDesktopsShrinkRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateDesktopsShrinkRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateDesktopsShrinkRequestUserCommands extends TeaModel {
        /**
         * <p>The content of the script.</p>
         * 
         * <strong>example:</strong>
         * <p>bmV3LWl0ZW0gZDpcdGVzdF91c2VyX2NvbW1hbmRzLnR4dCAtdHlwZSBm****</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The encoding format of the script content specified in the <code>Content</code> parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Base64</p>
         */
        @NameInMap("ContentEncoding")
        public String contentEncoding;

        /**
         * <p>The script type.</p>
         * 
         * <strong>example:</strong>
         * <p>RunPowerShellScript</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        public static CreateDesktopsShrinkRequestUserCommands build(java.util.Map<String, ?> map) throws Exception {
            CreateDesktopsShrinkRequestUserCommands self = new CreateDesktopsShrinkRequestUserCommands();
            return TeaModel.build(map, self);
        }

        public CreateDesktopsShrinkRequestUserCommands setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateDesktopsShrinkRequestUserCommands setContentEncoding(String contentEncoding) {
            this.contentEncoding = contentEncoding;
            return this;
        }
        public String getContentEncoding() {
            return this.contentEncoding;
        }

        public CreateDesktopsShrinkRequestUserCommands setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

    }

}
