// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class InfraStackStatus extends TeaModel {
    @NameInMap("message")
    public String message;

    @NameInMap("observedGeneration")
    public Integer observedGeneration;

    @NameInMap("observedTime")
    public String observedTime;

    @NameInMap("phase")
    public String phase;

    @NameInMap("resourceState")
    public InfraStackResourceState resourceState;

    @NameInMap("templateOutputs")
    public java.util.Map<String, ?> templateOutputs;

    @NameInMap("templateStatus")
    public InfraStackStatusTemplateStatus templateStatus;

    public static InfraStackStatus build(java.util.Map<String, ?> map) throws Exception {
        InfraStackStatus self = new InfraStackStatus();
        return TeaModel.build(map, self);
    }

    public InfraStackStatus setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InfraStackStatus setObservedGeneration(Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
        return this;
    }
    public Integer getObservedGeneration() {
        return this.observedGeneration;
    }

    public InfraStackStatus setObservedTime(String observedTime) {
        this.observedTime = observedTime;
        return this;
    }
    public String getObservedTime() {
        return this.observedTime;
    }

    public InfraStackStatus setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public InfraStackStatus setResourceState(InfraStackResourceState resourceState) {
        this.resourceState = resourceState;
        return this;
    }
    public InfraStackResourceState getResourceState() {
        return this.resourceState;
    }

    public InfraStackStatus setTemplateOutputs(java.util.Map<String, ?> templateOutputs) {
        this.templateOutputs = templateOutputs;
        return this;
    }
    public java.util.Map<String, ?> getTemplateOutputs() {
        return this.templateOutputs;
    }

    public InfraStackStatus setTemplateStatus(InfraStackStatusTemplateStatus templateStatus) {
        this.templateStatus = templateStatus;
        return this;
    }
    public InfraStackStatusTemplateStatus getTemplateStatus() {
        return this.templateStatus;
    }

    public static class InfraStackStatusTemplateStatus extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("outputs")
        public java.util.List<TerraformOutputValue> outputs;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("variables")
        public java.util.List<TerraformInputVariable> variables;

        public static InfraStackStatusTemplateStatus build(java.util.Map<String, ?> map) throws Exception {
            InfraStackStatusTemplateStatus self = new InfraStackStatusTemplateStatus();
            return TeaModel.build(map, self);
        }

        public InfraStackStatusTemplateStatus setOutputs(java.util.List<TerraformOutputValue> outputs) {
            this.outputs = outputs;
            return this;
        }
        public java.util.List<TerraformOutputValue> getOutputs() {
            return this.outputs;
        }

        public InfraStackStatusTemplateStatus setVariables(java.util.List<TerraformInputVariable> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<TerraformInputVariable> getVariables() {
            return this.variables;
        }

    }

}
