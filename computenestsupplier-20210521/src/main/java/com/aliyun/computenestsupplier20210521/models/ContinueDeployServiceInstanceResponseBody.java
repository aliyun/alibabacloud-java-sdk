// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ContinueDeployServiceInstanceResponseBody extends TeaModel {
    /**
     * <p>The dry run result.</p>
     */
    @NameInMap("DryRunResult")
    public ContinueDeployServiceInstanceResponseBodyDryRunResult dryRunResult;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>82DF27ED-E538-5AC0-A11C-39334A873189</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the service instance.</p>
     * 
     * <strong>example:</strong>
     * <p>si-d6ab3a63ccbb4b17****</p>
     */
    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    public static ContinueDeployServiceInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ContinueDeployServiceInstanceResponseBody self = new ContinueDeployServiceInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ContinueDeployServiceInstanceResponseBody setDryRunResult(ContinueDeployServiceInstanceResponseBodyDryRunResult dryRunResult) {
        this.dryRunResult = dryRunResult;
        return this;
    }
    public ContinueDeployServiceInstanceResponseBodyDryRunResult getDryRunResult() {
        return this.dryRunResult;
    }

    public ContinueDeployServiceInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ContinueDeployServiceInstanceResponseBody setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public static class ContinueDeployServiceInstanceResponseBodyDryRunResult extends TeaModel {
        /**
         * <p>The parameters that can be modified. The operation that is performed to modify the parameters does not cause a validation error.</p>
         * <blockquote>
         * <p> This parameter is returned only if DryRun is set to true.</p>
         * </blockquote>
         */
        @NameInMap("ParametersAllowedToBeModified")
        public java.util.List<String> parametersAllowedToBeModified;

        /**
         * <p>The parameters that can be modified under specific conditions. The new values of the parameters determine whether the operation that is performed to modify the parameters causes a validation error.</p>
         * <blockquote>
         * <p> This parameter is returned only if DryRun is set to true.</p>
         * </blockquote>
         */
        @NameInMap("ParametersConditionallyAllowedToBeModified")
        public java.util.List<String> parametersConditionallyAllowedToBeModified;

        /**
         * <p>The parameters that cannot be modified. The operation that is performed to modify the parameters causes a validation error.</p>
         * <blockquote>
         * <p> This parameter is returned only if DryRun is set to true.</p>
         * </blockquote>
         */
        @NameInMap("ParametersNotAllowedToBeModified")
        public java.util.List<String> parametersNotAllowedToBeModified;

        public static ContinueDeployServiceInstanceResponseBodyDryRunResult build(java.util.Map<String, ?> map) throws Exception {
            ContinueDeployServiceInstanceResponseBodyDryRunResult self = new ContinueDeployServiceInstanceResponseBodyDryRunResult();
            return TeaModel.build(map, self);
        }

        public ContinueDeployServiceInstanceResponseBodyDryRunResult setParametersAllowedToBeModified(java.util.List<String> parametersAllowedToBeModified) {
            this.parametersAllowedToBeModified = parametersAllowedToBeModified;
            return this;
        }
        public java.util.List<String> getParametersAllowedToBeModified() {
            return this.parametersAllowedToBeModified;
        }

        public ContinueDeployServiceInstanceResponseBodyDryRunResult setParametersConditionallyAllowedToBeModified(java.util.List<String> parametersConditionallyAllowedToBeModified) {
            this.parametersConditionallyAllowedToBeModified = parametersConditionallyAllowedToBeModified;
            return this;
        }
        public java.util.List<String> getParametersConditionallyAllowedToBeModified() {
            return this.parametersConditionallyAllowedToBeModified;
        }

        public ContinueDeployServiceInstanceResponseBodyDryRunResult setParametersNotAllowedToBeModified(java.util.List<String> parametersNotAllowedToBeModified) {
            this.parametersNotAllowedToBeModified = parametersNotAllowedToBeModified;
            return this;
        }
        public java.util.List<String> getParametersNotAllowedToBeModified() {
            return this.parametersNotAllowedToBeModified;
        }

    }

}
