// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribePolicyInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
        /**
         * <p>策略实例实施者UID。</p>
         * 
         * <strong>example:</strong>
         * <p>16298168****</p>
         */
        @NameInMap("ali_uid")
        public String aliUid;

        /**
         * <p>目标集群ID。</p>
         * 
         * <strong>example:</strong>
         * <p>c8155823d057948c69a****</p>
         */
        @NameInMap("cluster_id")
        public String clusterId;

        /**
         * <p>规则实例名称。</p>
         * 
         * <strong>example:</strong>
         * <p>no-env-var-secrets-****</p>
         */
        @NameInMap("instance_name")
        public String instanceName;

        /**
         * <p>策略治理规则名称。</p>
         * 
         * <strong>example:</strong>
         * <p>ACKPSPCapabilities</p>
         */
        @NameInMap("policy_name")
        public String policyName;

        /**
         * <p>策略类型名称。</p>
         * 
         * <strong>example:</strong>
         * <p>k8s-general</p>
         */
        @NameInMap("policy_category")
        public String policyCategory;

        /**
         * <p>规则模板描述。</p>
         * 
         * <strong>example:</strong>
         * <p>Restricts secrets used in pod envs</p>
         */
        @NameInMap("policy_description")
        public String policyDescription;

        /**
         * <p>当前规则实例的配置参数。</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;restrictedNamespaces&quot;: [ &quot;test&quot; ]</p>
         */
        @NameInMap("policy_parameters")
        public String policyParameters;

        /**
         * <p>规则实例治理等级。</p>
         * 
         * <strong>example:</strong>
         * <p>low</p>
         */
        @NameInMap("policy_severity")
        public String policySeverity;

        /**
         * <p>策略实例实施范围：</p>
         * <p>默认&quot;*&quot;代表集群所有命名空间。</p>
         * <p>否则返回作用Namespaces名称，多个Namespaces以逗号（,）分隔。</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("policy_scope")
        public String policyScope;

        /**
         * <p>规则治理动作，取值：</p>
         * <ul>
         * <li><p><code>deny</code>：拦截违规部署。</p>
         * </li>
         * <li><p><code>warn</code>：告警。</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>deny</p>
         */
        @NameInMap("policy_action")
        public String policyAction;

        /**
         * <p>创建时间（已废弃，请勿使用）。</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-29T18:09:12+08:00</p>
         */
        @NameInMap("Created")
        @Deprecated
        public String created;

        /**
         * <p>更新时间（已废弃，请勿使用）。</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-29T18:09:12+08:00</p>
         */
        @NameInMap("Updated")
        @Deprecated
        public String updated;

        /**
         * <p>资源ID（已废弃，请勿使用）。</p>
         * 
         * <strong>example:</strong>
         * <p>123456***</p>
         */
        @NameInMap("resource_id")
        @Deprecated
        public String resourceId;

        /**
         * <p>集群中处理违规计数（已废弃，请勿使用）。</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("total_violations")
        @Deprecated
        public Long totalViolations;

        /**
         * <p>删除状态（已废弃，请勿使用）。</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("is_deleted")
        @Deprecated
        public Long isDeleted;

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

        @Deprecated
        public DescribePolicyInstancesResponseBody setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        @Deprecated
        public DescribePolicyInstancesResponseBody setUpdated(String updated) {
            this.updated = updated;
            return this;
        }
        public String getUpdated() {
            return this.updated;
        }

        @Deprecated
        public DescribePolicyInstancesResponseBody setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        @Deprecated
        public DescribePolicyInstancesResponseBody setTotalViolations(Long totalViolations) {
            this.totalViolations = totalViolations;
            return this;
        }
        public Long getTotalViolations() {
            return this.totalViolations;
        }

        @Deprecated
        public DescribePolicyInstancesResponseBody setIsDeleted(Long isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Long getIsDeleted() {
            return this.isDeleted;
        }

    }

}
