// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetUserProfilePathRulesShrinkRequest extends TeaModel {
    /**
     * <p>The desktop group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dg-2i8qxpv6t1a03****</p>
     */
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The directories that you want to configure in the blacklist and whitelist.</p>
     */
    @NameInMap("UserProfilePathRule")
    public String userProfilePathRuleShrink;

    /**
     * <p>The directory type that you want to configure.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>Both_Default_DesktopGroup</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>DesktopGroup</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>Default</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DesktopGroup</p>
     */
    @NameInMap("UserProfileRuleType")
    public String userProfileRuleType;

    public static SetUserProfilePathRulesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SetUserProfilePathRulesShrinkRequest self = new SetUserProfilePathRulesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SetUserProfilePathRulesShrinkRequest setDesktopGroupId(String desktopGroupId) {
        this.desktopGroupId = desktopGroupId;
        return this;
    }
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    public SetUserProfilePathRulesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetUserProfilePathRulesShrinkRequest setUserProfilePathRuleShrink(String userProfilePathRuleShrink) {
        this.userProfilePathRuleShrink = userProfilePathRuleShrink;
        return this;
    }
    public String getUserProfilePathRuleShrink() {
        return this.userProfilePathRuleShrink;
    }

    public SetUserProfilePathRulesShrinkRequest setUserProfileRuleType(String userProfileRuleType) {
        this.userProfileRuleType = userProfileRuleType;
        return this;
    }
    public String getUserProfileRuleType() {
        return this.userProfileRuleType;
    }

}
