// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpdateServiceResponseBody extends TeaModel {
    @NameInMap("DryRunResult")
    public UpdateServiceResponseBodyDryRunResult dryRunResult;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceResponseBody self = new UpdateServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateServiceResponseBody setDryRunResult(UpdateServiceResponseBodyDryRunResult dryRunResult) {
        this.dryRunResult = dryRunResult;
        return this;
    }
    public UpdateServiceResponseBodyDryRunResult getDryRunResult() {
        return this.dryRunResult;
    }

    public UpdateServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateServiceResponseBodyDryRunResultRolePolicyMissingPolicy extends TeaModel {
        @NameInMap("Action")
        public java.util.List<String> action;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("ServiceName")
        public String serviceName;

        public static UpdateServiceResponseBodyDryRunResultRolePolicyMissingPolicy build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceResponseBodyDryRunResultRolePolicyMissingPolicy self = new UpdateServiceResponseBodyDryRunResultRolePolicyMissingPolicy();
            return TeaModel.build(map, self);
        }

        public UpdateServiceResponseBodyDryRunResultRolePolicyMissingPolicy setAction(java.util.List<String> action) {
            this.action = action;
            return this;
        }
        public java.util.List<String> getAction() {
            return this.action;
        }

        public UpdateServiceResponseBodyDryRunResultRolePolicyMissingPolicy setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public UpdateServiceResponseBodyDryRunResultRolePolicyMissingPolicy setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class UpdateServiceResponseBodyDryRunResultRolePolicy extends TeaModel {
        @NameInMap("MissingPolicy")
        public java.util.List<UpdateServiceResponseBodyDryRunResultRolePolicyMissingPolicy> missingPolicy;

        @NameInMap("Policy")
        public String policy;

        public static UpdateServiceResponseBodyDryRunResultRolePolicy build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceResponseBodyDryRunResultRolePolicy self = new UpdateServiceResponseBodyDryRunResultRolePolicy();
            return TeaModel.build(map, self);
        }

        public UpdateServiceResponseBodyDryRunResultRolePolicy setMissingPolicy(java.util.List<UpdateServiceResponseBodyDryRunResultRolePolicyMissingPolicy> missingPolicy) {
            this.missingPolicy = missingPolicy;
            return this;
        }
        public java.util.List<UpdateServiceResponseBodyDryRunResultRolePolicyMissingPolicy> getMissingPolicy() {
            return this.missingPolicy;
        }

        public UpdateServiceResponseBodyDryRunResultRolePolicy setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

    }

    public static class UpdateServiceResponseBodyDryRunResult extends TeaModel {
        @NameInMap("RolePolicy")
        public UpdateServiceResponseBodyDryRunResultRolePolicy rolePolicy;

        public static UpdateServiceResponseBodyDryRunResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceResponseBodyDryRunResult self = new UpdateServiceResponseBodyDryRunResult();
            return TeaModel.build(map, self);
        }

        public UpdateServiceResponseBodyDryRunResult setRolePolicy(UpdateServiceResponseBodyDryRunResultRolePolicy rolePolicy) {
            this.rolePolicy = rolePolicy;
            return this;
        }
        public UpdateServiceResponseBodyDryRunResultRolePolicy getRolePolicy() {
            return this.rolePolicy;
        }

    }

}
