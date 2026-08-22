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
         * <li>global: All resources under the project.</li>
         * <li>custom: Specified resources within the project scope.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>global</p>
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
         * <p>The scenario label of the authorization rule.</p>
         */
        @NameInMap("AuthorizationRuleScenarioLabel")
        public String authorizationRuleScenarioLabel;

        /**
         * <p>The subject ID associated with the authorization rule.</p>
         * 
         * <strong>example:</strong>
         * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
         */
        @NameInMap("AuthorizationRuleSubjectId")
        public String authorizationRuleSubjectId;

        /**
         * <p>The subject scope of the authorization rule. Valid values:</p>
         * <ul>
         * <li>shared: Shared type, which supports all subjects, including accounts and applications.</li>
         * <li>exclusive: Exclusive type.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>shared</p>
         */
        @NameInMap("AuthorizationRuleSubjectScope")
        public String authorizationRuleSubjectScope;

        /**
         * <p>The subject type associated with the authorization rule. This parameter is valid only when the authorization rule subject scope is exclusive. Valid values:</p>
         * <ul>
         * <li>application: Application.</li>
         * <li>user: Account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("AuthorizationRuleSubjectType")
        public String authorizationRuleSubjectType;

        /**
         * <p>The creation time, in UNIX timestamp format, measured in milliseconds.</p>
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
         * <p>The project ID associated with the authorization rule.</p>
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
         * <p>The last update time, in UNIX timestamp format, measured in milliseconds.</p>
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
