// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetAuthorizationRuleResponseBody extends TeaModel {
    /**
     * <p>The authorization rule object.</p>
     */
    @NameInMap("AuthorizationRule")
    public GetAuthorizationRuleResponseBodyAuthorizationRule authorizationRule;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAuthorizationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAuthorizationRuleResponseBody self = new GetAuthorizationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAuthorizationRuleResponseBody setAuthorizationRule(GetAuthorizationRuleResponseBodyAuthorizationRule authorizationRule) {
        this.authorizationRule = authorizationRule;
        return this;
    }
    public GetAuthorizationRuleResponseBodyAuthorizationRule getAuthorizationRule() {
        return this.authorizationRule;
    }

    public GetAuthorizationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAuthorizationRuleResponseBodyAuthorizationRule extends TeaModel {
        /**
         * <p>The authorization resource scope. Valid values:</p>
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
         * <li>user_custom: Created by the user.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>user_custom</p>
         */
        @NameInMap("AuthorizationRuleCreationType")
        public String authorizationRuleCreationType;

        /**
         * <p>The authorization rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>arrule_01kf143ug06fg7m9f43u7vahxxxx</p>
         */
        @NameInMap("AuthorizationRuleId")
        public String authorizationRuleId;

        /**
         * <p>The authorization rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-name</p>
         */
        @NameInMap("AuthorizationRuleName")
        public String authorizationRuleName;

        /**
         * <p>The scenario label of the authorization rule. Valid values:</p>
         * <ul>
         * <li>privileged_cloud_account (Privileged cloud account scenario)</li>
         * <li>asset (Asset scenario)</li>
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
         * <p>The subject category to which the authorization rule applies. For an exclusive rule, this field indicates the type of the specified subject. For a shared rule with a configured subject category, this field indicates the subject category that the rule allows to be associated with. Valid values:</p>
         * <ul>
         * <li>application: Application.</li>
         * <li>user: Account. For a shared privileged cloud account rule, this value indicates the human user category, which can be associated with accounts, user groups, and organizations.
         * If no subject category is configured for the rule, this field may be empty. The actual subjects associated with a shared rule are determined by the subject association query results.</li>
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
         * <p>The authorization rule status. Valid values:</p>
         * <ul>
         * <li>enabled: Enabled.</li>
         * <li>disabled: Disabled.</li>
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

        public static GetAuthorizationRuleResponseBodyAuthorizationRule build(java.util.Map<String, ?> map) throws Exception {
            GetAuthorizationRuleResponseBodyAuthorizationRule self = new GetAuthorizationRuleResponseBodyAuthorizationRule();
            return TeaModel.build(map, self);
        }

        public GetAuthorizationRuleResponseBodyAuthorizationRule setAuthorizationResourceScope(String authorizationResourceScope) {
            this.authorizationResourceScope = authorizationResourceScope;
            return this;
        }
        public String getAuthorizationResourceScope() {
            return this.authorizationResourceScope;
        }

        public GetAuthorizationRuleResponseBodyAuthorizationRule setAuthorizationRuleCreationType(String authorizationRuleCreationType) {
            this.authorizationRuleCreationType = authorizationRuleCreationType;
            return this;
        }
        public String getAuthorizationRuleCreationType() {
            return this.authorizationRuleCreationType;
        }

        public GetAuthorizationRuleResponseBodyAuthorizationRule setAuthorizationRuleId(String authorizationRuleId) {
            this.authorizationRuleId = authorizationRuleId;
            return this;
        }
        public String getAuthorizationRuleId() {
            return this.authorizationRuleId;
        }

        public GetAuthorizationRuleResponseBodyAuthorizationRule setAuthorizationRuleName(String authorizationRuleName) {
            this.authorizationRuleName = authorizationRuleName;
            return this;
        }
        public String getAuthorizationRuleName() {
            return this.authorizationRuleName;
        }

        public GetAuthorizationRuleResponseBodyAuthorizationRule setAuthorizationRuleScenarioLabel(String authorizationRuleScenarioLabel) {
            this.authorizationRuleScenarioLabel = authorizationRuleScenarioLabel;
            return this;
        }
        public String getAuthorizationRuleScenarioLabel() {
            return this.authorizationRuleScenarioLabel;
        }

        public GetAuthorizationRuleResponseBodyAuthorizationRule setAuthorizationRuleSubjectId(String authorizationRuleSubjectId) {
            this.authorizationRuleSubjectId = authorizationRuleSubjectId;
            return this;
        }
        public String getAuthorizationRuleSubjectId() {
            return this.authorizationRuleSubjectId;
        }

        public GetAuthorizationRuleResponseBodyAuthorizationRule setAuthorizationRuleSubjectScope(String authorizationRuleSubjectScope) {
            this.authorizationRuleSubjectScope = authorizationRuleSubjectScope;
            return this;
        }
        public String getAuthorizationRuleSubjectScope() {
            return this.authorizationRuleSubjectScope;
        }

        public GetAuthorizationRuleResponseBodyAuthorizationRule setAuthorizationRuleSubjectType(String authorizationRuleSubjectType) {
            this.authorizationRuleSubjectType = authorizationRuleSubjectType;
            return this;
        }
        public String getAuthorizationRuleSubjectType() {
            return this.authorizationRuleSubjectType;
        }

        public GetAuthorizationRuleResponseBodyAuthorizationRule setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetAuthorizationRuleResponseBodyAuthorizationRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAuthorizationRuleResponseBodyAuthorizationRule setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetAuthorizationRuleResponseBodyAuthorizationRule setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public GetAuthorizationRuleResponseBodyAuthorizationRule setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAuthorizationRuleResponseBodyAuthorizationRule setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
