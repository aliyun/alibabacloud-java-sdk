// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetUserProfilePathRulesRequest extends TeaModel {
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("UserProfilePathRule")
    public java.util.List<SetUserProfilePathRulesRequestUserProfilePathRule> userProfilePathRule;

    @NameInMap("UserProfileRuleType")
    public String userProfileRuleType;

    public static SetUserProfilePathRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        SetUserProfilePathRulesRequest self = new SetUserProfilePathRulesRequest();
        return TeaModel.build(map, self);
    }

    public SetUserProfilePathRulesRequest setDesktopGroupId(String desktopGroupId) {
        this.desktopGroupId = desktopGroupId;
        return this;
    }
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    public SetUserProfilePathRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetUserProfilePathRulesRequest setUserProfilePathRule(java.util.List<SetUserProfilePathRulesRequestUserProfilePathRule> userProfilePathRule) {
        this.userProfilePathRule = userProfilePathRule;
        return this;
    }
    public java.util.List<SetUserProfilePathRulesRequestUserProfilePathRule> getUserProfilePathRule() {
        return this.userProfilePathRule;
    }

    public SetUserProfilePathRulesRequest setUserProfileRuleType(String userProfileRuleType) {
        this.userProfileRuleType = userProfileRuleType;
        return this;
    }
    public String getUserProfileRuleType() {
        return this.userProfileRuleType;
    }

    public static class SetUserProfilePathRulesRequestUserProfilePathRuleBlackPath extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Type")
        public String type;

        public static SetUserProfilePathRulesRequestUserProfilePathRuleBlackPath build(java.util.Map<String, ?> map) throws Exception {
            SetUserProfilePathRulesRequestUserProfilePathRuleBlackPath self = new SetUserProfilePathRulesRequestUserProfilePathRuleBlackPath();
            return TeaModel.build(map, self);
        }

        public SetUserProfilePathRulesRequestUserProfilePathRuleBlackPath setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public SetUserProfilePathRulesRequestUserProfilePathRuleBlackPath setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SetUserProfilePathRulesRequestUserProfilePathRuleWhitePaths extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Type")
        public String type;

        public static SetUserProfilePathRulesRequestUserProfilePathRuleWhitePaths build(java.util.Map<String, ?> map) throws Exception {
            SetUserProfilePathRulesRequestUserProfilePathRuleWhitePaths self = new SetUserProfilePathRulesRequestUserProfilePathRuleWhitePaths();
            return TeaModel.build(map, self);
        }

        public SetUserProfilePathRulesRequestUserProfilePathRuleWhitePaths setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public SetUserProfilePathRulesRequestUserProfilePathRuleWhitePaths setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SetUserProfilePathRulesRequestUserProfilePathRule extends TeaModel {
        @NameInMap("BlackPath")
        public SetUserProfilePathRulesRequestUserProfilePathRuleBlackPath blackPath;

        @NameInMap("WhitePaths")
        public java.util.List<SetUserProfilePathRulesRequestUserProfilePathRuleWhitePaths> whitePaths;

        public static SetUserProfilePathRulesRequestUserProfilePathRule build(java.util.Map<String, ?> map) throws Exception {
            SetUserProfilePathRulesRequestUserProfilePathRule self = new SetUserProfilePathRulesRequestUserProfilePathRule();
            return TeaModel.build(map, self);
        }

        public SetUserProfilePathRulesRequestUserProfilePathRule setBlackPath(SetUserProfilePathRulesRequestUserProfilePathRuleBlackPath blackPath) {
            this.blackPath = blackPath;
            return this;
        }
        public SetUserProfilePathRulesRequestUserProfilePathRuleBlackPath getBlackPath() {
            return this.blackPath;
        }

        public SetUserProfilePathRulesRequestUserProfilePathRule setWhitePaths(java.util.List<SetUserProfilePathRulesRequestUserProfilePathRuleWhitePaths> whitePaths) {
            this.whitePaths = whitePaths;
            return this;
        }
        public java.util.List<SetUserProfilePathRulesRequestUserProfilePathRuleWhitePaths> getWhitePaths() {
            return this.whitePaths;
        }

    }

}
