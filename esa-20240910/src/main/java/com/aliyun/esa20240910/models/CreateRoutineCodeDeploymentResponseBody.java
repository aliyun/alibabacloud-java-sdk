// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateRoutineCodeDeploymentResponseBody extends TeaModel {
    @NameInMap("CodeVersions")
    public java.util.List<CreateRoutineCodeDeploymentResponseBodyCodeVersions> codeVersions;

    @NameInMap("DeploymentId")
    public String deploymentId;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CodeVersion")
        public String codeVersion;

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
