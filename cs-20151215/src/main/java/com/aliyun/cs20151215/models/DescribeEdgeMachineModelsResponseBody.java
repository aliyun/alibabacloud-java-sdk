// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeEdgeMachineModelsResponseBody extends TeaModel {
    /**
     * <p>The cloud-native box models.</p>
     */
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
        /**
         * <p>The number of vCores.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("cpu")
        public Integer cpu;

        /**
         * <p>The CPU architecture.</p>
         * 
         * <strong>example:</strong>
         * <p>x86_64/arm64</p>
         */
        @NameInMap("cpu_arch")
        public String cpuArch;

        /**
         * <p>The time when the cloud-native box was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-07T20:44:00+08:00</p>
         */
        @NameInMap("created")
        public String created;

        /**
         * <p>The description of the cloud-native box.</p>
         * 
         * <strong>example:</strong>
         * <p>B010</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Indicates whether the cloud-native box model manages the Docker runtime.</p>
         * 
         * <strong>example:</strong>
         * <p>0/1</p>
         */
        @NameInMap("manage_runtime")
        public Integer manageRuntime;

        /**
         * <p>The memory. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("memory")
        public Integer memory;

        /**
         * <p>The model of the cloud-native box.</p>
         * 
         * <strong>example:</strong>
         * <p>ACK-V-B010</p>
         */
        @NameInMap("model")
        public String model;

        /**
         * <p>The ID of the cloud-native box.</p>
         * 
         * <strong>example:</strong>
         * <p>c34cc753-8908-4739-bd10-ebd922a4****</p>
         */
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
