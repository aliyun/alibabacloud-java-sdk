// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ValidateJobResponseBody extends TeaModel {
    @NameInMap("JobInOut")
    public ValidateJobResponseBodyJobInOut jobInOut;

    @NameInMap("RequestId")
    public String requestId;

    public static ValidateJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateJobResponseBody self = new ValidateJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateJobResponseBody setJobInOut(ValidateJobResponseBodyJobInOut jobInOut) {
        this.jobInOut = jobInOut;
        return this;
    }
    public ValidateJobResponseBodyJobInOut getJobInOut() {
        return this.jobInOut;
    }

    public ValidateJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ValidateJobResponseBodyJobInOutDimsDim extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("Name")
        public String name;

        @NameInMap("Properties")
        public java.util.Map<String, ?> properties;

        @NameInMap("Type")
        public String type;

        @NameInMap("Workspace")
        public String workspace;

        public static ValidateJobResponseBodyJobInOutDimsDim build(java.util.Map<String, ?> map) throws Exception {
            ValidateJobResponseBodyJobInOutDimsDim self = new ValidateJobResponseBodyJobInOutDimsDim();
            return TeaModel.build(map, self);
        }

        public ValidateJobResponseBodyJobInOutDimsDim setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public ValidateJobResponseBodyJobInOutDimsDim setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ValidateJobResponseBodyJobInOutDimsDim setProperties(java.util.Map<String, ?> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
        }

        public ValidateJobResponseBodyJobInOutDimsDim setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ValidateJobResponseBodyJobInOutDimsDim setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

    public static class ValidateJobResponseBodyJobInOutDims extends TeaModel {
        @NameInMap("Dim")
        public java.util.List<ValidateJobResponseBodyJobInOutDimsDim> dim;

        public static ValidateJobResponseBodyJobInOutDims build(java.util.Map<String, ?> map) throws Exception {
            ValidateJobResponseBodyJobInOutDims self = new ValidateJobResponseBodyJobInOutDims();
            return TeaModel.build(map, self);
        }

        public ValidateJobResponseBodyJobInOutDims setDim(java.util.List<ValidateJobResponseBodyJobInOutDimsDim> dim) {
            this.dim = dim;
            return this;
        }
        public java.util.List<ValidateJobResponseBodyJobInOutDimsDim> getDim() {
            return this.dim;
        }

    }

    public static class ValidateJobResponseBodyJobInOutInputsInput extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("Name")
        public String name;

        @NameInMap("Properties")
        public java.util.Map<String, ?> properties;

        @NameInMap("Type")
        public String type;

        @NameInMap("Workspace")
        public String workspace;

        public static ValidateJobResponseBodyJobInOutInputsInput build(java.util.Map<String, ?> map) throws Exception {
            ValidateJobResponseBodyJobInOutInputsInput self = new ValidateJobResponseBodyJobInOutInputsInput();
            return TeaModel.build(map, self);
        }

        public ValidateJobResponseBodyJobInOutInputsInput setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public ValidateJobResponseBodyJobInOutInputsInput setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ValidateJobResponseBodyJobInOutInputsInput setProperties(java.util.Map<String, ?> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
        }

        public ValidateJobResponseBodyJobInOutInputsInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ValidateJobResponseBodyJobInOutInputsInput setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

    public static class ValidateJobResponseBodyJobInOutInputs extends TeaModel {
        @NameInMap("Input")
        public java.util.List<ValidateJobResponseBodyJobInOutInputsInput> input;

        public static ValidateJobResponseBodyJobInOutInputs build(java.util.Map<String, ?> map) throws Exception {
            ValidateJobResponseBodyJobInOutInputs self = new ValidateJobResponseBodyJobInOutInputs();
            return TeaModel.build(map, self);
        }

        public ValidateJobResponseBodyJobInOutInputs setInput(java.util.List<ValidateJobResponseBodyJobInOutInputsInput> input) {
            this.input = input;
            return this;
        }
        public java.util.List<ValidateJobResponseBodyJobInOutInputsInput> getInput() {
            return this.input;
        }

    }

    public static class ValidateJobResponseBodyJobInOutOutputsOutput extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("Name")
        public String name;

        @NameInMap("Properties")
        public java.util.Map<String, ?> properties;

        @NameInMap("Type")
        public String type;

        @NameInMap("Workspace")
        public String workspace;

        public static ValidateJobResponseBodyJobInOutOutputsOutput build(java.util.Map<String, ?> map) throws Exception {
            ValidateJobResponseBodyJobInOutOutputsOutput self = new ValidateJobResponseBodyJobInOutOutputsOutput();
            return TeaModel.build(map, self);
        }

        public ValidateJobResponseBodyJobInOutOutputsOutput setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public ValidateJobResponseBodyJobInOutOutputsOutput setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ValidateJobResponseBodyJobInOutOutputsOutput setProperties(java.util.Map<String, ?> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
        }

        public ValidateJobResponseBodyJobInOutOutputsOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ValidateJobResponseBodyJobInOutOutputsOutput setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

    public static class ValidateJobResponseBodyJobInOutOutputs extends TeaModel {
        @NameInMap("Output")
        public java.util.List<ValidateJobResponseBodyJobInOutOutputsOutput> output;

        public static ValidateJobResponseBodyJobInOutOutputs build(java.util.Map<String, ?> map) throws Exception {
            ValidateJobResponseBodyJobInOutOutputs self = new ValidateJobResponseBodyJobInOutOutputs();
            return TeaModel.build(map, self);
        }

        public ValidateJobResponseBodyJobInOutOutputs setOutput(java.util.List<ValidateJobResponseBodyJobInOutOutputsOutput> output) {
            this.output = output;
            return this;
        }
        public java.util.List<ValidateJobResponseBodyJobInOutOutputsOutput> getOutput() {
            return this.output;
        }

    }

    public static class ValidateJobResponseBodyJobInOut extends TeaModel {
        @NameInMap("Dims")
        public ValidateJobResponseBodyJobInOutDims dims;

        @NameInMap("Inputs")
        public ValidateJobResponseBodyJobInOutInputs inputs;

        @NameInMap("Outputs")
        public ValidateJobResponseBodyJobInOutOutputs outputs;

        public static ValidateJobResponseBodyJobInOut build(java.util.Map<String, ?> map) throws Exception {
            ValidateJobResponseBodyJobInOut self = new ValidateJobResponseBodyJobInOut();
            return TeaModel.build(map, self);
        }

        public ValidateJobResponseBodyJobInOut setDims(ValidateJobResponseBodyJobInOutDims dims) {
            this.dims = dims;
            return this;
        }
        public ValidateJobResponseBodyJobInOutDims getDims() {
            return this.dims;
        }

        public ValidateJobResponseBodyJobInOut setInputs(ValidateJobResponseBodyJobInOutInputs inputs) {
            this.inputs = inputs;
            return this;
        }
        public ValidateJobResponseBodyJobInOutInputs getInputs() {
            return this.inputs;
        }

        public ValidateJobResponseBodyJobInOut setOutputs(ValidateJobResponseBodyJobInOutOutputs outputs) {
            this.outputs = outputs;
            return this;
        }
        public ValidateJobResponseBodyJobInOutOutputs getOutputs() {
            return this.outputs;
        }

    }

}
