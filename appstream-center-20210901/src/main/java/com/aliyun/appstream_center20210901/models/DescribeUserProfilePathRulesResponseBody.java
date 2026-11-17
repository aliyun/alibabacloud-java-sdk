// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DescribeUserProfilePathRulesResponseBody extends TeaModel {
    /**
     * <p>The error code returned when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter.RuleType</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The path rules and user profile roaming configurations.</p>
     */
    @NameInMap("Data")
    public DescribeUserProfilePathRulesResponseBodyData data;

    /**
     * <p>The error message returned when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>The parameter RuleType is invalid.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier of the request, which can be used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>01A1CEEB-CDFF-18F9-B2BF-9997600D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUserProfilePathRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserProfilePathRulesResponseBody self = new DescribeUserProfilePathRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserProfilePathRulesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeUserProfilePathRulesResponseBody setData(DescribeUserProfilePathRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeUserProfilePathRulesResponseBodyData getData() {
        return this.data;
    }

    public DescribeUserProfilePathRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeUserProfilePathRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUserProfilePathRulesResponseBodyDataRulesBlackPath extends TeaModel {
        /**
         * <p>The excluded path relative to the user profile directory.</p>
         * 
         * <strong>example:</strong>
         * <p>AppData\Local</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The path type. Valid values:</p>
         * <ul>
         * <li><code>file</code>: File.</li>
         * <li><code>folder</code>: Folder.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>folder</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeUserProfilePathRulesResponseBodyDataRulesBlackPath build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserProfilePathRulesResponseBodyDataRulesBlackPath self = new DescribeUserProfilePathRulesResponseBodyDataRulesBlackPath();
            return TeaModel.build(map, self);
        }

        public DescribeUserProfilePathRulesResponseBodyDataRulesBlackPath setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeUserProfilePathRulesResponseBodyDataRulesBlackPath setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeUserProfilePathRulesResponseBodyDataRulesWhitePaths extends TeaModel {
        /**
         * <p>The exception path relative to BlackPath.Path.</p>
         * 
         * <strong>example:</strong>
         * <p>.\Microsoft\Office</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The path type. Valid values:</p>
         * <ul>
         * <li><code>file</code>: File.</li>
         * <li><code>folder</code>: Folder.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>folder</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeUserProfilePathRulesResponseBodyDataRulesWhitePaths build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserProfilePathRulesResponseBodyDataRulesWhitePaths self = new DescribeUserProfilePathRulesResponseBodyDataRulesWhitePaths();
            return TeaModel.build(map, self);
        }

        public DescribeUserProfilePathRulesResponseBodyDataRulesWhitePaths setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeUserProfilePathRulesResponseBodyDataRulesWhitePaths setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeUserProfilePathRulesResponseBodyDataRules extends TeaModel {
        /**
         * <p>The file or directory excluded from user profile roaming.</p>
         */
        @NameInMap("BlackPath")
        public DescribeUserProfilePathRulesResponseBodyDataRulesBlackPath blackPath;

        /**
         * <p>The list of files or directories that still participate in user profile roaming under the excluded directories.</p>
         */
        @NameInMap("WhitePaths")
        public java.util.List<DescribeUserProfilePathRulesResponseBodyDataRulesWhitePaths> whitePaths;

        public static DescribeUserProfilePathRulesResponseBodyDataRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserProfilePathRulesResponseBodyDataRules self = new DescribeUserProfilePathRulesResponseBodyDataRules();
            return TeaModel.build(map, self);
        }

        public DescribeUserProfilePathRulesResponseBodyDataRules setBlackPath(DescribeUserProfilePathRulesResponseBodyDataRulesBlackPath blackPath) {
            this.blackPath = blackPath;
            return this;
        }
        public DescribeUserProfilePathRulesResponseBodyDataRulesBlackPath getBlackPath() {
            return this.blackPath;
        }

        public DescribeUserProfilePathRulesResponseBodyDataRules setWhitePaths(java.util.List<DescribeUserProfilePathRulesResponseBodyDataRulesWhitePaths> whitePaths) {
            this.whitePaths = whitePaths;
            return this;
        }
        public java.util.List<DescribeUserProfilePathRulesResponseBodyDataRulesWhitePaths> getWhitePaths() {
            return this.whitePaths;
        }

    }

    public static class DescribeUserProfilePathRulesResponseBodyData extends TeaModel {
        /**
         * <p>The app instance group ID corresponding to the rule. When querying set rules, this is the primary app instance group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-0bi83v****</p>
         */
        @NameInMap("AppInstanceGroupId")
        public String appInstanceGroupId;

        /**
         * <p>The app instance group set ID corresponding to the rule. This is returned when querying set rules.</p>
         * 
         * <strong>example:</strong>
         * <p>set-3jm9d0abc00example</p>
         */
        @NameInMap("AppInstanceGroupSetId")
        public String appInstanceGroupSetId;

        /**
         * <p>The user profile roaming storage domain ID bound to the app instance group. This field may be omitted if no domain is bound.</p>
         * 
         * <strong>example:</strong>
         * <p>domain-existing</p>
         */
        @NameInMap("DomainId")
        public String domainId;

        /**
         * <p>Not enabled. The current query result does not provide the file system ID. The example is used to illustrate the field status.</p>
         * 
         * <strong>example:</strong>
         * <p>Not applicable (not enabled)</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <p>The user profile roaming switch. A value of <code>true</code> indicates that the feature is enabled, and a value of <code>false</code> indicates that the feature is disabled.</p>
         */
        @NameInMap("ProfileFollowSwitch")
        public Boolean profileFollowSwitch;

        /**
         * <p>The remote storage path for user profile roaming. If this path is not separately configured for the app instance group, the app instance group ID is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-0bi83v****</p>
         */
        @NameInMap("RemoteStoragePath")
        public String remoteStoragePath;

        /**
         * <p>The path rule type. Valid values:</p>
         * <ul>
         * <li><code>Default</code>: Queries system default rules. Both target IDs can be omitted.</li>
         * <li><code>AppInstanceGroup</code>: Queries the rules of an app instance group or an app instance group set.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AppInstanceGroup</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        /**
         * <p>The list of user profile roaming path rules.</p>
         */
        @NameInMap("Rules")
        public java.util.List<DescribeUserProfilePathRulesResponseBodyDataRules> rules;

        /**
         * <p>The storage quota for user profile roaming, in GB. This field may be omitted if it is not configured.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("UserProfileSize")
        public Long userProfileSize;

        /**
         * <p>The user profile roaming switch. The value is the same as ProfileFollowSwitch. A value of <code>true</code> indicates that the feature is enabled, and a value of <code>false</code> indicates that the feature is disabled.</p>
         */
        @NameInMap("UserProfileSwitch")
        public Boolean userProfileSwitch;

        public static DescribeUserProfilePathRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserProfilePathRulesResponseBodyData self = new DescribeUserProfilePathRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeUserProfilePathRulesResponseBodyData setAppInstanceGroupId(String appInstanceGroupId) {
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        public DescribeUserProfilePathRulesResponseBodyData setAppInstanceGroupSetId(String appInstanceGroupSetId) {
            this.appInstanceGroupSetId = appInstanceGroupSetId;
            return this;
        }
        public String getAppInstanceGroupSetId() {
            return this.appInstanceGroupSetId;
        }

        public DescribeUserProfilePathRulesResponseBodyData setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

        public DescribeUserProfilePathRulesResponseBodyData setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public DescribeUserProfilePathRulesResponseBodyData setProfileFollowSwitch(Boolean profileFollowSwitch) {
            this.profileFollowSwitch = profileFollowSwitch;
            return this;
        }
        public Boolean getProfileFollowSwitch() {
            return this.profileFollowSwitch;
        }

        public DescribeUserProfilePathRulesResponseBodyData setRemoteStoragePath(String remoteStoragePath) {
            this.remoteStoragePath = remoteStoragePath;
            return this;
        }
        public String getRemoteStoragePath() {
            return this.remoteStoragePath;
        }

        public DescribeUserProfilePathRulesResponseBodyData setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public DescribeUserProfilePathRulesResponseBodyData setRules(java.util.List<DescribeUserProfilePathRulesResponseBodyDataRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<DescribeUserProfilePathRulesResponseBodyDataRules> getRules() {
            return this.rules;
        }

        public DescribeUserProfilePathRulesResponseBodyData setUserProfileSize(Long userProfileSize) {
            this.userProfileSize = userProfileSize;
            return this;
        }
        public Long getUserProfileSize() {
            return this.userProfileSize;
        }

        public DescribeUserProfilePathRulesResponseBodyData setUserProfileSwitch(Boolean userProfileSwitch) {
            this.userProfileSwitch = userProfileSwitch;
            return this;
        }
        public Boolean getUserProfileSwitch() {
            return this.userProfileSwitch;
        }

    }

}
