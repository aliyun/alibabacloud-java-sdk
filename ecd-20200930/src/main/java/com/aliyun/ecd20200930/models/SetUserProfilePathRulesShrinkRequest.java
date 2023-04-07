// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetUserProfilePathRulesShrinkRequest extends TeaModel {
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("UserProfilePathRule")
    public String userProfilePathRuleShrink;

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
