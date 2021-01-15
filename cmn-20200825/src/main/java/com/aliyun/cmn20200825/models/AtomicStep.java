// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class AtomicStep extends TeaModel {
    // 步骤说明
    @NameInMap("Description")
    public String description;

    // 步骤入参
    @NameInMap("Input")
    public java.util.List<AtomicStepInput> input;

    // 步骤出参
    @NameInMap("Output")
    public java.util.List<AtomicStepOutput> output;

    // 步骤id
    @NameInMap("StepId")
    public String stepId;

    // 步骤名称
    @NameInMap("StepName")
    public String stepName;

    // 步骤类型
    @NameInMap("StepType")
    public String stepType;

    public static AtomicStep build(java.util.Map<String, ?> map) throws Exception {
        AtomicStep self = new AtomicStep();
        return TeaModel.build(map, self);
    }

    public AtomicStep setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AtomicStep setInput(java.util.List<AtomicStepInput> input) {
        this.input = input;
        return this;
    }
    public java.util.List<AtomicStepInput> getInput() {
        return this.input;
    }

    public AtomicStep setOutput(java.util.List<AtomicStepOutput> output) {
        this.output = output;
        return this;
    }
    public java.util.List<AtomicStepOutput> getOutput() {
        return this.output;
    }

    public AtomicStep setStepId(String stepId) {
        this.stepId = stepId;
        return this;
    }
    public String getStepId() {
        return this.stepId;
    }

    public AtomicStep setStepName(String stepName) {
        this.stepName = stepName;
        return this;
    }
    public String getStepName() {
        return this.stepName;
    }

    public AtomicStep setStepType(String stepType) {
        this.stepType = stepType;
        return this;
    }
    public String getStepType() {
        return this.stepType;
    }

    public static class AtomicStepInput extends TeaModel {
        // 参数说明
        @NameInMap("Description")
        public String description;

        // 参数名称
        @NameInMap("Name")
        public String name;

        // 参数示例
        @NameInMap("Sample")
        public String sample;

        // 参数类型
        @NameInMap("Type")
        public String type;

        public static AtomicStepInput build(java.util.Map<String, ?> map) throws Exception {
            AtomicStepInput self = new AtomicStepInput();
            return TeaModel.build(map, self);
        }

        public AtomicStepInput setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AtomicStepInput setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AtomicStepInput setSample(String sample) {
            this.sample = sample;
            return this;
        }
        public String getSample() {
            return this.sample;
        }

        public AtomicStepInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class AtomicStepOutput extends TeaModel {
        // 参数说明
        @NameInMap("Description")
        public String description;

        // 参数名称
        @NameInMap("Name")
        public String name;

        // 参数示例
        @NameInMap("Sample")
        public String sample;

        // 参数类型
        @NameInMap("Type")
        public String type;

        public static AtomicStepOutput build(java.util.Map<String, ?> map) throws Exception {
            AtomicStepOutput self = new AtomicStepOutput();
            return TeaModel.build(map, self);
        }

        public AtomicStepOutput setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AtomicStepOutput setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AtomicStepOutput setSample(String sample) {
            this.sample = sample;
            return this;
        }
        public String getSample() {
            return this.sample;
        }

        public AtomicStepOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
