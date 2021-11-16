// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeEdgeMachineModelsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("models")
    public java.util.List<DescribeEdgeMachineModelsResponseBodyModels> models;

    public static DescribeEdgeMachineModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEdgeMachineModelsResponseBody self = new DescribeEdgeMachineModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEdgeMachineModelsResponseBody setModels(java.util.List<DescribeEdgeMachineModelsResponseBodyModels> models) {
        this.models = models;
        return this;
    }
    public java.util.List<DescribeEdgeMachineModelsResponseBodyModels> getModels() {
        return this.models;
    }

    public static class DescribeEdgeMachineModelsResponseBodyModels extends TeaModel {
        // cpu
        @NameInMap("cpu")
        public Integer cpu;

        // cpu arch
        @NameInMap("cpu_arch")
        public String cpuArch;

        // created
        @NameInMap("created")
        public String created;

        // description
        @NameInMap("description")
        public String description;

        // manage runtime
        @NameInMap("manage_runtime")
        public Integer manageRuntime;

        // memory
        @NameInMap("memory")
        public Integer memory;

        // model
        @NameInMap("model")
        public String model;

        // model id
        @NameInMap("model_id")
        public String modelId;

        public static DescribeEdgeMachineModelsResponseBodyModels build(java.util.Map<String, ?> map) throws Exception {
            DescribeEdgeMachineModelsResponseBodyModels self = new DescribeEdgeMachineModelsResponseBodyModels();
            return TeaModel.build(map, self);
        }

        public DescribeEdgeMachineModelsResponseBodyModels setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeEdgeMachineModelsResponseBodyModels setCpuArch(String cpuArch) {
            this.cpuArch = cpuArch;
            return this;
        }
        public String getCpuArch() {
            return this.cpuArch;
        }

        public DescribeEdgeMachineModelsResponseBodyModels setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public DescribeEdgeMachineModelsResponseBodyModels setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEdgeMachineModelsResponseBodyModels setManageRuntime(Integer manageRuntime) {
            this.manageRuntime = manageRuntime;
            return this;
        }
        public Integer getManageRuntime() {
            return this.manageRuntime;
        }

        public DescribeEdgeMachineModelsResponseBodyModels setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public DescribeEdgeMachineModelsResponseBodyModels setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public DescribeEdgeMachineModelsResponseBodyModels setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

    }

}
