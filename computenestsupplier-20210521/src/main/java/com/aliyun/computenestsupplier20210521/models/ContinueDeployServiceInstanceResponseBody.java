// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ContinueDeployServiceInstanceResponseBody extends TeaModel {
    @NameInMap("DryRunResult")
    public ContinueDeployServiceInstanceResponseBodyDryRunResult dryRunResult;

    /**
     * <strong>example:</strong>
     * <p>82DF27ED-E538-5AC0-A11C-39334A873189</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
        @NameInMap("ParametersAllowedToBeModified")
        public java.util.List<String> parametersAllowedToBeModified;

        @NameInMap("ParametersConditionallyAllowedToBeModified")
        public java.util.List<String> parametersConditionallyAllowedToBeModified;

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
