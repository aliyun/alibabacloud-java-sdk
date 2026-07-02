// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class GenerateServicePolicyResponseBody extends TeaModel {
    /**
     * <p>The missing access policies.</p>
     */
    @NameInMap("MissingPolicy")
    public java.util.List<GenerateServicePolicyResponseBodyMissingPolicy> missingPolicy;

    /**
     * <p>The custom properties of the required access policy.</p>
     * 
     * <strong>example:</strong>
     * <p>{Statement&quot;: [{ &quot;Action&quot;: [&quot;oos:<em>&quot;], &quot;Effect&quot;: &quot;Allow&quot;, &quot;Resource&quot;: &quot;</em>&quot;},{ &quot;Action&quot;: [&quot;ecs:DescribeInstances&quot;], &quot;Effect&quot;: &quot;Allow&quot;, &quot;Resource&quot;: &quot;<em>&quot;},{ &quot;Action&quot;: [&quot;ecs:RunInstance&quot;], &quot;Effect&quot;: &quot;Allow&quot;, &quot;Resource&quot;: &quot;</em>&quot;}], &quot;Version&quot;: &quot;1&quot;}</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5040BE9E-8DA2-5C9D-9B70-0EE6027A14BC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GenerateServicePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateServicePolicyResponseBody self = new GenerateServicePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateServicePolicyResponseBody setMissingPolicy(java.util.List<GenerateServicePolicyResponseBodyMissingPolicy> missingPolicy) {
        this.missingPolicy = missingPolicy;
        return this;
    }
    public java.util.List<GenerateServicePolicyResponseBodyMissingPolicy> getMissingPolicy() {
        return this.missingPolicy;
    }

    public GenerateServicePolicyResponseBody setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public GenerateServicePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GenerateServicePolicyResponseBodyMissingPolicy extends TeaModel {
        /**
         * <p>The access policy information.</p>
         */
        @NameInMap("Action")
        public java.util.List<String> action;

        /**
         * <p>The specific resource that is authorized. An asterisk (*) indicates all resources.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Resource")
        public String resource;

        /**
         * <p>The service name to which the access policy belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        public static GenerateServicePolicyResponseBodyMissingPolicy build(java.util.Map<String, ?> map) throws Exception {
            GenerateServicePolicyResponseBodyMissingPolicy self = new GenerateServicePolicyResponseBodyMissingPolicy();
            return TeaModel.build(map, self);
        }

        public GenerateServicePolicyResponseBodyMissingPolicy setAction(java.util.List<String> action) {
            this.action = action;
            return this;
        }
        public java.util.List<String> getAction() {
            return this.action;
        }

        public GenerateServicePolicyResponseBodyMissingPolicy setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public GenerateServicePolicyResponseBodyMissingPolicy setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

}
