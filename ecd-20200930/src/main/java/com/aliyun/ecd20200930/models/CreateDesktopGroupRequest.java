// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateDesktopGroupRequest extends TeaModel {
    /**
     * <p>Specifies whether to authorize all users in the desktop group\&quot;s categories.</p>
     * <blockquote>
     * <p>This parameter is not yet available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Alice</p>
     */
    @NameInMap("AllClassifyUsers")
    public Boolean allClassifyUsers;

    /**
     * <p>Specifies whether to allow automatic creation of desktops in the subscription desktop group. This parameter is required and applies only when <code>ChargeType</code> is set to <code>PrePaid</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AllowAutoSetup")
    public Integer allowAutoSetup;

    /**
     * <p>The number of desktops to reserve in the pay-as-you-go desktop group. This parameter is required and applies only when <code>ChargeType</code> is set to <code>PostPaid</code>. Valid values:</p>
     * <ul>
     * <li><p>0: Does not reserve desktops.</p>
     * </li>
     * <li><p>N: Reserves N desktops, where N is an integer from 1 to 100.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If no desktops are reserved, a user must wait for a new desktop to be created and started, which can cause connection delays. We recommend reserving an appropriate number of desktops to improve connection times.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AllowBufferCount")
    public Integer allowBufferCount;

    /**
     * <p>Specifies whether to automatically pay for subscription orders.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal for the subscription desktop group.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The number of concurrent sessions allowed per desktop in a multi-session desktop group.</p>
     * <blockquote>
     * <p>This parameter is not yet available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("BindAmount")
    public Long bindAmount;

    /**
     * <p>The bundle ID.</p>
     * 
     * <strong>example:</strong>
     * <p>b-je9hani001wfn****</p>
     */
    @NameInMap("BundleId")
    public String bundleId;

    /**
     * <ul>
     * <li><p>For <code>subscription</code> desktop groups: The number of desktops to purchase. Valid values: 0 to 200.</p>
     * </li>
     * <li><p>For <code>pay-as-you-go</code> desktop groups: The minimum number of desktops in the group. Valid values: 0 to <code>MaxDesktopsCount</code>. The default value is 1.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("BuyDesktopsCount")
    public Integer buyDesktopsCount;

    /**
     * <p>The billing method of the desktops.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The type of the desktop group.</p>
     * <blockquote>
     * <p>This parameter is not yet available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>teacher</p>
     */
    @NameInMap("Classify")
    public String classify;

    /**
     * <p>A client token to ensure the idempotence of the request. You can use your client to generate a token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>A description or comments for the desktop group.</p>
     * 
     * <strong>example:</strong>
     * <p>comment</p>
     */
    @NameInMap("Comments")
    public String comments;

    /**
     * <p>The maximum duration of a connected session. When the session duration reaches this value, the session is automatically disconnected. Unit: milliseconds. Valid values: 900000 (15 minutes) to 345600000 (4 days).</p>
     * 
     * <strong>example:</strong>
     * <p>900000</p>
     */
    @NameInMap("ConnectDuration")
    public Long connectDuration;

    /**
     * <p>The type of the data disk.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_auto</p>
     */
    @NameInMap("DataDiskCategory")
    public String dataDiskCategory;

    /**
     * <p>The performance level (PL) of the ESSD. Default value: PL0.</p>
     * 
     * <strong>example:</strong>
     * <p>PL0</p>
     */
    @NameInMap("DataDiskPerLevel")
    public String dataDiskPerLevel;

    /**
     * <p>The size of the data disk. Unit: GiB. The value must be a multiple of 20 and in the range of 0 to 16,380.</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li><p>A value of 0 indicates that no data disk is attached.</p>
     * </li>
     * <li><p>If the selected bundle uses an Enhanced SSD (ESSD) at PL0, the minimum data disk size is 40 GiB.</p>
     * </li>
     * <li><p>If the selected bundle uses an SSD, the minimum data disk size is 20 GiB.</p>
     * </li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li><p>A value of 0 indicates that no data disk is attached.</p>
     * </li>
     * <li><p>If the selected bundle uses an SSD, the minimum data disk size is 20 GiB.</p>
     * </li>
     * </ul>
     * <p>Default value: 0</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("DataDiskSize")
    public Integer dataDiskSize;

    /**
     * <p>The default number of desktops to create in the desktop group. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DefaultInitDesktopCount")
    public Integer defaultInitDesktopCount;

    /**
     * <p>The system language.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("DefaultLanguage")
    public String defaultLanguage;

    @NameInMap("DeleteDuration")
    public Long deleteDuration;

    /**
     * <p>The name of the desktop group. The name must be 1 to 30 characters long, start with a letter or a Chinese character, and must not begin with <code>http://</code> or <code>https://</code>. The name can contain Chinese characters, letters, digits, colons (:), underscores (_), periods (.), or hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>SharedComputers01</p>
     */
    @NameInMap("DesktopGroupName")
    public String desktopGroupName;

    /**
     * <p>The desktop type. You can call the <a href="~~DescribeDesktopTypes~~">DescribeDesktopTypes</a> operation to query supported desktop types.</p>
     * 
     * <strong>example:</strong>
     * <p>eds.enterprise_office.16c64g</p>
     */
    @NameInMap("DesktopType")
    public String desktopType;

    /**
     * <p>The directory ID.</p>
     * <blockquote>
     * <p>This parameter is not yet available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dri-uf62w3qzt4aigvlcb****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>An array of user IDs to authorize for the desktop group.</p>
     */
    @NameInMap("EndUserIds")
    public java.util.List<String> endUserIds;

    /**
     * <p>Specifies the pool type. To create a static pool, set this parameter to <code>Exclusive</code>. This is required if <code>SessionType</code> is <code>MultipleSession</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Exclusive</p>
     */
    @NameInMap("ExclusiveType")
    public String exclusiveType;

    /**
     * <p>The ID of the Apsara File Storage NAS file system used for user data roaming.</p>
     * <blockquote>
     * <p>This parameter is not yet available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>kegd-nas-****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The number of individual desktops to create. This parameter is required only if <code>MultiResource</code> is set to <code>false</code>. Valid values: 1 to 5. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("GroupAmount")
    public Integer groupAmount;

    /**
     * <p>The version of the desktop group.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("GroupVersion")
    public Integer groupVersion;

    /**
     * <p>The custom hostname for the desktops. This parameter is applicable only to Windows desktops in an AD office network.</p>
     * <p>The hostname must meet the following naming conventions:</p>
     * <ul>
     * <li><p>Must be 2 to 15 characters in length.</p>
     * </li>
     * <li><p>Can contain letters, digits, and hyphens (-). It cannot start or end with a hyphen, contain consecutive hyphens, or consist only of digits.</p>
     * </li>
     * </ul>
     * <p>To generate sequential hostnames when creating multiple desktops, use the format <code>name_prefix[begin_number,bits]name_suffix</code>. For example, if you set the Hostname parameter to <code>ecd-[1,4]-test</code>, the first desktop is named ecd-0001-test, the second is named ecd-0002-test, and so on.</p>
     * <ul>
     * <li><p><code>name_prefix</code>: The prefix of the hostname.</p>
     * </li>
     * <li><p><code>[begin_number,bits]</code>: The sequential number in the hostname. <code>begin_number</code> is the starting number, which can be an integer from 0 to 999999. The default value is 0. <code>bits</code> is the number of digits, which can be an integer from 1 to 6. The default value is 6.</p>
     * </li>
     * <li><p><code>name_suffix</code>: The suffix of the hostname.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>testhost</p>
     */
    @NameInMap("Hostname")
    public String hostname;

    /**
     * <p>The maximum duration that a session can be idle before it is automatically disconnected. A session is considered idle if there is no keyboard or mouse input. Unit: milliseconds. Valid values: 360000 (6 minutes) to 3600000 (60 minutes).</p>
     * <p>Thirty seconds before disconnection, the user is prompted to save their work to prevent data loss.</p>
     * <blockquote>
     * <p>This parameter applies only to desktops created from image version 1.0.2 or later.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>360000</p>
     */
    @NameInMap("IdleDisconnectDuration")
    public Long idleDisconnectDuration;

    /**
     * <p>The image ID.</p>
     * 
     * <strong>example:</strong>
     * <p>m-gx2x1dhsmusr2****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The duration for which a session is kept active after a user disconnects. Unit: milliseconds. Valid values: 180000 (3 minutes) to 345600000 (4 days). A value of 0 indicates that the session is retained indefinitely.</p>
     * <p>If a user reconnects within this period, they can resume their session. If they fail to reconnect, the session is terminated, and any unsaved data is lost.</p>
     * 
     * <strong>example:</strong>
     * <p>180000</p>
     */
    @NameInMap("KeepDuration")
    public Long keepDuration;

    /**
     * <p>The load balancing policy for the multi-session desktop group.</p>
     * <blockquote>
     * <p>This parameter is not yet available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("LoadPolicy")
    public Long loadPolicy;

    /**
     * <p>The maximum number of desktops in the pay-as-you-go desktop group. Valid values: 0 to 500.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxDesktopsCount")
    public Integer maxDesktopsCount;

    /**
     * <p>The minimum number of desktops in the subscription desktop group. This parameter is required only if <code>ChargeType</code> is <code>PrePaid</code>. Valid values: 0 to <code>MaxDesktopsCount</code>. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinDesktopsCount")
    public Integer minDesktopsCount;

    /**
     * <p>Specifies whether to create a desktop group.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("MultiResource")
    public Boolean multiResource;

    /**
     * <p>The ID of the office network for the desktops.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+os-c5cy7q578s8jc****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The type of the desktop.</p>
     * <blockquote>
     * <p>This parameter is not yet available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OwnType")
    public Integer ownType;

    /**
     * <p>The subscription duration for the desktops. This parameter is required only if <code>ChargeType</code> is set to <code>PrePaid</code>. The <code>PeriodUnit</code> parameter specifies the time unit for this duration.</p>
     * <ul>
     * <li><p>If <code>PeriodUnit</code> is <code>Month</code>, the valid values are:</p>
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
     * <li><p>If <code>PeriodUnit</code> is <code>Year</code>, the valid values are:</p>
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
     * <p>The time unit of the subscription period.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The ID of the policy to apply to the desktops.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-9c2d6t2dwflqr****</p>
     */
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    /**
     * <p>Specifies whether to enable user data roaming.</p>
     * <blockquote>
     * <p>This parameter is not yet available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ProfileFollowSwitch")
    public Boolean profileFollowSwitch;

    /**
     * <p>The promotion ID.</p>
     * 
     * <strong>example:</strong>
     * <p>youhuiquan_promotion_option_id_*****</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The session usage threshold that triggers auto scaling for multi-session desktop groups. Session usage is calculated by using the following formula:</p>
     * <p><code>Session usage = (Number of connected sessions / (Total number of desktops × Maximum number of sessions per desktop)) × 100%</code></p>
     * <p>When session usage reaches this threshold, new desktops are created. When session usage falls below this threshold, the group scales in by deleting surplus desktops.</p>
     * <blockquote>
     * <p>This parameter is not yet available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0.5</p>
     */
    @NameInMap("RatioThreshold")
    public Float ratioThreshold;

    /**
     * <p>The ID of the region. To find the regions supported by Elastic Desktop Service (EDS), call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResellerOwnerUid")
    public Long resellerOwnerUid;

    /**
     * <p>The desktop reset type.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ResetType")
    public Long resetType;

    /**
     * <p>The ID of the scaling policy.</p>
     * <blockquote>
     * <p>This parameter is not yet available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ss-f9dkjz6vw3aaw****</p>
     */
    @NameInMap("ScaleStrategyId")
    public String scaleStrategyId;

    /**
     * <p>The session type.</p>
     * 
     * <strong>example:</strong>
     * <p>SingleSession</p>
     */
    @NameInMap("SessionType")
    public String sessionType;

    @NameInMap("SimpleUserGroupId")
    public String simpleUserGroupId;

    /**
     * <p>The ID of the automatic snapshot policy.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-28mp6my0l6zow****</p>
     */
    @NameInMap("SnapshotPolicyId")
    public String snapshotPolicyId;

    /**
     * <p>The amount of time a desktop can be idle before it is automatically stopped. Connecting to a stopped desktop automatically starts it. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>300000</p>
     */
    @NameInMap("StopDuration")
    public Long stopDuration;

    /**
     * <p>The type of the system disk.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_auto</p>
     */
    @NameInMap("SystemDiskCategory")
    public String systemDiskCategory;

    /**
     * <p>The performance level (PL) of the ESSD. Default value: PL0.</p>
     * 
     * <strong>example:</strong>
     * <p>PL0</p>
     */
    @NameInMap("SystemDiskPerLevel")
    public String systemDiskPerLevel;

    /**
     * <p>The size of the system disk. Unit: GiB.</p>
     * <blockquote>
     * <p>The system disk size must be at least the size of the image.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("SystemDiskSize")
    public Integer systemDiskSize;

    /**
     * <p>The list of tags. You can specify up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateDesktopGroupRequestTag> tag;

    /**
     * <p>The ID of the scheduled task group.</p>
     * 
     * <strong>example:</strong>
     * <p>ccg-0caoeogrk9m5****</p>
     */
    @NameInMap("TimerGroupId")
    public String timerGroupId;

    @NameInMap("UserGroupName")
    public String userGroupName;

    @NameInMap("UserOuPath")
    public String userOuPath;

    /**
     * <p>Specifies whether to enable disk encryption.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("VolumeEncryptionEnabled")
    public Boolean volumeEncryptionEnabled;

    /**
     * <p>The ID of the key from Key Management Service (KMS) used for disk encryption. You can call the <a href="https://help.aliyun.com/document_detail/28951.html">ListKeys</a> operation to obtain the key ID.</p>
     * 
     * <strong>example:</strong>
     * <p>08c33a6f-4e0a-4a1b-a3fa-7ddfa1d4****</p>
     */
    @NameInMap("VolumeEncryptionKey")
    public String volumeEncryptionKey;

    /**
     * <p>The ID of the Virtual Private Cloud (VPC) that contains the office network for the desktops.</p>
     * <blockquote>
     * <p>This parameter is not yet available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf6w8u60n8xbkg5el****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateDesktopGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDesktopGroupRequest self = new CreateDesktopGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateDesktopGroupRequest setAllClassifyUsers(Boolean allClassifyUsers) {
        this.allClassifyUsers = allClassifyUsers;
        return this;
    }
    public Boolean getAllClassifyUsers() {
        return this.allClassifyUsers;
    }

    public CreateDesktopGroupRequest setAllowAutoSetup(Integer allowAutoSetup) {
        this.allowAutoSetup = allowAutoSetup;
        return this;
    }
    public Integer getAllowAutoSetup() {
        return this.allowAutoSetup;
    }

    public CreateDesktopGroupRequest setAllowBufferCount(Integer allowBufferCount) {
        this.allowBufferCount = allowBufferCount;
        return this;
    }
    public Integer getAllowBufferCount() {
        return this.allowBufferCount;
    }

    public CreateDesktopGroupRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateDesktopGroupRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateDesktopGroupRequest setBindAmount(Long bindAmount) {
        this.bindAmount = bindAmount;
        return this;
    }
    public Long getBindAmount() {
        return this.bindAmount;
    }

    public CreateDesktopGroupRequest setBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }
    public String getBundleId() {
        return this.bundleId;
    }

    public CreateDesktopGroupRequest setBuyDesktopsCount(Integer buyDesktopsCount) {
        this.buyDesktopsCount = buyDesktopsCount;
        return this;
    }
    public Integer getBuyDesktopsCount() {
        return this.buyDesktopsCount;
    }

    public CreateDesktopGroupRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateDesktopGroupRequest setClassify(String classify) {
        this.classify = classify;
        return this;
    }
    public String getClassify() {
        return this.classify;
    }

    public CreateDesktopGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDesktopGroupRequest setComments(String comments) {
        this.comments = comments;
        return this;
    }
    public String getComments() {
        return this.comments;
    }

    public CreateDesktopGroupRequest setConnectDuration(Long connectDuration) {
        this.connectDuration = connectDuration;
        return this;
    }
    public Long getConnectDuration() {
        return this.connectDuration;
    }

    public CreateDesktopGroupRequest setDataDiskCategory(String dataDiskCategory) {
        this.dataDiskCategory = dataDiskCategory;
        return this;
    }
    public String getDataDiskCategory() {
        return this.dataDiskCategory;
    }

    public CreateDesktopGroupRequest setDataDiskPerLevel(String dataDiskPerLevel) {
        this.dataDiskPerLevel = dataDiskPerLevel;
        return this;
    }
    public String getDataDiskPerLevel() {
        return this.dataDiskPerLevel;
    }

    public CreateDesktopGroupRequest setDataDiskSize(Integer dataDiskSize) {
        this.dataDiskSize = dataDiskSize;
        return this;
    }
    public Integer getDataDiskSize() {
        return this.dataDiskSize;
    }

    public CreateDesktopGroupRequest setDefaultInitDesktopCount(Integer defaultInitDesktopCount) {
        this.defaultInitDesktopCount = defaultInitDesktopCount;
        return this;
    }
    public Integer getDefaultInitDesktopCount() {
        return this.defaultInitDesktopCount;
    }

    public CreateDesktopGroupRequest setDefaultLanguage(String defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
        return this;
    }
    public String getDefaultLanguage() {
        return this.defaultLanguage;
    }

    public CreateDesktopGroupRequest setDeleteDuration(Long deleteDuration) {
        this.deleteDuration = deleteDuration;
        return this;
    }
    public Long getDeleteDuration() {
        return this.deleteDuration;
    }

    public CreateDesktopGroupRequest setDesktopGroupName(String desktopGroupName) {
        this.desktopGroupName = desktopGroupName;
        return this;
    }
    public String getDesktopGroupName() {
        return this.desktopGroupName;
    }

    public CreateDesktopGroupRequest setDesktopType(String desktopType) {
        this.desktopType = desktopType;
        return this;
    }
    public String getDesktopType() {
        return this.desktopType;
    }

    public CreateDesktopGroupRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreateDesktopGroupRequest setEndUserIds(java.util.List<String> endUserIds) {
        this.endUserIds = endUserIds;
        return this;
    }
    public java.util.List<String> getEndUserIds() {
        return this.endUserIds;
    }

    public CreateDesktopGroupRequest setExclusiveType(String exclusiveType) {
        this.exclusiveType = exclusiveType;
        return this;
    }
    public String getExclusiveType() {
        return this.exclusiveType;
    }

    public CreateDesktopGroupRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CreateDesktopGroupRequest setGroupAmount(Integer groupAmount) {
        this.groupAmount = groupAmount;
        return this;
    }
    public Integer getGroupAmount() {
        return this.groupAmount;
    }

    public CreateDesktopGroupRequest setGroupVersion(Integer groupVersion) {
        this.groupVersion = groupVersion;
        return this;
    }
    public Integer getGroupVersion() {
        return this.groupVersion;
    }

    public CreateDesktopGroupRequest setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public CreateDesktopGroupRequest setIdleDisconnectDuration(Long idleDisconnectDuration) {
        this.idleDisconnectDuration = idleDisconnectDuration;
        return this;
    }
    public Long getIdleDisconnectDuration() {
        return this.idleDisconnectDuration;
    }

    public CreateDesktopGroupRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateDesktopGroupRequest setKeepDuration(Long keepDuration) {
        this.keepDuration = keepDuration;
        return this;
    }
    public Long getKeepDuration() {
        return this.keepDuration;
    }

    public CreateDesktopGroupRequest setLoadPolicy(Long loadPolicy) {
        this.loadPolicy = loadPolicy;
        return this;
    }
    public Long getLoadPolicy() {
        return this.loadPolicy;
    }

    public CreateDesktopGroupRequest setMaxDesktopsCount(Integer maxDesktopsCount) {
        this.maxDesktopsCount = maxDesktopsCount;
        return this;
    }
    public Integer getMaxDesktopsCount() {
        return this.maxDesktopsCount;
    }

    public CreateDesktopGroupRequest setMinDesktopsCount(Integer minDesktopsCount) {
        this.minDesktopsCount = minDesktopsCount;
        return this;
    }
    public Integer getMinDesktopsCount() {
        return this.minDesktopsCount;
    }

    public CreateDesktopGroupRequest setMultiResource(Boolean multiResource) {
        this.multiResource = multiResource;
        return this;
    }
    public Boolean getMultiResource() {
        return this.multiResource;
    }

    public CreateDesktopGroupRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public CreateDesktopGroupRequest setOwnType(Integer ownType) {
        this.ownType = ownType;
        return this;
    }
    public Integer getOwnType() {
        return this.ownType;
    }

    public CreateDesktopGroupRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateDesktopGroupRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateDesktopGroupRequest setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public CreateDesktopGroupRequest setProfileFollowSwitch(Boolean profileFollowSwitch) {
        this.profileFollowSwitch = profileFollowSwitch;
        return this;
    }
    public Boolean getProfileFollowSwitch() {
        return this.profileFollowSwitch;
    }

    public CreateDesktopGroupRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public CreateDesktopGroupRequest setRatioThreshold(Float ratioThreshold) {
        this.ratioThreshold = ratioThreshold;
        return this;
    }
    public Float getRatioThreshold() {
        return this.ratioThreshold;
    }

    public CreateDesktopGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDesktopGroupRequest setResellerOwnerUid(Long resellerOwnerUid) {
        this.resellerOwnerUid = resellerOwnerUid;
        return this;
    }
    public Long getResellerOwnerUid() {
        return this.resellerOwnerUid;
    }

    public CreateDesktopGroupRequest setResetType(Long resetType) {
        this.resetType = resetType;
        return this;
    }
    public Long getResetType() {
        return this.resetType;
    }

    public CreateDesktopGroupRequest setScaleStrategyId(String scaleStrategyId) {
        this.scaleStrategyId = scaleStrategyId;
        return this;
    }
    public String getScaleStrategyId() {
        return this.scaleStrategyId;
    }

    public CreateDesktopGroupRequest setSessionType(String sessionType) {
        this.sessionType = sessionType;
        return this;
    }
    public String getSessionType() {
        return this.sessionType;
    }

    public CreateDesktopGroupRequest setSimpleUserGroupId(String simpleUserGroupId) {
        this.simpleUserGroupId = simpleUserGroupId;
        return this;
    }
    public String getSimpleUserGroupId() {
        return this.simpleUserGroupId;
    }

    public CreateDesktopGroupRequest setSnapshotPolicyId(String snapshotPolicyId) {
        this.snapshotPolicyId = snapshotPolicyId;
        return this;
    }
    public String getSnapshotPolicyId() {
        return this.snapshotPolicyId;
    }

    public CreateDesktopGroupRequest setStopDuration(Long stopDuration) {
        this.stopDuration = stopDuration;
        return this;
    }
    public Long getStopDuration() {
        return this.stopDuration;
    }

    public CreateDesktopGroupRequest setSystemDiskCategory(String systemDiskCategory) {
        this.systemDiskCategory = systemDiskCategory;
        return this;
    }
    public String getSystemDiskCategory() {
        return this.systemDiskCategory;
    }

    public CreateDesktopGroupRequest setSystemDiskPerLevel(String systemDiskPerLevel) {
        this.systemDiskPerLevel = systemDiskPerLevel;
        return this;
    }
    public String getSystemDiskPerLevel() {
        return this.systemDiskPerLevel;
    }

    public CreateDesktopGroupRequest setSystemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    public CreateDesktopGroupRequest setTag(java.util.List<CreateDesktopGroupRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateDesktopGroupRequestTag> getTag() {
        return this.tag;
    }

    public CreateDesktopGroupRequest setTimerGroupId(String timerGroupId) {
        this.timerGroupId = timerGroupId;
        return this;
    }
    public String getTimerGroupId() {
        return this.timerGroupId;
    }

    public CreateDesktopGroupRequest setUserGroupName(String userGroupName) {
        this.userGroupName = userGroupName;
        return this;
    }
    public String getUserGroupName() {
        return this.userGroupName;
    }

    public CreateDesktopGroupRequest setUserOuPath(String userOuPath) {
        this.userOuPath = userOuPath;
        return this;
    }
    public String getUserOuPath() {
        return this.userOuPath;
    }

    public CreateDesktopGroupRequest setVolumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
        this.volumeEncryptionEnabled = volumeEncryptionEnabled;
        return this;
    }
    public Boolean getVolumeEncryptionEnabled() {
        return this.volumeEncryptionEnabled;
    }

    public CreateDesktopGroupRequest setVolumeEncryptionKey(String volumeEncryptionKey) {
        this.volumeEncryptionKey = volumeEncryptionKey;
        return this;
    }
    public String getVolumeEncryptionKey() {
        return this.volumeEncryptionKey;
    }

    public CreateDesktopGroupRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class CreateDesktopGroupRequestTag extends TeaModel {
        /**
         * <p>The tag key. The key cannot be an empty string, can be up to 128 characters long, and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. The value can be an empty string. The value can be up to 128 characters in length and cannot start with <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateDesktopGroupRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateDesktopGroupRequestTag self = new CreateDesktopGroupRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateDesktopGroupRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateDesktopGroupRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
