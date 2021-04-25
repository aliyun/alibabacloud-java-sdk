// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ParseAppInputsResponseBody extends TeaModel {
    // 主机 ID
    @NameInMap("HostId")
    public String hostId;

    // 请求 ID
    @NameInMap("RequestId")
    public String requestId;

    // 应用输入参数
    @NameInMap("Inputs")
    public java.util.List<ParseAppInputsResponseBodyInputs> inputs;

    public static ParseAppInputsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ParseAppInputsResponseBody self = new ParseAppInputsResponseBody();
        return TeaModel.build(map, self);
    }

    public ParseAppInputsResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public ParseAppInputsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ParseAppInputsResponseBody setInputs(java.util.List<ParseAppInputsResponseBodyInputs> inputs) {
        this.inputs = inputs;
        return this;
    }
    public java.util.List<ParseAppInputsResponseBodyInputs> getInputs() {
        return this.inputs;
    }

    public static class ParseAppInputsResponseBodyInputs extends TeaModel {
        // 参数名称
        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("VariableName")
        public String variableName;

        @NameInMap("VariableType")
        public String variableType;

        @NameInMap("VariableValue")
        public String variableValue;

        @NameInMap("Required")
        public Boolean required;

        @NameInMap("Help")
        public String help;

        @NameInMap("StepOrder")
        public Long stepOrder;

        public static ParseAppInputsResponseBodyInputs build(java.util.Map<String, ?> map) throws Exception {
            ParseAppInputsResponseBodyInputs self = new ParseAppInputsResponseBodyInputs();
            return TeaModel.build(map, self);
        }

        public ParseAppInputsResponseBodyInputs setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ParseAppInputsResponseBodyInputs setVariableName(String variableName) {
            this.variableName = variableName;
            return this;
        }
        public String getVariableName() {
            return this.variableName;
        }

        public ParseAppInputsResponseBodyInputs setVariableType(String variableType) {
            this.variableType = variableType;
            return this;
        }
        public String getVariableType() {
            return this.variableType;
        }

        public ParseAppInputsResponseBodyInputs setVariableValue(String variableValue) {
            this.variableValue = variableValue;
            return this;
        }
        public String getVariableValue() {
            return this.variableValue;
        }

        public ParseAppInputsResponseBodyInputs setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public ParseAppInputsResponseBodyInputs setHelp(String help) {
            this.help = help;
            return this;
        }
        public String getHelp() {
            return this.help;
        }

        public ParseAppInputsResponseBodyInputs setStepOrder(Long stepOrder) {
            this.stepOrder = stepOrder;
            return this;
        }
        public Long getStepOrder() {
            return this.stepOrder;
        }

    }

}
