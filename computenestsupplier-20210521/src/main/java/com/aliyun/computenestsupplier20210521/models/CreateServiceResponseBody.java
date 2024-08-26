// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class CreateServiceResponseBody extends TeaModel {
    @NameInMap("DryRunResult")
    public CreateServiceResponseBodyDryRunResult dryRunResult;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4DB0F536-B3BE-4F0D-BD29-E83FB56D550C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The service ID.</p>
     * 
     * <strong>example:</strong>
     * <p>service-0e6fca6a51a544xxxxxx</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The status of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>Created</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The service version.</p>
     * 
     * <strong>example:</strong>
     * <p>draft</p>
     */
    @NameInMap("Version")
    public String version;

    public static CreateServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceResponseBody self = new CreateServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServiceResponseBody setDryRunResult(CreateServiceResponseBodyDryRunResult dryRunResult) {
        this.dryRunResult = dryRunResult;
        return this;
    }
    public CreateServiceResponseBodyDryRunResult getDryRunResult() {
        return this.dryRunResult;
    }

    public CreateServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateServiceResponseBody setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public CreateServiceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateServiceResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class CreateServiceResponseBodyDryRunResultRolePolicyMissingPolicy extends TeaModel {
        @NameInMap("Action")
        public java.util.List<String> action;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("ServiceName")
        public String serviceName;

        public static CreateServiceResponseBodyDryRunResultRolePolicyMissingPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceResponseBodyDryRunResultRolePolicyMissingPolicy self = new CreateServiceResponseBodyDryRunResultRolePolicyMissingPolicy();
            return TeaModel.build(map, self);
        }

        public CreateServiceResponseBodyDryRunResultRolePolicyMissingPolicy setAction(java.util.List<String> action) {
            this.action = action;
            return this;
        }
        public java.util.List<String> getAction() {
            return this.action;
        }

        public CreateServiceResponseBodyDryRunResultRolePolicyMissingPolicy setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public CreateServiceResponseBodyDryRunResultRolePolicyMissingPolicy setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class CreateServiceResponseBodyDryRunResultRolePolicy extends TeaModel {
        @NameInMap("MissingPolicy")
        public java.util.List<CreateServiceResponseBodyDryRunResultRolePolicyMissingPolicy> missingPolicy;

        @NameInMap("Policy")
        public String policy;

        public static CreateServiceResponseBodyDryRunResultRolePolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceResponseBodyDryRunResultRolePolicy self = new CreateServiceResponseBodyDryRunResultRolePolicy();
            return TeaModel.build(map, self);
        }

        public CreateServiceResponseBodyDryRunResultRolePolicy setMissingPolicy(java.util.List<CreateServiceResponseBodyDryRunResultRolePolicyMissingPolicy> missingPolicy) {
            this.missingPolicy = missingPolicy;
            return this;
        }
        public java.util.List<CreateServiceResponseBodyDryRunResultRolePolicyMissingPolicy> getMissingPolicy() {
            return this.missingPolicy;
        }

        public CreateServiceResponseBodyDryRunResultRolePolicy setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

    }

    public static class CreateServiceResponseBodyDryRunResult extends TeaModel {
        @NameInMap("RolePolicy")
        public CreateServiceResponseBodyDryRunResultRolePolicy rolePolicy;

        public static CreateServiceResponseBodyDryRunResult build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceResponseBodyDryRunResult self = new CreateServiceResponseBodyDryRunResult();
            return TeaModel.build(map, self);
        }

        public CreateServiceResponseBodyDryRunResult setRolePolicy(CreateServiceResponseBodyDryRunResultRolePolicy rolePolicy) {
            this.rolePolicy = rolePolicy;
            return this;
        }
        public CreateServiceResponseBodyDryRunResultRolePolicy getRolePolicy() {
            return this.rolePolicy;
        }

    }

}
