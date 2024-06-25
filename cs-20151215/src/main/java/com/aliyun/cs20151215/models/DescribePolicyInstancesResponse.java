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
         * <p>The UID of the Alibaba Cloud account that is used to deploy the policy instance.</p>
         * 
         * <strong>example:</strong>
         * <p>16298168****</p>
         */
        @NameInMap("ali_uid")
        public String aliUid;

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>c8155823d057948c69a****</p>
         */
        @NameInMap("cluster_id")
        public String clusterId;

        /**
         * <p>The name of the policy instance.</p>
         * 
         * <strong>example:</strong>
         * <p>no-env-var-secrets-****</p>
         */
        @NameInMap("instance_name")
        public String instanceName;

        /**
         * <p>The name of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>ACKPSPCapabilities</p>
         */
        @NameInMap("policy_name")
        public String policyName;

        /**
         * <p>The type of policy.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s-general</p>
         */
        @NameInMap("policy_category")
        public String policyCategory;

        /**
         * <p>The description of the policy template.</p>
         * 
         * <strong>example:</strong>
         * <p>Restricts secrets used in pod envs</p>
         */
        @NameInMap("policy_description")
        public String policyDescription;

        /**
         * <p>The parameters of the policy instance.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;restrictedNamespaces&quot;: [ &quot;test&quot; ]</p>
         */
        @NameInMap("policy_parameters")
        public String policyParameters;

        /**
         * <p>The severity level of the policy instance.</p>
         * 
         * <strong>example:</strong>
         * <p>low</p>
         */
        @NameInMap("policy_severity")
        public String policySeverity;

        /**
         * <p>The applicable scope of the policy instance.</p>
         * <p>A value of \* indicates all namespaces in the cluster. This is the default value.</p>
         * <p>Multiple namespaces are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("policy_scope")
        public String policyScope;

        /**
         * <p>The action of the policy. Valid values:</p>
         * <ul>
         * <li><code>deny</code>: Deployments that match the policy are denied.</li>
         * <li><code>warn</code>: Alerts are generated for deployments that match the policy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>deny</p>
         */
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
