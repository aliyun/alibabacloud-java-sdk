// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetAuthorizationRuleResponseBody extends TeaModel {
    @NameInMap("AuthorizationRule")
    public GetAuthorizationRuleResponseBodyAuthorizationRule authorizationRule;

    /**
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
         * <p>授权资源范围，枚举值：global（项目下所有资源）、custom（指定资源）。</p>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        @NameInMap("AuthorizationResourceScope")
        public String authorizationResourceScope;

        /**
         * <p>授权规则的创建类型，枚举类型：user_created（用户创建)，approval_created（审批创建)。</p>
         * 
         * <strong>example:</strong>
         * <p>user_custom</p>
         */
        @NameInMap("AuthorizationRuleCreationType")
        public String authorizationRuleCreationType;

        /**
         * <p>授权规则标识。</p>
         * 
         * <strong>example:</strong>
         * <p>arrule_01kf143ug06fg7m9f43u7vahxxxx</p>
         */
        @NameInMap("AuthorizationRuleId")
        public String authorizationRuleId;

        /**
         * <p>授权规则名称。</p>
         * 
         * <strong>example:</strong>
         * <p>test-name</p>
         */
        @NameInMap("AuthorizationRuleName")
        public String authorizationRuleName;

        /**
         * <p>授权规则主体ID，主体类型对应的主体ID。</p>
         */
        @NameInMap("AuthorizationRuleSubjectId")
        public String authorizationRuleSubjectId;

        /**
         * <p>授权规则主体范围，枚举类型：shared（共享型，即支持所有主体，包括账户、应用），exclusive（专属类型）</p>
         */
        @NameInMap("AuthorizationRuleSubjectScope")
        public String authorizationRuleSubjectScope;

        /**
         * <p>授权规则主体类型，枚举类型：application（应用)，user（账户)。</p>
         */
        @NameInMap("AuthorizationRuleSubjectType")
        public String authorizationRuleSubjectType;

        /**
         * <p>创建时间，Unix时间戳格式，单位为毫秒。</p>
         * 
         * <strong>example:</strong>
         * <p>1652085686179</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>授权规则描述，长度限制为128字符。</p>
         * 
         * <strong>example:</strong>
         * <p>this is a test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>实例ID。</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>授权规则关联的项目标识。</p>
         * 
         * <strong>example:</strong>
         * <p>iprj_system_default</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>授权规则状态，枚举值：enabled（启用）、disabled（禁用）。</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>最近一次更新时间，Unix时间戳格式，单位为毫秒。</p>
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
