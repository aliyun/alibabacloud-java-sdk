// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetAuthorizationRuleResponseBody extends TeaModel {
    /**
     * <p>Authorization rule object.</p>
     */
    @NameInMap("AuthorizationRule")
    public GetAuthorizationRuleResponseBodyAuthorizationRule authorizationRule;

    /**
     * <p>Request ID.</p>
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
         * <p>Authorization resource scope. Valid values:</p>
         * <ul>
         * <li><p>global: Global resources under the project</p>
         * </li>
         * <li><p>custom: Resources within the specified project scope</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        @NameInMap("AuthorizationResourceScope")
        public String authorizationResourceScope;

        /**
         * <p>Authorization rule creation type. Valid values:</p>
         * <ul>
         * <li><p>system_init: System created</p>
         * </li>
         * <li><p>user_custom: User created</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>user_custom</p>
         */
        @NameInMap("AuthorizationRuleCreationType")
        public String authorizationRuleCreationType;

        /**
         * <p>Authorization rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>arrule_01kf143ug06fg7m9f43u7vahxxxx</p>
         */
        @NameInMap("AuthorizationRuleId")
        public String authorizationRuleId;

        /**
         * <p>Authorization rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-name</p>
         */
        @NameInMap("AuthorizationRuleName")
        public String authorizationRuleName;

        /**
         * <p>Subject ID associated with the authorization rule.</p>
         * 
         * <strong>example:</strong>
         * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
         */
        @NameInMap("AuthorizationRuleSubjectId")
        public String authorizationRuleSubjectId;

        /**
         * <p>Authorization rule subject scope. Valid values:</p>
         * <ul>
         * <li><p>shared: Shared type, supports all subjects, including accounts and applications</p>
         * </li>
         * <li><p>exclusive: Exclusive type</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>shared</p>
         */
        @NameInMap("AuthorizationRuleSubjectScope")
        public String authorizationRuleSubjectScope;

        /**
         * <p>Subject type associated with the authorization rule. Valid when the authorization rule subject scope is exclusive. Valid values:</p>
         * <ul>
         * <li><p>application: Application</p>
         * </li>
         * <li><p>user: Account</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("AuthorizationRuleSubjectType")
        public String authorizationRuleSubjectType;

        /**
         * <p>Creation time, in UNIX timestamp format, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1652085686179</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Authorization rule description.</p>
         * 
         * <strong>example:</strong>
         * <p>this is a test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Project ID associated with the authorization rule.</p>
         * 
         * <strong>example:</strong>
         * <p>iprj_system_default</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>Authorization rule status. Valid values:</p>
         * <ul>
         * <li><p>enabled: Enabled</p>
         * </li>
         * <li><p>disabled: Disabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Last update time, in UNIX timestamp format, in milliseconds.</p>
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
