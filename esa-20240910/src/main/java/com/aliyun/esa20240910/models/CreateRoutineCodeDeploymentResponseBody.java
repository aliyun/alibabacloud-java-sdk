// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateRoutineCodeDeploymentResponseBody extends TeaModel {
    /**
     * <p>The configuration list of the phased release version number.</p>
     */
    @NameInMap("CodeVersions")
    public java.util.List<CreateRoutineCodeDeploymentResponseBodyCodeVersions> codeVersions;

    /**
     * <p>The deployment record ID.</p>
     * 
     * <strong>example:</strong>
     * <p>234</p>
     */
    @NameInMap("DeploymentId")
    public String deploymentId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EDBD3EB3-97DA-5465-AEF5-8DCA5DC5E395</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The phased release policy. The constant string is &quot;percentage&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>percentage</p>
     */
    @NameInMap("Strategy")
    public String strategy;

    public static CreateRoutineCodeDeploymentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRoutineCodeDeploymentResponseBody self = new CreateRoutineCodeDeploymentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRoutineCodeDeploymentResponseBody setCodeVersions(java.util.List<CreateRoutineCodeDeploymentResponseBodyCodeVersions> codeVersions) {
        this.codeVersions = codeVersions;
        return this;
    }
    public java.util.List<CreateRoutineCodeDeploymentResponseBodyCodeVersions> getCodeVersions() {
        return this.codeVersions;
    }

    public CreateRoutineCodeDeploymentResponseBody setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public String getDeploymentId() {
        return this.deploymentId;
    }

    public CreateRoutineCodeDeploymentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRoutineCodeDeploymentResponseBody setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }
    public String getStrategy() {
        return this.strategy;
    }

    public static class CreateRoutineCodeDeploymentResponseBodyCodeVersions extends TeaModel {
        /**
         * <p>The version of the code.</p>
         * 
         * <strong>example:</strong>
         * <p>1723599747213377175</p>
         */
        @NameInMap("CodeVersion")
        public String codeVersion;

        /**
         * <p>The phased release ratio.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percentage")
        public Long percentage;

        public static CreateRoutineCodeDeploymentResponseBodyCodeVersions build(java.util.Map<String, ?> map) throws Exception {
            CreateRoutineCodeDeploymentResponseBodyCodeVersions self = new CreateRoutineCodeDeploymentResponseBodyCodeVersions();
            return TeaModel.build(map, self);
        }

        public CreateRoutineCodeDeploymentResponseBodyCodeVersions setCodeVersion(String codeVersion) {
            this.codeVersion = codeVersion;
            return this;
        }
        public String getCodeVersion() {
            return this.codeVersion;
        }

        public CreateRoutineCodeDeploymentResponseBodyCodeVersions setPercentage(Long percentage) {
            this.percentage = percentage;
            return this;
        }
        public Long getPercentage() {
            return this.percentage;
        }

    }

}
