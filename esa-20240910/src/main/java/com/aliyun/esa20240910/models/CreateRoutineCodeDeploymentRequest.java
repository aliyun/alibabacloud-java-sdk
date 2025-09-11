// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateRoutineCodeDeploymentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CodeVersions")
    public java.util.List<CreateRoutineCodeDeploymentRequestCodeVersions> codeVersions;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>production</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>percentage</p>
     */
    @NameInMap("Strategy")
    public String strategy;

    public static CreateRoutineCodeDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRoutineCodeDeploymentRequest self = new CreateRoutineCodeDeploymentRequest();
        return TeaModel.build(map, self);
    }

    public CreateRoutineCodeDeploymentRequest setCodeVersions(java.util.List<CreateRoutineCodeDeploymentRequestCodeVersions> codeVersions) {
        this.codeVersions = codeVersions;
        return this;
    }
    public java.util.List<CreateRoutineCodeDeploymentRequestCodeVersions> getCodeVersions() {
        return this.codeVersions;
    }

    public CreateRoutineCodeDeploymentRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public CreateRoutineCodeDeploymentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateRoutineCodeDeploymentRequest setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }
    public String getStrategy() {
        return this.strategy;
    }

    public static class CreateRoutineCodeDeploymentRequestCodeVersions extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("CodeVersion")
        public String codeVersion;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Percentage")
        public Long percentage;

        public static CreateRoutineCodeDeploymentRequestCodeVersions build(java.util.Map<String, ?> map) throws Exception {
            CreateRoutineCodeDeploymentRequestCodeVersions self = new CreateRoutineCodeDeploymentRequestCodeVersions();
            return TeaModel.build(map, self);
        }

        public CreateRoutineCodeDeploymentRequestCodeVersions setCodeVersion(String codeVersion) {
            this.codeVersion = codeVersion;
            return this;
        }
        public String getCodeVersion() {
            return this.codeVersion;
        }

        public CreateRoutineCodeDeploymentRequestCodeVersions setPercentage(Long percentage) {
            this.percentage = percentage;
            return this;
        }
        public Long getPercentage() {
            return this.percentage;
        }

    }

}
