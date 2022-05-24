// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribePolicyInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public java.util.List<DescribePolicyInstancesResponseBody> body;

    public static DescribePolicyInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyInstancesResponse self = new DescribePolicyInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribePolicyInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePolicyInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePolicyInstancesResponse setBody(java.util.List<DescribePolicyInstancesResponseBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<DescribePolicyInstancesResponseBody> getBody() {
        return this.body;
    }

    public static class DescribePolicyInstancesResponseBody extends TeaModel {
        // 策略实例实施者UID
        @NameInMap("ali_uid")
        public String aliUid;

        // 目标集群ID
        @NameInMap("cluster_id")
        public String clusterId;

        // 规则实例名称
        @NameInMap("instance_name")
        public String instanceName;

        // 策略治理规则名称
        @NameInMap("policy_name")
        public String policyName;

        // 策略类型名称
        @NameInMap("policy_category")
        public String policyCategory;

        // 规则模板描述
        @NameInMap("policy_description")
        public String policyDescription;

        // 当前规则实例的配置参数
        @NameInMap("policy_parameters")
        public String policyParameters;

        // 规则实例治理等级
        @NameInMap("policy_severity")
        public String policySeverity;

        // 策略实例实施范围： 默认"*"代表集群所有ns 否则返回作用namespaces名称，多个namespaces以逗号分隔
        @NameInMap("policy_scope")
        public String policyScope;

        // 规则治理动作  deny: 拦截违规部署  warn：告警
        @NameInMap("policy_action")
        public String policyAction;

        public static DescribePolicyInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyInstancesResponseBody self = new DescribePolicyInstancesResponseBody();
            return TeaModel.build(map, self);
        }

        public DescribePolicyInstancesResponseBody setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public DescribePolicyInstancesResponseBody setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribePolicyInstancesResponseBody setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribePolicyInstancesResponseBody setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public DescribePolicyInstancesResponseBody setPolicyCategory(String policyCategory) {
            this.policyCategory = policyCategory;
            return this;
        }
        public String getPolicyCategory() {
            return this.policyCategory;
        }

        public DescribePolicyInstancesResponseBody setPolicyDescription(String policyDescription) {
            this.policyDescription = policyDescription;
            return this;
        }
        public String getPolicyDescription() {
            return this.policyDescription;
        }

        public DescribePolicyInstancesResponseBody setPolicyParameters(String policyParameters) {
            this.policyParameters = policyParameters;
            return this;
        }
        public String getPolicyParameters() {
            return this.policyParameters;
        }

        public DescribePolicyInstancesResponseBody setPolicySeverity(String policySeverity) {
            this.policySeverity = policySeverity;
            return this;
        }
        public String getPolicySeverity() {
            return this.policySeverity;
        }

        public DescribePolicyInstancesResponseBody setPolicyScope(String policyScope) {
            this.policyScope = policyScope;
            return this;
        }
        public String getPolicyScope() {
            return this.policyScope;
        }

        public DescribePolicyInstancesResponseBody setPolicyAction(String policyAction) {
            this.policyAction = policyAction;
            return this;
        }
        public String getPolicyAction() {
            return this.policyAction;
        }

    }

}
