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
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token returned by this call. Use it in the next call to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries in the list.</p>
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
         * <p>The scope of resources to authorize. Valid values:</p>
         * <ul>
         * <li><p>global: global resources in the project</p>
         * </li>
         * <li><p>custom: resources in a specific project</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        @NameInMap("AuthorizationResourceScope")
        public String authorizationResourceScope;

        /**
         * <p>The type of authorization rule creation. Valid values:</p>
         * <ul>
         * <li><p>system_init: created by the system</p>
         * </li>
         * <li><p>user_custom: created by a user</p>
         * </li>
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
         * <p>The ID of the subject associated with the authorization rule.</p>
         * 
         * <strong>example:</strong>
         * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
         */
        @NameInMap("AuthorizationRuleSubjectId")
        public String authorizationRuleSubjectId;

        /**
         * <p>The scope of subjects for the authorization rule. Valid values:</p>
         * <ul>
         * <li><p>shared: applies to all subjects, such as accounts and applications</p>
         * </li>
         * <li><p>exclusive: applies only to a specific subject</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>shared</p>
         */
        @NameInMap("AuthorizationRuleSubjectScope")
        public String authorizationRuleSubjectScope;

        /**
         * <p>The type of subject associated with the authorization rule. This parameter takes effect only when AuthorizationRuleSubjectScope is exclusive. Valid values:</p>
         * <ul>
         * <li><p>application</p>
         * </li>
         * <li><p>user</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("AuthorizationRuleSubjectType")
        public String authorizationRuleSubjectType;

        /**
         * <p>The time when the authorization rule was created, in Unix timestamp format. Unit: milliseconds.</p>
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
         * <p>The ID of the instance.</p>
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
         * <li><p>enabled</p>
         * </li>
         * <li><p>disabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the authorization rule was last updated, in Unix timestamp format. Unit: milliseconds.</p>
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
