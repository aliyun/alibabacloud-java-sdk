// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CreateAppInstanceGroupShrinkRequest extends TeaModel {
    /**
     * <p>The application image ID. You can obtain the ID from the <strong>O&amp;M</strong> &gt; <strong>Custom Images</strong> or <strong>System Images</strong> page in the <a href="https://appstreaming.console.aliyun.com/">WUYING Cloud Application console</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>img-8z4nztpaqvay4****</p>
     */
    @NameInMap("AppCenterImageId")
    public String appCenterImageId;

    /**
     * <p>The name of the delivery group.</p>
     * 
     * <strong>example:</strong>
     * <p>办公应用</p>
     */
    @NameInMap("AppInstanceGroupName")
    public String appInstanceGroupName;

    /**
     * <p>The package type.</p>
     * 
     * <strong>example:</strong>
     * <p>browser.package.5.250.appstreaming.general.basic</p>
     */
    @NameInMap("AppPackageType")
    public String appPackageType;

    /**
     * <p>The policy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-0clfzcy0adpcf****</p>
     */
    @NameInMap("AppPolicyId")
    public String appPolicyId;

    /**
     * <p>The authorization mode of the delivery group.</p>
     * 
     * <strong>example:</strong>
     * <p>App</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("AuthMode")
    public String authMode;

    /**
     * <p>Specifies whether to enable automatic payment.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The region ID of the delivery group. For information about supported regions, see <a href="https://help.aliyun.com/document_detail/426036.html">Limits</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The sales mode.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Node</p>
     */
    @NameInMap("ChargeResourceMode")
    public String chargeResourceMode;

    /**
     * <p>The billing method.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cls-d39iq73l5c0a8****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The network configuration.</p>
     * <blockquote>
     * <p>To use this parameter, submit a ticket.</p>
     * </blockquote>
     */
    @NameInMap("Network")
    public String networkShrink;

    /**
     * <p>The node pool object.</p>
     */
    @NameInMap("NodePool")
    public String nodePoolShrink;

    /**
     * <p>The subscription duration of the resource when <code>ChargeType</code> is set to <code>PrePaid</code>. This parameter is required. The unit is specified by <code>PeriodUnit</code>.</p>
     * <ul>
     * <li><p>If <code>PeriodUnit</code> is set to <code>Week</code>, valid values:</p>
     * <ul>
     * <li>1</li>
     * </ul>
     * </li>
     * <li><p>If <code>PeriodUnit</code> is set to <code>Month</code>, valid values:</p>
     * <ul>
     * <li>1</li>
     * <li>2</li>
     * <li>3</li>
     * <li>6</li>
     * </ul>
     * </li>
     * <li><p>If <code>PeriodUnit</code> is set to <code>Year</code>, valid values:</p>
     * <ul>
     * <li>1</li>
     * <li>2</li>
     * <li>3</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If <code>ChargeType</code> is set to <code>PostPaid</code>, set this parameter to 1.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription duration when <code>ChargeType</code> is set to <code>PrePaid</code>.</p>
     * <blockquote>
     * <p>This parameter is case-sensitive. For example, <code>Week</code> is valid, but <code>week</code> is invalid.
     * If the request parameters do not match the valid combinations, such as <code>2 Week</code>, the API call succeeds but an error occurs during the order placement.</p>
     * </blockquote>
     * <blockquote>
     * <p>If <code>ChargeType</code> is set to <code>PostPaid</code>, set this parameter to <code>Month</code>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Week</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The pre-opened application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cag-b2ronxxd****</p>
     */
    @NameInMap("PreOpenAppId")
    public String preOpenAppId;

    /**
     * <p>The product type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The promotion ID. You can call the <a href="https://help.aliyun.com/document_detail/428503.html">GetResourcePrice</a> operation to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>17440009****</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The runtime policy.</p>
     */
    @NameInMap("RuntimePolicy")
    public String runtimePolicyShrink;

    /**
     * <p>The security policy.</p>
     */
    @NameInMap("SecurityPolicy")
    public String securityPolicyShrink;

    /**
     * <p>The application recycling timeout period, in minutes. After an end user disconnects from a cloud application for a period of time, the cloud application process exits. This period is the application recycling timeout. Set this parameter to <code>-1</code> if you do not want the application to be recycled. Valid values: -1 and 3 to 300 (integer). Default value: <code>15</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("SessionTimeout")
    public Integer sessionTimeout;

    /**
     * <p>The storage policy.</p>
     */
    @NameInMap("StoragePolicy")
    public String storagePolicyShrink;

    /**
     * <p>The billing method subtype.</p>
     * 
     * <strong>example:</strong>
     * <p>postPaid</p>
     */
    @NameInMap("SubPayType")
    public String subPayType;

    /**
     * <p>The user-defined policy.</p>
     */
    @NameInMap("UserDefinePolicy")
    public String userDefinePolicyShrink;

    /**
     * <p>The list of authorized user group IDs.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("UserGroupIds")
    public java.util.List<String> userGroupIds;

    /**
     * <p>The user information of the users to be added to the delivery group. This field is required if the <code>Users</code> parameter is specified.</p>
     */
    @NameInMap("UserInfo")
    public String userInfoShrink;

    /**
     * <p>The list of usernames to be added to the delivery group as assigned users.</p>
     */
    @NameInMap("Users")
    public java.util.List<String> users;

    /**
     * <p>The display policy.</p>
     */
    @NameInMap("VideoPolicy")
    public String videoPolicyShrink;

    public static CreateAppInstanceGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppInstanceGroupShrinkRequest self = new CreateAppInstanceGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppInstanceGroupShrinkRequest setAppCenterImageId(String appCenterImageId) {
        this.appCenterImageId = appCenterImageId;
        return this;
    }
    public String getAppCenterImageId() {
        return this.appCenterImageId;
    }

    public CreateAppInstanceGroupShrinkRequest setAppInstanceGroupName(String appInstanceGroupName) {
        this.appInstanceGroupName = appInstanceGroupName;
        return this;
    }
    public String getAppInstanceGroupName() {
        return this.appInstanceGroupName;
    }

    public CreateAppInstanceGroupShrinkRequest setAppPackageType(String appPackageType) {
        this.appPackageType = appPackageType;
        return this;
    }
    public String getAppPackageType() {
        return this.appPackageType;
    }

    public CreateAppInstanceGroupShrinkRequest setAppPolicyId(String appPolicyId) {
        this.appPolicyId = appPolicyId;
        return this;
    }
    public String getAppPolicyId() {
        return this.appPolicyId;
    }

    public CreateAppInstanceGroupShrinkRequest setAuthMode(String authMode) {
        this.authMode = authMode;
        return this;
    }
    public String getAuthMode() {
        return this.authMode;
    }

    public CreateAppInstanceGroupShrinkRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateAppInstanceGroupShrinkRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateAppInstanceGroupShrinkRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public CreateAppInstanceGroupShrinkRequest setChargeResourceMode(String chargeResourceMode) {
        this.chargeResourceMode = chargeResourceMode;
        return this;
    }
    public String getChargeResourceMode() {
        return this.chargeResourceMode;
    }

    public CreateAppInstanceGroupShrinkRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateAppInstanceGroupShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateAppInstanceGroupShrinkRequest setNetworkShrink(String networkShrink) {
        this.networkShrink = networkShrink;
        return this;
    }
    public String getNetworkShrink() {
        return this.networkShrink;
    }

    public CreateAppInstanceGroupShrinkRequest setNodePoolShrink(String nodePoolShrink) {
        this.nodePoolShrink = nodePoolShrink;
        return this;
    }
    public String getNodePoolShrink() {
        return this.nodePoolShrink;
    }

    public CreateAppInstanceGroupShrinkRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateAppInstanceGroupShrinkRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateAppInstanceGroupShrinkRequest setPreOpenAppId(String preOpenAppId) {
        this.preOpenAppId = preOpenAppId;
        return this;
    }
    public String getPreOpenAppId() {
        return this.preOpenAppId;
    }

    public CreateAppInstanceGroupShrinkRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public CreateAppInstanceGroupShrinkRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public CreateAppInstanceGroupShrinkRequest setRuntimePolicyShrink(String runtimePolicyShrink) {
        this.runtimePolicyShrink = runtimePolicyShrink;
        return this;
    }
    public String getRuntimePolicyShrink() {
        return this.runtimePolicyShrink;
    }

    public CreateAppInstanceGroupShrinkRequest setSecurityPolicyShrink(String securityPolicyShrink) {
        this.securityPolicyShrink = securityPolicyShrink;
        return this;
    }
    public String getSecurityPolicyShrink() {
        return this.securityPolicyShrink;
    }

    public CreateAppInstanceGroupShrinkRequest setSessionTimeout(Integer sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
        return this;
    }
    public Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    public CreateAppInstanceGroupShrinkRequest setStoragePolicyShrink(String storagePolicyShrink) {
        this.storagePolicyShrink = storagePolicyShrink;
        return this;
    }
    public String getStoragePolicyShrink() {
        return this.storagePolicyShrink;
    }

    public CreateAppInstanceGroupShrinkRequest setSubPayType(String subPayType) {
        this.subPayType = subPayType;
        return this;
    }
    public String getSubPayType() {
        return this.subPayType;
    }

    public CreateAppInstanceGroupShrinkRequest setUserDefinePolicyShrink(String userDefinePolicyShrink) {
        this.userDefinePolicyShrink = userDefinePolicyShrink;
        return this;
    }
    public String getUserDefinePolicyShrink() {
        return this.userDefinePolicyShrink;
    }

    public CreateAppInstanceGroupShrinkRequest setUserGroupIds(java.util.List<String> userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    public CreateAppInstanceGroupShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

    public CreateAppInstanceGroupShrinkRequest setUsers(java.util.List<String> users) {
        this.users = users;
        return this;
    }
    public java.util.List<String> getUsers() {
        return this.users;
    }

    public CreateAppInstanceGroupShrinkRequest setVideoPolicyShrink(String videoPolicyShrink) {
        this.videoPolicyShrink = videoPolicyShrink;
        return this;
    }
    public String getVideoPolicyShrink() {
        return this.videoPolicyShrink;
    }

}
