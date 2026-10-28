// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CreateBrowserInstanceGroupShrinkRequest extends TeaModel {
    /**
     * <p>The package identifier.</p>
     * <p>You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("AppPackageType")
    public String appPackageType;

    /**
     * <p>Specifies whether to send notification emails for authorization and deauthorization.</p>
     * <ul>
     * <li><code>true</code>: Sends notification emails.</li>
     * <li><code>false</code>: Does not send notification emails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AuthNotificationEnabled")
    public Boolean authNotificationEnabled;

    /**
     * <p>The automatic payment parameter.</p>
     * <p>You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The auto-renewal parameter.</p>
     * <p>You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The identifier of the business region. This parameter is required.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The browser configuration.</p>
     */
    @NameInMap("BrowserConfig")
    public String browserConfigShrink;

    /**
     * <p>The resource billing method.
     * <strong>For MAU scenarios:</strong> Set this parameter to <code>AppInstance</code>, which indicates billing by instance resources.</p>
     * 
     * <strong>example:</strong>
     * <p>AppInstance</p>
     */
    @NameInMap("ChargeResourceMode")
    public String chargeResourceMode;

    /**
     * <p>The billing method.</p>
     * <p><strong>For MAU scenarios:</strong> Set this parameter to PostPaid, which indicates pay-as-you-go.</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The name of the cloud browser group. This parameter cannot be empty. It is used to distinguish different browser groups in business management scenarios.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Business office browser</p>
     */
    @NameInMap("CloudBrowserName")
    public String cloudBrowserName;

    /**
     * <p>The image ID used by the cloud browser. The image must be compatible with the operating system.
     * If this parameter is omitted, the default image available for the account is used. If no default image is available, the creation may fail.
     * <strong>Usage conditions:</strong> When CookiesSync is enabled, explicitly specify an image that supports cookie synchronization.</p>
     * 
     * <strong>example:</strong>
     * <p>img-bp13mu****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The instance type identifier. Select an instance type that matches the target region, operating system, and inventory conditions.
     * If this parameter is omitted, the default instance type is used.</p>
     * 
     * <strong>example:</strong>
     * <p>appstreaming.general.basic</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The capacity configuration in MAU billing scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("MaxAmount")
    public Integer maxAmount;

    /**
     * <p>The configurations for the office network and website access restrictions. The selected office network must belong to the current account and reside in the region specified by BizRegionId.</p>
     */
    @NameInMap("Network")
    public String networkShrink;

    /**
     * <p>The node pool configuration.
     * You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("NodePool")
    public String nodePoolShrink;

    /**
     * <p>The operating system type. This parameter is required.
     * Only <code>Windows</code> is supported. Other operating systems are not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Windows</p>
     */
    @NameInMap("OsType")
    public String osType;

    /**
     * <p>The number of billing cycles for the purchase.</p>
     * <p>You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the billing cycle for the purchase.</p>
     * <p>You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>Configures policies for the clipboard, video, watermark, session, and client access.</p>
     */
    @NameInMap("Policy")
    public String policyShrink;

    /**
     * <p>The promotion identifier, which is used to specify the promotional offer applied to the order.</p>
     * <p>Applicability and specific discounts are subject to the promotion rules. You do not need to specify this parameter if no promotional offer is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>17440009****</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The connection security policy of the browser group.</p>
     */
    @NameInMap("SecurityPolicy")
    public String securityPolicyShrink;

    /**
     * <p>The user data storage configuration of the browser group.</p>
     */
    @NameInMap("StoragePolicy")
    public String storagePolicyShrink;

    /**
     * <p>The billing sub-type.</p>
     * <p><strong>You must explicitly set this parameter to mau, which indicates billing by monthly active users (MAUs).</strong> Omitting this parameter does not enable MAU billing.</p>
     * 
     * <strong>example:</strong>
     * <p>mau</p>
     */
    @NameInMap("SubPayType")
    public String subPayType;

    /**
     * <p>This parameter is not supported and does not need to be specified.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Tag")
    public String tagShrink;

    /**
     * <p>This parameter is not supported and does not need to be specified.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Timers")
    public String timersShrink;

    /**
     * <p>The list of authorized user group IDs. You can specify up to 10 IDs. The user groups must belong to the current account and match the account type of the office network.
     * <strong>Limits:</strong> This parameter cannot be specified together with a non-empty Users parameter.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("UserGroupIds")
    public java.util.List<String> userGroupIds;

    /**
     * <p>The authorized user account information. The information must match the user and office network types.</p>
     */
    @NameInMap("UserInfo")
    public String userInfoShrink;

    /**
     * <p>The list of authorized users. You can specify up to 200 users. The users must be created in advance and match the account type.</p>
     * <p><strong>Limit:</strong> This parameter cannot be specified together with a non-empty UserGroupIds parameter.</p>
     */
    @NameInMap("Users")
    public String usersShrink;

    public static CreateBrowserInstanceGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBrowserInstanceGroupShrinkRequest self = new CreateBrowserInstanceGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateBrowserInstanceGroupShrinkRequest setAppPackageType(String appPackageType) {
        this.appPackageType = appPackageType;
        return this;
    }
    public String getAppPackageType() {
        return this.appPackageType;
    }

    public CreateBrowserInstanceGroupShrinkRequest setAuthNotificationEnabled(Boolean authNotificationEnabled) {
        this.authNotificationEnabled = authNotificationEnabled;
        return this;
    }
    public Boolean getAuthNotificationEnabled() {
        return this.authNotificationEnabled;
    }

    public CreateBrowserInstanceGroupShrinkRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateBrowserInstanceGroupShrinkRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateBrowserInstanceGroupShrinkRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public CreateBrowserInstanceGroupShrinkRequest setBrowserConfigShrink(String browserConfigShrink) {
        this.browserConfigShrink = browserConfigShrink;
        return this;
    }
    public String getBrowserConfigShrink() {
        return this.browserConfigShrink;
    }

    public CreateBrowserInstanceGroupShrinkRequest setChargeResourceMode(String chargeResourceMode) {
        this.chargeResourceMode = chargeResourceMode;
        return this;
    }
    public String getChargeResourceMode() {
        return this.chargeResourceMode;
    }

    public CreateBrowserInstanceGroupShrinkRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateBrowserInstanceGroupShrinkRequest setCloudBrowserName(String cloudBrowserName) {
        this.cloudBrowserName = cloudBrowserName;
        return this;
    }
    public String getCloudBrowserName() {
        return this.cloudBrowserName;
    }

    public CreateBrowserInstanceGroupShrinkRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateBrowserInstanceGroupShrinkRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateBrowserInstanceGroupShrinkRequest setMaxAmount(Integer maxAmount) {
        this.maxAmount = maxAmount;
        return this;
    }
    public Integer getMaxAmount() {
        return this.maxAmount;
    }

    public CreateBrowserInstanceGroupShrinkRequest setNetworkShrink(String networkShrink) {
        this.networkShrink = networkShrink;
        return this;
    }
    public String getNetworkShrink() {
        return this.networkShrink;
    }

    public CreateBrowserInstanceGroupShrinkRequest setNodePoolShrink(String nodePoolShrink) {
        this.nodePoolShrink = nodePoolShrink;
        return this;
    }
    public String getNodePoolShrink() {
        return this.nodePoolShrink;
    }

    public CreateBrowserInstanceGroupShrinkRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public CreateBrowserInstanceGroupShrinkRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateBrowserInstanceGroupShrinkRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateBrowserInstanceGroupShrinkRequest setPolicyShrink(String policyShrink) {
        this.policyShrink = policyShrink;
        return this;
    }
    public String getPolicyShrink() {
        return this.policyShrink;
    }

    public CreateBrowserInstanceGroupShrinkRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public CreateBrowserInstanceGroupShrinkRequest setSecurityPolicyShrink(String securityPolicyShrink) {
        this.securityPolicyShrink = securityPolicyShrink;
        return this;
    }
    public String getSecurityPolicyShrink() {
        return this.securityPolicyShrink;
    }

    public CreateBrowserInstanceGroupShrinkRequest setStoragePolicyShrink(String storagePolicyShrink) {
        this.storagePolicyShrink = storagePolicyShrink;
        return this;
    }
    public String getStoragePolicyShrink() {
        return this.storagePolicyShrink;
    }

    public CreateBrowserInstanceGroupShrinkRequest setSubPayType(String subPayType) {
        this.subPayType = subPayType;
        return this;
    }
    public String getSubPayType() {
        return this.subPayType;
    }

    public CreateBrowserInstanceGroupShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

    public CreateBrowserInstanceGroupShrinkRequest setTimersShrink(String timersShrink) {
        this.timersShrink = timersShrink;
        return this;
    }
    public String getTimersShrink() {
        return this.timersShrink;
    }

    public CreateBrowserInstanceGroupShrinkRequest setUserGroupIds(java.util.List<String> userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    public CreateBrowserInstanceGroupShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

    public CreateBrowserInstanceGroupShrinkRequest setUsersShrink(String usersShrink) {
        this.usersShrink = usersShrink;
        return this;
    }
    public String getUsersShrink() {
        return this.usersShrink;
    }

}
