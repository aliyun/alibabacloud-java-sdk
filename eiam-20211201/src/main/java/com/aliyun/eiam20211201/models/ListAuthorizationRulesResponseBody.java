// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListAuthorizationRulesResponseBody extends TeaModel {
    /**
     * <p>The list of authorization rules.</p>
     */
    @NameInMap("AuthorizationRules")
    public java.util.List<ListAuthorizationRulesResponseBodyAuthorizationRules> authorizationRules;

    /**
     * <p>The maximum number of entries per page for paging in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token returned in the current response for querying the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListAuthorizationRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizationRulesResponseBody self = new ListAuthorizationRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuthorizationRulesResponseBody setAuthorizationRules(java.util.List<ListAuthorizationRulesResponseBodyAuthorizationRules> authorizationRules) {
        this.authorizationRules = authorizationRules;
        return this;
    }
    public java.util.List<ListAuthorizationRulesResponseBodyAuthorizationRules> getAuthorizationRules() {
        return this.authorizationRules;
    }

    public ListAuthorizationRulesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAuthorizationRulesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAuthorizationRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAuthorizationRulesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAuthorizationRulesResponseBodyAuthorizationRules extends TeaModel {
        /**
         * <p>The scope of authorized resources. Valid values:</p>
         * <ul>
         * <li>custom: Resources within the specified project scope.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("AuthorizationResourceScope")
        public String authorizationResourceScope;

        /**
         * <p>The creation type of the authorization rule. Valid values:</p>
         * <ul>
         * <li>system_init: Created by the system.</li>
         * <li>user_custom: Created by a user.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>user_custom</p>
         */
        @NameInMap("AuthorizationRuleCreationType")
        public String authorizationRuleCreationType;

        /**
         * <p>The ID of the authorization rule.</p>
         * 
         * <strong>example:</strong>
         * <p>arrule_01kf143ug06fg7m9f43u7vahxxxx</p>
         */
        @NameInMap("AuthorizationRuleId")
        public String authorizationRuleId;

        /**
         * <p>The name of the authorization rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test-name</p>
         */
        @NameInMap("AuthorizationRuleName")
        public String authorizationRuleName;

        /**
         * <p>The scenario label of the authorization rule. Valid values:</p>
         * <ul>
         * <li>privileged_cloud_account: Privileged cloud account scenario.</li>
         * <li>asset: Asset scenario.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>privileged_cloud_account</p>
         */
        @NameInMap("AuthorizationRuleScenarioLabel")
        public String authorizationRuleScenarioLabel;

        /**
         * <p>The ID of the subject associated with the authorization rule.</p>
         * 
         * <strong>example:</strong>
         * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
         */
        @NameInMap("AuthorizationRuleSubjectId")
        public String authorizationRuleSubjectId;

        /**
         * <p>The subject scope of the authorization rule. Valid values:</p>
         * <ul>
         * <li>shared: Shared. A single rule can be used by multiple subjects that meet the rule constraints.</li>
         * <li>exclusive: Exclusive. A single rule can only be used by the specified subject.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>shared</p>
         */
        @NameInMap("AuthorizationRuleSubjectScope")
        public String authorizationRuleSubjectScope;

        /**
         * <p>The subject type applicable to the authorization rule. For an exclusive rule, this field indicates the type of the specified subject. For a shared rule with a specified subject type, this field indicates the subject types that the rule can be associated with. Valid values:</p>
         * <ul>
         * <li>application: Application.</li>
         * <li>user: Account. For a shared privileged cloud account rule, this value indicates the human user type and can be associated with accounts, user groups, and organizational units.<blockquote>
         * <p>If the subject type is not specified for the rule, this field may be empty. The actual subjects associated with a shared rule are subject to the query results of subject associations.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("AuthorizationRuleSubjectType")
        public String authorizationRuleSubjectType;

        /**
         * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1652085686179</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the authorization rule.</p>
         * 
         * <strong>example:</strong>
         * <p>this is a test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the project associated with the authorization rule.</p>
         * 
         * <strong>example:</strong>
         * <p>iprj_system_default</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>The status of the authorization rule. Valid values:</p>
         * <ul>
         * <li>enabled: The rule is enabled.</li>
         * <li>disabled: The rule is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The last update time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1652085686179</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListAuthorizationRulesResponseBodyAuthorizationRules build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizationRulesResponseBodyAuthorizationRules self = new ListAuthorizationRulesResponseBodyAuthorizationRules();
            return TeaModel.build(map, self);
        }

        public ListAuthorizationRulesResponseBodyAuthorizationRules setAuthorizationResourceScope(String authorizationResourceScope) {
            this.authorizationResourceScope = authorizationResourceScope;
            return this;
        }
        public String getAuthorizationResourceScope() {
            return this.authorizationResourceScope;
        }

        public ListAuthorizationRulesResponseBodyAuthorizationRules setAuthorizationRuleCreationType(String authorizationRuleCreationType) {
            this.authorizationRuleCreationType = authorizationRuleCreationType;
            return this;
        }
        public String getAuthorizationRuleCreationType() {
            return this.authorizationRuleCreationType;
        }

        public ListAuthorizationRulesResponseBodyAuthorizationRules setAuthorizationRuleId(String authorizationRuleId) {
            this.authorizationRuleId = authorizationRuleId;
            return this;
        }
        public String getAuthorizationRuleId() {
            return this.authorizationRuleId;
        }

        public ListAuthorizationRulesResponseBodyAuthorizationRules setAuthorizationRuleName(String authorizationRuleName) {
            this.authorizationRuleName = authorizationRuleName;
            return this;
        }
        public String getAuthorizationRuleName() {
            return this.authorizationRuleName;
        }

        public ListAuthorizationRulesResponseBodyAuthorizationRules setAuthorizationRuleScenarioLabel(String authorizationRuleScenarioLabel) {
            this.authorizationRuleScenarioLabel = authorizationRuleScenarioLabel;
            return this;
        }
        public String getAuthorizationRuleScenarioLabel() {
            return this.authorizationRuleScenarioLabel;
        }

        public ListAuthorizationRulesResponseBodyAuthorizationRules setAuthorizationRuleSubjectId(String authorizationRuleSubjectId) {
            this.authorizationRuleSubjectId = authorizationRuleSubjectId;
            return this;
        }
        public String getAuthorizationRuleSubjectId() {
            return this.authorizationRuleSubjectId;
        }

        public ListAuthorizationRulesResponseBodyAuthorizationRules setAuthorizationRuleSubjectScope(String authorizationRuleSubjectScope) {
            this.authorizationRuleSubjectScope = authorizationRuleSubjectScope;
            return this;
        }
        public String getAuthorizationRuleSubjectScope() {
            return this.authorizationRuleSubjectScope;
        }

        public ListAuthorizationRulesResponseBodyAuthorizationRules setAuthorizationRuleSubjectType(String authorizationRuleSubjectType) {
            this.authorizationRuleSubjectType = authorizationRuleSubjectType;
            return this;
        }
        public String getAuthorizationRuleSubjectType() {
            return this.authorizationRuleSubjectType;
        }

        public ListAuthorizationRulesResponseBodyAuthorizationRules setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListAuthorizationRulesResponseBodyAuthorizationRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAuthorizationRulesResponseBodyAuthorizationRules setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAuthorizationRulesResponseBodyAuthorizationRules setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListAuthorizationRulesResponseBodyAuthorizationRules setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAuthorizationRulesResponseBodyAuthorizationRules setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
