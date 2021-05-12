// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class UpdateEnvironmentNodesRequest extends TeaModel {
    @NameInMap("cpu")
    public Integer cpu;

    @NameInMap("dataDisk")
    public java.util.List<String> dataDisk;

    @NameInMap("dataDisk2")
    public java.util.List<UpdateEnvironmentNodesRequestDataDisk2> dataDisk2;

    @NameInMap("envUID")
    public String envUID;

    @NameInMap("identifier")
    public String identifier;

    @NameInMap("labels")
    public java.util.Map<String, ?> labels;

    @NameInMap("memory")
    public Integer memory;

    @NameInMap("nodeIP")
    public String nodeIP;

    @NameInMap("rootPassword")
    public String rootPassword;

    @NameInMap("systemDisk")
    public java.util.List<String> systemDisk;

    @NameInMap("systemDisk2")
    public java.util.List<UpdateEnvironmentNodesRequestSystemDisk2> systemDisk2;

    @NameInMap("taints")
    public java.util.List<UpdateEnvironmentNodesRequestTaints> taints;

    public static UpdateEnvironmentNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnvironmentNodesRequest self = new UpdateEnvironmentNodesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEnvironmentNodesRequest setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public UpdateEnvironmentNodesRequest setDataDisk(java.util.List<String> dataDisk) {
        this.dataDisk = dataDisk;
        return this;
    }
    public java.util.List<String> getDataDisk() {
        return this.dataDisk;
    }

    public UpdateEnvironmentNodesRequest setDataDisk2(java.util.List<UpdateEnvironmentNodesRequestDataDisk2> dataDisk2) {
        this.dataDisk2 = dataDisk2;
        return this;
    }
    public java.util.List<UpdateEnvironmentNodesRequestDataDisk2> getDataDisk2() {
        return this.dataDisk2;
    }

    public UpdateEnvironmentNodesRequest setEnvUID(String envUID) {
        this.envUID = envUID;
        return this;
    }
    public String getEnvUID() {
        return this.envUID;
    }

    public UpdateEnvironmentNodesRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public UpdateEnvironmentNodesRequest setLabels(java.util.Map<String, ?> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, ?> getLabels() {
        return this.labels;
    }

    public UpdateEnvironmentNodesRequest setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public UpdateEnvironmentNodesRequest setNodeIP(String nodeIP) {
        this.nodeIP = nodeIP;
        return this;
    }
    public String getNodeIP() {
        return this.nodeIP;
    }

    public UpdateEnvironmentNodesRequest setRootPassword(String rootPassword) {
        this.rootPassword = rootPassword;
        return this;
    }
    public String getRootPassword() {
        return this.rootPassword;
    }

    public UpdateEnvironmentNodesRequest setSystemDisk(java.util.List<String> systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public java.util.List<String> getSystemDisk() {
        return this.systemDisk;
    }

    public UpdateEnvironmentNodesRequest setSystemDisk2(java.util.List<UpdateEnvironmentNodesRequestSystemDisk2> systemDisk2) {
        this.systemDisk2 = systemDisk2;
        return this;
    }
    public java.util.List<UpdateEnvironmentNodesRequestSystemDisk2> getSystemDisk2() {
        return this.systemDisk2;
    }

    public UpdateEnvironmentNodesRequest setTaints(java.util.List<UpdateEnvironmentNodesRequestTaints> taints) {
        this.taints = taints;
        return this;
    }
    public java.util.List<UpdateEnvironmentNodesRequestTaints> getTaints() {
        return this.taints;
    }

    public static class UpdateEnvironmentNodesRequestDataDisk2 extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("size")
        public String size;

        public static UpdateEnvironmentNodesRequestDataDisk2 build(java.util.Map<String, ?> map) throws Exception {
            UpdateEnvironmentNodesRequestDataDisk2 self = new UpdateEnvironmentNodesRequestDataDisk2();
            return TeaModel.build(map, self);
        }

        public UpdateEnvironmentNodesRequestDataDisk2 setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateEnvironmentNodesRequestDataDisk2 setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

    }

    public static class UpdateEnvironmentNodesRequestSystemDisk2 extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("size")
        public String size;

        public static UpdateEnvironmentNodesRequestSystemDisk2 build(java.util.Map<String, ?> map) throws Exception {
            UpdateEnvironmentNodesRequestSystemDisk2 self = new UpdateEnvironmentNodesRequestSystemDisk2();
            return TeaModel.build(map, self);
        }

        public UpdateEnvironmentNodesRequestSystemDisk2 setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateEnvironmentNodesRequestSystemDisk2 setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

    }

    public static class UpdateEnvironmentNodesRequestTaints extends TeaModel {
        @NameInMap("effect")
        public String effect;

        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static UpdateEnvironmentNodesRequestTaints build(java.util.Map<String, ?> map) throws Exception {
            UpdateEnvironmentNodesRequestTaints self = new UpdateEnvironmentNodesRequestTaints();
            return TeaModel.build(map, self);
        }

        public UpdateEnvironmentNodesRequestTaints setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public UpdateEnvironmentNodesRequestTaints setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateEnvironmentNodesRequestTaints setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
