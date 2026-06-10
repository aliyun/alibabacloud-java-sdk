// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeUserProfilePathRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserProfilePathRule")
    public DescribeUserProfilePathRulesResponseBodyUserProfilePathRule userProfilePathRule;

    public static DescribeUserProfilePathRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserProfilePathRulesResponseBody self = new DescribeUserProfilePathRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserProfilePathRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserProfilePathRulesResponseBody setUserProfilePathRule(DescribeUserProfilePathRulesResponseBodyUserProfilePathRule userProfilePathRule) {
        this.userProfilePathRule = userProfilePathRule;
        return this;
    }
    public DescribeUserProfilePathRulesResponseBodyUserProfilePathRule getUserProfilePathRule() {
        return this.userProfilePathRule;
    }

    public static class DescribeUserProfilePathRulesResponseBodyUserProfilePathRuleRulesBlackPath extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Type")
        public String type;

        public static DescribeUserProfilePathRulesResponseBodyUserProfilePathRuleRulesBlackPath build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserProfilePathRulesResponseBodyUserProfilePathRuleRulesBlackPath self = new DescribeUserProfilePathRulesResponseBodyUserProfilePathRuleRulesBlackPath();
            return TeaModel.build(map, self);
        }

        public DescribeUserProfilePathRulesResponseBodyUserProfilePathRuleRulesBlackPath setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeUserProfilePathRulesResponseBodyUserProfilePathRuleRulesBlackPath setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeUserProfilePathRulesResponseBodyUserProfilePathRuleRulesWhitePaths extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Type")
        public String type;

        public static DescribeUserProfilePathRulesResponseBodyUserProfilePathRuleRulesWhitePaths build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserProfilePathRulesResponseBodyUserProfilePathRuleRulesWhitePaths self = new DescribeUserProfilePathRulesResponseBodyUserProfilePathRuleRulesWhitePaths();
            return TeaModel.build(map, self);
        }

        public DescribeUserProfilePathRulesResponseBodyUserProfilePathRuleRulesWhitePaths setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeUserProfilePathRulesResponseBodyUserProfilePathRuleRulesWhitePaths setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeUserProfilePathRulesResponseBodyUserProfilePathRuleRules extends TeaModel {
        @NameInMap("BlackPath")
        public DescribeUserProfilePathRulesResponseBodyUserProfilePathRuleRulesBlackPath blackPath;

        @NameInMap("WhitePaths")
        public java.util.List<DescribeUserProfilePathRulesResponseBodyUserProfilePathRuleRulesWhitePaths> whitePaths;

        public static DescribeUserProfilePathRulesResponseBodyUserProfilePathRuleRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserProfilePathRulesResponseBodyUserProfilePathRuleRules self = new DescribeUserProfilePathRulesResponseBodyUserProfilePathRuleRules();
            return TeaModel.build(map, self);
        }

        public DescribeUserProfilePathRulesResponseBodyUserProfilePathRuleRules setBlackPath(DescribeUserProfilePathRulesResponseBodyUserProfilePathRuleRulesBlackPath blackPath) {
            this.blackPath = blackPath;
            return this;
        }
        public DescribeUserProfilePathRulesResponseBodyUserProfilePathRuleRulesBlackPath getBlackPath() {
            return this.blackPath;
        }

        public DescribeUserProfilePathRulesResponseBodyUserProfilePathRuleRules setWhitePaths(java.util.List<DescribeUserProfilePathRulesResponseBodyUserProfilePathRuleRulesWhitePaths> whitePaths) {
            this.whitePaths = whitePaths;
            return this;
        }
        public java.util.List<DescribeUserProfilePathRulesResponseBodyUserProfilePathRuleRulesWhitePaths> getWhitePaths() {
            return this.whitePaths;
        }

    }

    public static class DescribeUserProfilePathRulesResponseBodyUserProfilePathRule extends TeaModel {
        @NameInMap("DesktopGroupId")
        public String desktopGroupId;

        @NameInMap("Rules")
        public java.util.List<DescribeUserProfilePathRulesResponseBodyUserProfilePathRuleRules> rules;

        @NameInMap("UserProfileRuleType")
        public String userProfileRuleType;

        public static DescribeUserProfilePathRulesResponseBodyUserProfilePathRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserProfilePathRulesResponseBodyUserProfilePathRule self = new DescribeUserProfilePathRulesResponseBodyUserProfilePathRule();
            return TeaModel.build(map, self);
        }

        public DescribeUserProfilePathRulesResponseBodyUserProfilePathRule setDesktopGroupId(String desktopGroupId) {
            this.desktopGroupId = desktopGroupId;
            return this;
        }
        public String getDesktopGroupId() {
            return this.desktopGroupId;
        }

        public DescribeUserProfilePathRulesResponseBodyUserProfilePathRule setRules(java.util.List<DescribeUserProfilePathRulesResponseBodyUserProfilePathRuleRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<DescribeUserProfilePathRulesResponseBodyUserProfilePathRuleRules> getRules() {
            return this.rules;
        }

        public DescribeUserProfilePathRulesResponseBodyUserProfilePathRule setUserProfileRuleType(String userProfileRuleType) {
            this.userProfileRuleType = userProfileRuleType;
            return this;
        }
        public String getUserProfileRuleType() {
            return this.userProfileRuleType;
        }

    }

}
